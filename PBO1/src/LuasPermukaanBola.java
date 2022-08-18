
import java.util.Scanner;
public class LuasPermukaanBola {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r;
        
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.print("Masukkan Jari-jarinya :");
        r = input.nextInt();
        System.out.print("Luas Permukaanya = "+((3.14*r*r)*4));
    }
}
