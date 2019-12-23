package com.mariiapasichna;

import java.util.Arrays;

public class MyList {
    private int[] arr = new int[0];

    public int get(int index) {
        checkIndex(index);
        return arr[index];
    }

    public void set(int index, int value) {
        checkIndex(index);
        arr[index] = value;
    }

    public void add(int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length - 1] = value;
        arr = tmp;
    }

    public void clear() {
        arr = new int[0];
    }

    public int size() {
        return arr.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // опционально
    public void add(int index, int value) {
        checkIndex(index);
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, index);
        tmp[index] = value;
        System.arraycopy(arr, index, tmp, index + 1, arr.length - index);
        arr = tmp;
    }

    public void remove(int index) {
        checkIndex(index);
        int[] tmp = new int[arr.length - 1];
        System.arraycopy(arr, 0, tmp, 0, index - 1);
        System.arraycopy(arr, index, tmp, index - 1, arr.length - index);
        arr = tmp;
    }

    public void removeByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                int[] tmp = new int[arr.length - 1];
                System.arraycopy(arr, 0, tmp, 0, i);
                System.arraycopy(arr, i + 1, tmp, i, arr.length - i - 1);
                arr = tmp;
            }
        }
    }

    public int[] toArray() {
        int[] arrArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrArray[i] = arr[i];
        }
        return arrArray;
    }

    public void sort() {
        Arrays.sort(arr);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    private void checkIndex(int index) {
        if (index < 0 || index > arr.length)
            System.out.println("Index out of range");
    }
}