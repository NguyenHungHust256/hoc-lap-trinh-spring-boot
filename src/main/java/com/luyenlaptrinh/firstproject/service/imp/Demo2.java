package com.luyenlaptrinh.firstproject.service.imp;


import com.luyenlaptrinh.firstproject.service.BanhXe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Demo2 {

    @Autowired
    private BanhXe banhXe;

    @Scheduled(fixedDelay = 1000L)
    public void run(){
        banhXe.tang();
        System.out.println("Demo2: Gia tri a = " + banhXe.layGiaTri());
    }
}
