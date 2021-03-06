package com.company;

public class ArrChange {

    public int[] changeArr(int[] arrTest){
        int lookFour = -1;
        for (int i = 0; i < arrTest.length; i++) {
            if (arrTest[i] == 4) lookFour = i;
        }
        if (lookFour == -1) throw new RuntimeException("нет ни одной четверки!");
        int[] arr = new int[arrTest.length-(lookFour+1)];
        System.arraycopy(arrTest, lookFour+1, arr, 0, arr.length);
        return arr;
    }

    public boolean lookFourAndOne(int[] arrTest){
        int lookFour = -1;
        int lookOne = -1;
        int anatherNumber = -1;
        for (int i = 0; i < arrTest.length; i++) {
            if (arrTest[i] == 4) lookFour = i;
            if (arrTest[i] == 1) lookOne = i;
            if (arrTest[i] != 1 && arrTest[i] != 4) anatherNumber = i;
        }
        if (anatherNumber != -1) return false;
        return lookFour != -1 && lookOne != -1;
    }
}
