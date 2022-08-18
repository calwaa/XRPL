
public class KeywordThrowsEx {
    
    static void test() throws java.lang.IllegalAccessException{
        System.out.println("This is in test()");
        throw new java.lang.IllegalAccessException("test");
    }
    public static void main(String[] args) {
        try{
            test();
        }catch(java.lang.IllegalAccessException e){
            System.out.println("Caught in main");
            System.out.println(e);
        }
    }
}
