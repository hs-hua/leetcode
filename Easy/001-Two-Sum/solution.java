import java.util.HashMap;
public int[] twoSum(int[] nums, int target){
   HashMap<Integer,Integer> hm = new HashMap<>();
   int count = 0;
   for(int num : nums){
      hm.put(num, count); //inserting integer key and index value
      count++;
   }
}
