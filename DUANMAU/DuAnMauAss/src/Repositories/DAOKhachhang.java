/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Model.KhachHang;
import ViewModel.QLKH;
import ViewModel.QLNV;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOKhachhang {
    public int themkh(KhachHang kh);
    public int xoakh(String ma);
    public int suakh(KhachHang kh,String m);
public int tontai(String kt);
public List<QLKH> getAll();   
  public List<QLKH> timkiem(String ma);   
}
