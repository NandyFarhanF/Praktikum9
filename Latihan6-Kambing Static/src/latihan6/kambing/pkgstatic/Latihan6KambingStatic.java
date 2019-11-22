/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6.kambing.pkgstatic;

/**
 *
 * @author Rizki Adam Kurniawan
 */
public class Latihan6KambingStatic {
    
    // Variabel jumlahKambing dideklarasikan sebagai statik
   public static int jumlahKambing; 

} 
   class KambingStatic { 
    
 // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
       Latihan6KambingStatic.jumlahKambing = 485000;
       System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                           + Latihan6KambingStatic.jumlahKambing);
    }
}
