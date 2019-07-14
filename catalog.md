# Catalog

[TOC]



### 3. greedy:

#### 455. Assign Cookies

#### 376. Wiggle Subsequence

#### 402. Remove K Digits 

本题最核心的部分是找到贪心算法的每次最优解。在第一遍练习时，找到了最优解的规律。但是没有想到使用栈来连续向前比较。

心得：

1. 当需要提高算法时间复杂度时，应该考虑引入栈，队列，集合等数据结构进行优化。
2. 对于双向链表的操作不熟悉。
3. 解贪心问题，画图，举例子非常重要
4. 审题一定要认真。

#### 55. Jump Game

#### 45. Jump Game II

```
Jump as far as possible but lazily.

[2, 3, 1, 1, 4]
i    nums[i]   steps   near   far
-      -         0       0     0
0      2         0       0     2
1      3         1       2     4
2      1         1       2     4
3      1         2       4     4
4      4         2       4     8
```

Time complexity: O(n)
Space complexity: O(1)

在O(n)的解法中，for循环既更新最大值，有在i大于 当前位置是进行计数。每次找每一段最开的

自己使用的O(n2)的算法，是因为需要用一个for循环记录每次最优的点。

#### 452. Minimum Number of Arrows to Burst Balloons

##### 此问题涉及到的知识点：

1. java如何表示负无穷
2. comparable 如何使用

java比较器系统学习

1. 多维数组排序

2. ```
   	Array.Sort(points, new Comparison<int[]>((a,b) => a[0]-b[0]));
   ```

3. java int 的最大最小值 [[-2147483648,2147483647]]

##### 错误记录：

未考虑负数，比较时初始值使用-1

#### 122. Best Time to Buy and Sell Stock II

#### 134. Gas Station

### 4. 递归，回溯，分治

当问题每一步都有相同的解法时，就可以使用递归。

感觉回溯是多重的递归。

#### 704. Binary Search

#### 78. subsets

### 位运算法
![Screen Shot 2019-07-05 at 3.54.06 PM](Screen Shot 2019-07-05 at 3.54.06 PM.png)

与运算的实质是该位存不存在。

位运算可以代表改位存不存在，逻辑&预算可以用来判断该位存不存在。

1<<多少位就可以代表第多少位。1<<多为用来生成总的代表存不存在的个数。

#### 90. Subsets II

1. 去重使用集合

2. 用集合去重时能不能相等可以用equal方法判断一下

3. 集合可以直接对arraylist去重

   

回溯法和位云算法的算法复杂度都是o(n2)

#### 40. Combination Sum II

生成子集的两种方法，位运算法，回溯法。

在使用两种方法，不进行剪枝的情况下，时间复杂度太差，使用回溯进行剪枝。

注意剪枝的条件，尽量去优化剪去不必要的分支。