package dsa.stack_and_queue;

public class LargestrectangleInMatrix
{

    int[] histogram(char row[], int prevSum[]) throws NumberFormatException
    {
        for(int i = 0; i < row.length; i++)
        {
            if(row[i] == '1')
                prevSum[i] = Integer.parseInt(String.valueOf(row[i])) + prevSum[i];
            else
                prevSum[i] = 0;
        }
        return prevSum;
    }

    public static void main(String[] args)
    {

        // char[][] matrix = {{'1', '0', '1', '0', '0'},
        //                    {'1', '0', '1', '1', '1'},
        //                    {'1', '1', '1', '1', '1'},
        //                    {'1', '0', '0', '1', '0'}};

        char[][] matrix = {{'0'}};

        LargestRectangleInHistogram largestArea = new LargestRectangleInHistogram();
        LargestrectangleInMatrix ob = new LargestrectangleInMatrix();
        // System.out.println(matrix.length);
        int max = 0;

        int sum[] = new int[matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++)
        {
            sum = ob.histogram(matrix[i], sum);
            for (int x : sum) {
                System.out.print(x + " ");
            }
            System.out.println();
            int x = largestArea.largestRectangleArea(sum);
            max = (x > max)? x: max;

        }

        System.out.println(max);
    }
}
