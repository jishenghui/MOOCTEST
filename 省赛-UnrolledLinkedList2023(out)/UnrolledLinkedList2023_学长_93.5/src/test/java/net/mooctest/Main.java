package net.mooctest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        int arr[]=new int[read()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=read();
        }

    }
    public static int f(int[]nums,int k){
        int ans = 0;
        int s = 0;
        Map<Integer, Integer> cnt = new HashMap<>(nums.length + 1); // 设置容量可以快 2ms
        cnt.put(0, 1); // s[0]=0 单独统计
        for (int x : nums) {
            s += x;
            ans += cnt.getOrDefault(s - k, 0);
            cnt.merge(s, 1, Integer::sum); // cnt[s]++
        }
        return ans;

    }
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st=new StreamTokenizer(br);
    public static int read() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }
}
