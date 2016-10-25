package Chapter1;

import static Libary.Helper.printMatrix;

public class Chapter1_7 {


	public static void main(String[] args){

		int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(matrix);
		System.out.println();
		printMatrix(matrix);
	} 



	private static boolean rotate(int[][] martix){
		if(martix.length ==0 || martix[0].length != martix.length) return false;
        printMatrix(martix);


		int n = martix.length;

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i  = first; i < last; i++) {
				int offset = i - first;
				int top =  martix[first][i];

				// left >> top
				martix[first][i] = martix[last - offset][first];

				// bottom >> left
				martix[last - offset][first] = martix[last][last - offset];

				// right >>bottom
				martix[last][last - offset] = martix[i][last];

				// top >> right
				martix[i][last] = top;
			}
            System.out.println("------------------");
            printMatrix(martix);
            System.out.println("------------------");
        }
		return true;
	}


}