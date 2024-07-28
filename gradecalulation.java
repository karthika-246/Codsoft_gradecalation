import java.util.*;
class Student_Grade 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\t\t\t\t\t STUDENT GRADE CALCULATION \n");
        System.out.print("\nENTER YOUR ROLL NO :  ");
        String roll = input.nextLine();
        System.out.print("ENTER YOUR NAME :   ");
        String name = input.nextLine();  
        System.out.println("\nENTER THE " + name + "'s MARKS \n");
        System.out.print("ENTER THE NUMBER OF SUBJECTS YOU WANT TO ENTER: ");
        int n = input.nextInt(); 
        int[] marks = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks for Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            if(marks[i]<=100)
            {
            total += marks[i]; 
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }
        float per = (float) total / n;
        System.out.println("\n** DETAILS ** \nROLL NO : "+roll);
        System.out.println("NAME : "+name);
        System.out.println("\nTotal Mark :  " + total);
        System.out.println("Percentage :  " + per);    
        if (per >= 90)
            System.out.println("Grade  A  EXCELLENT");
        else if (per >= 80)
            System.out.println("Grade  B  VERY GOOD");
        else if (per >= 70)
            System.out.println("Grade  C  GOOD");
        else if (per >= 60)
            System.out.println("Grade  D  SATISFACTION");
        else if (per >= 50)
            System.out.println("Grade  E  BAD");
        else
            System.out.println("Grade  F  FAIL");
           }
}
