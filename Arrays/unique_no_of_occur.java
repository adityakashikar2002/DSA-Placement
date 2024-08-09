class Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        
        for(int i=0;i<n;i++)
        {   
            list.add(arr[i]);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        HashSet<Integer> set = new HashSet<>(map.values());
        
        return set.size()==map.size();

    }
}
