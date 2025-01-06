void swap(int* nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
void reverse(int* nums, int s, int n) {
    int i = s;
    int j = n - 1;
    while (i < j) {
        swap(nums, i, j);
        i++;
        j--;
    }
}
void nextPermutation(int* nums, int n) {
    int p = -1;
    for (int i = n - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            p = i;
            break;
        }
    }
    if (p == -1) {
        reverse(nums, 0, n);
    } else {
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[p]) {
                swap(nums, p, i);
                break;
            }
        }
        reverse(nums, p + 1, n);
    }
}
