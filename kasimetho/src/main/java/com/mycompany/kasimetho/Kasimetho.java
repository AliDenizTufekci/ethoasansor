package com.mycompany.kasimetho;
//*asansor problemi//*

import java.util.Scanner;


public class Kasimetho {

    public static void main(String[] args) {
        
        
      Scanner scanner = new Scanner (System.in);  
        
    System.out.print("Merhaba!Bulunduğunuz katı giriniz.");
        
    int kat1 = scanner.nextInt();
     
    if (kat1>=1 && kat1<=10){
        
     System.out.println("Tebrikler!Şimdi,gitmek istediğiniz katı giriniz.");
        
    int kat2 =scanner.nextInt () ;   
    
    if (kat2>=1 && kat2<=10){
        
    if (kat1>kat2) { 
        
       int harmes = kat1 - kat2;
        
     System.out.print("Tebrikler!Asansör,bulunduğumuz" + kat1 + "katından" + kat2 + "katına doğru" + harmes + "tane katı(kat boslugunu) geçecek sekilde asagi yonlu olarak hareket etmektedir.BİNİNİZ.");
          
      for (int i=kat1;i>=kat2;i--) {
          
         System.out.print ("gecilen kat" + i + "katidir.") ;
      }
    
          
          }
    
    else if (kat2>kat1){
        
       int harmes =kat2-kat1;
       
       System . out.println("Tebrikler!Asansör,bulunduğumuz" + kat1 + "katından" + kat2 + "katına doğru" + harmes + "tane katı(kat boslugunu) geçecek sekilde yukari yonlu olarak hareket etmektedir.BİNİNİZ.");
    
    for (int i=kat1;i<=kat2;i++) {
          
         System.out.print ("gecilen kat" + i + "katidir.") ;
        }
    }
    else {
    
    System.out.println("girdiginiz katlar aynı katlardır.Bu sebeple beni kullanamazsınız,ZATEN HEDEF KATINIZDASINIZ.");
        
       }
    }
    
    else {
    
    System.out.println("her ne kadar girdiginiz " + kat1 + "kati mevcut ve uygun olsa da girdiginiz " + kat2 + "katı (hedef kat) asansörün gidebileceği katlar arasında değildir." );
    
    } 
    
    }
    
    else {
            
            System.out.println("asansorun gidebilecegi katlar arasinda boyle bir kat yoktir,baska bir vasita araci bulunuz.");
       
            }     
        
        
        
        
        
        
        
      scanner.close();
        
       //*bu kodda,asansörde geçilen katları tek tek ekrana yazdırmam için for döngüsü gerekli oldu.O yüzden youtube'den yararlandım ama sadece bu for döngüsü için//* 
        
    }

    
    
    
    
    
    
    
    
    }
