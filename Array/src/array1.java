
public class array1 {
    public static void main(String[] args) {
        int MatrixA[][]={{1,2,3,4,5},{6,7,8,9,10}};
        int MatrixB[][]={{11,12,13,14,15},{16,17,18,19,20}};
        int MatrixC[][]={{21,22,23,24,25},{26,27,28,29,30}};
        int MatrixD[][]={{31,32,33,34,35},{36,37,38,39,40}};
        int MatrixE[][]={{41,42,43,44,45},{46,47,48,49,50}};
        int MatrixF[][]=new int[5][5];
        
        System.out.println("MATRIX A");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(MatrixA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("MATRIX B");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(MatrixB[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("MATRIX C");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(MatrixC[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("MATRIX D");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(MatrixD[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("MATRIX E");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(MatrixE[i][j]+" ");
            }
            System.out.println();
        }    
        System.out.println("MATRIX F ");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 5;j++){
                MatrixF[i][j]=MatrixA[i][j]+MatrixB[i][j]+MatrixC[i][j]+MatrixD[i][j]+MatrixE[i][j];
                System.out.print(MatrixF[i][j]+" ");
            }
            System.out.println();
        }        
    }
}
