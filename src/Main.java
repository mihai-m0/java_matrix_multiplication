//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Matrix mat = new Matrix(3,3);
      mat.readMatrix();
//      mat.printMatrix();

      Matrix mat1 = new Matrix(3,3);
      mat1.readMatrix();
//      mat1.printMatrix();

      Matrix res=MatrixOps.mulMatrix(mat,mat1);

      res.printMatrix();
    }
}