class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> stonesWeight = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<stones.length;i++){
            stonesWeight.offer(stones[i]);
        }
       while(stonesWeight.size()>1){
        int a = stonesWeight.poll();
        int b = stonesWeight.poll();
        if(a!=b){
            stonesWeight.offer(Math.abs(a-b));
        }
       }
        return (stonesWeight.size()==1) ? stonesWeight.poll() : 0;
      
    }
}
