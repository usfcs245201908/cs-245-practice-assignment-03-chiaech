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
        int mid = (low + high)/2;

        if (low > high)
            return -1;
        else if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
           return search(arr, target);
        else
            return search(arr, target);
    }
}
