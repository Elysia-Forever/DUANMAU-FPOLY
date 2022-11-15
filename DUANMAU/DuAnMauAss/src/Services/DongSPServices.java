/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.DongSP;
import Model.MauSac;
import Repositories.DongSPRepositories;
import java.util.List;

/**
 *
 * @author admin
 */
public class DongSPServices {
    private final DongSPRepositories ql = new DongSPRepositories();
    
    
      public int xoa(String ma){
    if(ql.xoadsp(ma) !=0){
      return 1;
  }
  else{return 0;}
    }
      
         public int them(DongSP dsp){
         if(ql.themndsp(dsp)!=0)
 {
    return 1;
 }
 else{
 return 0;
 }
    }
         
      public int sua(DongSP dsp,String ma){
     if(ql.suadsp(dsp, ma) !=0){
      return 1;
  }
  else{return 0;}
    
    }
      
       public List<DongSP> getList(){
    try{
 return ql.getAll();
 }
catch(Exception e){
   return null;
   }  
    
    }
    
}
