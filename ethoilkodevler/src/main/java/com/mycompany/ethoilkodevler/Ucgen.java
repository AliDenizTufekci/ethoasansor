package com.mycompany.ethoilkodevler;

import java.util.Scanner;

public class Ucgen {

    public static void main(String[] args) {
    
        Scanner scanner =new Scanner (System.in);
        
      System.out.print("kenar uzunlugu giriniz");
        
       int ken1 = scanner.nextInt();
        
   System.out.print("kenar uzunlugu giriniz");
        
       int ken2 = scanner.nextInt();
    
    System.out.print("kenar uzunlugu giriniz");
        
       int ken3 = scanner.nextInt();
    
    if (ken1+ken2>ken3 && ken1+ken3>ken2 && ken2+ken3>ken1){
    
    if (ken1==ken2 && ken2==ken3 ) {
        
        System.out.print("Bu bir eskenar ucgendir.");
    }
    
    else if (ken1>ken2 && ken2==ken3 || ken2>ken3 && ken3==ken1 || ken3>ken2 && ken2==ken1|| ken1<ken2 && ken2==ken3 || ken2<ken3 && ken3==ken1 
          ||  ken3<ken2 && ken2==ken1){
        
   System.out.println("bu ucgen bir ikizkenar ucgendir.");
        
      }
    
    else if (ken1!=ken2 && ken2!=ken3 && ken3!=ken1){
        System.out.print("bu ucgen bir cesitkenar ucgendir.");
    }
    
    }
    
    else {
        
        System.out.print("bu kenarlar bir ucgen olusturamamaktadir.");
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
