/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class GioHangCT {
    private String idgh;
    private String idctsp;
    private int sl;
    private int dongia;
    private int dongiagiam;

    public GioHangCT(String idgh, String idctsp, int sl, int dongia, int dongiagiam) {
        this.idgh = idgh;
        this.idctsp = idctsp;
        this.sl = sl;
        this.dongia = dongia;
        this.dongiagiam = dongiagiam;
    }

    public String getIdgh() {
        return idgh;
    }

    public void setIdgh(String idgh) {
        this.idgh = idgh;
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

    public int getDongiagiam() {
        return dongiagiam;
    }

    public void setDongiagiam(int dongiagiam) {
        this.dongiagiam = dongiagiam;
    }
    
    
}
