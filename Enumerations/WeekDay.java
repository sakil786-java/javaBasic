package Enumerations;

public class WeekDay {
	Day day;
	public WeekDay(Day day)
    {
        this.day = day;
    }
	
	public void dayIsLike()
    {
        switch (day)
        {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
	public static void main(String[] args) {
		String str = "FRIDAY";
		WeekDay t1 = new WeekDay(Day.valueOf(str));
        t1.dayIsLike();

	}

}
