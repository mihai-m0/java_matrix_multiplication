public class MatrixOps {

    public static Matrix addMatrix(Matrix a, Matrix b) {
        Matrix res = new Matrix(a.getCols(), a.getRows());
        for (int i = 0; i < a.getRows(); i++)
            for (int j = 0; j < a.getCols(); j++)
                res.setData(i, j, a.getaData(i, j) + b.getaData(i, j));
        return res;
    }

    public static Matrix mulMatrix(Matrix a, Matrix b) {
        Matrix res = new Matrix(a.getRows(), b.getCols());
        int sum = 0;
        for (int i = 0; i < a.getRows(); i++)
            for (int j = 0; j < b.getCols(); j++) {
                sum = 0;
                for (int k = 0; k < a.getCols(); k++)
                    sum += a.getaData(i, k) * b.getaData(k, j);

                res.setData(i, j, sum);
            }

        return res;
    }
}
