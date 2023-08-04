class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean> map= new HashMap<>();
        return canConstruct(s, wordDict, map);
    }
    
    public boolean canConstruct(String target,List<String> words, HashMap<String,Boolean> map)
    {
        if(map.containsKey(target))
            return map.get(target);
        if(target.isEmpty())
            return true;
        for(String word: words)
        {
            if(target.startsWith(word))
            {
                if(canConstruct(target.substring(word.length()),words, map))
                {

                    map.put(target, true);
                    return true;
                }
            }
        }
		
		
        map.put(target,false);
        return false;
    }
}
