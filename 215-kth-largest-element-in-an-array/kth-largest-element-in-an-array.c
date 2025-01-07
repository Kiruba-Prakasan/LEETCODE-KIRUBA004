void heapify(int* h, int n, int i) {
    int sm = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;

    if (l < n && h[l] < h[sm])
        sm = l;
    if (r < n && h[r] < h[sm])
        sm = r;

    if (sm != i) {
        int t = h[i];
        h[i] = h[sm];
        h[sm] = t;
        heapify(h, n, sm);
    }
}

int findKthLargest(int* a, int n, int k) {
    int* h = (int*)malloc(k * sizeof(int));
    for (int i = 0; i < k; i++) {
        h[i] = a[i];
    }

    for (int i = k / 2 - 1; i >= 0; i--) {
        heapify(h, k, i);
    }

    for (int i = k; i < n; i++) {
        if (a[i] > h[0]) {
            h[0] = a[i];
            heapify(h, k, 0);
        }
    }

    int r = h[0];
    free(h);
    return r;
}
