package school.chap3;

import java.util.Scanner;

// 根据用于指定月份，打印该月份所属的季节
public class Hw3_3 {
    public static void main(String[] args) {
        System.out.println("Please input a month: ");
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        SeasonJudgment sj = new SeasonJudgment();
        sj.printSeason(month);
    }
}

class SeasonJudgment{
    void printSeason(String month){
        switch(month){
            case "3":
            case "4":
            case "5":
                System.out.println("Spring");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("Summer");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("Autumn");
                break;
            case "12":
            case "1":
            case "2":
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
