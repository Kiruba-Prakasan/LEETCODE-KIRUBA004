char** stringMatching(char** words, int wordsSize, int* returnSize) {
    char** result = (char**)malloc(wordsSize * sizeof(char*));
    *returnSize = 0;
    bool* isSubstring = (bool*)calloc(wordsSize, sizeof(bool));
    for (int i = 0; i < wordsSize; i++) {
        for (int j = 0; j < wordsSize; j++) {
            if (i == j) continue;
            int len1 = strlen(words[i]);
            int len2 = strlen(words[j]);
            if (len1 > len2) continue;
            bool found = false;
            for (int k = 0; k <= len2 - len1; k++) {
                bool match = true;
                for (int l = 0; l < len1; l++) {
                    if (words[j][k + l] != words[i][l]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    found = true;
                    break;
                }
            }
            if (found && !isSubstring[i]) {
                isSubstring[i] = true;
                result[*returnSize] = (char*)malloc((len1 + 1) * sizeof(char));
                strcpy(result[*returnSize], words[i]);
                (*returnSize)++;
                break;
            }
        }
    }
    free(isSubstring);
    if (*returnSize == 0) {
        free(result);
        return NULL;
    }
    return result;
}