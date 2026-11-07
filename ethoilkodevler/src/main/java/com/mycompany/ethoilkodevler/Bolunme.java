package com.mycompany.ethoodev;

import java.util.Scanner;

public class Bolunme {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner (System.in);    
        
    System.out.print("sayı giriniz");
        
    int sayi = scanner. nextInt ()  ;  
        
     if (sayi%3 ==0 && sayi%5 ==0) {
         
         System.out.print(sayi + " sayisi hem 3'e hem 5'e ve dolayisiyle de 15'e tam bolunur.");
     } 
     
     else if (sayi%3==0) {
         
         System.out.println(sayi + " sayisi 3'e tam bolunur ancak 5'e tam bolunmez.");
     }
        
     else if (sayi%5==0) {
         
         System.out.println(sayi + " sayisi 5'e tam bolunur ancak 3'e tam bolunmez.");
     } 
        
     else {
         
         System.out.println(sayi+ " sayisi ne 5'e ne de 3'e tam bolunmez.");
     }  
        
        
       }
}
