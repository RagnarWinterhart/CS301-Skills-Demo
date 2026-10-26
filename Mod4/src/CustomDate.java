public class CustomDate {
    private int month, day, year;

    public CustomDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int totalDays(){
        int total = 0;
        for(int i = 1; i < year; i++){
            if(isLeapYear(i)){
                total += 366;
            }else{
                total += 365;
            }
        }
        for(int i = 1; i < month; i++){
            total += getMonthDays(i);
        }
        total += day;
        return total;
    }

    public int getMonthDays(int month){
        if(month == 2){
            return isLeapYear(year) ? 29 : 28;
        } else if ((month + month / 8) % 2 == 0) {
            return 30;
        }else{
            return 31;
        }
    }


    public boolean isLeapYear(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public int daysBetween(CustomDate other){
        return Math.abs(other.totalDays() - this.totalDays());
    }

    public String getDayOfWeek(){
        int weekDay = this.totalDays() % 7;
        switch (weekDay){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "";
        }
    }

    public static void main(String[] args) {
        /*
        Create a data type Date that represents a date. You should be
        able to create a new Date by specifying the month, day, and year.
         It should support methods to compute the number of days between
          two dates, return the day of the week that a day falls on, etc.
           The program should be named CustomDate.java.
         */

        CustomDate first = new CustomDate(10, 17, 2026);
        CustomDate second = new CustomDate(10, 30, 2026);
        System.out.println(first.getMonthDays(2));
        System.out.println(first.daysBetween(second));
        System.out.println(first.getDayOfWeek());
    }
}
