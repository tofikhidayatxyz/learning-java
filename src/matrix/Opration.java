package matrix;

public class Opration {
    public Integer[] matrixA = {};
    public Integer[][] matrixB = {};
    public double[][] oprationResult = {{0,0}, {0,0}};
    public double[][] inversResult = {{0,0}, {0,0}};

    public Opration setMatrixA(Integer[] matrixA) {
        this.matrixA = matrixA;
        return this;
    }
    public Opration setMatrixB(Integer[][] matrixB) {
        this.matrixB = matrixB;
        return this;
    }

    public Opration calculate() {
        double[][] result = {
                {this.matrixA[0] * this.matrixB[0][0], this.matrixA[0] * matrixB[1][0]},
                {this.matrixA[1] * this.matrixB[1][0], this.matrixA[1] * matrixB[1][1]},
        };
        this.oprationResult = result;
        return this;
    }

    public Opration inverse(double[][] inversData) {
        double detMatrix = (inversData[0][0] * inversData[1][1]) - (inversData[1][0] * inversData[1][0]);
        double detSub = (double) 1 /detMatrix;
        double resultInvers[][] = {
                {
                        (double)this.matrixB[0][0] * detSub,
                        (double)(this.matrixB[0][1] * -1 ) * detSub,
                }, {
                        (double)(this.matrixB[1][0] * - 1) * detSub,
                        (double)this.matrixB[1][1] * detSub,
                 }
        };
        this.inversResult = resultInvers;
        return this;
    }


    // get
    public double[][] getInversResult() {
        return this.inversResult;
    }

    public double[][] getOprationResult() {
        return this.oprationResult;
    }

}
