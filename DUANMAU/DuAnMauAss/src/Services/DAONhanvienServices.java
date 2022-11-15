/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.NhanVien;
import ViewModel.QLNV;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAONhanvienServices {
    public int them(String idch,String idcv,QLNV nv);
    public int xoa(String ma);
    public int sua(String idch,String idcv,QLNV nv,String ma);
    public List<QLNV> getList();
    public int tontai(String ma);
    public QLNV timkiem(String ma);
}
