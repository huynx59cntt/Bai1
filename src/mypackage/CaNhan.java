/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Admin
 */
public class CaNhan 
{
    String ten;
    int tuoi;
    String sdt;
   //contructor --> phim tat Alt + insert

    public CaNhan()
    {
    }
    
    public CaNhan(String ten, int tuoi, String sdt) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String getTT ()
    {
        return "ten: "+ ten +"\n"
                + "tuoi: " + tuoi +"\n"
                + "sdt: " + sdt +"\n";
    }
}
