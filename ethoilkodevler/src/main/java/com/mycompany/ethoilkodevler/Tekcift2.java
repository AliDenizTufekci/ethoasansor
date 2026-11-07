package com.company.ethoilkodevler;

import java.util.Scanner;


public class Tekcift2 {

    public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
       
        
        System.out.print("sayı giriniz.");
   
    int sayi=scanner.nextInt();
      
    int abc = sayi%2;
   
    if (abc==0){
        
        System.out.println(sayi + "sayısı cift sayıdır");
                 
    }         
   else {
        
        System.out.println(sayi + "sayısı tek sayıdır") ;
    } 
    }
    }
    
