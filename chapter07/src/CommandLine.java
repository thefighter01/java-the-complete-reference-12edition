import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (String arg : args) {
            System.out.println("args[" + arg + "]: ");
        }
    }
}
