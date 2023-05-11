package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run(){
        if (isRunCalled){
            return null;
        }
        isRunCalled = true;
        return new HalvingCarouselRun();
    }

}
