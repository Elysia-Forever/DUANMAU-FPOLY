/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Model.ChucVu;
import Model.CuaHang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOChucvu {
  public int themcv(ChucVu cv);
  public int xoacv(String ma);
  public int suacv(ChucVu cv,String m);
public int tontai(String kt);
public List<ChucVu> getAll();
}
