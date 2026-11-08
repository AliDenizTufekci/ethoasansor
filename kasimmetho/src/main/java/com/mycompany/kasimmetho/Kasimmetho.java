package com.mycompany.kasimmetho;
 
import java.util.Scanner;

//*Deneme sınavı//*


public class Kasimmetho {

    public static void main(String[] args) {
        
   Scanner scanner = new Scanner (System.in); 
    
    System.out.print("MERHABA!Sizden deneme sinav sonuclarini girmenizi istiyorum.Ilk önce dogru cevap sayinizi giriniz.");
    
   int ds =scanner.nextInt();
    
   if (ds<0 || ds>20) {
       
       System.out.println("GECERSİZ DOGRU SAYISI!!!!!");
   }
    
   else{
       
       System.out.println("Simdi de yanlis sayinizi giriniz.");
   
   int ys = scanner.nextInt();
   
   if (ys>20 || ys <0){
       
       System.out.println("GECERSİZ YANLIS SAYISI!!!!!");
   }
   
   else if (ys+ds<0 || ys + ds >20){
       
       System.out.println("Bu iki sayinin en az biri yanlis girilmistir cunku sayilarin toplami 20'den coktur. ");
   }
   
   else{
       
   int boss=20-(ys+ds);
  
   double nets = ds - (double)ys / 4;//*parantez içinde veri tipi yazarak(ys'nin önündeki "(double)" )sonucu etkilemeyi google yz modundan öğrendim.//*


   
   if ( nets<=5){
       
     System.out .println("Basari durumunuz ,GELISTIRILMELI olarak olculmustur."+ "Ayrica net sayiniz " + nets + "'dir ve bos sayiniz de "+ boss + "'dir");
       
   }
   
   else if (nets>5 && nets<=10){
       
       System.out.println("Basari durumunuz ORTA olarak olculmustur."+ "Ayrica net sayiniz " + nets + "'dir ve bos sayiniz de "+ boss + "'dir");
   }
   
   else if (nets>10 && nets<=15){
       
       System.out.println("Basari durumunuz IYI olarak olculmustur."+ "Ayrica net sayiniz " + nets + "'dir ve bos sayiniz de "+ boss + "'dir");
   }
   
   else {
       
    System.out.println("Basari durumunuz COK IYI olarak olculmustur."+ "Ayrica net sayiniz " + nets + "'dir ve bos sayiniz de "+ boss + "'dir");   
       
   }
   }
   }
   
   
  scanner.close();
    
    }
   
   
   
   
   
   } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
