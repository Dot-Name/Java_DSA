public class condtional_statement{
    public static void main(String[] args) {
        int age = 16;
        if (age>=18) {
            System.out.println("Adult: Drive, vote");
        }
        else if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult as well as teenager");
        }
    }
}