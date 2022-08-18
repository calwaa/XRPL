
public class UKL {

    public static void main(String[] args) {
        int a=9;
        int b=9;
        int n=12;
        int x=a+b;
        int y=a+b;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3-i; j++) {
               System.out.print(x+"\t");
               x=x+b;
               y=y+x; 
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2+i; j++) {
                System.out.print(x+"\t");
                x=x+b;
                y=y+x;
            }
            System.out.println();
        }
        
    }
    
}
