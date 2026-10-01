package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || !(o instanceof Solution)) return false;
        Solution sol = (Solution) o;

        if (first != null ? !first.equals(sol.first) : sol.first != null) return false;
        return last != null ? last.equals(sol.last) : sol.last == null;
    }


    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
        for (Solution solution : s) {
            System.out.println(solution.hashCode());
        }

        System.out.println(new Solution("Donald", "Duck").hashCode());
    }
}
