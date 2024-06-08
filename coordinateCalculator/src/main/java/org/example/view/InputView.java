package org.example.view;

import org.example.model.Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * 좌표값 입력받기
     */
    public String getCoordinateInput() throws IOException {
        System.out.println("좌표를 입력하세요.");
        return br.readLine();
    }

    /**
     * 좌표 문자열을 파싱하여 Point List로 저장
     */
    public List<Point> parseCoordinateString(String coordinate) {
        List<Point> coordinateList = new ArrayList<>();
        String[] coordinateParts = coordinate.split("[^A-Z0-9]+|[^0-9$]");

        for (int i = 1; i < coordinateParts.length; i+=2) {
            String x = coordinateParts[i];
            String y = coordinateParts[i+1];

            coordinateList.add(new Point(x, y));
        }

        return coordinateList;
    }

    /**
     * 게임 진행 여부 입력받기
     */
    public boolean askContinue() throws IOException {
        System.out.println("계속 하시겠습니까? (yes/no)");
        String status = br.readLine();

        if (status.equals("no")) return false;
        return true;
    }
}
