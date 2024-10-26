package com.test.assesment;

import org.springframework.stereotype.Component;

@Component
public class StringCalculator {

    int add(String numbers){
        int addition = 0;
        int stringLength = numbers.length();
        if (stringLength != 0){
        char check = ',';
        if(numbers.charAt(0) == '/'){
            check = numbers.charAt(2);
            numbers = numbers.substring(4);
        }
        numbers = numbers.replaceAll("(\r\n|\n)", String.valueOf(check));
        stringLength = numbers.length();


        String numString = new String();

            for(int i=0;i<stringLength;i++){

                if(numbers.charAt(i) != check){
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
