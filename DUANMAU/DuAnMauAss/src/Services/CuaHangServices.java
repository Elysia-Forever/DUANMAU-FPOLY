/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.CuaHang;
import Repositories.ChucvuRepository;
import Repositories.CuaHangRepositories;
import Repositories.DAOCuahang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class CuaHangServices implements DAOCuaHanhServices{
private final DAOCuahang qlch = new CuaHangRepositories();

 

    @Override
    public List<CuaHang> getList() {
 try{
   return qlch.getAll();}
   catch(Exception e){
   return null;
   }
    }

    @Override
    public int themCh(CuaHang ch) {
 if(qlch.themch(ch)!=0){
    return 1;
 }
 else{
 return 0;
 }
    }

    @Override
    public int xoaCh(String ma) {
  if(qlch.xoach(ma)!=0){
      return 1;}
 else{
 return 0;
 }
    }

    @Override
    public int suaCh(CuaHang ch,String ma) {
  if(qlch.suach(ch, ma)!=0){
     return 1;
   }
 else{
 return 0;
 }
    }

    @Override
    public int kttontai(String ma) {
  if(qlch.tontai(ma)!=0){
  return 1;
  }
  else{
  return 0;
  }
    }
    
}
