package com.good;

import org.junit.Test;

public class UserController {
    @Test
    public void test1(){
        Persion[] persions = new Persion[10];
        for (int i = 0; i < persions.length ; i++) {
            persions[i] = new Persion();
            persions[i].setId(String.valueOf(i));
            persions[i].setAge(i+10);
            persions[i].setUsername("name"+String.valueOf(i));
            persions[i].setSex(i%2==0?"man":"female");
        }
        for (Persion one:persions
             ) {
            System.out.println(one);
        }
    }
}
