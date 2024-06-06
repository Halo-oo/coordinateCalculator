package org.example;

import org.example.view.InputView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final InputView inputView = new InputView();

        boolean continueStatus = true;

        while (continueStatus) {
            // 1) 좌표값 입력받기
            String coordinate = inputView.getCoordinateInput();

            continueStatus = false;
        }
    }
}