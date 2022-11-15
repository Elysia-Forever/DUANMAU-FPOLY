/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.KhachHang;
import ViewModel.QLKH;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOKhachHangServices {
    public int themKh(KhachHang kh);
    public int xoaKh(String ma);
    public int suaKh(KhachHang kh,String ma);
    public List<QLKH> getList();
     public List<QLKH> timkiem(String ma);
     public int check(String kt);
}
