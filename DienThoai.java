/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class DienThoai extends HangHoa implements Serializable{
    private String nsx;
    private float dungluong;
    private String mausac;

    public DienThoai(String nsx, float dungluong, String mausac,String MaHang, String Ten, float Giaban) {
        super(MaHang, Ten, Giaban);
        this.nsx = nsx;
        this.dungluong = dungluong;
        this.mausac = mausac;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public float getDungluong() {
        return dungluong;
    }

    public void setDungluong(float dungluong) {
        this.dungluong = dungluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "nsx=" + nsx + ", dungluong=" + dungluong + ", mausac=" + mausac + '}';
    }
    
    
    @Override
     public void HienThi(){
        super.HienThi();
        System.out.println(" "+this.getDungluong());
        System.out.println(" "+this.getMausac());
        System.out.println(" "+this.getNsx());
    }
}
