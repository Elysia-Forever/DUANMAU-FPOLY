/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.ChucVu;
import Model.KhachHang;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class ChucvuRepository implements DAOChucvu{

    @Override
    public int themcv(ChucVu cv) {
 
     try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO CHUCVU VALUES (NEWID(),?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1, cv.getMa());
  ps.setString(2, cv.getTen());
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    }

    @Override
    public int xoacv(String ma) {
  try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM CHUCVU WHERE MA = ?";
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

    @Override
    public int suacv(ChucVu cv, String m) {
 
     try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE CHUCVU SET MA = ?,TEN=? WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sua);
   ps.setString(1, cv.getMa());
   ps.setString(2,cv.getTen());
   ps.setString(3, m);
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }

    @Override
    public int tontai(String kt) {
  
    try{
 Connection con = DBConnection.openDbConnection();
 String sql = "SELECT COUNT(*) FROM CHUCVU WHERE Ma = ?";
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

    @Override
    public List<ChucVu> getAll() {
       List<ChucVu> listcv = new ArrayList<ChucVu>();
   try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT ID,MA,TEN FROM CHUCVU";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
         ChucVu cv = new ChucVu(rs.getString(1),rs.getString(2),rs.getString(3));
         listcv.add(cv);
         
            }
            return listcv;
         
           
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
      
    return null;
    }
    
   
    
}
