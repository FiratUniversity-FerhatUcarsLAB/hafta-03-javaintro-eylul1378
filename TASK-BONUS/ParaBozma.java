package BONUS;

public class Bonus3{
    public static void main(String[] args) {
        
        int toplamPara = 786; 
        int yuzluk = toplamPara / 100;
        int ellilik = (toplamPara % 100) / 50;
        int yirmilik = (toplamPara % 50) / 20;
        int onluk = (toplamPara % 20) / 10;
        int beslik = (toplamPara % 10) / 5;
        int birlik = toplamPara % 5;

        System.out.println("Para Bozma Sonucu:");
        System.out.println("100'lük: " + yuzluk);
        System.out.println("50'lik: " + ellilik);
        System.out.println("20'lik: " + yirmilik);
        System.out.println("10'luk: " + onluk);
        System.out.println("5'lik: " + beslik);
        System.out.println("1'lik: " + birlik);
   
    }
    }
