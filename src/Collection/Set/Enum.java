package Collection.Set;

public class Enum {
    public static void main(String[] args) {
        System.out.println(myEnum.FRIDAY.ordinal());
        System.out.println(myEnum.SATURDAY);
        boolean eq = myEnum.FRIDAY.equals(myEnum.SATURDAY);
        System.out.println(eq);
        System.out.println(myEnum.valueOf(myEnum.class, "SUNDAY").ordinal());
    }
}

enum myEnum {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

