package com.rku.tradepipeline.models;
import java.io.*;
import java.util.*;

public class User {
    static int mod_i = (int) 1e9 + 7;
    static long mod_l = (long) 1e12 + 7;

    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {

        }
        io.close();
    }

    static class Kattio extends PrintWriter {
        public Kattio(InputStream i) {
            super(new BufferedOutputStream(System.out));
            r = new BufferedReader(new InputStreamReader(i));
        }
        public Kattio(InputStream i, OutputStream o) {
            super(new BufferedOutputStream(o));
            r = new BufferedReader(new InputStreamReader(i));
        }
        public boolean hasMoreTokens() { return peekToken() != null; }
        public int getInt() { return Integer.parseInt(nextToken()); }
        public double getDouble() { return Double.parseDouble(nextToken()); }
        public long getLong() { return Long.parseLong(nextToken()); }
        public String getWord() { return nextToken(); }
        private BufferedReader r;
        private String line;
        private StringTokenizer st;
        private String token;
        private String peekToken() {
            if (token == null)
                try {
                    while (st == null || !st.hasMoreTokens()) {
                        line = r.readLine();
                        if (line == null) return null;
                        st = new StringTokenizer(line);
                    }
                    token = st.nextToken();
                } catch (IOException e) {}
            return token;
        }
        private String nextToken() { String ans = peekToken(); token = null; return ans; }
    }
}
