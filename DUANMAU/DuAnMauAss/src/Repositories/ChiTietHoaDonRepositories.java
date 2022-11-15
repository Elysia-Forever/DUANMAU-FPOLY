/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.CTHD;
import Utilities.DBConnection;
import ViewModel.QLCTHD;
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
public class ChiTietHoaDonRepositories implements DAOCTHDRepositories{

   

    @Override
    public int xoa(CTHD cthd) {
     try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM HOADONCHITIET WHERE IDHOADON = ? AND IDCHITIETSP = ? AND SOLUONG = ? AND DONGIA = ?";
  PreparedStatement ps = con.prepareStatement(xoa);
  ps.setString(1, cthd.getIdhd());
  ps.setString(2, cthd.getIdctsp());
  ps.setInt(3, cthd.getSl());
  ps.setInt(4, cthd.getDongia());
 
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }

    

    @Override
    public List<QLCTHD> getAll() {
  List<QLCTHD> list = new ArrayList<QLCTHD>();
    try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "SELECT * FROM HOADONCHITIET";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
        QLCTHD ql = new QLCTHD(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
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
    public int tontai(String idhd,String idsp){
      try{
  Connection con = DBConnection.openDbConnection();
  String them = "SELECT COUNT(*) FROM HOADONCHITIET WHERE IDHOADON = ? AND IDCHITIETSP =?";
  PreparedStatement ps = con.prepareStatement(them);
 ps.setString(1, idhd);
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
    public int them(CTHD cthd) {
     try{
  Connection con = DBConnection.openDbConnection();
  String them = "INSERT INTO HOADONCHITIET VALUES (?,?,?,?)";
  PreparedStatement ps = con.prepareStatement(them);
  ps.setString(1, cthd.getIdhd());
  ps.setString(2, cthd.getIdctsp());
  ps.setInt(3, cthd.getSl());
  ps.setInt(4,cthd.getDongia());
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }

    @Override
    public int sua(CTHD cthd, String idHD,String idsp) {
  try{
        Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE HOADONCHITIET SET IDHOADON = ? ,IDCHITIETSP = ? ,SOLUONG = ?,DONGIA = ? WHERE IDHOADON = ? AND IDCHITIETSP = ? ";
  PreparedStatement ps = con.prepareStatement(sua);
  ps.setString(1, cthd.getIdhd());
  ps.setString(2, cthd.getIdctsp());
  ps.setInt(3, cthd.getSl());
  ps.setInt(4,cthd.getDongia());
  ps.setString(5, idHD);
  ps.setString(6, idsp);
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    }
    
}
