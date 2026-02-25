package wipro;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class TestEnum1 {
    public static void main(String[] args) {

        Day[] allDays = Day.values();

        System.out.println("All Days of the Week:");
        for (Day d : allDays) {
            System.out.println(d);
        }

        System.out.println("\nDays till Sunday:");
        for (Day d : allDays) {
            System.out.println(d);
            if (d == Day.SUNDAY) {
                break; // stop after Sunday
            }
        }
    }
}
