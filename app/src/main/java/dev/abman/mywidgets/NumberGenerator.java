package dev.abman.mywidgets;

import java.util.Random;

/**
 * Created by adul on 03/10/17.
 */

public class NumberGenerator {

    public static int Generate(int max){
        Random random = new Random();
        int randomInt = random.nextInt(max);
        return randomInt;
    }
}
