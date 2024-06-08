package org.example;

import org.example.calculator.ShapeCalculatorService;
import org.example.model.Point;
import org.example.view.InputView;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final InputView inputView = new InputView();
        final ShapeCalculatorService shapeCalculatorService = new ShapeCalculatorService();

        boolean continueStatus = true;

        while (continueStatus) {
            // 1) 좌표값 입력받기
            String coordinateInput = inputView.getCoordinateInput();
            List<Point> coordinateList = inputView.parseCoordinateString(coordinateInput);

            // 2) 좌표 모양 별 계산
            double result = shapeCalculatorService.calculationShape(coordinateList);

            continueStatus = false;
        }
    }
}