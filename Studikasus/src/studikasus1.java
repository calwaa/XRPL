
import java.util.Scanner;

public class studikasus1 {

    public static void main(String[] args) {
        //deklarasi variabel
        int matematika, kimia, biologi, fisika,ratarata = 100;
        double hasil;
        Scanner input = new Scanner(System.in);
        
        //perulangan
        //masukkan data nilai
        do{
            System.out.println("Data Nilai Pak Bagus");
            System.out.println("Nilai Matematika: ");
            matematika = input.nextInt();
            System.out.println("Nilai Kimia: ");
            kimia = input.nextInt();
            System.out.println("Nilai Biologi: ");
            biologi = input.nextInt();
            System.out.println("Nilai Fisika: ");
            fisika = input.nextInt();
            //proses perhitungan
            hasil = (matematika + kimia + biologi + fisika)/4;
            System.out.println("Rata-rata nilai: "+ hasil);
            //percabangan
            if(ratarata >= 75){
                System.out.println("Selamat anda dinyatakan lulus :)");
            }else{
                System.out.println("Mohon maaf anda tidak lulus :(");
            }
        }while(ratarata < 100);  
    }
    
}
