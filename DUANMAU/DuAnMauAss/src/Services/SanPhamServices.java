/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Sanpham;
import Repositories.SanPhamRepositories;
import ViewModel.QLSP;
import java.util.List;

/**
 *
 * @author admin
 */
public class SanPhamServices {
    private final SanPhamRepositories qlsp = new SanPhamRepositories();
    public int themsp(Sanpham sp){
          if(qlsp.them(sp)!=0)
 {
    return 1;
 }
          
 else{
 return 0;
 }
    
    }
    
    public int xoasp(String ma){
    if(qlsp.xoa(ma) !=0){
      return 1;
  }
  else{return 0;}
    
    }
    
    public int sua(Sanpham sp,String ma){
    if(qlsp.sua(sp, ma)!=0){
      return 1;
  }
  else{return 0;}
    
    }
    
    public int check(String ma){
    if(qlsp.tontai(ma) !=0){
      return 1;
  }
  else{return 0;}
    
    }
    
    public List<QLSP> getList(){
    try{
 return qlsp.getAll();
 }
catch(Exception e){
   return null;
   }  
    
    }
    
    
}
