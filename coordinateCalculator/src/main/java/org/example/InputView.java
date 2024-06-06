package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * 좌표값 입력받기
     */
    public String getCoordinateInput() throws IOException {
        System.out.println("좌표를 입력하세요.");
        return br.readLine();
    }
}
