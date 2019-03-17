## 1. 反转链表
### 算法描述
输入一个链表，反转链表后，输出新链表的表头。

### 解决思路
我们需要定义三个节点，分别指向要输出的反转链表的Head节点、当前遍历链表的指针、当前遍历链表的指针的前一个节点。然后通过遍历链表的指针，每次将链表的节点插入到反转链表的头部节点。最终返回反转链表的Head节点。
###代码实现
``` java
public ListNode ReverseList(ListNode head){
        if(head==null)
            return null;

        //反转链表的Head节点
        ListNode reverseHead= null;
        //当前遍历的节点
        ListNode pNode=head;
        //当前遍历的节点的前驱节点（实际上也是当前反转链表的头节点）
        ListNode prev=null;
        while (pNode!=null){
            ListNode pNext = pNode.next;

            if(pNext==null){
                reverseHead=pNode;
            }

            pNode.next=prev;
            prev=pNode;
            pNode = pNext;
        }
        return reverseHead;
    }
```

## 2. 树的子结构
### 算法描述
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

### 解决思路
我们首先调用HasSubTree遍历二叉树，判断终止条件。然后DeepSubtreeHelper递归判断B是否是A的左子树的子结构，B是否是A的右子树的子结构，B是否是A的子结构。如果上述描述有一个符合条件，则HasSubTree返回true。DeepSubtreeHelper用来判断B是否和A完全相等，需要递归所有节点相同则返回true。在DeepSubtreeHelper中首先判断B是否null，如果为null说明到达叶子节点，则返回true。然后判断A是否为null，如果为null返回false。最终判断A和B的value值是否相等，并且递归调用A的左子树和B的左子树，并且递归调用A的右子树和B的右子树是否相等。

### 代码实现
``` java
public class _17_HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null)return false;

        return DeepSubtreeHelper(root1,root2) || DeepSubtreeHelper(root1.left,root2) || DeepSubtreeHelper(root1.right,root2);
    }

    public boolean DeepSubtreeHelper(TreeNode root1,TreeNode root2) {
        if(root2==null)return true;
       if(root1==null)return false;

       return root1.val==root2.val && DeepSubtreeHelper(root1.left,root2.left) && DeepSubtreeHelper(root1.right,root2.right);
    }
}
```

## 3. 顺时针打印矩阵
### 算法描述
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

### 解决思路
首先算出要经过多少次环形状条件，通过int circle=((rows>cols?cols:rows)-1)/2+1;然后通过轮询n次环形条件，从左到右打印（打印到最右边元素），从上向下打印（打印到最下面元素），从右向左打印（打印到最左边元素），从下向上打印（打印到上面元素）。最后在两个打印之间，通过判断是否能否打印，以排除特殊情况。
### 代码实现
``` java
public class _19_printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int rows=matrix.length;//行数
        int cols=matrix[0].length;//列数
        int circle=((rows>cols?cols:rows)-1)/2+1;
        for (int i = 0; i < circle; i++) {
            //从左到右打印
            for (int j = i; j < cols-i; j++) {
                arrayList.add(matrix[i][j]);
            }
            //从上向下打印
            for (int j = i+1; j <rows-i; j++) {
                arrayList.add(matrix[j][cols-1-i]);
            }
            //从右向左打印,去取重复元素
            if(rows-2-2*i>0){
                for (int j = cols-i-2; j >=i ; j--) {
                    arrayList.add(matrix[rows-i-1][j]);
                }
            }
            //从下向上打印,去取重复元素
            if(cols-2*i-1>0){
                for (int j = rows-2-i; j >i ; j--) {
                    arrayList.add(matrix[j][i]);
                }
            }
        }
        return arrayList;
    }
```

## 4. 二叉搜索树的后序遍历序列
### 算法描述
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
### 算法思路
由于后序遍历的特性是先遍历左子树再遍历右子树，最后遍历根节点。二叉搜索树的特性是左子树都比根节点小，而右子树都比根节点大。那么后序遍历的最后一个元素就是二叉搜索树的根节点，那么我们根据从序列的头部开始遍历，直到元素大于二叉搜索树的根节点，那么这个遍历的下标就是二叉搜索树左子树的下标，其后就是右子树的下标。然后从二叉搜索树的右子树开始遍历，如果所有元素都是大于根节点，则符合要求。若有一个不大于，则返回false。最后递归调用判断根节点的左子树是否是符合要求，以及右子树是否符合要求。

### 实现代码
``` java
public static boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence==null||sequence.length==0)
            return false;
        int root=sequence[sequence.length-1];
        int low=0;
        for (low = 0; low < sequence.length-1; low++) {
            if(sequence[low]>root)
                break;
        }
        for (int i =low; i < sequence.length-1; i++) {
            if(sequence[i]<root)
                return false;
        }
        boolean left = true;
        if(low>0){
            left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, low));
        }
        boolean right = true;
        if(low<sequence.length-1){
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, low, sequence.length-1));
        }
        return left&right;
    }
```

## 5. 二叉树和为某一值的路径
### 算法描述
输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)

### 算法思路
可以通过二叉树的前序遍历访问二叉树的根节点，先访问根节点，再访问左子树，最后再访问右子树。遍历整个二叉搜索树，如果根节点的值为target，则将路径添加到结果集中。如果根节点的值小于target，则说明，需要的值在根节点的左子树或者右子树之间。我们继续递归调用根节点的左子树，此时target变为target-root.val。我们继续递归调用根节点的右子树，此时target变为target-root.val。最后递归调用完毕还需要从Path中移除最后一个元素。当前节点访问结束之后，递归函数将自动回到它的父节点。因此我们在函数退出之前要在路径上删除当前节点并减去当前节点的值，以确保返回父节点时路径刚好是从根节点到夫节点的值。

### 实现代码
``` java
private ArrayList<ArrayList<Integer>> pathList =new ArrayList<>();
    private ArrayList<Integer> path=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null)
            return pathList;
        path.add(root.val);
        if(root.val==target && root.right==null && root.left==null){
            pathList.add(new ArrayList<>(path));
        }
        if(root.left!=null && root.val<target){
            FindPath(root.left,target-root.val);
        }
        if(root.right!=null && root.val<target){
            FindPath(root.right,target-root.val);
        }
        path.remove(path.size()-1);
        return pathList;
    }
```

## 6. 复杂链表的复制
### 算法描述
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

### 算法思路
1. 第一步是复制每个链表上的每一个节点，并用mpNext指针链接起来；第二部设置random指针，遍历每一个链表，假设链表random指针指向的位置是S，那么需要从头开始遍历复制后的链表，找到相应的S节点复制后的节点S1。那么从头开始寻找S1的时间复杂度为N，最终的时间复杂度为O(N^2).
2. 第一步仍然是复制原始链表上的每个节点N创建N1，然后把这些节点用next指针连接起来。同时把<N,N1>放入一个Hash表中。第二部仍然是设置复制链表的random指针，通过寻找hash表找到相应的N1元素。这种方法相当于是空间换取时间，最终的时间复杂度为O(N).
3. 接下来，我们换一种思路不用空间换取时间的情况下实现O(N)的时间复杂度。第一步分解原始链表，假设原始链表为A-B-C 分解之后为A-A1-B-B1-C-C1。第二步复制random pCur是原来链表的结点 pCur.next是复制pCur的结点。第三步拆分 拆分整个链表的偶数位置就是最后的值。

``` java
 public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null)
            return null;
        RandomListNode temp=pHead;

        //分解原始链表，假设原始链表为A-B-C 分解之后为A-A1-B-B1-C-C1
        while (temp!=null){
            RandomListNode random=new RandomListNode(temp.label);
            random.next=temp.next;
            temp.next=random;
            temp=random.next;
        }

        //复制random pCur是原来链表的结点 pCur.next是复制pCur的结点
        temp=pHead;
        while (temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }

        //拆分 拆分整个链表的偶数位置就是最后的值
        RandomListNode cloneHead=pHead.next;
        temp=pHead;
        RandomListNode cloneTemp=cloneHead;
        while (temp!=null){
            temp.next = temp.next.next;
            if(cloneTemp.next!=null)
                cloneTemp.next=cloneTemp.next.next;
            temp=temp.next;
            cloneTemp=cloneTemp.next;
        }
        return cloneHead;
    }
```

## 7.二叉搜索树与双向链表
### 算法描述
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

### 算法思路
记录子树链表的最后一个节点pListNodeInList，终结点只可能为只含左子树的非叶节点与叶节点。将左子树构造成双链表，并返回链表头节点。如果左子树链表不为空的话，将当前current追加到左子树链表。如果pListNodeInList不为null，更新pListNodeInList的right为current。并更新pListNodeInList为current。如果右子树链表不为空的话，递归调用右子树节点。

### 解题思路
``` java
public class _26_Convert {
    private TreeNode pListNodeInList=null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        ConvertHelper(pRootOfTree);
        TreeNode temp=pRootOfTree;
        while (temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }

    private void ConvertHelper(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return;
        TreeNode current = pRootOfTree;
        if(pRootOfTree.left!=null)
            ConvertHelper(pRootOfTree.left);

        current.left=pListNodeInList;

        if(pListNodeInList!=null)
            pListNodeInList.right=current;

        pListNodeInList=current;

        if(pRootOfTree.right!=null)
            ConvertHelper(pRootOfTree.right);

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
```

## 8. 字符串全排列问题
### 算法描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

### 算法思路
对于字符串的排列问题：
* 如果能生成n-1个元素的全排列，就能生成n个元素的全排列。对于只有一个元素的集合，可以直接生成全排列。所以全排列的递归终止条件很明确，只有一个元素时。我们可以分析一下全排列的过程：
* (1)首先，我们固定第一个字符a，求后面两个字符bc的排列
* (2)当两个字符bc排列求好之后，我们把第一个字符a和后面的b交换，得到bac，接着我们固定第一个字符b，求后面两个字符ac的排列
* (3)现在是把c放在第一个位置的时候了，但是记住前面我们已经把原先的第一个字符a和后面的b做了交换，为了保证这次c仍是和原先处在第一个位置的a交换，我们在拿c和第一个字符交换之前，先要把b和a交换回来。在交换b和a之后，再拿c和处于第一位置的a进行交换，得到cba。我们再次固定第一个字符c，求后面两个字符b、a的排列
* (4)既然我们已经知道怎么求三个字符的排列，那么固定第一个字符之后求后面两个字符的排列，就是典型的递归思路了

去掉重复的全排列:
* 由于全排列就是从第一个数字起，每个数分别与它后面的数字交换，我们先尝试加个这样的判断——如果一个数与后面的数字相同那么这两个数就不交换了。例如abb，第一个数与后面两个数交换得bab，bba。然后abb中第二个数和第三个数相同，就不用交换了。但是对bab，第二个数和第三个数不同，则需要交换，得到bba。由于这里的bba和开始第一个数与第三个数交换的结果相同了，因此这个方法不行。

* 换种思维，对abb，第一个数a与第二个数b交换得到bab，然后考虑第一个数与第三个数交换，此时由于第三个数等于第二个数，所以第一个数就不再用与第三个数交换了。再考虑bab，它的第二个数与第三个数交换可以解决bba。此时全排列生成完毕！

### 解题思路
``` java
public class _27_Permutation {
    private ArrayList<String> list=new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if(str.length()==0)
            return list;
        PermutationHelper(str.toCharArray(),0);
        Collections.sort(list);
        return list;
    }

    private void PermutationHelper(char[] chars, int index){
        if(index==chars.length){
            list.add(String.valueOf(chars));
        }
        for (int i = index; i < chars.length; i++) {
            if(isSwap(chars,index,i)){
                swap(chars,index,i);
                PermutationHelper(chars,index+1);
                swap(chars,i,index);
            }
        }
    }

    //判断low到high之间是否有和low[high]元素相同的元素
    private boolean isSwap(char[] chars, int low ,int high){
        for (int i = low; i <high; i++) {
            if (chars[i] == chars[high])
                return false;
        }
        return true;
    }

    private void swap(char[] chars, int i, int k) {
        char temp=chars[k];
        chars[k]=chars[i];
        chars[i]=temp;
    }

    public static void main(String[] args) {
        _27_Permutation permutation=new _27_Permutation();
        ArrayList<String> a = permutation.Permutation("aba");
        System.out.println(a);
    }
}
```

## 9. 数组中的逆序数数字
### 算法描述
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007

### 算法思路
我们先把数组分解成两个长度为2的子数组，再把这两个子数组分别拆成两个长度为1的子数组。接下来一边合并相邻的子数组，一边统计逆序对的数目。在第一对长度为1的子数组{7}、{5}中7大于5，因此（7,5）组成一个逆序对。同样在第二对长度为1的子数组{6}、{4}中也有逆序对（6,4）。由于我们已经统计了这两对子数组内部的逆序对，因此需要把这两对子数组 排序 所示， 以免在以后的统计过程中再重复统计。

接下来我们统计两个长度为2的子数组子数组之间的逆序对。合并子数组并统计逆序对的过程如下图如下图所示。

我们先用两个指针分别指向两个子数组的末尾，并每次比较两个指针指向的数字。如果第一个子数组中的数字大于第二个数组中的数字，则构成逆序对，并且逆序对的数目等于第二个子数组中剩余数字的个数，如下图（a）和（c）所示。如果第一个数组的数字小于或等于第二个数组中的数字，则不构成逆序对，如图b所示。每一次比较的时候，我们都把较大的数字从后面往前复制到一个辅助数组中，确保 辅助数组（记为copy） 中的数字是递增排序的。在把较大的数字复制到辅助数组之后，把对应的指针向前移动一位，接下来进行下一轮比较。

过程：先把数组分割成子数组，先统计出子数组内部的逆序对的数目，然后再统计出两个相邻子数组之间的逆序对的数目。在统计逆序对的过程中，还需要对数组进行排序。如果对排序算法很熟悉，我们不难发现这个过程实际上就是归并排序。

``` java
public class _35_InversePairs {
    public int InversePairs(int [] array) {
        int[] copy=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
        return InversePairsHelper(array,copy,0,array.length-1);
    }

    private int InversePairsHelper(int [] array,int [] copy, int start ,int end) {
        if(start==end){
            copy[start]=array[start];
            return 0;
        }
        int length=(end-start)/2;
        int left=InversePairsHelper(copy,array,start,start+length);
        int right=InversePairsHelper(copy,array,start+length+1,end);

        int i=start+length;
        int j=end;
        int indexCopy=end;
        int count=0;
        while (i>= start && j>=start+length+1){
            if(array[i]>array[j]){
                copy[indexCopy--]=array[i--];
                count+=j-start-length;
            }else {
                copy[indexCopy--]=array[j--];
            }
        }

        while (i>=start){
            copy[indexCopy--]=array[i--];
        }

        while (j>=start+length+1){
            copy[indexCopy--]=array[j--];
        }
        return (left+right+count)%1000000007;
    }
}
```
## 10.和为S的连续子序列
###算法描述
小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

###算法思路
用small和big两个指针分别表示最小值和最大值。small初始化为1，big初始化为2。如果small+big>s,则增大small,去掉序列中较小的值；如果small+big<s,则可以增大big，让序列包含更多的数字。因为序列至少包含两个数字，故small增加到（1+s）/2为止。

### 算法实现
``` java
 public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(sum < 3) return result;
        int low=1;
        int high=2;
        //设置middle变量的原因在于如果在当前总和小于sum的情况下，
        //small在增加到sum的一半的过程中肯定会大于sum
        int mid=(sum+1)/2;
        int curSum=low+high;
        while (low<mid){
            if(curSum==sum)
                addResultFromLowToHigh(result,low,high);
            while (curSum > sum && low<mid){
                curSum-=low;
                low++;
                if(curSum==sum)
                    addResultFromLowToHigh(result,low,high);
            }
            high++;
            curSum+=high;
        }
        return result;
    }

    public void addResultFromLowToHigh(ArrayList<ArrayList<Integer>> result, int low, int high){
        ArrayList arrayList=new ArrayList();
        for (int i = low; i <= high; i++) {
            arrayList.add(i);
        }
        result.add(arrayList);
        return;
    }
```
