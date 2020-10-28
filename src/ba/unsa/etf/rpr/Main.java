package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
	    System.out.println("Unesite n:");
	    Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        for (int i = 1; i <= n; i=i+1) {
            if(i%sumaCifara(i)==0) System.out.println(i);
        }
    }
    public static int sumaCifara(int n) {
        int cifra,suma=0;
        while (n>0){
            cifra = n%10;
            n = n / 10;
            suma = suma + cifra;
        }
        return suma;
    }
}
