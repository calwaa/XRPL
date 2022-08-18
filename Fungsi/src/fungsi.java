
import java.util.Scanner;

public class fungsi {
    public static void main(String[] args){
        int nilaiA, nilaiB, nilaiC, nilaiD, nilaiE;
        double hasil;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nilai ujian pertama:");
        nilaiA = input.nextInt();
        System.out.println("Nilai ujian ke-2:");
        nilaiB = input.nextInt();
        System.out.println("Nilai ujian ke-3");
        nilaiC = input.nextInt();
        System.out.println("Nilai ujian ke-4");
        nilaiD = input.nextInt();
        System.out.println("Nilai ujian ke-5");
        nilaiE = input.nextInt();
        
        hasil = (nilaiA + nilaiB + nilaiC + nilaiD + nilaiE)/5;
        System.out.println("Rata-rata hasil ujian Matematika: "+hasil);
        
    }
   
     
}
