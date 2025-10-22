package com.AREP.Parcial;

import java.util.ArrayList; 
import java.util.List;

public class PellSequence{

public static void main(String[] args) {
    int n = 13; 
    String json = getPellSequence(n);
    System.out.println(json);
}

public static String getPellSequence(int n) {
    List<Long> sequence = new ArrayList<>();

    long v0 = 0;
    long v1 = 1;
    sequence.add(v0);

    if (n > 0) sequence.add(v1);

    for (int i = 2; i <= n; i++) {
        long vn = 2 * v1 + v0;
        sequence.add(vn);
        v0 = v1;
        v1 = vn;
    }

    return "{\n" +
            "  \"operation\": \"Secuencia de Pell\",\n" +
            "  \"input\": " + n + ",\n" +
            "  \"output\": " + sequence.toString() + "\n" +
            "}";
}

}