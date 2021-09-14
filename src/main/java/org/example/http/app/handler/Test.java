package org.example.http.app.handler;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final String s1 = "/courses";
        System.out.println(s1);
        final String s2 = "/courses?";
        System.out.println(s2);
        final String s3 = "/courses/search?q=Java адвансед&v=16&s=cou rses&q=nulllll&x=serыver";
        System.out.println(s3);

        final String[] split1 = s1.split("[?]", 2);
        System.out.println(Arrays.toString(split1));
        final String[] split2 = s2.split("[?]", 2);
        System.out.println(Arrays.toString(split2));
        final String[] split3 = s3.split("[?]", 2);
        System.out.println(Arrays.toString(split3));
    }
}
