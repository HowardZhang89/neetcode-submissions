class Solution {
    public int[] sortArray(int[] nums) {
        // merge sort
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    private void mergeSort(int[] nums, int start, int end){
        if(start >= end) return;
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int arr[], int start, int mid, int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = start;
        int j = mid + 1;
        while(i<=mid && j <= end){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }
        while(j <= end){
            temp.add(arr[j]);
            j++;
        }
        for(i = start; i <= end; i++){
            arr[i] = temp.get(i-start);
        }
    }
}