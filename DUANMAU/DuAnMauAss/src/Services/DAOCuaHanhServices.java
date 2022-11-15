/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.CuaHang;
import Model.KhachHang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOCuaHanhServices {
     public int themCh(CuaHang ch);
    public int xoaCh(String ma);
    public int suaCh(CuaHang ch,String ma);
    public List<CuaHang> getList();
    public int kttontai(String ma);
}
