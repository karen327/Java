package school.chap3;

import java.util.Scanner;

// 对学生成绩大于60分的，输出“合格”，低于60分的，输出“不合格”
public class Hw3_2 {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩：");
        Scanner sc = new Scanner(System.in);
        int score = Integer.parseInt(sc.next());
        ScoreJudgment sj = new ScoreJudgment();
        sj.judge(score);
    }
}

class ScoreJudgment {
    public void judge(int score){
        if(score < 0 || score > 100){
            System.out.println("您输入的分数有误");
        }

        if(score >= 60){
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }
}
