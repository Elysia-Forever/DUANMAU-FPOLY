/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Repositories.ChiTietSanPhamRepositories;
import Repositories.DAOCTSP;
import ViewModel.QLCTSP;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietSanPhamServices implements DAOCTSP_Services{
private final DAOCTSP ql = new ChiTietSanPhamRepositories();


    @Override
    public int themctsp(String idsp, String idNSX, String idMausac, String idDongsp, QLCTSP ctsp) {
       if(ql.themctsp(idsp, idNSX, idMausac, idDongsp, ctsp)!=0){
       return 1;
       }
       else{
       return 0;
       }
    }

    @Override
    public int xoactsp(String id) {
   if(ql.xoactsp(id) !=0){
      return 1;
  }
  else{return 0;}
    
    }

    

    @Override
    public List<QLCTSP> getALL() {
  try{
 return ql.getALL();
 }
catch(Exception e){
   return null;
   }  
    
    
    }

    @Override
    public int sua(String idsp, String idNSX, String idMausac, String idDongsp, QLCTSP ctsp, String id) {
 if(ql.sua(idsp, idNSX, idMausac, idDongsp, ctsp, id)!=0){
 return 1;
 }
 else{
 return 0;
 }
}

    @Override
    public List<QLCTSP> Loc(int gianhap, int giaban) {
   return ql.Loc(gianhap, giaban);
    }
    
}
