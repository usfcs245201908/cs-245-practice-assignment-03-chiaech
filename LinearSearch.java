public class LinearSearch implements Practice03Search {
    @Override
    public String searchName() {
        String name = "Linear Search ";
        return name;
    }

    @Override
    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
