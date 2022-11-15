/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.KhachHang;
import Repositories.DAOKhachhang;
import Repositories.KhachHangRepositories;
import ViewModel.QLKH;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class KhachHangServices implements DAOKhachHangServices{
private List<KhachHang> list;
private final DAOKhachhang qlkh = new KhachHangRepositories();
    
    @Override
    public List<QLKH> getList() {
  try{
   return qlkh.getAll();}
   catch(Exception e){
   return null;
   }
    }

    @Override
    public int themKh(KhachHang kh) {
 if(qlkh.themkh(kh)!=0){
 return 1;
 }
 else{
 return 0;
 }
    
    }

    @Override
    public int xoaKh(String ma) {
 if(qlkh.xoakh(ma)!=0){
 return 1;
 }
 else{
 return 0;
 }
    }

    @Override
    public int suaKh(KhachHang kh,String ma) {
if(qlkh.suakh(kh, ma)!=0){
 return 1;
 }
 else{
 return 0;
 }
    }

    @Override
    public int check(String kt) {
  if(qlkh.tontai(kt)!=0){
 return 1;
 }
 else{
 return 0;
 }
    }

    @Override
    public List<QLKH> timkiem(String ma) {
  return  qlkh.timkiem(ma);
    }
    
}
