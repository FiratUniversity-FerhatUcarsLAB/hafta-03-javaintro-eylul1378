package GÖREV3;

public class Ucgenalanı {
    public static void main (String[] args) {

    double a=3;
    double b=4;
    double c=5;

    double cevre= a+b+c;
    double s=cevre/2;
    double alan=Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("alan: " + alan);
    System.out.println("çevre: " + cevre);

    }
    }
