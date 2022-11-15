/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.ChucVu;
import Model.CuaHang;
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
public class CuaHangRepositories  implements DAOCuahang{

    @Override
    public int themch(CuaHang ch) {
  try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO CUAHANG VALUES (NEWID(),?,?,?,?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1,ch.getMa());
  ps.setString(2, ch.getTen());
  ps.setString(3, ch.getDiachi());
  ps.setString(4, ch.getThanhpho());
  ps.setString(5,ch.getQuocgia());
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    }

    @Override
    public int xoach(String ma) {
 try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM CUAHANG WHERE MA = ?";
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
    public int suach(CuaHang ch, String m) {
   try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE CUAHANG SET MA = ?,TEN=?,DIACHI=?,THANHPHO=?,QUOCGIA=? WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sua);
  ps.setString(1,ch.getMa());
  ps.setString(2, ch.getTen());
  ps.setString(3, ch.getDiachi());
  ps.setString(4,ch.getThanhpho());
  ps.setString(5, ch.getQuocgia());
  ps.setString(6, m);
  
  
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
 String sql = "SELECT COUNT(*) FROM CUAHANG WHERE Ma = ?";
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
    public List<CuaHang> getAll() {
     List<CuaHang> listch = new ArrayList<CuaHang>();
     try {Connection con = DBConnection.openDbConnection(); 
     
            Statement st = con.createStatement();
            String danhsach = "SELECT MA,TEN,DIACHI,THANHPHO,QUOCGIA,ID FROM CUAHANG";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
       CuaHang ch = new CuaHang(rs.getString(6),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
         listch.add(ch);
         
            }
            return listch;
         
           
        } 
    catch (SQLException e) {
            e.printStackTrace();
// cbbCH.removeAllItems();            
//        List<CuaHang> ch = chl.getList();
//        for (CuaHang cuaHang : ch) {
//            cbbCH.addItem(cuaHang.getTen());}
  
     }
      
    return null;
    }
    }
    

