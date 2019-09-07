public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName() {
        String name = "Binary Recursive Search";
        return name;
    }

    @Override
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        return search(arr, target, low, high);
    }

    public int search(int[] arr, int target, int low, int high){

        if (low <= high){
            int mid = (low + high)/2;

            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                return search(arr, target, low, mid - 1);
            else
                return search(arr, target, mid + 1, high);
        } else {
            return -1;
        }

    }
}
