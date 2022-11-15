/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.CuaHang;
import Model.KhachHang;
import Utilities.DBConnection;
import ViewModel.QLKH;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class KhachHangRepositories implements DAOKhachhang{

    @Override
    public int themkh(KhachHang kh) {
 try {
            Connection con = DBConnection.openDbConnection();
            //Truy vấn
           String them = "INSERT INTO Khachhang values (newID(),?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(them);
           ps.setString(1,kh.getMaKh());
           ps.setString(2,kh.getTenKh());
           ps.setString(3,kh.getTenDem());
           ps.setString(4,kh.getHo());
           ps.setString(5,kh.getNgaySinh().toString());
           ps.setString(6,kh.getSdt());
           ps.setString(7,kh.getDiachi());
           ps.setString(8,kh.getThanhPho());
           ps.setString(9,kh.getQuocGia());
           ps.setString(10,kh.getMatkhau());
           
                 
            int kq = ps.executeUpdate();
            return kq;
            
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;      

    }

    @Override
    public int xoakh(String ma) {
 try{
   Connection con = DBConnection.openDbConnection();
   String delete = "DELETE KHACHHANG WHERE MA = ?";
   PreparedStatement ps = con.prepareStatement(delete);
   
   ps.setString(1,ma);
   
   int kq = ps.executeUpdate();
   return kq;
 
 }
     
catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        } 
     
     
    return 0;
    }

    @Override
    public int suakh(KhachHang kh,String m) {
 try{
 Connection con = DBConnection.openDbConnection();
 String sua = "UPDATE KHACHHANG SET TEN=?,DIACHI=?,THANHPHO=?,QUOCGIA=? WHERE MA = ?";
 PreparedStatement ps = con.prepareStatement(sua);
 
           ps.setString(1,kh.getTenKh());
           ps.setString(2,kh.getDiachi());
           ps.setString(3,kh.getThanhPho());
           ps.setString(4,kh.getQuocGia());
          
           ps.setString(5, m);
           
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
 String sql = "SELECT COUNT(*) FROM KHACHHANG WHERE THANHPHO = ?";
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
    public List<QLKH> getAll() {
  List<QLKH> listkh = new ArrayList<QLKH>();
    try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT MA,TEN,DIACHI,THANHPHO,QUOCGIA FROM KHACHHANG";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
         QLKH kh = new QLKH(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            listkh.add(kh);
            }    
         
         return listkh;
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
      
    return null;
    
    }

    @Override
    public List<QLKH> timkiem(String ma) {
   List<QLKH> listkh = new ArrayList<QLKH>();
    try {Connection con = DBConnection.openDbConnection(); 
           
            String danhsach = "SELECT MA,TEN,DIACHI,THANHPHO,QUOCGIA FROM KHACHHANG WHERE THANHPHO = ?";
             PreparedStatement ps = con.prepareStatement(danhsach);
  ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
         QLKH kh = new QLKH(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            listkh.add(kh);
            }    
         
         return listkh;
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
      
    return null;
    }

 
   
    
}
