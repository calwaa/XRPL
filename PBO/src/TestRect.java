
public class TestRect {
    
    public static void main(String[] args){
        Rect baru1 = new Rect(1,1,4,4);
        Rect baru2 = new Rect(2,3,5,6);
        
        System.out.println("2,3 is Inside the union");
        System.out.println(baru1+"union"+baru2+"="+baru1.union(baru2));
        System.out.println(baru1+"intersection"+baru2+"="+baru1.intersection(baru2));
        
        System.out.println(baru1.intersection(baru2)+"Digeser sejauh (8,8)");
        baru1.move(3, 3);
        baru2.move(3, 3);
        System.out.println(baru1.intersection(baru2));
    }
}
