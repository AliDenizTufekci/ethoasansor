package com.mycompany.artikyil;

import java.util.Scanner;



public class Artikyil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
   
   System.out.print("bulundugunuz yili giriniz.");
    
   int yil = scanner.nextInt () ;
    
    if ( yil%4 ==0 && yil%100 !=0){ 
        
        System.out.println(yil + "yili bir artik yildir.");
    }
    
    else if ( yil%400==0){
        
        System.out.print(yil + "yili bir artik yildir.");
    }
    
    else {
        
        System.out.println(yil + "yili bir artik yil degildir.");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
