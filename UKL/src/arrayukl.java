
public class arrayukl {
    public static void main(String[] args) {
        int a[][]={{2,3,4},{4,6,3},{3,-1,2}};
        int b[][]={{6,3,5},{-4,8,3},{5,3,2}};
        int h[][]={{0,0,0},{0,0,0},{0,0,0}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
