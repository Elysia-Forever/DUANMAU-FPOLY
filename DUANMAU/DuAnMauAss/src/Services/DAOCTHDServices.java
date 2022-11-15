/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.CTHD;
import ViewModel.QLCTHD;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOCTHDServices {
      public int them(CTHD cthd);
    public int xoa(CTHD cthd);
    public int sua(CTHD cthd,String idhd,String idsp);
    public List<QLCTHD> getList();
    public int tontai(String idhd,String idsp);
}
