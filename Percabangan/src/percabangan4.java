
import java.util.Scanner;


public class percabangan4 {
    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inputkan nilai: ");
        nilai = input.nextInt();
        
        if(nilai >= 90){
            grade = "A";
        }else if (nilai >= 80){
            grade = "B+";
        }else if (nilai >= 70){
            grade = "B";
        }else{
            grade = "E";
        }
        System.out.println("Grade: "+grade);
    }
}
