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