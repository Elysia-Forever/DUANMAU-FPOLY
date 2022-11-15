/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Model.GioHangCT;
import ViewModel.QLGioHangCT;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOGioHangCTRepo {
    public List<QLGioHangCT> getAll();
    public int tontai(String idgh,String idsp);
     public int xoa(String idgh,String idsp);
      public int them(String gio,String sp,GioHangCT gh);
    public int sua(String gio,String sp,GioHangCT gh,String idgh,String idctsp);  
}
