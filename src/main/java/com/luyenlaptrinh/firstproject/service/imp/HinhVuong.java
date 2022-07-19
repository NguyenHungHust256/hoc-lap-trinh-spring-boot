package com.luyenlaptrinh.firstproject.service.imp;

import com.luyenlaptrinh.firstproject.service.Shape;
import org.springframework.stereotype.Component;

@Component
public class HinhVuong implements Shape {
    @Override
    public void draw() {
        System.out.println("Ve hinh vuong");
    }
}
