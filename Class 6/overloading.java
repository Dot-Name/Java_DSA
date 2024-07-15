
public class overloading {
    //  number of parameters
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b,int c){
        return a+b+c;
    }
    // datatypes
    public static int add(float a, float b){
        return (int)(a+b);
    }

    public static void main(String[] args) {
        int num1= 4;
        int num2 =5;
        int num3 = 10;
        System.out.println(add(num1,num2));
        System.out.println(add(num1,num2,num3));
        System.out.println(add(13.4f,13.4f));
    }
}
