/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.DongSP;
import Model.MauSac;
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
public class DongSPRepositories {
    public int themndsp(DongSP dsp) {
 
     try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO DONGSP VALUES (NEWID(),?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1, dsp.getMa());
  ps.setString(2, dsp.getTen());
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    } 
    
       public int xoadsp(String ma) {
  try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM DONGSP WHERE MA = ?";
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
       
          public int suadsp(DongSP dsp, String m) {
 
     try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE DONGSP SET MA = ?,TEN=? WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sua);
   ps.setString(1, dsp.getMa());
   ps.setString(2, dsp.getTen());
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
 String sql = "SELECT COUNT(*) FROM DONGSP WHERE Ma = ?";
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
             
               public List<DongSP> getAll() {
       List<DongSP> list = new ArrayList<DongSP>();
   try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT *from DONGSP";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
     DongSP dsp = new DongSP(rs.getString("ID"),rs.getString("MA"),rs.getString("TEN"));
       list.add(dsp);
            }
            return list;
         
           
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
      
    return null;
    }
}
