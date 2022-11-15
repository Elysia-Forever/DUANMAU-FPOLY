/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.GioHangCT;
import Utilities.DBConnection;
import ViewModel.QLCTSP;
import ViewModel.QLGioHangCT;
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
public class ChiTietGioHangRepositories implements DAOGioHangCTRepo{
    
    @Override
    public List<QLGioHangCT> getAll(){
    List<QLGioHangCT> list = new ArrayList<QLGioHangCT>();
    try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT IDGIOHANG,IdChiTietSP,SoLuong,DONGIA,DonGiaKhiGiam, dbo.GioHang.MA, dbo.ChiTietSP.Id AS Expr1\n" +
"FROM     dbo.ChiTietSP INNER JOIN\n" +
"                  dbo.GioHangChiTiet ON dbo.ChiTietSP.Id = dbo.GioHangChiTiet.IdChiTietSP INNER JOIN\n" +
"                 dbo.GioHang ON dbo.GioHangChiTiet.IdGioHang = dbo.GioHang.Id ";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
        QLGioHangCT ql = new QLGioHangCT(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7));
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
     public int tontai(String idgh,String idsp){
      try{
  Connection con = DBConnection.openDbConnection();
  String tt = "SELECT COUNT(*) FROM GioHangChiTiet WHERE IDGIOHANG = ? AND IdChiTietSP =?";
  PreparedStatement ps = con.prepareStatement(tt);
 ps.setString(1, idgh);
 ps.setString(2, idsp);
 ResultSet rs = ps.executeQuery();
 while(rs.next()){
  int kq = rs.getInt(1);
  return kq;
 }
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }
     
    @Override
    public int xoa(String idgh,String idsp){
       try{
  Connection con = DBConnection.openDbConnection();
  String tt = "DELETE FROM GioHangChiTiet WHERE IDGIOHANG = ? AND IdChiTietSP =?";
  PreparedStatement ps = con.prepareStatement(tt);
 ps.setString(1, idgh);
 ps.setString(2, idsp);
 
 int kq = ps.executeUpdate();
 return kq;
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }
    
    
      public String getidGio(String gio){
           try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT ID FROM GIOHANG WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, gio);
  
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
      
   public String getidCTSP(String sp){
           try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT ID FROM CHITIETSP WHERE IDSP = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, sp);
  
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
      public int them(String gio,String sp,GioHangCT gh){
         try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO GIOHANGCHITIET(IDGIOHANG,IDCHITIETSP,SOLUONG,DONGIA,DONGIAKHIGIAM) VALUES (?,?,?,?,?)";
  PreparedStatement ps = con.prepareStatement(them);
 ps.setString(1,getidGio(gio));
 ps.setString(2, gh.getIdctsp()); //ps.setString(2, getidCTSP(sp));//
 ps.setInt(3,gh.getSl());
 ps.setInt(4,gh.getDongia());
 ps.setInt(5,gh.getDongiagiam());
  
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
          
          
      }
      
      
    @Override
 public int sua(String gio,String sp,GioHangCT gh,String idgh,String idctsp){
         try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE GIOHANGCHITIET SET IDGIOHANG = ?,IDCHITIETSP = ?,SOLUONG = ?,DONGIA = ?,DONGIAKHIGIAM=? WHERE IDGIOHANG = ? AND IDCHITIETSP = ?";
  PreparedStatement ps = con.prepareStatement(sua);
 ps.setString(1,getidGio(gio));
 ps.setString(2, gh.getIdctsp()); //ps.setString(2, getidCTSP(sp));//
 ps.setInt(3,gh.getSl());
 ps.setInt(4,gh.getDongia());
 ps.setInt(5,gh.getDongiagiam());
 ps.setString(7, idgh);
 ps.setString(8, idctsp);
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
          
          
      }
      
    
}
