package com.luyenlaptrinh.firstproject.service.imp;

import com.luyenlaptrinh.firstproject.service.BanhXe;
import com.luyenlaptrinh.firstproject.service.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BanhXeImp implements BanhXe {
    private Integer a = 0;

    @Autowired
    private Shape shape;

    @Override
    public void chay() {
        shape.draw();
    }

    public void tang(){
        a = ++a;
    }

    public Integer layGiaTri(){
        return a;
    }
}
