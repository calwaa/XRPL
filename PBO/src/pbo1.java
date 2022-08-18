
import java.util.Scanner;


public class pbo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<6 ;i++){
            for(int j = 0;j <=6; j++){
                
                if ((i==5&&j==5)||
                    (i==5&&j==5)||
                    (i==0&&j==5)||
                    (i==5&&j==4)||
                    (i==4&&j==4)||
                    (i==0&&j==4)||
                    (i==5&&j==3)||
                    (i==3&&j==3)||
                    (i==0&&j==3)||
                    (i==5&&j==2)||
                    (i==2&&j==2)||
                    (i==0&&j==2)||
                    (i==5&&j==1)||
                    (i==1&&j==1)||
                    (i==0&&j==1)||
                    (i==5&&j==0)||
                    (i==0&&j==0)
                    )
                {
                    System.out.print("@");
                }
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
