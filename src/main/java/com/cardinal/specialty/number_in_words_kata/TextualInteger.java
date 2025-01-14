package com.cardinal.specialty.number_in_words_kata;

import java.util.Map;

import static java.util.Map.entry;

public class TextualInteger {
    private final int value;
    public TextualInteger(int value) {
        this.value = value;
    }

    public String toString() {
        String result = "";

        result = evaluateSecondDigitValue(20, result);
        result = evaluateSecondDigitValue(30, result);
        result = evaluateSecondDigitValue(40, result);
        result = evaluateSecondDigitValue(50, result);
        result = evaluateSecondDigitValue(60, result);
        result = evaluateSecondDigitValue(70, result);
        result = evaluateSecondDigitValue(80, result);
        result = evaluateSecondDigitValue(90, result);

        if (result.isEmpty()) {
            return numberMap.get(this.value);
        } else {
            return result;
        }
    }

    private String evaluateSecondDigitValue(int x, String result) {
        if (x < this.value && this.value < x + 10) {
            result = numberMap.get(x) + " " + numberMap.get(this.value - x);
        }
        return result;
    }

    private static final Map<Integer, String> numberMap = Map.ofEntries(
            entry(0, "zero"),
            entry(1, "one"),
            entry(2, "two"),
            entry(3, "three"),
            entry(4, "four"),
            entry(5, "five"),
            entry(6, "six"),
            entry(7, "seven"),
            entry(8, "eight"),
            entry(  9, "nine"),
            entry(  10, "ten"),
            entry(  11, "eleven"),
            entry(  12, "twelve"),
            entry(  13, "thirteen"),
            entry(  14, "fourteen"),
            entry(  15, "fifteen"),
            entry(  16, "sixteen"),
            entry(  17, "seventeen"),
            entry(  18, "eighteen"),
            entry(  19, "nineteen"),
            entry(  20, "twenty"),
            entry(  30, "thirty"),
            entry(  40, "forty"),
            entry(  50, "fifty"),
            entry(  60, "sixty"),
            entry(  70, "seventy"),
            entry(  80, "eighty"),
            entry(  90, "ninety")
    );
}
