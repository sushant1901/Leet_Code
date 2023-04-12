class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<answers.length;i++)
        {
            if(h.containsKey(answers[i])==false)h.put(answers[i],1);
            else h.put(answers[i],h.get(answers[i])+1);
        }
        int c=0,k,v,d,m;
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            k=e.getKey();
            v=e.getValue();
            if(k==0)
            {
                c+=v;
                continue;
            }
            else if(k>=v)
            {
                c+=(k+1);
                continue;
            }
            d=v/(k+1);
            m=v%(k+1);
            if(m==0)c+=(d*(k+1));
            else c+=(d*(k+1))+(k+1);
        }
        return c;
    }
}
