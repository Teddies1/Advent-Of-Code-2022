package aoc.day01;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day01Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = List.of(
                "1000", "2000","3000","","4000","","5000","6000","","7000","8000","9000","","10000");


        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("24000", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = List.of(
                "1000", "2000","3000","","4000","","5000","6000","","7000","8000","9000","","10000");

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals("45000", result);
    }
}
