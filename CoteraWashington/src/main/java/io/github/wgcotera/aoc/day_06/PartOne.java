package io.github.wgcotera.aoc.day_06;

import io.github.wgcotera.aoc.Aoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class PartOne implements Aoc<Integer> {
    public static void main(String[] args) {
        System.out.println(new PartOne().run());
    }

    @Override
    public Integer solution(String input) {

        List<String> listOfChar = Arrays.stream(input.lines().toList().get(0).split("")).toList();
        List<String> tmp = new ArrayList<>(listOfChar.subList(0, 4));

        for (int i = 4; i < listOfChar.size(); i++) {
            tmp.add(listOfChar.get(i));
            Set<String> set = Set.copyOf(tmp.subList(tmp.size() - 4, tmp.size()));
            if (set.size() == 4) {
                return i + 1;
            }
        }
        return null;
    }

    @Override
    public String inputFilePath() {
        return "6";
    }
}
