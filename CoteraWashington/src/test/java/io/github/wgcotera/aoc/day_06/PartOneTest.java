package io.github.wgcotera.aoc.day_06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartOneTest {

    @Test
    void solution_test_one() {

        var partOne = new PartOne();
        var solution = partOne.solution("bvwbjplbgvbhsrlpgdmjqwftvncz");
        assertEquals(solution, 5);
    }

    @Test
    void solution_test_two() {

        var partOne = new PartOne();
        var solution = partOne.solution("nppdvjthqldpwncqszvftbrmjlhg");
        assertEquals(solution, 6);
    }

    @Test
    void solution_test_three() {

        var partOne = new PartOne();
        var solution = partOne.solution("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg");
        assertEquals(solution, 10);
    }

    @Test
    void solution_test_four() {

        var partOne = new PartOne();
        var solution = partOne.solution("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw");
        assertEquals(solution, 11);
    }
}