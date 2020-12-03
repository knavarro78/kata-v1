package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        var result = ""
        if(inputNumber % 3 == 0) result+= "Foo"
        if(inputNumber % 5 == 0) result+= "Bar"
        var inputNumberToString = inputNumber.toString();
        for(i in 0.. inputNumberToString.length -1){
            if(inputNumberToString[i].equals('3')) result+= "Foo"
            else if(inputNumberToString[i].equals('5')) result+= "Bar"
            else if(inputNumberToString[i].equals('7')) result+= "Quix"
            else if(inputNumber % 5 != 0 && inputNumber % 3 != 0)  result+=inputNumberToString[i]
        }
        return result;
    }

}