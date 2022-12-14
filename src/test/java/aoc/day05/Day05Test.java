package aoc.day05;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day05Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = List.of(
                "move 1 from 2 to 1","move 3 from 1 to 3","move 2 from 2 to 1","move 1 from 1 to 2");


        // When
        String result = new Day05().part1(input);

        // Then
        assertEquals("CMZ", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = List.of(
                "move 1 from 2 to 1","move 3 from 1 to 3","move 2 from 2 to 1","move 1 from 1 to 2");

        // When
        String result = new Day05().part2(input);

        // Then
        assertEquals("MCD", result);
    }
}