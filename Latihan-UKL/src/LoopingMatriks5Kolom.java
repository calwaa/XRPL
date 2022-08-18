
package latihanukl;

public class LoopingMatriks5Kolom {
    public static void main(String[] args) {
        int x=5;
        int y=3;
        int n=10;
        int a=x;
        int b=x;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1+i; j++) {
                System.out.print(a+"\t");
                a=a+y;
                b=b+a;
            }
            System.out.println();
        }
    }
}
