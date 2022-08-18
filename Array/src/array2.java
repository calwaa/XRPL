
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int m,n,o,p,k;
        System.out.println("Matriks A dan B");
        
        System.out.println("Ukuran Matriks A");
        System.out.println("Masukkan Ukuran Baris :");
        m = input.nextInt();
        System.out.println("Masukkan Ukuran Kolom :");
        n = input.nextInt();
        int A[][] = new int[m][n];
        System.out.println("Input nilai untuk Matrix A");
        for(int i = 0;i <A.length;i++){
            for(int j = 0;j < A.length;j++){
                System.out.println("Nilai A["+i+"]["+j+"])\t");
                A[i][j]=input.nextInt();
            }
        }
        System.out.println(" ");
        
        System.out.println("Ukuran Matriks B");
        System.out.println("Masukkan Ukuran Baris :");
        o = input.nextInt();
        System.out.println("Masukkan Ukuran Kolom :");
        p = input.nextInt();
        int B[][] = new int[o][p ];
        System.out.println();
        System.out.println("Input nilai untuk Matrix A");
        for(int i = 0;i <B.length;i++){
            for(int j = 0;j < B.length;j++){
                System.out.println("Nilai B["+i+"]["+j+"])\t");
                B[i][j]=input.nextInt();
            }
        }
        System.out.println("Matriks A = ");
        for(int i = 0;i < A.length;i++){
            for(int j = 0;j < A.length;j++){
                
            }
        }
        System.out.println("Matriks B = ");
        for(int i = 0;i < B.length;i++){
            for(int j = 0;j < B.length;j++){
                
            }
        }
        System.out.println("");
        int[][]jumlah = new int[m][n];
        int[][]kurang = new int[m][n];
        int[][]kali = new int[m][n];
        int[][]bagi  = new int[m][n];
        System.out.println("Pilih operasi:\n1.Penjulahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian");
        int Pilih;
        System.out.println("Pilih operasi matriks yang anda gunakan :");
        Pilih = input.nextInt();
        //Penjumlahan
        if(Pilih==1){
            if(m==o&&n==p){
                for(int i = 0;i < m;i++){
                    for(int j = 0;j < n;j++){
                        jumlah[i][j]=A[i][j]+B[i][j];
                    }
                }
                System.out.println("Jumlah Matriks A dan B adalah = ");
                for(int i = 0;i < m;i++){
                    for(int j = 0;j < n;j++){
                        System.out.println(""+jumlah[i][j]);
                        System.out.println("");
                    }
                }}else{
                System.out.println("Ord");
            }
            
        }
    }
}
