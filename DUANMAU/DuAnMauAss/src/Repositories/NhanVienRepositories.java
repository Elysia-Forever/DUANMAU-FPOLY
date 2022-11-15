/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.CuaHang;
import Model.KhachHang;
import Model.NhanVien;
import Utilities.DBConnection;
import ViewModel.QLNV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVienRepositories implements DAONhanvien{

   public String getIDCH(String ma){
   try{
   Connection con = DBConnection.openDbConnection();
   String layid = "Select ID FROM CUAHANG WHERE TEN = ? ";
   PreparedStatement ps = con.prepareStatement(layid);
   ps.setString(1, ma);
   ResultSet rs = ps.executeQuery();
   while(rs.next()){
   String id =  rs.getString(1);
   return id;
   }
   
   }
     catch (Exception ex) {
        ex.printStackTrace();
        }   
       
   return null;
   }
   
     public String getIDCV(String ma){
   try{
   Connection con = DBConnection.openDbConnection();
   String layid = "Select ID FROM CHUCVU WHERE TEN = ? ";
   PreparedStatement ps = con.prepareStatement(layid);
   ps.setString(1, ma);
   ResultSet rs = ps.executeQuery();
   while(rs.next()){
   String id =  rs.getString(1);
   return id;
   }
   
   }
     catch (Exception ex) {
           ex.printStackTrace();
        }   
       
   return null;
   }

    @Override
    public int themnv(String idch,String idcv,QLNV nv) {
  try{
  Connection con = DBConnection.openDbConnection();
   String themnv = "INSERT INTO NHANVIEN(ID,MA,TEN,TENDEM,HO,GIOITINH,NGAYSINH,DIACHI,SDT,MATKHAU,IDCH,IDCV) VALUES(NEWID(),?,?,?,?,?,?,?,?,?,?,?)";
   PreparedStatement ps = con.prepareStatement(themnv);
   ps.setString(1, nv.getMa());
   ps.setString(2, nv.getTen());
   ps.setString(3, nv.getTendem());
   ps.setString(4, nv.getHo());
   ps.setString(5, nv.getGioitinh());
   ps.setString(6, nv.getNgaysinh());
   ps.setString(7, nv.getDiachi());
   ps.setString(8, nv.getSdt());
   ps.setString(9, nv.getMatkhau());
   ps.setString(10, getIDCH(idch));
   ps.setString(11, getIDCV(idcv));
   
   int kq = ps.executeUpdate();
   return kq;
  
  }
        
    catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0;  
    }

    @Override
    public int xoanv(String ma) {
    try{
  Connection con = DBConnection.openDbConnection();
  String xoa = "DELETE FROM NHANVIEN WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(xoa);
  ps.setString(1, ma);
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
        ex.printStackTrace();
        }
 return 0; 
    }

    @Override
    public int suanv(String idch,String idcv,QLNV nv, String m) {
   try{
  Connection con = DBConnection.openDbConnection();
  String sua = "UPDATE NHANVIEN SET MA = ?,TEN=?,TENDEM=?,HO=?,GIOITINH=?,NGAYSINH=?,DIACHI=?,SDT=?,MATKHAU=?,IDCH=?,IDCV=? WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sua);
 ps.setString(1,nv.getMa());
 ps.setString(2,nv.getTen());
 ps.setString(3,nv.getTendem());
 ps.setString(4, nv.getHo());
 ps.setString(5,nv.getGioitinh());
 ps.setString(6,nv.getNgaysinh());
 ps.setString(7,nv.getDiachi());
 ps.setString(8,nv.getSdt());
 ps.setString(9, nv.getMatkhau());
 ps.setString(10,getIDCH(idch));
 ps.setString(11, getIDCV(idcv));
 ps.setString(12,m);
  
  
  int kq = ps.executeUpdate();
  return kq;
 
  }
    
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0; 
    
    }

    @Override
    public List<QLNV> getAll() {
  List<QLNV> listnv = new ArrayList<QLNV>();
     try {Connection con = DBConnection.openDbConnection(); 
           
            Statement st = con.createStatement();
            String danhsach = "select nhanvien.id,nhanvien.ma,nhanvien.ten,tendem,ho,gioitinh,CONVERT(NVARCHAR(50),ngaysinh,110),nhanvien.diachi,sdt,matkhau,idch,idcv,cuahang.TEN,chucvu.TEN  FROM CUAHANG join nhanvien on cuahang.id = nhanvien.idCH join chucvu on nhanvien.idcv = chucvu.id ";
            ResultSet rs = st.executeQuery(danhsach);
            
            while(rs.next()){
             QLNV nv = new QLNV(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
            listnv.add(nv);
            }    
         return listnv;
         
        } 
    catch (SQLException e) {
            e.printStackTrace();
     }
      
    return null;
    }

    @Override
    public int tontai(String kt) {
   try{
  Connection con = DBConnection.openDbConnection();
  String sql = "SELECT COUNT(*) FROM NHANVIEN WHERE MA = ?";
  PreparedStatement ps = con.prepareStatement(sql);
 ps.setString(1,kt);
  
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
    public QLNV timkiem(String ma){
     try{
  Connection con = DBConnection.openDbConnection();
  String sql = "SELECT dbo.NhanVien.Ma, dbo.NhanVien.Ho, dbo.NhanVien.TenDem, dbo.NhanVien.Ten, dbo.NhanVien.MatKhau, dbo.CuaHang.Ten AS Expr1, dbo.ChucVu.Ten AS Expr2\n" +
"  FROM CHUCVU join nhanvien on CHUCVU.id = nhanvien.idCV join cUAHANG on nhanvien.idch = cuahang.id  WHERE NHANVIEN.MA = ?";
  PreparedStatement ps = con.prepareStatement(sql);
 ps.setString(1,ma);
  
       ResultSet rs = ps.executeQuery();
       while(rs.next()){
           
      QLNV ql = new QLNV("a", rs.getString(1),rs.getString(4),rs.getString(3),rs.getString(2),"a","a","a","a",rs.getString(5) ,"a","a",rs.getString(6),rs.getString(7));
     return ql;
       }
 
  }
 catch (Exception ex) {
            Logger.getLogger(KhachHangRepositories.class.getName()).log(Level.SEVERE, null, ex);
//    int dau = ten.indexOf(" ");
// int cuoi = ten.lastIndexOf(" ");
// String ho = ten.substring(0,dau);
// String dem = ten.substring(dau,cuoi);
// String t = ten.substring(cuoi);
        }
   return null;
    }
    
}
