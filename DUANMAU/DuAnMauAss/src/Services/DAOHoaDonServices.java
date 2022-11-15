/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.HoaDon;
import ViewModel.QLHD;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOHoaDonServices {
    public List<QLHD> getList();
    public int themHD(String makh,String manv,HoaDon hd);
     public int tontai(String ma);
     public int xoa(String ma);
      public int suaHD(String makh,String manv,HoaDon hd,String ma);
}
