/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.NhanVien;
import Repositories.DAONhanvien;
import Repositories.NhanVienRepositories;
import ViewModel.QLNV;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVienServices implements DAONhanvienServices{
private List<NhanVien> list;
private final DAONhanvien qlnv = new NhanVienRepositories();

    @Override
    public int them(String idch,String idcv,QLNV nv) {
   if(qlnv.themnv(idch,idcv,nv)!=0){
   return 1;
   }
   else{
   return 0;
   }
    
    }

    @Override
    public int xoa(String ma) {
   if(qlnv.xoanv(ma)!=0){
   return 1;
   }
   else {
   return 0;
   }
    }

    @Override
    public int sua(String idch,String idcv,QLNV nv, String ma) {
    if(qlnv.suanv(idch,idcv,nv, ma)!=0){
    return 1;
    }
    else {return 0;}
    }

    @Override
    public List<QLNV> getList() {
  try{
      return qlnv.getAll();
 
  }
  catch(Exception e){
  return null;
  }
    
    }

    @Override
    public int tontai(String ma) {
  if(qlnv.tontai(ma)!=0){
  return 1;
  }
  else{
  return 0;
  }
    }

@Override
    public QLNV timkiem(String ma){
   return  qlnv.timkiem(ma);
    }
}
