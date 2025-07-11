public class EnumExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of week");
                break;
            case FRIDAY:
                System.out.println("Weekend is near!");
                break;
            default:
                System.out.println("Midweek day");
        }
    }
}
