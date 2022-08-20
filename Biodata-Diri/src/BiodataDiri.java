
import java.util.Scanner;
public class BiodataDiri {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama,tempatlahir,jeniskelamin,mottohidup,NIS,tanggallahir,alamatdimalang;
        
        System.out.println("========BIODATA DIRI========");
        System.out.print("Nama              :");
        nama = input.nextLine();
        System.out.print("NIS               :");
        NIS = input.nextLine();
        System.out.print("Tempat Lahir      :");
        tempatlahir = input.nextLine();
        System.out.print("Tanggal Lahir     :");
        tanggallahir = input.nextLine();
        System.out.print("Jenis Kelamin     :");
        jeniskelamin =  input.nextLine();
        System.out.print("Alamat di Malang  :");
        alamatdimalang = input.nextLine();
        System.out.print("Motto Hidup       :");
        mottohidup = input.nextLine();
    }
}
