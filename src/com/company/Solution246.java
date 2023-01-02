class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if(k == 0) return result;
        backtrace(result, new ArrayList<Integer>(), new boolean[9], n, 0, k, 1);
        return result;
    }
    private void backtrace(List<List<Integer>> result, List<Integer> list, boolean[] used, int target, int sum, int k, int start){
        if(sum == target && list.size() == k){
            result.add(new ArrayList<Integer>(list));
        }else if(sum > target)
            return;
        else{
            for(int i = start; i <= 9; i++){
                if(used[i - 1]) continue;
                used[i - 1] = true;
                list.add(i);
                backtrace(result, list, used, target, sum + i, k, i + 1);
                list.remove(list.size() - 1);
                used[i - 1] = false;
            }
        }
    }
}
