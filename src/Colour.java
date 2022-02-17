import java.io.Console;

public class Colour{
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("what is your favourite colour ");
        String Colour = myConsole.readLine();
        System.out.println("your favourite colour is "+" "+Colour+"? MINE TOO!!! ");
    }
}