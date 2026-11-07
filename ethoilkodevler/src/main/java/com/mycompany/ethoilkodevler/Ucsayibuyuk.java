package com.mycompany.ucsayibuyuk;

import java.util.Scanner;


public class Ucsayibuyuk {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
                
                System.out.print("sayı girin");
       
            int sayi1 = scanner.nextInt();
    
    System.out.print("sayı girin");
       
              int  sayi2 = scanner.nextInt();
    
    System.out.print("sayı girin");
       
             int   sayi3 = scanner.nextInt();
    
    
    if (sayi1>sayi2 && sayi1>sayi3 && sayi2!=sayi3){
    
    System.out.println(sayi1+"sayısı diğerlerinden büyüktür ayrıca"+ sayi2 +"sayısı ile"+sayi3+"sayısı eşit değildir");
        
   }    
        
     if (sayi1>sayi2 && sayi1>sayi3 && sayi2==sayi3){
    
    System.out.println(sayi1+"sayısı diğerlerinden büyüktür ayrıca"+ sayi2 +"sayısı ile"+sayi3+"sayısı eşittir");
        
   }     
        
     if (sayi2 >sayi1 && sayi2>sayi3 && sayi1==sayi3){
    
    System.out.println(sayi2+"sayısı diğerlerinden büyüktür ayrıca"+ sayi1 +"sayısı ile"+sayi3+"sayısı eşittir");
        
   }        
        
        
      if (sayi2 >sayi1 && sayi2>sayi3 && sayi1!=sayi3){
    
    System.out.println(sayi2+"sayısı diğerlerinden büyüktür ayrıca"+ sayi1 +"sayısı ile"+sayi3+"sayısı eşit değildir.");
        
   }      
        
        
        if (sayi3 >sayi1 && sayi3>sayi2 && sayi1!=sayi2){
    
    System.out.println(sayi3+"sayısı diğerlerinden büyüktür ayrıca"+ sayi2 +"sayısı ile"+sayi1+"sayısı eşit değildir.");
        
   }      
        
        
     if (sayi3 >sayi1 && sayi3>sayi2 && sayi1==sayi2){
    
    System.out.println(sayi3+"sayısı diğerlerinden büyüktür ayrıca"+ sayi2 +"sayısı ile"+sayi1+"sayısı eşittir.");
        
   }         
        
    if (sayi1==sayi2 && sayi2==sayi3) {   
        
    System.out.println("sayılar birbirine eşittir");
    }
    }
}
