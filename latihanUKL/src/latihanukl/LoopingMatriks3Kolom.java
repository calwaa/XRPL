
package latihanukl;

public class LoopingMatriks3Kolom {
    public static void main(String[] args) {
        int x=5;
        int y=3;
        int n=10;
        int a=x;
        int b=x;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3-i; j++) {
                System.out.print(a+"\t");
                a=a+y;
                b=b+a;
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2+i; j++) {
                System.out.print(a+"\t");
                a=a+y;
                b=b+a;
            }
            System.out.println();
        }
    }
}
