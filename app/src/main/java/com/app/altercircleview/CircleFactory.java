package com.app.altercircleview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Berry on 2018/4/26.
 */

public class CircleFactory {

    // 圆 属性
    private int mRadius;

    public CircleFactory(int raidus) {
        mRadius = raidus;

    }

    // 根据传入的叶子数量产生叶子信息
    public List<Circle> generateCircles(int circleSize) {
        List<Circle> circles = new ArrayList<>();
        for (int i = 0; i < circleSize; i++) {
            circles.add(generateCircle(i));
        }
        return circles;
    }

    // 生成一个叶子信息
    private Circle generateCircle(int i) {
        Circle circle = new Circle(mRadius * (3 * (i + 1 - 1)), 0, mRadius, false);
        if (i == 0) {
            circle.setSolid(true);
        }
        return circle;
    }
}
