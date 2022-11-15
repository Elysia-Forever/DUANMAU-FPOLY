/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class QLCTHD {
    private String idhd;
    private String idctsp;
    private int sl;
    private int dongia;

    public QLCTHD(String idhd, String idctsp, int sl, int dongia) {
        this.idhd = idhd;
        this.idctsp = idctsp;
        this.sl = sl;
        this.dongia = dongia;
    }

    public String getIdhd() {
        return idhd;
    }

    public void setIdhd(String idhd) {
        this.idhd = idhd;
    }

    public String getIdctsp() {
        return idctsp;
    }

    public void setIdctsp(String idctsp) {
        this.idctsp = idctsp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
     
}
