# leetcode

## HOT 100 Easy

1 两数之和：用数组位置查找数组值，O(1)；用数组值查找数组位置想要达到O(1)，用HashMap--常用技巧。

20 有效的括号： 【栈】。

21 合并两个有序链表：可以【循环】，也可以采用【递归】。

53 最大子序和： 一次循环，maxEndingHere储存以该点结尾的子序和，maxSoFar储存到该点的最大子序和。

70 爬楼梯： 循环，一次只储存两个值。

101 对称二叉树：日常递归。

104 二叉树的最大深度： 【一行递归】。

121 买卖股票的最佳时机：与目前最小值做差，求差的最大值，一次循环就够了。

136 只出现一次的数字：【异或的性质】, a^a=0, a^0=a。

141 环形链表: 快慢指针。

155 最小栈: 需要辅助栈。【同步栈】，【不同步栈】。

160 相交链表: 所有寻找同一节点链表题的本质（如相交，环），都是对加法交换律的花式运用。

169 多数元素：我将这种算法称为 【抱对自杀】，每当一个众数碰到一个非众数就会抱住，然后双双自杀。如果没有遇到足够的非众数，众数们就会等人到齐了再抱对自杀。最后留下来的当然是众数。

198 打家劫舍：看到这一道题第一反应是递归，但是简单递归会导致大量重复计算量，因此应该标记计算过的节点。但实际上，我们真的需要储存那么多中间值嘛？并不是，只用存前一个值和前前一个值就好，所以其实可以用【简单循环】解决这个问题--跟 70. 爬楼梯 是类似的。

206 反转链表：其实是 234. 回文链表 的一部分。

226 翻转二叉树：自身递归，“交换”左右子树时记得备份。

234 回文链表: 快慢指针（整除器），把剩下的一半变成逆序，再进行比较。注意奇偶情况讨论。

283 移动零：将非零元素依次交换到前面来。

437 路径总和 III ：经典划分：树 = 根节点+左子树+右子树。好的划分是递归的基础。

438 找到字符串中所有字母异位词：【滑动窗口】。

448 找到所有数组中消失的数字：把数字放到对应位置上去，最后依次找出没有正确摆放数字的位置。千万注意，调换的时候，数组的角标含义可能会发生变化。【我的代码】。

461 汉明距离：十进制向二进制转换技巧：整除/2，或右移>>1；异或^的用法。

538 把二叉搜索树转换为累加树：树的经典题，dfs，右孩子-根-左孩子。

543 二叉树的直径：dfs求节点到叶子节点的距离，叶子节点的到叶子节点距离定义为1。dfs遍历所有节点找出最大直径。

581 最短无序连续子数组：四遍循环。从左至右找无序子数组极小值，从右至左找无序子数组极大值，从左至右找无序子数组左边起始点，从右至左找无序子数组右边起始点。 

617 合并二叉树：递归，经典划分：树=根+左子树+右子树，跟437 路径总和 III的思想是一样的。



