/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.CTSP;
import Model.NSX;
import Utilities.DBConnection;
import ViewModel.QLCTSP;
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
public class ChiTietSanPhamRepositories implements DAOCTSP{

    public String getidsp(String tensp){
      try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT ID FROM SANPHAM WHERE TEN = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, tensp);
  
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
 String idsp = rs.getString(1);
 return idsp;
  }
 }
    
  catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return null;
    }
    /////////
    
    public String getidNSX(String tennsx){
        try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT ID FROM NSX WHERE TEN = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, tennsx);
  
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
 String idnsx = rs.getString(1);
 return idnsx;
  }
 }
    
  catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return null;
    }
    
    
    //////////
    public String getidMausac(String tenmau){
        try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT ID FROM MAUSAC WHERE TEN = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, tenmau);
  
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
 String idmau = rs.getString(1);
 return idmau;
  }
 }
    
  catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return null;
    }
    
    /////////
    public String getidDongsp(String tendongsp){
           try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT ID FROM DONGSP WHERE TEN = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, tendongsp);
  
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
 String iddongsp = rs.getString(1);
 return iddongsp;
  }
 }
    
  catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return null;

    }
    
    ///////////
    
    @Override
    public int themctsp(String idsp, String idNSX, String idMausac, String idDongsp, QLCTSP ctsp) {
      try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO CHITIETSP(ID,IDSP,IDNSX,IDMAUSAC,IDDONGSP,NAMBH,SOLUONGTON,GIANHAP,GIABAN) VALUES (NEWID(),?,?,?,?,?,?,?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1, getidsp(idsp));
  ps.setString(2, getidNSX(idNSX));
  ps.setString(3, getidMausac(idMausac));
  ps.setString(4, getidDongsp(idDongsp));
  ps.setInt(5, ctsp.getNambaohanh());
  ps.setInt(6, ctsp.getSlton());
  ps.setInt(7, ctsp.getGianhap());
  ps.setInt(8, ctsp.getGiaban());
  
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    
    }

    @Override
    public int xoactsp(String id) {
     try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM CHITIETSP WHERE ID = ?";
  PreparedStatement ps = con.prepareStatement(xoa);
  ps.setString(1, id);
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
         
    
    }

  

    @Override
    public List<QLCTSP> getALL() {
 List<QLCTSP> listctsq = new ArrayList<QLCTSP>();
 try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ten, dbo.NSX.Ten AS Expr1, dbo.MauSac.Ten AS Expr2, dbo.DongSP.Ten AS Expr3, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n" +
"FROM     dbo.ChiTietSP INNER JOIN\n" +
"                  dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n" +
"                  dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n" +
"                  dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n" +
"                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
        QLCTSP ctsp = new QLCTSP(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9));
         listctsq.add(ctsp);
            }
            return listctsq;
         
           
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
     return null;
    }

    @Override
    public int sua(String idsp, String idNSX, String idMausac, String idDongsp, QLCTSP ctsp, String id) {
      try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE CHITIETSP SET IDSP = ?,IDNSX=?,IDMAUSAC=?,IDDONGSP=?,NAMBH=?,SOLUONGTON=?,GIANHAP=?,GIABAN=? WHERE ID = ?";
  PreparedStatement ps = con.prepareStatement(sua);
  ps.setString(1, getidsp(idsp));
  ps.setString(2, getidNSX(idNSX));
  ps.setString(3, getidMausac(idMausac));
  ps.setString(4, getidDongsp(idDongsp));
  ps.setInt(5, ctsp.getNambaohanh());
  ps.setInt(6, ctsp.getSlton());
  ps.setInt(7, ctsp.getGianhap());
  ps.setInt(8, ctsp.getGiaban());
  ps.setString(9, id);
  
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    
    }
    
    @Override
    public List<QLCTSP> Loc(int gianhap,int giaban){
    List<QLCTSP> listctsq = new ArrayList<QLCTSP>();
 try {Connection con = DBConnection.openDbConnection(); 
           
           
            String danhsach = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ten, dbo.NSX.Ten AS Expr1, dbo.MauSac.Ten AS Expr2, dbo.DongSP.Ten AS Expr3, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n" +
"FROM     dbo.ChiTietSP INNER JOIN\n" +
"                  dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n" +
"                  dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n" +
"                  dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n" +
"                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id where GiaNhap >= ? and GiaBan <= ?";
            
            PreparedStatement ps = con.prepareStatement(danhsach);
            ps.setInt(1, gianhap);
            ps.setInt(2, giaban);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
        QLCTSP ctsp = new QLCTSP(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9));
         listctsq.add(ctsp);
            }
            return listctsq;
         
           
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
     return null;
    }
    
}
