package cz.educanet.tranformations;

public class Main {
    public static void main(String[] args) {
        double[][] a = {
                {7,6,2},
                {5,9,4},
                {1,5,4},
        };

        double[][] b = {
                {9,5,5},
                {3,4,1},
                {8,4,2},
        };

        IMatrix matrixA = MatrixFactory.create(a);
        IMatrix matrixB = MatrixFactory.create(b);
    }
}
