package com.company;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	    DecimalFormat df = new DecimalFormat( "#.###" );
        for (int i = 1; i <= 10; i++) {
            double value = 1.0/i;
            System.out.println(df.format(value));
        }
    }
}
