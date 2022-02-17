import java.io.Console;

public class Movie{
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter your age for legitimacy to watch the movie negro:");
        String age = myConsole.readLine();
        Integer realAge = Integer.parseInt(age);

        if(realAge >= 17 ){
            System.out.println("Enjoy your movie my guy");

        } else{
            System.out.println("GEt out the movie theater my guy");
        }
    }
}