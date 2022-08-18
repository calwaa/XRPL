
import java.util.Scanner;


public class RAPOR_JAVA2 {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no. pilihan anda");
        int bahan1= input.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2) {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1){
                System.out.println("1. Susu");
                System.out.println("2. Minyak goreng");
                System.out.println("3. Tidak ada");
            }else{
                System.out.println("1. Minyak goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.println("Masukkan no. pilihan anda"); 
        }else
            System.out.println("Mohon maaf,pilihan tidak ditemukan,"+"tidak dapat memberikan saran resep");
        int bahan2 = input.nextInt(); 
        if(bahan2 >=1 && bahan2 <=3) {
            if(bahan1==1)
            switch(bahan2){
                case 1: System.out.println("Anda dapat membuat milk shake banana");break;
                case 2: System.out.println("Anda dapat membuat pisang goreng");break;
                case 3: System.out.println("Anda dapat membuat pisang rebus");break;
            }
            else
            switch(bahan2){
                case 1: System.out.println("Anda dapat membuat telur mata sapi");break;
                case 2: System.out.println("Anda dapat membuat sandwich telur");break;
                case 3: System.out.println("Anda dapat membuat telur rebus");break;
            }
        }else
            System.out.println("Mohon maaf,pilihan tidak ditemukan,"+"tidak dapat memberikan saran resep");
    }
    }
    
}
