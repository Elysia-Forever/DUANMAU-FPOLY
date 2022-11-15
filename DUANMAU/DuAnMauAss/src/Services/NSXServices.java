/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.NSX;
import Repositories.NSXRepositories;
import java.util.List;

/**
 *
 * @author admin
 */
public class NSXServices {
    private final NSXRepositories ql = new NSXRepositories();
    
    public int them(NSX nsx){
        if(ql.themnsx(nsx)!=0)
 {
    return 1;
 }
 else{
 return 0;
 }
        
    }
    
    public int xoa(String ma){
  if(ql.xoansx(ma) !=0){
      return 1;
  }
  else{return 0;}
    }
    
    public int sua(NSX nsx,String ma){
     if(ql.suansx(nsx, ma)!=0){
     return 1;
     }   
     else{
     return 0;
     }
    }
    
    public int check(String ma){
    if(ql.tontai(ma)!=0){
    return 1;
    }
    else{
    return 0;
    
    }
    }
    
    public List<NSX> getList(){
 try{
 return ql.getAll();
 }
catch(Exception e){
   return null;
   }  
    
    }
}
