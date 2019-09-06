public class BinaryIterativeSearch implements Practice03Search {
    @Override
    public String searchName() {
        String name = "Binary Iterative Search";
        return name;
    }

    @Override
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
