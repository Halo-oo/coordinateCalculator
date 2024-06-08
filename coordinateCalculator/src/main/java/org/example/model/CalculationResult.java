package org.example.model;

public class CalculationResult {
    /* 모양 종류 */
    String shapeType;

    /* 계산 결과 */
    double calculatorResult;

    public String getShapeType() {
        return shapeType;
    }

    public double getCalculatorResult() {
        return calculatorResult;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public void setCalculatorResult(double calculatorResult) {
        this.calculatorResult = calculatorResult;
    }
}
