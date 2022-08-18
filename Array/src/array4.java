
import java.util.Scanner;


public class array4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bilangan[];
        int kuadrat;
        
        System.out.println("Masukkan nilai awal: ");
        int awal = input.nextInt();
        System.out.println("Masukkan nilai akhir");
        int akhir = input.nextInt();
        
        bilangan = new int[awal + akhir + 1];
        for(int i = awal;i <= akhir;i++){
            bilangan[i] = i;
        }
        for(int i = awal;i >= akhir;i--){
            bilangan[i] = i;
        }
        if(awal == akhir && (awal % 2 = 0 || akhir % 2 = 0)){
            System.out.println("Tidak ditemukan angka ganjil");
        }else if (awal < akhir){
            for(int i = 0;i < bilangan.length;i++){
                kuadrat = bilangan[i] * bilangan[i];
                if(bilangan[i] % 2 !=0){
                    System.out.println(bilangan[i]+"kuadrat: "+kuadrat);
                }
            }  
        }else{
            for(int i = bilangan.length-1;i > 0;i--){
                kuadrat = bilangan[i] * bilangan[i];
                if(bilangan[i] % 2 !=0){
                    System.out.println(bilangan[i]+"kuadrat: "+kuadrat);
                }    
            }        
        }
    }
}
