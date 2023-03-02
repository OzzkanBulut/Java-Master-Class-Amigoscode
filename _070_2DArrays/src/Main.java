import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j]='-';
            }
        }
        System.out.println(Arrays.deepToString(board)); // this is how you print 2d array
        board[0][0] = 'O';
        board[1][1] = 'O';
        board[2][2] = 'O';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }

        char[][] boardTwo = new char[][]{
                new char[]{'X','O','X'},
                new char[]{'X','O','O'},
                new char[]{'X','X','O'}
        };
//        System.out.println(Arrays.deepToString(boardTwo));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(boardTwo[i][j]+" ");
            }
            System.out.println();

        }
    }
}