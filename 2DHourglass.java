import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[][] sum(int[][] arr)
    {
        int[][] result = new int[4][4];
        int sum = 0;
        for(int i = 0; i < arr.length - 2; i++)
        {
            for(int j= 0; j < arr[i].length - 2; j++)
            {
                sum = sum + arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
               result[i][j] = sum; 
               sum = 0;
            }
            
        }
        return result;
    }



    static int hourglassSum(int[][] arr) {
        int[][] result = sum(arr);
        int max = result[0][0];
        System.out.println(max);
        for(int i = 0; i < result.length; i++)
        {
            for(int j= 1; j < result[i].length; j++)
            {
                System.out.println(result[i][j]);
                if (result[i][j] > max)
                {
                    max = result[i][j];
                }
            }
        }
        return max;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
