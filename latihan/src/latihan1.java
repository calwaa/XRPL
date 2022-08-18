
import java.util.Scanner;

public class latihan1 {
    
    //Method 1
    public static void cetakNama(String nama) {
        System.out.println("Nama :"+nama);
    }
    //Method 2
    public static void cetakKelas(String kelas) {
        System.out.println("Kelas :"+kelas);
    }
    //Method 3
    public static void cetakAbsen(String absen) {
        System.out.println("Absen :"+absen);
    }
    //Method 4
    public static void cetakJurusan(String jurusan) {
        System.out.println("Jurusan :"+jurusan);
    }
    //Method 5
    public static void main(String[] args) {
        //Penginputan
        Scanner input = new Scanner(System.in);
        int matematika,fisika,kimia,sejarah,pkn;
        int password = 1;
        double ratarata;
        String grade;
        
        //Output method 1,2,3,dan 4
        cetakNama("Ardhian Calwa Nugraha");
        cetakKelas("XRPL3");
        cetakAbsen("Tiga(03)");
        cetakJurusan("RPL");
        
        //Perulangan
        while(password !=886){
            System.out.println("Masukkan Password :");
            password = input.nextInt();
        }
        
        //Percabangan
        System.out.println("Masukkan nilai matematika :");
        matematika = input.nextInt();
        
        if(matematika >= 90){
            grade = "A";
        }else if(matematika >= 80){
            grade = "B";
        }else if(matematika >= 75){
            grade = "C";
        }else{
            grade = "D";
            System.out.println("Remidi dapat dilakukan pada tanggal 7 Desember pukul 07.00 PM");
        }
        System.out.println("Grade :"+grade);
            
        System.out.println("Masukkan nilai fisika :");
        fisika = input.nextInt();
        
        if(fisika >= 90){
            grade = "A";
        }else if(fisika >= 80){
            grade = "B";
        }else if(fisika >= 75){
            grade = "C";
        }else{
            grade = "D";
            System.out.println("Remidi dapat dilakukan pada tanggal 7 Desember pukul 09.00 PM");
        }
        System.out.println("Grade :"+grade);
        
        System.out.println("Masukkan nilai kimia :");
        kimia = input.nextInt();
        
        if(kimia >= 90){
            grade = "A";
        }else if(kimia >= 80){
            grade = "B";
        }else if(kimia >= 70){
            grade = "C";
        }else{
            grade = "D";
            System.out.println("Remidi dapat dilakukan pada tanggal 8 Desember pukul 07.00 PM");
        }
        System.out.println("Grade :"+grade);
        
        System.out.println("Masukkan nilai sejarah :");
        sejarah = input.nextInt();
        
        if(sejarah >= 90){
            grade = "A";
        }else if(sejarah >= 80){
            grade = "B";
        }else if(sejarah >= 75){
            grade = "C";
        }else{
            grade = "D";
            System.out.println("Remidi dapat dilakukan pada tanggal 8 Desember pukul 09.00 PM");
        }
        System.out.println("Grade :"+grade);
        
        System.out.println("Masukkan nilai pkn :");
        pkn = input.nextInt();
        
        if(pkn >= 90){
            grade = "A";
        }else if(pkn >= 80){
            grade = "B";
        }else if(pkn >= 70){
            grade = "C";
        }else{
            grade = "D";
            System.out.println("Remidi dapat dilakukan pada tanggal 9 Desember pukul 07.00 PM");
        }
        System.out.println("Grade :"+grade);
        
        ratarata = (matematika + fisika + kimia + sejarah + pkn)/5;
        System.out.println("Rata-rata nilai anda :"+ratarata);
    }
    
    
}
