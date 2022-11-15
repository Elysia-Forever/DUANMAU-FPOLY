/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.MauSac;
import Repositories.MauSacRepositoryes;
import java.util.List;

/**
 *
 * @author admin
 */
public class MauSacServices {
    private final MauSacRepositoryes list = new MauSacRepositoryes();
    
    public int them(MauSac m){
         if(list.themnms(m)!=0)
 {
    return 1;
 }
 else{
 return 0;
 }
    }
    
    public int xoa(String ma){
    if(list.xoanms(ma) !=0){
      return 1;
  }
  else{return 0;}
    }
    
    public int sua(MauSac m,String ma){
     if(list.suams(m, ma) !=0){
      return 1;
  }
  else{return 0;}
    
    }
    
    public int check(String ma){
     if(list.tontai(ma) !=0){
      return 1;
  }
  else{return 0;}
    
    }
    
    public List<MauSac> getList(){
    try{
 return list.getAll();
 }
catch(Exception e){
   return null;
   }  
    
    }
}
