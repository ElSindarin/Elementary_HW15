import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String dateAsString = "1920-02-10";
        System.out.println(giveDayOfWeek(dateAsString));
    }

    public static DayOfWeek giveDayOfWeek (String dateAsString) {
        String[] splittedDate = dateAsString.split("-");
        System.out.println(Arrays.toString(splittedDate));
        LocalDate date = LocalDate.of(Integer.valueOf(splittedDate[0]),Integer.valueOf(splittedDate[1]),Integer.valueOf(splittedDate[2]));
        return date.getDayOfWeek();
    }


}
