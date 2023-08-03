package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int flag = 0;
        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
            flag = 1;
        } else {
            flag = 2;
        }

        switch(flag) {
            case 1:
                System.out.println("leap");
                break;
            case 2:
                System.out.println("not leap");
                break;
        }
    }
}
