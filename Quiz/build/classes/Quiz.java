
import java.util.Scanner;


public class Quiz {
    
    public static void main(String[] args) {
        //Mulai
        //Deklerasi variabel input scanner
        Scanner input = new Scanner(System.in);
        //Array nama
        String[] nama = {"Aldi","Bayu","Gallang","Maman","Bagas","Ghazi","Arya","Eko","Ihsan"};
        System.out.println("Masukkan nama yang dicari: ");//Variabel percarian data
        String nama1 = input.next();        
        int angka=0;
        //Perulangan untuk array    
        for (int i=0; i < nama.length;i++){ 
                if(nama[i].equals(nama1)){//percabangan data ditemukan
                    System.out.println("Data Ditemukan! ");
                    System.out.println("Pada Index Ke - " + i);
                    angka =1;
                }else{
                }
            }

            if (angka==1){
        
            }else {
                System.out.println("Data tidak ditemukan ! ");//Selesai
            }
    }
    
}
