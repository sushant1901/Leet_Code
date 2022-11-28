class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer , Integer> won = new HashMap<>();
        HashMap<Integer , Integer> lose = new HashMap<>();
        
        for(int i = 0 ; i < matches.length ; i++){
            won.put(matches[i][0] , won.getOrDefault(matches[i][0], 0) + 1);
            lose.put(matches[i][1] , lose.getOrDefault(matches[i][1], 0) + 1);
        }
        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> winner = new ArrayList<>();
        ArrayList<Integer> looser = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : won.entrySet()){
            int team = entry.getKey();
            if(!lose.containsKey(team)){
                winner.add(team);
            }
        }
        Collections.sort(winner);   
        list.add(winner);
        for(Map.Entry<Integer,Integer> entry : lose.entrySet()){
            int value = entry.getValue();
            int team = entry.getKey();
            if(value == 1){
                looser.add(team);
            }
        }
        Collections.sort(looser);
        list.add(looser);
        return list;
    }
}
