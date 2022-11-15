/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.ChucVu;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DAOChucVuServices {
    public int themCv(ChucVu cv);
    public int xoaCv(String ma);
    public int suaCv(ChucVu cv,String ma);
    public List<ChucVu> getList();
    public void xoatoanbo();
    public int check(String kt);
}
