package GÖREV2;

public class Faktoriyel{
    public static void main(String[] args){
        
        int sayi = 5;
        System.out.print(sayi + "! = ");
        int sonuc = faktoriyelAdimGoster(sayi);
        System.out.println(" = " + sonuc);
    }

    
    public static int faktoriyelAdimGoster(int n) {
         System.out.print(n);     
         System.out.print((n > 1) ? " * " : "");

        return (n == 1)
                ? 1 
                : n * faktoriyelAdimGoster(n - 1); 

}
}
