package com.mycompany.ethoilkodevler;

import java.util.Scanner;


public class Hesapm {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner ( System.in);
        
    System.out.print("hangi islemi yapacaginizi giriniz. toplama ise 1 ,cıkarma ise 2 ,carpma ise 3,bolme ise 4 yaziniz.");
    
    int istek =scanner.nextInt();
    
    
    
   if (istek ==1) { 
     
    System.out.print("1. sayiyi girin.");
        
     int sayi1 =scanner .nextInt();
   
    System.out.println("2.sayiyi girin.");
    
    int sayi2 = scanner .nextInt();
    
    int sonuc= sayi1 + sayi2 ;
    
    System.out.print(sonuc);
    }
    
    else if (istek==2){
            
      System.out.print("eksilen (azalan) sayiyi giriniz.");
            
       int eks =scanner.nextInt();
            
      System.out.print("cikan (eksileni azaltan) sayiyi giriniz");
            
        int cik =scanner.nextInt();    
            
      int sonuc = eks - cik ;
               
      System.out.println(sonuc);
            }     
            
            
    else if (istek==3){
        
        System.out.print("carpacagınız birinci sayiyi giriniz");
    
    int sayi1 =scanner.nextInt();
    
    System.out.println("carpacaginiz ikinci sayiyi giriniz.");
    
    int sayi2 =scanner.nextInt();
    
    
    int sonuc =sayi1*sayi2;
   
    System.out.println(sonuc);
    }
    
    
    else if (istek==4) {     
    
    System.out.print("bolunen sayiyi giriniz.");
        
     int sayi1 = scanner.nextInt();
     
     System.out.print("bolen sayiyi girin");
        
     int sayi2 = scanner.nextInt();
     if (sayi2!=0) {  
     int sonuc= sayi1/sayi2;  
        
     System.out.print(sonuc);}
     else {System.out.print("GECERSİZ BOLEN");
     }
     }

    else {
        
        System.out.print("GECERSİZ İSLEM İSTEGİ");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}