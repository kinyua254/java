import java.io.Console;
public class LeapYear{
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter the year that you were born:");
        String yearBirth = myConsole.readLine();
        Integer birth = Integer.parseInt(yearBirth);

        for (Integer year = birth ; year < 2019 ; year++){
            if(year % 4 == 0){
                System.out.println(year);
            }
        }
    }
}