
import java.util.Arrays;

class leet73{
    public void setZeroes(int[] [] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean [] rowszero = new boolean[rows];
        boolean [] colszero = new boolean[cols];
        for(int i = 0 ; i<rows ; i++){
            for(int j =0 ; j<cols ; j++){
                if(matrix[i][j]==0){
                    rowszero[i]=true;
                    colszero[j]=true;
                }
            }
        }


        for(int i=0 ; i<rows ; i++){
            for(int j =0 ; j<cols ; j++){
                if(rowszero[i]==true || colszero[j]==true){
                    matrix[i][j]=0;
                }
            }
        }

    }
}

public class leetcode73 {
    public static void main(String[] args) {
        int [][] abr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}

        };
        leet73 l1 = new leet73();
        l1.setZeroes(abr);

    }
}
