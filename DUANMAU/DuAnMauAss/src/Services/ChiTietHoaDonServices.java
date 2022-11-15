/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.CTHD;
import Repositories.ChiTietHoaDonRepositories;
import Repositories.DAOCTHDRepositories;
import ViewModel.QLCTHD;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietHoaDonServices implements DAOCTHDServices{
private final DAOCTHDRepositories ql = new ChiTietHoaDonRepositories();
   

    @Override
    public int xoa(CTHD cthd) {
return  ql.xoa(cthd);
    }

   

    @Override
    public List<QLCTHD> getList() {
   return ql.getAll();
    }

    @Override
    public int them(CTHD cthd) {
   return ql.them(cthd);
    }

    @Override
    public int sua(CTHD cthd, String idhd,String idsp) {
  return ql.sua(cthd, idhd, idsp);
    }

    @Override
    public int tontai(String idhd, String idsp) {
   return  ql.tontai(idhd, idsp);
    
    }
    
    
   
}
