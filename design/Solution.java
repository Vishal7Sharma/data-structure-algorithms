package design;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

public class Solution {

    public static int solve(String a, String b, String[] c) {
        if(a==b)return 0;
        int n = a.length();
        return 1;
    }

    public static List<Integer> majorityElement(int[] nums){
        int n = nums.length;

        int a = 0, b = 1, ca = 0, cb = 0;
        for(int num : nums){
            if(num == a)ca++;
            else if(num == b)cb++;
            else if(ca == 0){
                a = num;
                ca = 1;
            }
            else if(cb == 0){
                b = num;
                cb = 1;
            }
            else{
                ca--;
                cb--;
            }

        }
        return Arrays.asList(a,b);
        /*
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for(int i=0; i<n; i++){
            if(ht.containsKey(nums[i]))ht.put(nums[i], ht.get(nums[i])+1);
            else ht.put(nums[i], 1);
        }
        List<Integer> l = new ArrayList();
        ht.forEach( (k,v) -> {
            if(v > nums.length/3)l.add(k);
        });
        

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hashMap.containsKey(nums[i]))hashMap.put(nums[i], hashMap.get(nums[i])+1);
            else hashMap.put(nums[i], 1);
        }
        List<Integer> list = new ArrayList();
        hashMap.forEach((k,v) -> {
            if(v>nums.length/3)list.add(k);
        });
        return l;
        */
    }
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        pre[0]=1;
        suff[nums.length-1]=1;
        for(int i = 1;i<nums.length;i++){
            pre[i] = pre[i-1] * nums[i-1];
        }
        for(int i= n-2;i>=0;i--){
            suff[i] = suff[i+1] * nums[i+1];
        }
        for(int i=0;i<n;i++){
            nums[i] = pre[i]*suff[i];
        }
        return nums;
    }
    public void doVisit(char[][] grid, int x, int y){
        int n = grid.length;
        int m = grid[0].length;
        if(grid[x][y]=='0')return;
        grid[x][y]='1';
        if(x+1<n && grid[x+1][y]=='1')doVisit(grid, x+1, y);
        if(y+1<m && grid[x][y+1]=='1')doVisit(grid, x, y+1);
        if(x-1>=0 && grid[x-1][y]=='1')doVisit(grid, x-1, y);
        if(y-1>=0 && grid[x][y-1]=='1')doVisit(grid, x, y-1);
        return;
        
    }

    public int numIslands(char[][] grid) {
        try{
            int n = grid.length;
            int m = grid[0].length;
            boolean[][] visit = new boolean[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++)visit[i][j]=false;
            }
            int count = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]=='1'){
                        doVisit(grid, i, j);
                        count++;
                    }
                }
            }
            return count;
        }
        catch (Exception e){
            return 0;
        }
    }

    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j])return nums[i];
            }
        }
        return 0;
    }

    public void collectionExamples(){
        // Map for Key Value pair store
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        // List to store continous values
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        List<Integer> stack = new Stack<>();

        // Queue to store list data with insertion order deletes
        Queue<Integer> priorityQueue = new PriorityQueue<>(comparator); 
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Set to store unique values 
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();

    }
    Semaphore a = new Semaphore(0);
    Semaphore b = new Semaphore(0);

    public static int climbStairs(int n){
        /** 
         * Function will return number of ways we can reach to end using stairs 
         * At a time we can take either 1 or 2 steps.
        */

        /** If -1 stairs then no way or 0 ways to reach */
        if(n<0)return 0

        /** If we reached 0 successfully then we there is a way */
        if(n==0)return 1;

        /** 
         * we have 2 ways to reach to 0, either take 2 steps or 1 step
         * hence add both number of ways
        */
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //majorityElement(nums).forEach((value) -> System.out.println(value));
        //productExceptSelf(nums);
        for( int n : nums)System.out.println(climbStairs(n));
    }

}