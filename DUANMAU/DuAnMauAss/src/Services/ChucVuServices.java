/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.ChucVu;
import Repositories.ChucvuRepository;
import Repositories.DAOChucvu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChucVuServices implements DAOChucVuServices{
private List<ChucVu> list;
private final DAOChucvu ql = new ChucvuRepository();



    @Override
    public List<ChucVu> getList() {
   try{
   return ql.getAll();}
   catch(Exception e){
   return null;
   }
    }

    @Override
    public void xoatoanbo() {
   this.list.removeAll(list);
    }

    @Override
    public int themCv(ChucVu cv) {
 if(ql.themcv(cv)!=0)
 {
    return 1;
 }
 else{
 return 0;
 }
    }

    @Override
    public int xoaCv(String ma) {
  
   if(ql.xoacv(ma)!=0){
      return 1;}
 else{
 return 0;
 }
    }

    @Override
    public int suaCv(ChucVu cv,String ma) {
 
   if(ql.suacv(cv, ma)!=0){
     return 1;
   }
 else{
 return 0;
 }
    }

    @Override
    public int check(String kt) {
    if(ql.tontai(kt)!=0){
        return 1;
        
    }
    else{
       return 0; 
        
    }}
    
}
