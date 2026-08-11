public class CountSubstringOptimal {

    public static int countContiguousSubstring(String str){
          int freq[] = new int[26];   //from 'a' to 'z';
          buidFreuency(str, 0, freq);
          return sumCombinations(freq, 0);
    }
      //step-1: make frequncy array to store character frequency
    public static void buidFreuency(String str, int idx, int[] freq){   //store freq in array
          if(idx == str.length()) return;
          freq[str.charAt(idx) - 'a']++;
          buidFreuency(str, idx+1, freq);
    }
    
    // step 2: check frequency and count combination of contiguous substring and return IT.
    public static int sumCombinations(int freq[], int index){   //sum of count
        if(index == freq.length) return 0;
          int n = freq[index];
          int count = n * (n+1)/2;
          return count + sumCombinations(freq, index+1);
    }

    public static void main(String[] args) {
        System.out.println(countContiguousSubstring("abccba"));
    }
}
