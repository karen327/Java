package school.chap3;

import java.util.Scanner;

// 输出输入的日期为2014年的第几天
public class Hw3_4 {
    public static void main(String[] args) {
        int month, day, sum;
        System.out.println("Please input a month of 2014");
        Scanner sc = new Scanner(System.in);
        month = Integer.parseInt(sc.next());
        System.out.println("Please input a day of 2014");
        day = Integer.parseInt(sc.next());
        DayCount dayCount = new DayCount();
        sum = dayCount.countdays(month, day);
        System.out.println("2014/" + month + '/' + day + ": " + sum + " days");
    }
}

class DayCount{
    int getMonthDays(int month){
        if(month < 1 || month > 12){
            return -1;
        }

        int daySum;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daySum = 31;
                break;
            case 2:
                daySum = 28;
                break;
            default:
                daySum = 30;
                break;
        }
        return daySum;
    }
    int countdays(int month, int day){
        int sum = 0;
        if(month < 1 || month > 12 || day < 1 || day > getMonthDays(month)){
            return -1;
        }
        for(int i = 1; i < month; i ++){
            sum += getMonthDays(i);
        }
        sum += day;
        return sum;
    }
}
