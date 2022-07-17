package com.blz.stringpermutations;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args){

        String str = "ABC";
        System.out.println("Using Recursive Permutation");
        recursivePermutations("", str);
        System.out.println("Using Itarative Approach");
        iterativePermutation(str);
    }
    private static void recursivePermutations(String candidate, String remaining)
    {
        if (remaining == null) {
            return;
        }

        if (remaining.length() == 0) {
            System.out.println(candidate);
        }

        for (int i = 0; i < remaining.length(); i++)
        {
            String newCandidate = candidate + remaining.charAt(i);

            String newRemaining = remaining.substring(0, i) +
                    remaining.substring(i + 1);

            recursivePermutations(newCandidate, newRemaining);
        }
    }
    public static void iterativePermutation(String str)
    {
        if (str == null || str.length() == 0) {
            return;
        }
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(str.charAt(0)));

        // do for every character of the specified string
        for (int i = 1; i < str.length(); i++)
        {
            for (int j = partial.size() - 1; j >= 0 ; j--)
            {
                String s = partial.remove(j);

                for (int k = 0; k <= s.length(); k++)
                {
                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }

        System.out.println(partial);
    }
}
