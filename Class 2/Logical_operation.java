public class Logical_operation {
    public static void main(String[] args) {
        System.out.println("Logical AND (&&)");
        System.out.println("true | true -> "+(true&&true));
        System.out.println("true | false -> "+(true&&false));
        System.out.println("false | true -> "+(false&&true));
        System.out.println("false | false -> "+(false&&false));

        System.out.println("Logical OR (||)");
        System.out.println("true | true -> "+(true||true));
        System.out.println("true | false -> "+(true||false));
        System.out.println("false | true -> "+(false||true));
        System.out.println("false | false -> "+(false||false));

        System.out.println("Logical NOT (!)");
        System.out.println("true -> "+(!true));
        System.out.println("false -> "+(!false));
    }
}
