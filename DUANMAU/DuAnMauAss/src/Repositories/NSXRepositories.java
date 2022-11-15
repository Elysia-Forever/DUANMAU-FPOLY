/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.ChucVu;
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
public class NSXRepositories {
    
     public int themnsx(NSX n) {
 
     try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO NSX VALUES (NEWID(),?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1, n.getMa());
  ps.setString(2, n.getTen());
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    }
     
       public int xoansx(String ma) {
  try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM NSX WHERE MA = ?";
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
       
        public int suansx(NSX n, String m) {
 
     try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE NSX SET MA = ?,TEN=? WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sua);
   ps.setString(1, n.getMa());
   ps.setString(2,n.getTen());
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
 String sql = "SELECT COUNT(*) FROM NSX WHERE Ma = ?";
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
         
         public List<NSX> getAll() {
       List<NSX> list = new ArrayList<NSX>();
   try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT ID,MA,TEN FROM NSX";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
        NSX n = new NSX(rs.getString("ID"),rs.getString("MA"),rs.getString("TEN"));
         list.add(n);
         
            }
            return list;
         
           
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
      
    return null;
    }

}
