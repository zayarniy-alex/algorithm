package ru.zayarniy.alexandr.algorithm.lesson6.homeWork6;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class MainTrees {

    private static void uniqueRandom(ArrayList<Integer> a, int amont){
        Random r = new Random();
        SecureRandom sr = new SecureRandom();
        while (a.size() < amont){
            int num = sr.nextInt();
            if (!a.contains(num))
                a.add(num);
        }
    }

    public static void main(String[] args){
        final int TREES = 50;
        int balanced = 0;
        for (int i = 0; i < TREES; i++){
            ArrayList<Integer> a = new ArrayList<>();
            uniqueRandom(a, 10000);
            Tree t = new Tree(a);
            balanced += (t.isBalanced(false)) ? 1 : 0;
        }
        System.out.println(balanced * 100f / TREES + "%");
    }
}
