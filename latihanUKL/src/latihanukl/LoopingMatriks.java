package latihanukl;

public class LoopingMatriks {

    public static void main(String[] args) {
        int x=7;
        int y=5;
        int n=15;
        int a=x;
        int b=x;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a+"\t");
                a=a+y;
                b=b+a;
            }
            System.out.println();
        }
    }
   
}
    
