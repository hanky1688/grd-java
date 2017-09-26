package com.hanky.annotations;

import lombok.Data;

@Data
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor= FruitColor.Color.RED)
    private String appleColor;

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
}
