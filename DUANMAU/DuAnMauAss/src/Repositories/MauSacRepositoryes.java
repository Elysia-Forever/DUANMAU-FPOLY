/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.MauSac;
import Model.NSX;
import Utilities.DBConnection;
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
public class MauSacRepositoryes {
     public int themnms(MauSac m) {
 
     try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO MAUSAC VALUES (NEWID(),?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1, m.getMa());
  ps.setString(2, m.getTen());
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    }
     
       public int xoanms(String ma) {
  try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM MAUSAC WHERE MA = ?";
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
       
        public int suams(MauSac ms, String m) {
 
     try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE MASAC SET MA = ?,TEN=? WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sua);
   ps.setString(1, ms.getMa());
   ps.setString(2,ms.getTen());
   ps.setString(3, m);
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }
        
         public int tontai(String kt) {
  
    try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT COUNT(*) FROM MAUSAC WHERE Ma = ?";
  PreparedStatement ps = con.prepareStatement(sql);
  ps.setString(1, kt);
  
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
          public void reli(){
//CHECK GIA,SL    
//  boolean ktnhap = false;
//    ktnhap = nhap.matches("[1-9][0-9]{0,}");
//    if(ktnhap == false){
//    }   
    
 //CHECK  date , MK
 // kt = ngaysinh.matches("(0[1-9]|1[0-2])[-](0[1-9]|[12][0-9]|3[01])[-][12][0-9]{3}");    (mm-dd-yyyy)
 // kt = ngaysinh.matches("[12][0-9]{3}[-](0[1-9]|1[0-2])[-](0[1-9]|[12][0-9]|3[01])");   (yyyy-mm-dd) 
 //  mk = matkhau.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{5,}$");     
      }    
         
         public List<MauSac> getAll() {
       List<MauSac> list = new ArrayList<MauSac>();
   try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT *from MAUSAC";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
       MauSac m = new MauSac(rs.getString("ID"),rs.getString("MA"),rs.getString("TEN"));
         list.add(m);
         
            }
            return list;
         
           
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
      
    return null;
    }
}
