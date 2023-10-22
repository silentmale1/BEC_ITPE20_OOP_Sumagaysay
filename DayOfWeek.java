public class DayOfWeekExample {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("It's Monday. Time to start the workweek.");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a weekday. Keep working!");
                break;
            case FRIDAY:
                System.out.println("It's Friday. Almost the weekend!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday. Enjoy your weekend!");
                break;
            case SUNDAY:
                System.out.println("It's Sunday. Relax and recharge.");
                break;
        }
    }
}
