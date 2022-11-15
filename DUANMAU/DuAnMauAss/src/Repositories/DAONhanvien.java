/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Model.ChucVu;
import Model.NhanVien;
import ViewModel.QLNV;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAONhanvien {
  public int themnv(String idch,String idcv,QLNV nv);
  public int xoanv(String ma);
  public int suanv(String idch,String idcv,QLNV cv,String m);
  public int tontai(String kt);
  public List<QLNV> getAll();
  public QLNV timkiem(String ma);
}
