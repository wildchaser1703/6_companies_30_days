//https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/#
class PrintAnagrams{
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here 
int len = string_list.length;
       HashMap<String,Integer> map1 = new HashMap<>();
       int index = 0;
       List<List<String>> list1 = new ArrayList<>();
       for(int i=0;i<len;i++) {
           char arr[] = new char[string_list[i].length()];
           arr = string_list[i].toCharArray();
           Arrays.sort(arr);
           String word = new String(arr);
           List<String> list = new ArrayList<>();
           if(map1.containsKey(word)) {
               int val = map1.get(word);
               list = list1.get(val);
               list.add(string_list[i]);
               list1.set(val,list);
           }
           else {
               list.add(string_list[i]);
               map1.put(word,index);
               list1.add(list);
               index++;
               
           }
       }
       return list1;
   }
}
