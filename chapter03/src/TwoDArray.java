package src;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] myArrays = new int[4][5];
        int k = 0;
        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 5; ++j){
                myArrays[i][j] = k++;
            }
        }

        for (int i = 0; i < 4; ++i , System.out.println()){
            for (int j = 0; j < 5; ++j){
                System.out.print(myArrays[i][j] + " ");
            }
        }
    }
}
