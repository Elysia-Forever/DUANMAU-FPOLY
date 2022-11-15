/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.GioHang;
import Utilities.DBConnection;
import ViewModel.QLGioHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class GioHangRepositories implements DAOGioHangRepo{

    public String getIDNV(String ma){
     try {
            Connection  con = DBConnection.openDbConnection();
            String danhsach = "SELECT ID FROM NHANVIEN WHERE MA = ?";
            PreparedStatement ps = con.prepareStatement(danhsach);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
          String id = rs.getString(1);
          return id;
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
     return null;
    }
    
     public String getIDKH(String ma){
     try {
            Connection  con = DBConnection.openDbConnection();
            String danhsach = "SELECT ID FROM KHACHHANG WHERE MA = ?";
            PreparedStatement ps = con.prepareStatement(danhsach);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
          String id = rs.getString(1);
          return id;
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
     return null;
    }
     
    @Override
    public List<QLGioHang> getAll() {
   List<QLGioHang> list = new ArrayList<QLGioHang>();
        try {
            Connection  con = DBConnection.openDbConnection();
            String danhsach = "SELECT MA,NGAYTAO,NGAYTHANHTOAN,TENNGUOINHAN,DIACHI,SDT,TINHTRANG FROM GIOHANG";
            PreparedStatement ps = con.prepareStatement(danhsach);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            QLGioHang ql = new QLGioHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
            list.add(ql);
            }
            return list;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    return null;
    }
    @Override
    public int xoa(String ma) {
    try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM GIOHANG WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(xoa);
  ps.setString(1, ma);
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
        ex.printStackTrace();
        }
 return 0; 
    
    }

    @Override
    public int tontai(String ma) {
      try{
  Connection con = DBConnection.openDbConnection();
  String sql = "SELECT COUNT(*) FROM GIOHANG WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sql);
 ps.setString(1,ma);
  
       ResultSet rs = ps.executeQuery();
       while(rs.next()){
       if(rs.getInt(1)!=0){
             
           return 1;
       }
       }
 
  }
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }

    @Override
    public QLGioHang getFill(String ma) {
    try {
            Connection  con = DBConnection.openDbConnection();
            String danhsach = "SELECT dbo.GioHang.Ma, dbo.GioHang.IdKH, dbo.GioHang.IdNV, dbo.KhachHang.Ma AS Expr1, dbo.NhanVien.Ma AS Expr2\n" +
"FROM     dbo.GioHang INNER JOIN KHACHHANG ON GIOHANG.IDKH = KHACHHANG.ID JOIN HOADON ON KHACHHANG.ID = HOADON.IdKH JOIN \n" +
"           NHANVIEN ON HOADON.IdNV = NhanVien.ID WHERE GIOHANG.MA = ?";
            PreparedStatement ps = con.prepareStatement(danhsach);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                QLGioHang ql = new QLGioHang(rs.getString(2),rs.getString(3),rs.getString(1),rs.getString(5),rs.getString(4));
            return ql;
            }
           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    return null;
    
    }

    @Override
    public int them(String idnv, String idkh, GioHang gh) {
      try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO GIOHANG(ID,IDKH,IDNV,MA,NGAYTAO,NGAYTHANHTOAN,TENNGUOINHAN,DIACHI,SDT,TINHTRANG) VALUES(NEWID(),?,?,?,?,?,?,?,?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1, getIDKH(idkh));
  ps.setString(2, getIDNV(idnv));
  ps.setString(3, gh.getMa());
  ps.setString(4, gh.getNgaytao());
  ps.setString(5, gh.getNgaythanhtoan());
  ps.setString(6, gh.getTennguoinhan());
  ps.setString(7, gh.getDiachi());
  ps.setString(8, gh.getSdt());
  ps.setInt(9,gh.getTinhtrang());
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
        ex.printStackTrace();
        }
 return 0; 
    
    }

    @Override
    public int sua(String idnv, String idkh, GioHang gh, String ma) {
       try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE GIOHANG SET IDKH =?,IDNV=?,NGAYTAO=?,NGAYTHANHTOAN=?,TENNGUOINHAN=?,DIACHI=?,SDT=?,TINHTRANG=? WHERE MA =?";
  PreparedStatement ps = con.prepareStatement(sua);
  ps.setString(1, getIDKH(idkh));
  ps.setString(2, getIDNV(idnv));

  ps.setString(3, gh.getNgaytao());
  ps.setString(4, gh.getNgaythanhtoan());
  ps.setString(5, gh.getTennguoinhan());
  ps.setString(6, gh.getDiachi());
  ps.setString(7, gh.getSdt());
  ps.setInt(8,gh.getTinhtrang());
  ps.setString(9, ma);
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
        ex.printStackTrace();
        }
 return 0;  
    
    }
    
}
