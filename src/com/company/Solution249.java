class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        int i;
        for(i = 0; i < tasks.length; i++)
        {
           
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
        }
        int round = 0; 
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            int freq = entry.getValue();
            
            if(freq == 1)
            {
                return -1;
            }
            else if(freq % 3 == 0)
            {
                round += (freq / 3);
            }
            else
            {
                round += (freq / 3)+1;
            }
        }
        return round;        
    }
}
