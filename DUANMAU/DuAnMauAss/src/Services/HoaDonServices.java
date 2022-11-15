/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.HoaDon;
import Repositories.DAOHoaDon;
import Repositories.HoaDonRepositories;
import ViewModel.QLHD;
import java.util.List;

/**
 *
 * @author admin
 */
public class HoaDonServices implements DAOHoaDonServices{
    private final DAOHoaDon qlhd = new HoaDonRepositories();
    
    @Override
    public List<QLHD> getList(){
    try{
    return qlhd.getAll();
    }
    catch(Exception e){
    e.printStackTrace();
    return null;
    }
    }

    @Override
    public int themHD(String makh, String manv, HoaDon hd) {
  if(qlhd.themHD(makh, manv, hd)!=0){
  return 1;
  }
  else{
  return 0;
  }
    }

    @Override
    public int tontai(String ma) {
  if(qlhd.tontai(ma)!=0){
  return 1;
  }
  else{
  return 0;
  }
    
    }

    @Override
    public int xoa(String ma) {
    if(qlhd.xoaHD(ma)!=0){
  return 1;
  }
  else{
  return 0;
  }
    }

    @Override
    public int suaHD(String makh, String manv, HoaDon hd, String ma) {
      if(qlhd.suaHD(makh, manv, hd, ma)!=0){
  return 1;
  }
  else{
  return 0;
  }
    }
}
