class Solution {
public int minSetSize(int[] arr) {
int n = arr.length;

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    for(int i = 0 ; i < n ; i++) {
        int element = arr[i];
        map.put(element, map.getOrDefault(element, 0) + 1);
    }
    
    int[] frequency = new int[100001];
    for(int val : map.keySet()) {
        frequency[map.get(val)]++;
    }
    
    int newLength = n / 2, count = 0;
    for(int i = 100000 ; i >= 0 ; i--) {
        int temp = frequency[i];
        while(temp > 0 && newLength > 0) {
            newLength -= i;
            count++;
            temp--;
        }
        
        if(newLength < 0) {
            break;
        }
    }
    
    return count;
}
}