/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.Sanpham;
import Utilities.DBConnection;
import ViewModel.QLSP;
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
public class SanPhamRepositories {
    public int them(Sanpham sp){
       try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO SANPHAM VALUES (NEWID(),?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1, sp.getMa());
  ps.setString(2, sp.getTen());
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    }
    
    public int xoa(String ma){
     try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM SANPHAM WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(xoa);
  ps.setString(1, ma);
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
       
    }
    
    public int sua(Sanpham sp,String ma){
     try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE SANPHAM SET MA = ?,TEN=? WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sua);
   ps.setString(1, sp.getMa());
   ps.setString(2,sp.getTen());
   ps.setString(3, ma);
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }
    
    public int tontai(String ma){
       try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT COUNT(*) FROM SANPHAM WHERE Ma = ?";
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
    
    public List<QLSP> getAll(){
    
        List<QLSP> list = new ArrayList<QLSP>();
   try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT MA,TEN FROM SANPHAM";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
       QLSP sp = new QLSP(rs.getString("MA"),rs.getString("TEN"));
         list.add(sp);
         
            }
            return list;
         
           
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
      
    return null;
    }
    }

