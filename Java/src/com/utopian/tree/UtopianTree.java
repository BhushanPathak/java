package com.utopian.tree;

import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        for (int i = 0; i < numCases; i++) {
            int n = in.nextInt();
            int answer = ((int) Math.pow(2, (n + 3) / 2)) + (((int) Math.pow(-1, n)) - 3) / 2;
            System.out.println(answer);
        }
        in.close();
    }
}