package md.tekoway.operationsandcyclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        // Enter the day name and write in the console the day number

        String nameOfTheDay = "Saturday";
        int numberOfTheDay;

        switch (nameOfTheDay.toUpperCase()) {
            case "MONDAY":
                numberOfTheDay = 1;
                break;

            case "TUESDAY":
                numberOfTheDay = 2;
                break;

            case "WEDNESDAY":
                numberOfTheDay = 3;
                break;

            case "THURSDAY":
                numberOfTheDay = 4;
                break;

            case "FRIDAY":
                numberOfTheDay = 5;
                break;

            case "SATURDAY":
                numberOfTheDay = 6;
                break;

            case "SUNDAY":
                numberOfTheDay = 7;
                break;
            default:
                numberOfTheDay = 0;
                System.out.println("Wrong name of the day");
        }

        System.out.println("The number of the week day - " + nameOfTheDay + " is: " + numberOfTheDay);
    }
}
