package InterviewPrograms;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int nooflines = input.nextInt();
        int row, col=0;
        for(row =0;row<nooflines;row++) {
            for(col=0;col<=row;col++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }

