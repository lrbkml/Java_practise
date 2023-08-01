public class method_overloading {
    
    // static void foo (){
    //     System.out.println("hey suppp");
    // }
    // static void foo (int a ){
    //     System.out.println(a);
    // }
    static int foo(int a , int b ){
        System.out.println("this is" +a + "value");
        System.out.println("this is" +b + "value");
        return a;
    }

    

    public static void main(String[] args) {
        
        // foo();
        // foo(23);
        foo(22,44);

    }
}
