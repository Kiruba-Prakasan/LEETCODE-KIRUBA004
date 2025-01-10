void sortStrings(char** strs, int strsSize) {
    for (int i = 0; i < strsSize - 1; i++) {
        for (int j = i + 1; j < strsSize; j++) {
            if (strcmp(strs[i], strs[j]) > 0) {
                char* temp = strs[i];
                strs[i] = strs[j];
                strs[j] = temp;
            }
        }
    }
}

char* longestCommonPrefix(char** strs, int strsSize) {
    if (strsSize == 0) {
        return "";
    }
    sortStrings(strs, strsSize);
    char* first = strs[0];
    char* last = strs[strsSize - 1];
    int n = strlen(first) < strlen(last) ? strlen(first) : strlen(last);
    static char result[256];
    int index = 0;

    for (int i = 0; i < n; i++) {
        if (first[i] != last[i]) {
            break;
        }
        result[index++] = first[i];
    }
    result[index] = '\0';
    return result;
}