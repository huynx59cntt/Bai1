/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

import mypackage.CaNhan;
import mypackage.HocSinh;

/**
 *
 * @author Admin
 */
public class HelloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Phim tat sua loi~ thieu import Alt + Enter
//        CaNhan c = new CaNhan("Minh", 20, "012345");
//        System.out.println("Ten: "+ c.getTen());
//        System.out.println("Tuoi: "+ c.getTuoi());
//        System.out.println("Sđt: "+ c.getSdt());
        // TODO code application logic here
        
        HocSinh hs = new HocSinh();
        hs.setTen("Thanh");
        hs.setTuoi(21);
        hs.setSdt("01234");
        hs.setLop("59CNTT3");
        System.out.println(hs.getTT());
        
    }
    
}
