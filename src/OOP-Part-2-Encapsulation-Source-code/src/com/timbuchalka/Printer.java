package com.timbuchalka;

/**
 * Created by Michał on 2017-06-28.
 */
public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.numberOfPagesPrinted =0;
    }

    public void fillUpToner(int ammount){
        if (tonerLevel <100){
            this.tonerLevel = tonerLevel + ammount;
        }else {
            System.out.println("toner is full");
        }

    }
}
