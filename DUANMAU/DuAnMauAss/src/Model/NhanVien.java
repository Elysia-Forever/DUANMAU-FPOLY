/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String id;
    private String ma;
    private String ten;
    private String tendem;
    private String ho;
    private String gioitinh;
    private String  ngaysinh;
    private String diachi;
    private String sdt;
    private String matkhau;
    private String idcuahang;
    private String idchucvu;
    private String idguibaocao;
    private int trangthai;

    public NhanVien() {
    }

    public NhanVien(String id, String ma, String ten, String tendem, String ho, String gioitinh, String ngaysinh, String diachi, String sdt, String matkhau, int trangthai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.trangthai = trangthai;
    }

    public NhanVien(String id, String ma, String ten, String tendem, String ho, String gioitinh, String ngaysinh, String diachi, String sdt, String matkhau, String idcuahang, String idchucvu, int trangthai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.idcuahang = idcuahang;
        this.idchucvu = idchucvu;
       
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getIdcuahang() {
        return idcuahang;
    }

    public void setIdcuahang(String idcuahang) {
        this.idcuahang = idcuahang;
    }

    public String getIdchucvu() {
        return idchucvu;
    }

    public void setIdchucvu(String idchucvu) {
        this.idchucvu = idchucvu;
    }

    public String getIdguibaocao() {
        return idguibaocao;
    }

    public void setIdguibaocao(String idguibaocao) {
        this.idguibaocao = idguibaocao;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
