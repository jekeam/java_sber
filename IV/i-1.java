import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = new ArrayList<Integer>();
        int cnt = 4;
        int v;
        while (cnt >= 0) {
            v = Integer.parseInt(reader.readLine());
            nums.add(v);
            cnt -= 1;
        }
        Collections.sort(nums);
        System.out.println("");
        for (int i=0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }
    }
}


