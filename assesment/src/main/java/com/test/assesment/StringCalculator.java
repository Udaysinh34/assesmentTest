package com.test.assesment;

import org.springframework.stereotype.Component;

@Component
public class StringCalculator {

    int add(String numbers){
        numbers = numbers.replaceAll("(\r\n|\n)", ",");
        int stringLength = numbers.length();
//        System.lineSeparator();

        int addition = 0;
        String numString = new String();
        if (stringLength != 0){
            for(int i=0;i<stringLength;i++){

                if(numbers.charAt(i) != ','){
                    numString = numString + (String.valueOf(numbers.charAt(i)));
                } else {
                    addition = addition + Integer.parseInt( numString);
                    numString = new String();
                }
            }
            addition = addition + Integer.parseInt(numString);
        }

        return addition;
    }
}
