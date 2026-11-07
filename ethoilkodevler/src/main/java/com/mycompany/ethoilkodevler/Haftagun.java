package com.mycompany.ethoilkodevler;
 
import java.util.Scanner;


public class Haftagun {

    public static void main(String[] args) {
        
    Scanner scanner =new Scanner (System.in);

System.out.println("istediginiz gunun numarasini giriniz.");
    
int sayi = scanner.nextInt();

switch (sayi){
    
    case 1: System.out.println("PAZARTESİ");
break;

    case 2: System.out.println("SALI");

break;

    case 3: System.out.println("CARSAMBA");

break;

case 4: System.out.println("PERSEMBE");

break;
        
case 5: System.out.println("CUMA");

break;
        
case 6: System.out.println("CUMARTESI");

break;

case 7 : System.out.println("PAZAR");}

if (sayi<0 || sayi>7){
    
    System.out.print("GECERSIZ SAYI,UYGUN DEGIL");
}











}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

