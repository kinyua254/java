import java.io.Console;
public class Hotel{
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("What season are planning on staying at the hotel?");
        String season = myConsole.readLine();
        System.out.println("You plan on staying during the weekend or the weekday?");
        String day = myConsole.readLine();

        boolean summer = season.equals("summer");
        boolean weekend = day.equals("weekend");
        boolean winter = season.equals("winter");
        if (summer && weekend){
            System.out.println("this stay is going to be VERY EXPENSIVE MADAM!!");
        } else if (winter && weekend){
            System.out.println("This will be even more expensive to be honest!!!");
        } else{
            System.out.println("it could have been worse enjoy your luck");
        }
    }
}