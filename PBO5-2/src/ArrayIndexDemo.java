
public class ArrayIndexDemo {
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        try{
        nums[4]=3;
        }
        catch(Exception e){
        System.out.println(e);

        }


        System.out.println(""+nums[2]);
        
    }
}
