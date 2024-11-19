package com.cardinal.specialty.number_in_words_kata;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class TextualIntegerTest {
    private static Stream<Arguments> singleWordResultTest() {
        return Stream.of(
                Arguments.of(0, "zero"),
                Arguments.of(1, "one"),
                Arguments.of(2, "two"),
                Arguments.of(3, "three"),
                Arguments.of(4, "four"),
                Arguments.of(5, "five"),
                Arguments.of(6, "six"),
                Arguments.of(7, "seven"),
                Arguments.of(8, "eight"),
                Arguments.of(9, "nine"),
                Arguments.of(10, "ten"),
                Arguments.of(11, "eleven"),
                Arguments.of(12, "twelve"),
                Arguments.of(13, "thirteen"),
                Arguments.of(14, "fourteen"),
                Arguments.of(15, "fifteen"),
                Arguments.of(16, "sixteen"),
                Arguments.of(17, "seventeen"),
                Arguments.of(18, "eighteen"),
                Arguments.of(19, "nineteen"),
                Arguments.of(20, "twenty"),
                Arguments.of(30, "thirty"),
                Arguments.of(40, "forty"),
                Arguments.of(50, "fifty"),
                Arguments.of(60, "sixty"),
                Arguments.of(70, "seventy"),
                Arguments.of(80, "eighty"),
                Arguments.of(90, "ninety")
        );
    }

    @ParameterizedTest
    @MethodSource
    void singleWordResultTest(int number, String expected) {
        var subject = new TextualInteger(number);
        assertEquals(expected, subject.toString());
    }

    private static Stream<Arguments> twoWordTest() {
        return Stream.of(
                Arguments.of(21, "twenty one"),
                Arguments.of(22, "twenty two"),
                Arguments.of(23, "twenty three"),
                Arguments.of(24, "twenty four"),
                Arguments.of(25, "twenty five"),
                Arguments.of(26, "twenty six"),
                Arguments.of(27, "twenty seven"),
                Arguments.of(28, "twenty eight"),
                Arguments.of(29, "twenty nine"),
                Arguments.of(31, "thirty one"),
                Arguments.of(32, "thirty two"),
                Arguments.of(33, "thirty three"),
                Arguments.of(34, "thirty four"),
                Arguments.of(35, "thirty five"),
                Arguments.of(36, "thirty six"),
                Arguments.of(37, "thirty seven"),
                Arguments.of(38, "thirty eight"),
                Arguments.of(39, "thirty nine"),
                Arguments.of(41, "forty one"),
                Arguments.of(42, "forty two"),
                Arguments.of(43, "forty three"),
                Arguments.of(44, "forty four"),
                Arguments.of(45, "forty five"),
                Arguments.of(46, "forty six"),
                Arguments.of(47, "forty seven"),
                Arguments.of(48, "forty eight"),
                Arguments.of(49, "forty nine"),
                Arguments.of(51, "fifty one"),
                Arguments.of(52, "fifty two"),
                Arguments.of(53, "fifty three"),
                Arguments.of(54, "fifty four"),
                Arguments.of(55, "fifty five"),
                Arguments.of(56, "fifty six"),
                Arguments.of(57, "fifty seven"),
                Arguments.of(58, "fifty eight"),
                Arguments.of(59, "fifty nine"),
                Arguments.of(61, "sixty one"),
                Arguments.of(62, "sixty two"),
                Arguments.of(63, "sixty three"),
                Arguments.of(64, "sixty four"),
                Arguments.of(65, "sixty five"),
                Arguments.of(66, "sixty six"),
                Arguments.of(67, "sixty seven"),
                Arguments.of(68, "sixty eight"),
                Arguments.of(69, "sixty nine"),
                Arguments.of(71, "seventy one"),
                Arguments.of(72, "seventy two"),
                Arguments.of(73, "seventy three"),
                Arguments.of(74, "seventy four"),
                Arguments.of(75, "seventy five"),
                Arguments.of(76, "seventy six"),
                Arguments.of(77, "seventy seven"),
                Arguments.of(78, "seventy eight"),
                Arguments.of(79, "seventy nine"),
                Arguments.of(81, "eighty one"),
                Arguments.of(82, "eighty two"),
                Arguments.of(83, "eighty three"),
                Arguments.of(84, "eighty four"),
                Arguments.of(85, "eighty five"),
                Arguments.of(86, "eighty six"),
                Arguments.of(87, "eighty seven"),
                Arguments.of(88, "eighty eight"),
                Arguments.of(89, "eighty nine"),
                Arguments.of(91, "ninety one"),
                Arguments.of(92, "ninety two"),
                Arguments.of(93, "ninety three"),
                Arguments.of(94, "ninety four"),
                Arguments.of(95, "ninety five"),
                Arguments.of(96, "ninety six"),
                Arguments.of(97, "ninety seven"),
                Arguments.of(98, "ninety eight"),
                Arguments.of(99, "ninety nine")
        );
    }

    @ParameterizedTest
    @MethodSource
    void twoWordTest(int number, String expected) {
        var subject = new TextualInteger(number);
        assertEquals(expected, subject.toString());
    }
}