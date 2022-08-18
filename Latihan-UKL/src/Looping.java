
package latihanukl;

public class Looping {

    public static void main(String[] args) {
        int x=7;
        int y=5;
        int n=15;
        int a=x;
        int b=x;
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            a=a+y;
            b=b+a;
        }
        b=b-a;
        System.out.println("Jika dijumlahkan :"+b);
    }
        
}
