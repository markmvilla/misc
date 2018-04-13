import java.util.Map;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author markvilla
 *
 */
public class HelloWorld {

 /**
  * @param args
  */
 public static void main(String[] args) {
   // TODO Auto-generated method stub
   //System.out.println(reverseString("Leylah"));
   //int[] nums = {5,6,7,8,9,2,3,4};
   int[] nums = {
    1,
    2,
    3,
    4,
    4,
    5,
    6,
    7
   };
   String[] dict = {
    "bat",
    "cat",
    "cougar",
    "dog",
    "apple",
    "bear"
   };
   //System.out.println(rotationSearchDict(dict, 0, 6));
   System.out.println(findDuplicate2(nums));
  }
  //leetcode
 public static int hammingDistance(int x, int y) {
  int xor = x ^ y, count = 0;
  while (xor != 0) {
   if ((xor & 1) == 1) count++;
   xor = xor >> 1;
  }
  return count;
 }

 public static int hammingDistance2(int x, int y) {
  int xor = x ^ y, count = 0;
  while (xor != 0) {
   xor &= (xor - 1);
   count++;
  }
  return count;
 }

 public static int countBits(int x) {
  int count = 0;
  while (x != 0) {
   x &= (x - 1);
   count++;
  }
  return count;
 }

 public static boolean judgeCircle(String moves) {
   int countx = 0, county = 0;
   for (int i = 0; i < moves.length(); i++) {
    if (moves.charAt(i) == 'U') county++;
    if (moves.charAt(i) == 'D') county--;
    if (moves.charAt(i) == 'R') countx++;
    if (moves.charAt(i) == 'L') countx--;
   }
   return countx == 0 && county == 0;
  }
  //didn't meet speed req.
 public static String reverseString(String s) {
  if (s.length() <= 1) return s;
  return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
 }

 public static String reverseString2(String s) {
  char[] word = s.toCharArray();
  int i = 0;
  int j = s.length() - 1;
  while (i < j) {
   char temp = word[i];
   word[i] = word[j];
   word[j] = temp;
   i++;
   j--;
  }
  return new String(word);
 }

 public static String reverseString3(String s) {
   return new StringBuilder(s).reverse().toString();
  }
  //study
 public static String reverseString4(String s) {
  int length = s.length();
  if (length <= 1) return s;
  String leftStr = s.substring(0, length / 2);
  String rightStr = s.substring(length / 2, length);
  return reverseString4(rightStr) + reverseString4(leftStr);
 }

 public static void pyramidNumbers(int levels) {
  int rowcount = 1;
  int numbers = 1;
  String row = "";
  for (int i = 0; i < levels; i++) {
   for (int j = 0; j < rowcount; j++) {
    row += numbers + " ";
    numbers++;
   }
   System.out.println(row);
   row = "";
   rowcount++;
  }
 }

 //interviewcake: big o notation
 //interviewcake: logarithms
 //interviewcake: triangle series
 //33
 public static int twiceConsecutive(int[] nums) {
   int sum = 0;
   int n = nums.length - 1;
   for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
   }
   return sum - ((int) Math.pow(n, 2) + n) / 2;
  }
  //39
 public static int twoEgg(int[] nums) {
   return 0;
  }
  //interviewcake: binary search
 public static boolean binarySearch(int target, int[] nums) {
   int floor = -1;
   int ceiling = nums.length;
   while (floor + 1 < ceiling) {
    int midIndex = floor + (ceiling - floor) / 2;
    int midValue = nums[midIndex];

    if (midValue == target) {
     return true;
    }

    if (midValue > target) {
     ceiling = midIndex;
    } else {
     floor = midIndex;
    }
   }
   return false;
  }
  //12
  //13
 public static int rotationSearchDict(String[] dict, int start, int end) {
  int mid = (start + end) / 2;
  if (start == mid) {
   return mid + 1;
  } else if (dict[start].compareTo(dict[mid]) > 0) {
   return rotationSearchDict(dict, start, mid);
  } else {
   return rotationSearchDict(dict, mid, end);
  }
 }
 public static int rotationSearch(int[] nums, int start, int end) {
   int mid = (start + end) / 2;
   if (start == mid) {
    return mid + 1;
   } else if (nums[start] > nums[mid]) {
    return rotationSearch(nums, start, mid);
   } else {
    return rotationSearch(nums, mid, end);
   }
  }
  //40
 public static int findDuplicate(int[] nums) {
  HashMap < Integer, Integer > hashmap = new HashMap < > ();
  for (int i = 0; i < nums.length; i++) {
   if (hashmap.containsKey(nums[i])) {
    return nums[i];
   } else {
    hashmap.put(nums[i], 0);
   }
  }
  return -1;
 }
 public static int findDuplicate2(int[] nums) {
   int[] mem = new int[nums.length];
   for (int i = 0; i < nums.length; i++) {
    if (mem[nums[i]] > 0) {
     return nums[i];
    } else {
     mem[nums[i]] += 1;
    }
   }
   return -1;
  }
  //41

 //interviewcake: breadth-first search
 //interviewcake: depth-first search
 //interviewcake: counting sort
 //interviewcake: brute force algorithms
 //interviewcake: greedy algorithms
 //1
 //2
 //3
 //interviewcake: buttom-up algorithms
 //interviewcake: overlapping subproblems
 //interviewcake: memoization
 //5
 //15
 //16
 //interviewcake: short circuit evaluation
 //interviewcake: garbage collection
 //interviewcake: closer
 //interviewcake: arrat slicing
 //interviewcake: hashing
 //interviewcake: mutable vs immutable
 //interviewcake: data structures overview
 //interviewcake: array
 //interviewcake: dynamic array
 //interviewcake: hash table
 //interviewcake: linked list
 //interviewcake: queue
 //interviewcake: stack
 //interviewcake: binary tree
 //interviewcake: graph
 //interviewcake: bits
 //interviewcake: XOR bits
 //21
 public static int singleNumber(int[] nums) {
   int xor = 0;
   for (int i = 0; i < nums.length; i++) {
    xor ^= nums[i];
   }
   return xor;
  }
  //study
 public static int singleNumber2(int[] nums) {
  HashMap < Integer, Integer > hashmap = new HashMap < > ();

  for (int num: nums) {
   if (hashmap.containsKey(num)) {
    hashmap.put(num, hashmap.get(num) + 1);
   } else {
    hashmap.put(num, 1);
   }
  }
  for (HashMap.Entry < Integer, Integer > entry: hashmap.entrySet()) {
   if (entry.getValue() == 1) {
    return entry.getKey();
   }
  }
  return 0;
 }





 public static int test(int nums) {
  return Integer.MIN_VALUE;
 }

 public static int test2(int nums) {
  return nums ^ -1;
 }

}
