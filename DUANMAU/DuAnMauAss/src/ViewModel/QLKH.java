/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QLKH {
private String ma;
private String ten;
private String diachi;
private String tp;
private String quocgia;

    public QLKH(String ma, String ten, String diachi, String tp, String quocgia) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.tp = tp;
        this.quocgia = quocgia;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

}
