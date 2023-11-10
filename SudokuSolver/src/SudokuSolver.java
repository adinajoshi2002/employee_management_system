
/*
 * input
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9
 */
import java.util.Scanner;

public class SudokuSolver {
	static int count=0;
	//printing sudoku board
	public static void printBoard(int[][] board) {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row > 0) {
                System.out.println("------+-------+------");
            }
            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0 && col > 0) {
                    System.out.print("| ");
                }
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
	
    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) 
        {
            for (int col = 0; col < 9; col++) 
            {
                if (board[row][col] == 0) 
                {
                    for (int num = 1; num <= 9; num++)//checking which value will be fit for particular cell in sudoku from 1 to 9
                    {
                        if (isSafe(board, row, col, num))//calling isSafe method to check whether number fits in that cell or not 
                        {
                            board[row][col] = num;//if it fits place that number in that cell
                            //count++;
                            //System.out.println("_____________________");
                            //System.out.println("Step"+count+":");
                            //printBoard(board);//when ever a value fits in sudoku then print the board
                            if (solveSudoku(board)) {                           	
                                return true;
                            }
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    
//to check corresponding row,column and 3*3 matrix where this number is already present any where in that or not 
    public static boolean isSafe(int[][] board, int row, int col, int num) {
    	
    	//checking whether number present in corresponding row or column
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num || board[x][col] == num) {
                return false;//when number present in column or row it will return false
            }
        }
        
        //checking whether number present in 3*3 matrix  or not
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;//where number present in 3*3 matrix  return false 
                }
            }
        }
        return true;//return true when number is not present in row,column and 3*3 matrix
    }

    

    public static void main(String[] args) {
        int[][] board = new int[9][9];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sudoku puzzle row by row (use 0 for empty cells):");

        for (int row = 0; row < 9; row++) {
            String rowInput = scanner.nextLine();
            String[] values = rowInput.split(" ");
            for (int col = 0; col < 9; col++) {
                board[row][col] = Integer.parseInt(values[col]);
            }
        }

        System.out.println("Sudoku Puzzle:");
        printBoard(board);

        if (solveSudoku(board)) {
            System.out.println("Sudoku Solution:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
