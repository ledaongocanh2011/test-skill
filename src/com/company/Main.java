package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        example1();
    }

    public static void example1() {
        List<Integer> ints = Arrays.asList(1, 3, 6, 85, 234, 74, 23, 46, 566, 31, 312, 32);
        int n = 4;
        ArrayList<Integer> i1 = new ArrayList<>();
        ArrayList<Integer> i2 = new ArrayList<>();
        ArrayList<Integer> i3 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int rs = (i * n) + (n - 1);
            for (int j = (i * n); j <= rs; j++) {
                if (i == 0) {
                    i1.add(ints.get(j));
                } else if (i == 1) {
                    i2.add(ints.get(j));
                } else if (i == 2) {
                    i3.add(ints.get(j));
                }
            }
        }

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        ArrayList<Integer> rs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rs.add(i1.get(i));
            rs.add(i2.get(i));
            rs.add(i3.get(i));
        }
        System.out.println(rs);

    }

    public static void example2() {
        List<Integer> ints = Arrays.asList(1, 3, 6, 85, 234, 74, 23, 46, 566);
        Collections.sort(ints);
        System.out.println(ints.get(ints.size() - 2) + ints.get(ints.size() - 1));
    }

    public static void example3() {

        List<Integer> ints = Arrays.asList(1, 5, 4, 7, 9, 0, -10, 13, 93, 14, 15);
        Collections.sort(ints);
        int min = ints.get(ints.size() - 1) - ints.get(0);
        for (int i = 0; i < ints.size() - 1; i++) {
            int rs = ints.get(i) - ints.get(i + 1);
            if (rs > min) {
                min = rs;
            }
        }
        for (int i = 0; i < ints.size(); i++) {
            int rs = ints.get(i) + min;
            if (ints.contains(rs)) {
                List<Integer> listRs = new ArrayList<>();
                listRs.add(ints.get(i));
                listRs.add(rs);
                System.out.println(listRs);
            }
        }
    }
}



