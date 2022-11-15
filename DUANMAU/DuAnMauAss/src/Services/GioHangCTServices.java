/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.GioHangCT;
import Repositories.ChiTietGioHangRepositories;
import Repositories.DAOGioHangCTRepo;
import ViewModel.QLGioHangCT;
import java.util.List;

/**
 *
 * @author admin
 */
public class GioHangCTServices implements DAOGioHangCTServices{
private final DAOGioHangCTRepo ql = new ChiTietGioHangRepositories();
    @Override
    public List<QLGioHangCT> getAll() {
 return ql.getAll();
    }

    @Override
    public int tontai(String idgh, String idsp) {
   return ql.tontai(idgh, idsp);
    }

    @Override
    public int xoa(String idgh, String idsp) {
  return ql.xoa(idgh, idsp);
    }

    @Override
    public int them(String gio, String sp, GioHangCT gh) {
  return ql.them(gio, sp, gh);
    }

    @Override
    public int sua(String gio, String sp, GioHangCT gh, String idgh, String idctsp) {
  return ql.sua(gio, sp, gh, idgh, idctsp);
    }
    
}
