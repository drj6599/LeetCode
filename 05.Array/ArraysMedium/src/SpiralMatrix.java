import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int total = matrix.length*matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (total == 0)
                    return result;
                result.add(matrix[i][j]);
                total -= 1;
                if (total == 0) return result;
                if(j == matrix[i].length-1-i)
                {
                    for (int k = i+1; k < matrix.length-i; k++) {
                        result.add(matrix[k][j]);
                        total -= 1;
                        if (total == 0) return result;
                    }
                    int l = matrix.length-1-i;
                    for (int k = matrix[l].length-2-i; k >= 0; k--) {
                        result.add(matrix[l][k]);
                        total -= 1;
                        if (total == 0) return result;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //List<Integer> output = spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
        int result = 0;
        int count = 0;
        int[] nums = {437,315,322,431,686,264,442};
        for(int i=0; i<nums.length; i++)
        {
            int n = nums[i];
            while(n != 0)
            {
                n /= 10;
                count += 1;
            }

            if(count%2 == 0)
                result += 1;
        }
        System.out.println(result);
    }
}
