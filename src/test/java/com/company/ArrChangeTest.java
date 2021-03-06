package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

class ArrChangeTest {

    private ArrChange arrChange;

    @BeforeEach
    public void init() {
        arrChange = new ArrChange();
    }

    @ParameterizedTest
    @MethodSource("dataForAddOperation")
    public void changeArr(int[] a, int[] result) {
        Assertions.assertEquals(Arrays.toString(result), Arrays.toString(arrChange.changeArr(a)));
        System.out.println(Arrays.toString(a) + " =>> " + Arrays.toString(result));
    }

    public static Stream<Arguments> dataForAddOperation() {
        ArrayList<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[] {9, 4, 3, 3, 4, 6, 2}, new int[] {6, 2}));
        out.add(Arguments.arguments(new int[] {3, 4, 2, 5}, new int[] {9, 5}));
        out.add(Arguments.arguments(new int[] {4, 2 ,3, 6, 7, 8}, new int[] {2 ,3, 6, 7, 8}));
        out.add(Arguments.arguments(new int[] {7, 2, 2, 2}, new int[] {2, 2, 2}));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForAddOperation2")
    public void lookFourAndOne(int[] a, boolean result) {
        Assertions.assertEquals(result, arrChange.lookFourAndOne(a));
        System.out.println(Arrays.toString(a) + " =>> " + result);
    }

    public static Stream<Arguments> dataForAddOperation2() {
        ArrayList<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[] {1, 3, 4, 4}, false));
        out.add(Arguments.arguments(new int[] {1, 4, 1, 4, 1, 1, 4}, true));
        out.add(Arguments.arguments(new int[] {1, 1, 1, 1}, true));
        out.add(Arguments.arguments(new int[] {4, 4, 4, 4}, false));
        return out.stream();
    }
}