package org.example.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        BigDecimal bdResult = new BigDecimal(calculatorResult).setScale(6, RoundingMode.HALF_UP);
        this.calculatorResult = bdResult.doubleValue();
    }
}
