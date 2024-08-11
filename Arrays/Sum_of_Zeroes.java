import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Sum_of_Zeroes {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here.
		int N = mat.size();
        int M = mat.get(0).size();
        int coverage = 0;

        // Loop through each cell in the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // If we find a zero, check its neighbors
                if (mat.get(i).get(j) == 0) {

                    // Check left neighbor
                    if (j-1 >= 0 && mat.get(i).get(j - 1) == 1) {
                        coverage++;
                    }

                    // Check right neighbor
                    if (j+1 < M  && mat.get(i).get(j + 1) == 1) {
                        coverage++;
                    }

                    // Check top neighbor
                    if (i-1 >= 0 && mat.get(i - 1).get(j) == 1) {
                        coverage++;
                    }

                    // Check bottom neighbor
                    if (i+1 < N && mat.get(i + 1).get(j) == 1) {
                        coverage++;
                    }

                    // Add the coverage for this zero to the total coverage
                    
                }
            }
        }

        return coverage;
	}
}
