int findMin(int* arr, int n) {
        int start = 0, end = n - 1, min = INT_MAX;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[start] <= arr[mid]) {
            if (arr[start] < min) {
                min = arr[start];
            }
            start = mid + 1;
        } else {
            if (arr[mid] < min) {
                min = arr[mid];
            }
            end = mid - 1;
        }
    }
    return min;
}