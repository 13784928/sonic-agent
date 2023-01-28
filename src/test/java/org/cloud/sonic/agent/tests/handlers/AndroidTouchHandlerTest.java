package org.cloud.sonic.agent.tests.handlers;

import org.junit.Test;

public class AndroidTouchHandlerTest {

    private int width = 720;
    private int height = 1600;

    private int[] transferWithRotation(int x, int y) {
        int directionStatus = 1;
        int _x;
        int _y;
        if (directionStatus == 1 || directionStatus == 3) {
            _x = directionStatus == 1 ? width - y : x - width * 3;
            _y = directionStatus == 1 ? x : -y;
        } else {
            _x = directionStatus == 2 ? width - x : x;
            _y = directionStatus == 2 ? height - y : y;
        }
        return new int[]{_x, _y};
    }

    @Test
    public void test() {
        int[] re = transferWithRotation(988, 256);
        System.out.println(re[0]);
        System.out.println(re[1]);
    }
}
