/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class QLCTSP {
    private String id;
    private String tensp;
    private String tennsx;
    private String tenmausac;
    private String tendongsp;
    private int nambaohanh;
    private int slton;
    private int gianhap;
    private int giaban;

    public QLCTSP(String id, String tensp, String tennsx, String tenmausac, String tendongsp, int nambaohanh, int slton, int gianhap, int giaban) {
        this.id = id;
        this.tensp = tensp;
        this.tennsx = tennsx;
        this.tenmausac = tenmausac;
        this.tendongsp = tendongsp;
        this.nambaohanh = nambaohanh;
        this.slton = slton;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getTennsx() {
        return tennsx;
    }

    public void setTennsx(String tennsx) {
        this.tennsx = tennsx;
    }

    public String getTenmausac() {
        return tenmausac;
    }

    public void setTenmausac(String tenmausac) {
        this.tenmausac = tenmausac;
    }

    public String getTendongsp() {
        return tendongsp;
    }

    public void setTendongsp(String tendongsp) {
        this.tendongsp = tendongsp;
    }

    public int getNambaohanh() {
        return nambaohanh;
    }

    public void setNambaohanh(int nambaohanh) {
        this.nambaohanh = nambaohanh;
    }

    public int getSlton() {
        return slton;
    }

    public void setSlton(int slton) {
        this.slton = slton;
    }

    public int getGianhap() {
        return gianhap;
    }

    public void setGianhap(int gianhap) {
        this.gianhap = gianhap;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
    
    
}
