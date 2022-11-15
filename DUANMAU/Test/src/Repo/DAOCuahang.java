/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repo;

import DomainModel.CuaHang;

import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOCuahang {
      public int themch(CuaHang ch);
    public int xoach(String ma);
    public int suach(CuaHang ch,String m);
public int tontai(String kt);
public List<CuaHang> getAll();
}
