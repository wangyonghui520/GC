package com.atguigu.iedatest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    public static void main(String[] args) {
        System.out.println("asksaklasklsakl");
    }
    public void test(){
        test();
        System.out.println("skala");
    }

    @GetMapping("/hello")
    public void hello() {
        ArrayList<String> list = new ArrayList<>();
        List list1 = list;
        for (Object o : list1) {
            
        }
        for (int i = 0; i < 12; i++) {
            
        }

        System.out.println();
    }
}
