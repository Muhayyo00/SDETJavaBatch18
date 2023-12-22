package class5;

import java.util.Scanner;

public class T5 {
    /*Write a program that will read three inputs of scores (quiz, mid term, and final term scores)
    from 0-100 and determine the grade based on the following rules:
    If the average score>=90-->grade=A
    If the average score >=70 and <90-->grade=B
    If the average score>=50 and <70-->grade=C
    If the average score<50-->grade=F
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double quizMarks, midMarks, finalMarks, avgMarks;
        char grade;
        System.out.println("Please enter the mark for quiz 0-100");
        quizMarks=sc.nextDouble();
        System.out.println("Please enter the mark for midterm 0-100");
        midMarks=sc.nextDouble();
        System.out.println("Please enter the mark for final 0-100");
        finalMarks=sc.nextDouble();
        avgMarks=(quizMarks+midMarks+finalMarks)/3;

        if(avgMarks>=90) {
            grade='A';
        }else if (avgMarks>=70) {
            grade='B';
        }else if(avgMarks>=50) {
            grade='C';
        }else{
            grade='F';
        }
        System.out.println(grade);






    }
}
