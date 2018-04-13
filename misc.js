/**
 * @param {string} s
 * @return {string}
 */

//leetcode
var hammingDistance = function(int x, int y) {
 int xor = x ^ y, count = 0;
 while (xor != 0) {
  if ((xor & 1) == 1) count++;
  xor = xor >> 1;
 }
 return count;
}

var hammingDistance2 = function(x, y) {
 int xor = x ^ y, count = 0;
 while (xor != 0) {
  xor &= (xor - 1);
  count++;
 }
 return count;
}

var countBits = function(x) {
 int count = 0;
 while (x != 0) {
  x &= (x - 1);
  count++;
 }
 return count;
}

var judgeCircle = function(moves) {
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
var reverseString = function(s) {
 if (s.length <= 1) return s;
 return s.substring(s.length - 1) + reverseString(s.substring(0, s.length - 1));
}

var reverseString2 = function(s) {
 word = s.split('');
 var i = 0;
 var j = s.length - 1;
 while (i < j) {
  var temp = word[i];
  word[i] = word[j];
  word[j] = temp;
  i++;
  j--;
 }
 return word.join('');
}

var reverseString3 = function(s) {
  return s.split('').reverse().join('');
 }
 //study
var reverseString4 = function(s) {
 var length = s.length;
 if (length <= 1) return s;
 var leftStr = s.substring(0, length / 2);
 var rightStr = s.substring(length / 2, length);
 return reverseString4(rightStr) + reverseString4(leftStr);
}

var pyramidNumbers = function(levels) {
 var rowcount = 1,
  numbers = 1,
  row = "";
 for (var i = 0; i < levels; i++) {
  for (var j = 0; j < rowcount; j++) {
   row += numbers + " ";
   numbers++;
  }
  console.log(row);
  row = "";
  rowcount++;
 }
}


//interviewcake: big o notation
//interviewcake: logarithms
//interviewcake: triangle series
//33
var twiceConsecutive = function(nums) {
  var sum = 0;
  var n = nums.length - 1;
  for (var i = 0; i < nums.length; i++) {
   sum += nums[i];
  }
  return sum - (Math.pow(n, 2) + n) / 2;
 }
 //39
var twoEgg = function(nums) {}
 //interviewcake: binary search
var binarySearch = function(target, nums) {
  var floor = -1;
  var ceiling = nums.length;

  while (floor + 1 < ceiling) {
   var midIndex = floor + (ceiling - floor) / 2;
   var midValue = nums[midIndex];

   if (midValue == target) {
    return true;
   }

   if (midValue > target) {
    ceiling = midValue;
   } else {
    floor = midValue;
   }
  }
  return false;
 }
 //12:(logn)
 //13
var rotationSearch = function(target, nums) {
 //
 var floor = -1;
 var ceiling = nums.length;

 while (floor + 1 < ceiling) {
  var midIndex = floor + (ceiling - floor) / 2;
  var midValue = nums[midIndex];

  if (midValue == target) {
   return true;
  }

  if (midValue > target) {
   ceiling = midValue;
  } else {
   floor = midValue;
  }
 }
 return false;
}

//40
//41


//interviewcake: breadth-first search
//interviewcake: depth-first search
//interviewcake: counting sort
//interviewcake: brute force algorithms
//interviewcake: greedy algorithms
//interviewcake: buttom-up algorithms
//interviewcake: overlapping subproblems
//interviewcake: memoization
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
//interviewcake: XOR Bits
//21
var singleNumber = function(nums) {
  var xor = 0;
  for (var i = 0; i < nums.length; i++) {
   xor ^= nums[i];
  }
  return xor;
 }
 //study
var singleNumber2 = function(nums) {
 var hashMap = new Map();
 nums.forEach(function(num) {
  if (hashMap.has(num)) {
   hashMap.set(num, hashMap.get(num) + 1);
  } else {
   hashMap.set(num, 1);
  }
 })
 for (var [id, count] of hashMap) {
  if (count === 1) {
   return id;
  }
 }
}
