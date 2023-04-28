package MEDIUM;

public class TopKfrequent {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int n: nums)
            {
                map.put(n,map.getOrDefault(n,0)+1);
    
            }
    
            PriorityQueue<Map.Entry<Integer,Integer>> maxHeap= new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
    
            for(Map.Entry<Integer,Integer> entry: map.entrySet())
            {
                maxHeap.add(entry);
            }
    
            List<Integer> arr= new ArrayList<>();
            // int arr []= new int [k];
    
            // int arr[];
            while(arr.size()<k)
            {
                Map.Entry<Integer,Integer> i= maxHeap.poll();
    
                arr.add(i.getKey());
            }
    
            return arr.stream().mapToInt(i->i).toArray();    
            //  to convert list to array
            
        }
    }
    
}
