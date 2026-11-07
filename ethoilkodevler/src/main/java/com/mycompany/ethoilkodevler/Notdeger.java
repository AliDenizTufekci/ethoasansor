package com.mycompany.ethoilkodevler;

import java.util.Scanner;


public class Notdeger {

    public static void main(String[] args) {
        
   Scanner scanner = new Scanner (System.in);     
        
   System.out.print("sayı girin");
        
   int not = scanner.nextInt();
        
   if (not>=90 && not<=100) {
       
  System.out.print("AA");
       
  }    
        
        
   else  if (not>=80 && not<=89) {
       
  System.out.print("BA");
       
  }       
        
        
   else if (not>=70 && not<=79) {
       
  System.out.print("BB");
       
  }         
        
        
        
   else if (not>=60 && not<=69) {
       
  System.out.print("CB");
       
  }         
        
        
   else if (not>=50 && not<=59) {
       
  System.out.print("CC");
       
  }         
        
        
   else if (not>=0 && not<=49) {
       
  System.out.print("FF");
       
  }         
        
   else {
       
       System.out.print("Girdiğiniz sayı,0 ile 100 arasında olmadığı için geçersiz sayılmıştır,programı yeniden çalıştırıp doğru bir aralıkta sayı giriniz.");
   }     
        
  }
}
