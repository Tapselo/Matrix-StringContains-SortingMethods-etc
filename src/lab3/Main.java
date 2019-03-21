package lab3;

import lab3.cw1.Matrix;
import lab3.cw2.SolutionList;
import lab3.cw3.Substring;
import lab3.cw4.SolutionTab;
import lab3.cw5.SortingMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wybor;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("<><><><><><><><><><><>");
            System.out.println("Choose one:\n1. Adding Matrix\n2. List solution\n3. Substring\n4. Solution(index)\n5. Sorting Arrays\n0. Exit");
            System.out.println("<><><><><><><><><><><>");
            wybor = scan.nextInt();
            switch (wybor) {
                case 1:
                    Matrix.matrixMain();
                    break;
                case 2:
                    SolutionList.solutionMain();
                    break;
                case 3:
                    Substring.substringMain();
                    break;
                case 4:
                    SolutionTab.tabMain();
                    break;
                case 5:
                    SortingMain.sortingmain();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong option - choose again");
                    break;
            }
        }
    }
}
