class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int st: stones) pq.add(st);
        while(pq.size() > 1) {
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            if(stone1 > stone2) pq.add(stone1-stone2);
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
