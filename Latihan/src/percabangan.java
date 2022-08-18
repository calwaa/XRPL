
import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        int nilaiUTS,nilaiUAS;
        double ratarata;
        String nama,grade;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama Mahasiswa :");
        nama = input.nextLine();
        System.out.print("Inputkan nilai UTS : ");
        nilaiUTS = input.nextInt();
        System.out.print("Inputkan nilai UAS : ");
        nilaiUAS = input.nextInt();
        
        if(nilaiUTS >= 80 && nilaiUAS >= 80){
            grade = "A";
        }else if (nilaiUTS >= 80 && nilaiUAS >= 65){
            grade = "B";
        }else if (nilaiUTS >= 65 && nilaiUAS >= 50){
            grade = "D";
        }else if (nilaiUTS >= 50 && nilaiUAS >= 35){
            grade = "D";   
        }else{
            grade = "E";
        }
        ratarata = nilaiUTS+nilaiUAS/2;
        System.out.println(nama+" memiliki rata-rata nilai UTS dan nilai UAS: "+ratarata);
        System.out.println("Grade : "+grade);
    }
}
