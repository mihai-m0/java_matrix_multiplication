import java.sql.SQLOutput;
import java.util.Scanner;

public class Matrix {
    private int rows;
    private int cols;
    private int[][] mat;

    public Matrix(int cols,int rows){
        this.rows=rows;
        this.cols=cols;
        mat = new int[cols][rows];
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public int getaData(int i,int j){
        return mat[i][j];
    }

    public void setData(int i,int j,int value){
        mat[i][j]=value;
    }

    public void readMatrix(){
        Scanner in = new Scanner(System.in);
        System.out.print("write the matrix on a line: ");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++){
                int x;
                x=in.nextInt();
                mat[i][j]=x;
            }
    }

    public void printMatrix(){
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }


}
