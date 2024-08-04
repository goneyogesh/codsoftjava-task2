import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of subjects : ");
        int no_of_subjects=sc.nextInt();
        System.out.println("Enter the marks obtained in each subject (out of 100) : ");
        int Total_marks=0;
        for(int i=1;i<no_of_subjects+1;i++){
            System.out.println("Enter the marks in subject : "+i);
            int marks=sc.nextInt();
            if(marks>=0 && marks<=100){
                Total_marks=marks+Total_marks;
            }
            else{
                System.out.println("Enter the marks in valid marks : ");
                i--;
            }
        }
        float average=Total_marks/no_of_subjects;
        System.out.println("Total marks : "+Total_marks);
        System.out.println("Average percentage : "+ average);
        if(average>90 && average<=100){
            System.out.println("Grade A");
        }
        else if(average>75 && average<=90){
            System.out.println("Grade B");
        }
        else if(average>60 && average<=75){
            System.out.println("Grade C");
        }
        else if(average>=40 && average<=60){
            System.out.println("Grade D");
        }
        else if(average>=0 && average<40){
            System.out.println("Your fail in the exam you have no Grade");
        }
    }
}
