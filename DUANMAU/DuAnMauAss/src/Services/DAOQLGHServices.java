/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.GioHang;
import ViewModel.QLGioHang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOQLGHServices {
    public List<QLGioHang> getAll();
    public int xoa(String ma);
    public int tontai(String ma);
    public QLGioHang getFill(String ma);
     public int them(String idnv,String idkh,GioHang gh);
    public int sua(String idnv,String idkh,GioHang gh,String ma);
}
