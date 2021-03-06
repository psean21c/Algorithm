package com.spark.algo.coursera.part2.chap1.lab;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Domain implements Comparable<Domain> {
    private final String[] fields;
    private final int n;

    // store fields in reverse order
    public Domain(String name) {
        fields = name.split("\\.");
        n = fields.length;
    }

    // return string representation - fields, delimited by .
    public String toString() {
        if (n == 0) return "";
        String s = fields[0];
        for (int i = 1; i < n; i++)
            s = fields[i] + "." + s;
        return s;
    }

    // compare by reverse domain name
    public int compareTo(Domain that) {
        for (int i = 0; i < Math.min(this.n, that.n); i++) {
            String s = this.fields[this.n - i - 1];
            String t = that.fields[that.n - i - 1];
            int c = s.compareTo(t);
            if      (c < 0) return -1;
            else if (c > 0) return +1;
        }
        return this.n - that.n;
    }

    // test client
    public static void main(String[] args) {

        // read in domain names
        String[] names = StdIn.readAllStrings();
        Domain[] domains = new Domain[names.length];
        for (int i = 0; i < domains.length; i++) {
            domains[i] = new Domain(names[i]);
        }

        // sort
        Arrays.sort(domains);

        // print results
        for (int i = 0; i < domains.length; i++) {
            StdOut.println(domains[i]);
        }
    }


}
