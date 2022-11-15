/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Model.CTSP;
import ViewModel.QLCTSP;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOCTSP {
  public int themctsp(String idsp,String idNSX,String idMausac,String idDongsp,QLCTSP ctsp);
 public int xoactsp(String id);
 public int sua(String idsp,String idNSX,String idMausac,String idDongsp,QLCTSP ctsp,String id);
 public List<QLCTSP> getALL();
 public List<QLCTSP> Loc(int gianhap,int giaban);
}
