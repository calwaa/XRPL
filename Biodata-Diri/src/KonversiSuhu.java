

import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double K,R,F;
        int C = 78;

        K = C + 273;
        R = 4 * C / 5;
        F = (9 * C / 5)+32;

        System.out.println("Konversi suhu 78o C ke dalam satuan Reamur ="+R);
        System.out.println("Konversi suhu 78o C ke dalam satuan Farenheit ="+F);
        System.out.println("Konversi suhu 78o C ke dalam satuan Kelvin ="+K);
    }
}
