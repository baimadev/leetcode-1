/*
LeetCode Problem No.347:    https://leetcode.com/problems/top-k-frequent-elements/
Author:                     zhangyixing1007
Idea:                       bucket sort
Time:                       15 ms, beat 99.49%
Space:                      40.9 MB, beat 95.62%
*/

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List[] list=new List[nums.length+1];
        for (int key:map.keySet()){
            int count=map.get(key);
            if(list[count]==null)
                list[count]=new ArrayList<>();
            list[count].add(key);
        }
        List<Integer> ans=new ArrayList<>();
        for (int i=list.length-1; i>-1; i--){
            if(list[i]!=null&&list[i].size()<=k){
                ans.addAll(list[i]);
                k-=list[i].size();
            }
        }
        return ans;
    }
}
