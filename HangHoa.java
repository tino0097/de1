/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author Admin
 */
public class HangHoa {
    protected String MaHang;
    protected String Ten;
    protected float Giaban;

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public float getGiaban() {
        return Giaban; 
    }

    public void setGiaban(float Giaban) {
        this.Giaban = Giaban;
    }

    public HangHoa(String MaHang, String Ten, float Giaban) {
        this.MaHang = MaHang;
        this.Ten = Ten;
        this.Giaban = Giaban;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "MaHang=" + MaHang + ", Ten=" + Ten + ", Giaban=" + Giaban + '}';
    }
    
    
     public void HienThi(){
        System.out.println(" "+this.getMaHang());
        System.out.println(" "+this.getGiaban());
        System.out.println(" "+this.getTen());
    }
}
