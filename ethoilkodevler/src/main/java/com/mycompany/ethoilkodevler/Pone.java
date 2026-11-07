package com.mycompany.ethoilkodevler;

import java.util.Scanner;



/**
 *
 * @author yasar
 */
public class Pone {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
    
     System.out.print("sayı girin");
                
     int sayi = scanner.nextInt();
                
     if (sayi>0) {
         
         System.out.println(sayi + "sayısı pozitiftir");
     }
        
     else if (sayi==0){
         System.out.println(sayi + "sayısı 0,dır");
     }
     
     else {
         System.out.println(sayi + "sayısı negatiftir.");
                 }
}
}