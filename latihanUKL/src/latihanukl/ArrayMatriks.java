
package latihanukl;

public class ArrayMatriks {
//    public static void main(String[] args) {
//        int a[][]={{-7,5},{4,8}};
//        int b[][]={{1,1},{-4,9}};
//        
//        System.out.println("Hasil A-B :");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(a[i][j]-b[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        /** 
         * matriksA -> 1x3 
         * matriksB -> 1x2
         * result -> 1x2
         */
        int matriksA[][] = {
            {4,1,9}
        };

        int matriksB[][] = {
            {2,6}
        };

        int[][] result = new int[1][2];

        // proses perkalian
        // batas loop pertama adalah 
        // jml baris matriksA
        for (int i = 0; i < 1; i++) {
            // batas loop kedua adalah
            // jml kolom matriksB
            for (int j = 0; j < 2; j++) {
                int h=0;
                // batas loop ketiga adalah
                // jml kolom matriksA
                for (int k = 0; k < 1; k++) {
                    // isi matriks hasil
                    result[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }

        // menampilkan isi matriks result (2x1)
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println("");
        }
    }
//    public static void main(String[] args) {
//        int a[][]={{6,3,9}};
//        int b[][]={{3,6}};
//        int h[][]={{0,0}};
//        
//        int[][] hasil = new int[][];
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 2; j++) {
//                int x = 0;
//                for (int k = 0; k < 3; k++) {
//                    x += a[i]][k] * b[k][j];
//                }
//                hasil[i][j] = x;
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 1; j++) {
//                System.out.print(h[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
}

