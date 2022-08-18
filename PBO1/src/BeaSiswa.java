
import java.util.Scanner;
public class BeaSiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA :");
        int TPA = input.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris :");
        int BahasaInggris = input.nextInt();
        if((TPA > 85)&&(BahasaInggris > 80))
            System.out.println("Siswa dapat Beasiswa");
        else
            System.out.println("Siswa tidak dapat Beasiswa");
    }
}
