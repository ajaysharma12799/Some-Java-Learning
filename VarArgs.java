// Program To Demonstrate varArgs or Variable-Argument
public class VarArgs {
    public static void printVarArguments(int ...args) {
        for(int element : args) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        printVarArguments( 1, 2, 3, 4, 5 );
        printVarArguments( 1, 2, 3 );
        printVarArguments(  );
    }
}
