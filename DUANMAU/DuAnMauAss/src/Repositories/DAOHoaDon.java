/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Model.HoaDon;
import ViewModel.QLHD;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOHoaDon {
    public List<QLHD> getAll();
    public int themHD(String makh,String manv,HoaDon hd);
    public int tontai(String ma);
    public int xoaHD(String ma);
    public int suaHD(String makh,String manv,HoaDon hd,String ma);
}
