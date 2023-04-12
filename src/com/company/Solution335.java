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


// 2nd approach:

class Solution {
    public int numRabbits(int[] answers) {
        double answer=0;
        HashMap<Integer,Integer> memo= new HashMap<>();
        for(int currentReportee : answers){
            if(memo.containsKey(currentReportee)) memo.put(currentReportee,memo.get(currentReportee)+1);
            else memo.put(currentReportee,1);
        }

        for(Integer currentKey : memo.keySet()){
            double groupSize=currentKey+1;
            double numGroups= Math.ceil(memo.get(currentKey)/groupSize);
            answer+= (numGroups * groupSize);
        }

        return (int)answer;
    }
}
