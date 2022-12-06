package io.github.wgcotera.aoc.day_06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartTwoTest {

    @Test
    void solution_test_one() {

        var partTwo = new PartTwo();
        var solution = partTwo.solution("mjqjpqmgbljsphdztnvjfqwrcgsmlb");
        assertEquals(solution, 19);
    }

    @Test
    void solution_test_two() {

        var partTwo = new PartTwo();
        var solution = partTwo.solution("bvwbjplbgvbhsrlpgdmjqwftvncz");
        assertEquals(solution, 23);
    }

    @Test
    void solution_test_three() {

        var partTwo = new PartTwo();
        var solution = partTwo.solution("nppdvjthqldpwncqszvftbrmjlhg");
        assertEquals(solution, 23);
    }

    @Test
    void solution_test_four() {

        var partTwo = new PartTwo();
        var solution = partTwo.solution("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg");
        assertEquals(solution, 29);
    }

    @Test
    void solution_test_five() {

        var partTwo = new PartTwo();
        var solution = partTwo.solution("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw");
        assertEquals(solution, 26);
    }


}