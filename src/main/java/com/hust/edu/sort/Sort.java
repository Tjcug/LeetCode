package com.hust.edu.sort;

/**
 * locate com.hust.edu.sort
 * Created by mastertj on 2018/10/19.
 */
public class Sort {

    //插入排序是一种稳定的排序方法,最好的时间复杂是O(n)也就是已经排好的序列,最差的时间复杂度是O(n^2)逆序
    public void insertSort(int nums[]){
        int tmp;
        for(int i=1;i<nums.length;i++){
            int j=i;
            while (j>0 && nums[j]<nums[j-1]){
                tmp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=tmp;
                j--;
            }
        }
    }

    //希尔排序是一个不稳定的排序算法,它的时间复杂度为O(n^（1.3—2）)
    public void shellSortHelper(int nums[],int incr){
        int tmp;
        for(int i=incr;i<nums.length;i+=incr){
            int j=i;
            while (j>0 && nums[j]<nums[j-incr]){
                tmp=nums[j];
                nums[j]=nums[j-incr];
                nums[j-incr]=tmp;
                j-=incr;
            }
        }
    }
    //希尔排序
    public void shellSort(int nums[]){
        for(int i=nums.length/2;i > 0;i/=2){
            shellSortHelper(nums,i);
        }
    }

    //交换排序是一种稳定的排序方法，最好最坏的时间复杂度都是O(n^2)
    public void swapSort(int nums[])
    {
        int tmp;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    tmp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=tmp;
                }
            }
        }
    }

    //选择排序是一种不稳定的排序方法，最好最坏的时间复杂度都是O(n^2)
    public void selectSort(int nums[]){
        for(int i=0;i<nums.length;i++){
            int values=nums[i];
            int position=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<values){
                    values=nums[j];
                    position=j;
                }
            }
            //swap
            nums[position]=nums[i];
            nums[i]=values;
        }
    }

    //冒泡排序 一种稳定的排序算法，最好最坏的时间复杂度都是O(n^2)
  public void bubbleSort(int nums[]){
        int tmp;
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    tmp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=tmp;
                }
            }
        }
  }

    //快速排序是由一种不稳定的排序算法，最好的时间复杂度是O(nLogN)，最差时间复杂度是O(n^2)
    private void quickSortHelper(int nums[],int start,int end){
      if(start>=end) return;
      int low=start;
      int high=end;
      int target=nums[low];

      while (low<high){
          while (low<high && nums[high]>=target){
              high--;
          }
          nums[low]=nums[high];
          while (low<high && nums[low]<=target){
              low++;
          }
          nums[high]=nums[low];
      }
      nums[low]=target;
      quickSortHelper(nums,start,low-1);
      quickSortHelper(nums,low+1,end);
    }

    public void quickSort(int nums[])
    {
        quickSortHelper(nums,0,nums.length-1);
    }


    //归并排序,是一种不稳定的排序是算法这个算法的时间复复杂度都是O(NlogN)
    public void mergeSrot(int nums[],int start,int end){
        if(start>=end) return;
        int mid=(start+end)/2;
        mergeSrot(nums,start,mid);
        mergeSrot(nums, mid+1, end);
        mergeSrotHelper(nums,start,mid,end);
    }

    //  将两个有序序列归并为一个有序序列(二路归并)
    private void mergeSrotHelper(int[] nums, int start, int mid, int end) {
       int[] arr=new int[end+1];
       int low=start;

       int left=start;
       int center=mid+1;

       while (left<=mid && center<= end){
           arr[low++]= nums[left] >= nums[center] ? nums[center++] :nums[left++];
       }
       while (left<=mid){
           arr[low++] = nums[left++];
       }
       while (center<=end){
            arr[low++] = nums[center++];
       }

       for(int i=start;i<=end;i++){
           nums[i]=arr[i];
       }
    }

    //堆排序
    private boolean isLeaf(int[] nums, int pos){
        //没有叶子节点
        return (2*pos+1)>=nums.length;
    }

    private void swap(int[] nums,int pos1, int pos2){
        int tmp=nums[pos2];
        nums[pos2]=nums[pos1];
        nums[pos1]=tmp;
    }

    private void shiftdown(int[] nums, int pos) {
        while (!isLeaf(nums,pos)){
            int left=2*pos+1;
            int right=2*pos+2;
            if(right<nums.length){
                left= nums[left] < nums[right] ? right : left;
            }
            //是否需要调整
            if(nums[left]<=nums[pos])
                return;

            swap(nums,pos,left);
            pos=left;
        }
    }

    public void buildHeap(int nums[])
    {
       for(int i=nums.length/2-1;i>=0;i--){
           shiftdown(nums,i);
       }
    }

    //    public void heapSort(int nums[])
//    {
//        for(int i=nums.length-1;i>=0;i--)
//        {
//            swap(nums,0,i);
//            shiftdown(nums,i);
//        }
//    }
    public static void main(String[] args)
    {
        Sort sort=new Sort();
        //0 0 2 18 53 53 79 87 199
        int[] nums={0,18,79,53,2,87,0,53,199};
        //sort.quickSort(nums);
        //sort.insertSort(nums);
        //sort.bubbleSort(nums);
        //sort.swapSort(nums);
        //sort.selectSort(nums);
        //sort.mergeSrot(nums,0,nums.length-1);
        //希尔排序
        //sort.shellSort(nums);
        sort.buildHeap(nums);
        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
}
