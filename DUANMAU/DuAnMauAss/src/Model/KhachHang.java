/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class KhachHang {
    private String id;
    private String MaKh;
    private String TenKh;
    private String TenDem;
    private String Ho;
    private String NgaySinh;
    private String sdt;
    private String Diachi;
    private String ThanhPho;
    private String QuocGia;
    private String Matkhau;

    public KhachHang() {
    }

    public KhachHang(String MaKh, String TenKh, String Diachi, String ThanhPho, String QuocGia) {
        this.MaKh = MaKh;
        this.TenKh = TenKh;
        this.Diachi = Diachi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
    }
    

    public KhachHang(String id, String MaKh, String TenKh, String TenDem, String Ho, String NgaySinh, String sdt, String Diachi, String ThanhPho, String QuocGia, String Matkhau) {
        this.id = id;
        this.MaKh = MaKh;
        this.TenKh = TenKh;
        this.TenDem = TenDem;
        this.Ho = Ho;
        this.NgaySinh = NgaySinh;
        this.sdt = sdt;
        this.Diachi = Diachi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
        this.Matkhau = Matkhau;
    }

    public KhachHang(String MaKh, String TenKh, String TenDem, String Ho, String NgaySinh, String sdt, String Diachi, String ThanhPho, String QuocGia, String Matkhau) {
        this.MaKh = MaKh;
        this.TenKh = TenKh;
        this.TenDem = TenDem;
        this.Ho = Ho;
        this.NgaySinh = NgaySinh;
        this.sdt = sdt;
        this.Diachi = Diachi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
        this.Matkhau = Matkhau;
    }

    public KhachHang(String MaKh, String TenKh, String TenDem, String Ho, String sdt, String Diachi, String ThanhPho, String QuocGia) {
        this.MaKh = MaKh;
        this.TenKh = TenKh;
        this.TenDem = TenDem;
        this.Ho = Ho;
        this.sdt = sdt;
        this.Diachi = Diachi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaKh() {
        return MaKh;
    }

    public void setMaKh(String MaKh) {
        this.MaKh = MaKh;
    }

    public String getTenKh() {
        return TenKh;
    }

    public void setTenKh(String TenKh) {
        this.TenKh = TenKh;
    }

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }
    
    
           
}
