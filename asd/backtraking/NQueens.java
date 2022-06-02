package asd.backtraking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens
{

    boolean isSafeAt(int row, int col, char board[][])
    {
        
        // Horizontal

        for(int i = 0; i < board.length; i++)
        {
            if(board[row][i] == 'Q')
                return false;
        }

        // Vertical

        for(int i = 0; i < board.length; i++)
        {
            if(board[i][col] == 'Q')
                return false;
        }

        // Upper Left

        int r = row;

        for(int c = col; c >= 0 && r >= 0; c--, r--)
        {
            if(board[r][c] == 'Q')
                return false;
        }

        // Upper Right

        r = row;

        for(int c = col; c < board.length && r >= 0; c++, r--)
        {
            if(board[r][c] == 'Q')
                return false;
        }

        // Lower Left

        r = row;

        for(int c = col; c >= 0 && r < board.length; c--, r++)
        {
            if(board[r][c] == 'Q')
                return false;
        }

        // Lower Right

        r = row;

        for(int i = col; i < board.length && r < board.length; i++, r++)
        {
            if(board[r][i] == 'Q')
                return false;
        }

        return true;
    }

    void saveBoard(char board[][], List<List<String>> allBoards)
    {
        List<String> newBoard = new ArrayList<>();
        String row = "";
        for(int i = 0; i < board.length; i++)
        {
            row = "";
            for(int j = 0; j < board[i].length; j++)
            {
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    void queensPos(char board[][], List<List<String>> allBoards, int col)
    {
        if(col == board.length)
        {
            saveBoard(board, allBoards);
            return;
        }

        for(int row = 0; row < board.length; row++)
        {
            if(isSafeAt(row, col, board))
            {
                board[row][col] = 'Q';
                queensPos(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args)
    {
        NQueens ob = new NQueens();
        List<List<String>> allBoards = new ArrayList<>();
        int n = 4;
        char board[][] = new char[n][n];
        ob.queensPos(board, allBoards, 0);
        System.out.println(allBoards);
    }
}
