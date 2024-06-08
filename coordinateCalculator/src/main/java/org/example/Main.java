package org.example;

import org.example.calculator.ShapeCalculatorService;
import org.example.model.CalculationResult;
import org.example.model.Point;
import org.example.view.InputView;
import org.example.view.ResultView;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final InputView inputView = new InputView();
        final ResultView resultView = new ResultView();
        final ShapeCalculatorService shapeCalculatorService = new ShapeCalculatorService();

        boolean continueStatus = true;

        while (continueStatus) {
            // 1) 좌표값 입력받기
            String coordinateInput = inputView.getCoordinateInput();
            List<Point> coordinateList = inputView.parseCoordinateString(coordinateInput);

            // 2) 좌표 모양 별 계산 결과출력
            CalculationResult calculationResult = shapeCalculatorService.calculationShape(coordinateList);
            resultView.calculationResultOutput(calculationResult);

            continueStatus = inputView.askContinue();
        }
    }
}