package org.example.view;

import org.example.model.CalculationResult;

public class ResultView {

    /**
     * (기본) message 출력
     */
    public void plainMessageOutput(String message) {
        System.out.println(message);
    }

    /**
     * (경고) message 출력
     */
    public void warningMessageOutput(String message) {
        System.out.println("[!주의] " + message);
    }

    /**
     * (결과) 모양 별 계산 결과 출력
     */
    public void calculationResultOutput(CalculationResult result) {
        System.out.println(result.getShapeType() + "는 " + result.getCalculatorResult() + " 입니다.");
    }
}
