package com.mycompany.ethoilkodevler;

import java.util.Scanner;

        
        
        public class Ikisayibuyuk {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
   
    System.out.print("sayı girin");
    
    int sayi1 = scanner.nextInt();
   
    System.out.print("sayı girin");
    
    int sayi2 = scanner.nextInt();
    
    if (sayi1>sayi2){ 
        
        System.out.println(sayi1 + "sayısı," + sayi2 + "sayısından büyüktür." );
    }
    
    else if (sayi2 >sayi1 ) {
        
        System.out.println(sayi2 + "sayısı," +sayi1 + "sayısından büyüktür");
    }
    
    else {
        
      System.out.println ("sayılar eşittir");
   
    }
    }
}
