/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.HoaDon;
import Model.NSX;
import Utilities.DBConnection;
import ViewModel.QLHD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class HoaDonRepositories implements DAOHoaDon{

    public String getIDKH(String makh){
              try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT ID FROM KHACHHANG WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, makh);
  
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
 String id = rs.getString(1);
 return id;
  }
 }
    
  catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return null;
    
    }
    
    public String getIDNV(String manv){
                 try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT ID FROM NHANVIEN WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, manv);
  
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
 String id = rs.getString(1);
 return id;
  }
 }
    
  catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return null;
    
    }
    
    @Override
    public List<QLHD> getAll() {
   List<QLHD> list = new ArrayList<QLHD>();
    try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT dbo.KhachHang.Ma, dbo.NhanVien.Ma AS Expr1, dbo.HoaDon.Ma AS Expr2,CONVERT(varchar(40),dbo.HoaDon.NgayTao, 110) ,CONVERT(varchar(40),dbo.HoaDon.NgayThanhToan, 110) ,CONVERT(varchar(40),dbo.HoaDon.NgayShip, 110),CONVERT(varchar(40), dbo.HoaDon.NgayNhan, 110) , dbo.HoaDon.TinhTrang, dbo.HoaDon.DiaChi, \n" +
"                  dbo.HoaDon.Sdt,dbo.HoaDon.ID\n" +
"FROM     dbo.HoaDon INNER JOIN\n" +
"                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n" +
"                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
             QLHD ql = new QLHD(rs.getString(11),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10));
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
    public int themHD(String makh, String manv,HoaDon hd) {
     try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO HOADON(ID,IDKH,IDNV,MA,NGAYTAO,NGAYTHANHTOAN,NGAYSHIP,NGAYNHAN,TINHTRANG,DIACHI,SDT) VALUES (NEWID(),?,?,?,?,?,?,?,?,?,?)";
  PreparedStatement ps = con.prepareStatement(them);
ps.setString(1,getIDKH(makh));
ps.setString(2,getIDNV(manv));
ps.setString(3,hd.getMa());
ps.setString(4, hd.getNgaytao());
ps.setString(5, hd.getNgaythanhtoan());
ps.setString(6, hd.getNgayship());
ps.setString(7, hd.getNgaynhan());
ps.setInt(8, hd.getTinhtrang());
ps.setString(9,hd.getDiachi());
ps.setString(10, hd.getSdt());
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }

    @Override
    public int tontai(String ma) {
    try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT COUNT(*) FROM HOADON WHERE Ma = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, ma);
  
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
    public int xoaHD(String ma) {
  try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM HOADON WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(xoa);
  ps.setString(1, ma);
  
  int kq = ps.executeUpdate();
  return kq;
  
  }
  
  catch(Exception e){
  e.printStackTrace();
  }
    return 0;
    }

    @Override
    public int suaHD(String makh, String manv, HoaDon hd, String ma) {
  try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE HOADON SET IDKH = ?,IDNV=?,NGAYTAO=?,NGAYTHANHTOAN=?,NGAYSHIP=?,NGAYNHAN=?,TINHTRANG=?,DIACHI=?,SDT=? WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sua);
  ps.setString(1, getIDKH(makh));
  ps.setString(2, getIDNV(manv));
  ps.setString(3, hd.getNgaytao());
  ps.setString(4, hd.getNgaythanhtoan());
  ps.setString(5, hd.getNgayship());
  ps.setString(6, hd.getNgaynhan());
  ps.setInt(7, hd.getTinhtrang());
  ps.setString(8, hd.getDiachi());
  ps.setString(9, hd.getSdt());
  ps.setString(10, ma);
  
  int kq = ps.executeUpdate();
  return kq;
  
  }
  
  catch(Exception e){
  e.printStackTrace();
  }
    return 0;
    
    }
    
}
