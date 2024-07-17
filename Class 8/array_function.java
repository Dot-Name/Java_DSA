import java.util.*;;

public class array_function {
    public static void update(int marks[]){
        for( int i=0; i<marks.length; i++){
            marks[i] +=1;
        }
    }
    public static void main(String[] args) {
        
        int marks[] = {97,98,99};
        System.out.println("Before update");
        for( int i=0; i<marks.length; i++){
            System.out.println("marks at "+i+" index: "+marks[i]);
        }
        update(marks);
        System.out.println("After update");
        for( int i=0; i<marks.length; i++){
            System.out.println("marks at "+i+" index: "+marks[i]);
        }
    }
}
