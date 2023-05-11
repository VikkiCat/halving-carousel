package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.DecrementingCarousel.array;

public class HalvingCarouselRun extends CarouselRun {

    public  int decrement;
    @Override
    public int next() {

        int count = 0;
        while (count < array.length && array[position%=array.length] <= 0) {
            position++;
            count++;
        }
        if (count == array.length) return -1;
        int beforeDecreasing = array[position];
        array[position] = array[position] / 2;
        position++;
        return beforeDecreasing;
    }

    @Override
    public boolean isFinished() {

        for (int var: array) {
            if (var > 0) return false;
        }
        return true;
    }

}
