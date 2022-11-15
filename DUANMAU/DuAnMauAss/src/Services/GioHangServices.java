/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.GioHang;
import Repositories.DAOGioHangRepo;
import Repositories.GioHangRepositories;
import ViewModel.QLGioHang;
import java.util.List;

/**
 *
 * @author admin
 */
public class GioHangServices implements DAOQLGHServices{
private final DAOGioHangRepo ql = new GioHangRepositories();
    @Override
    public List<QLGioHang> getAll() {
  return  ql.getAll();
    }

    @Override
    public int xoa(String ma) {
   return ql.xoa(ma);
    }

    @Override
    public int tontai(String ma) {
   return ql.tontai(ma);
    }

    @Override
    public QLGioHang getFill(String ma) {
    return ql.getFill(ma);
    }

    @Override
    public int them(String idnv, String idkh, GioHang gh) {
   return ql.them(idnv, idkh, gh);
    }

    @Override
    public int sua(String idnv, String idkh, GioHang gh, String ma) {
  return ql.sua(idnv, idkh, gh, ma);
    }
    
}
