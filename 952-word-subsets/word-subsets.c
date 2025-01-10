void countCharFrequency(const char* word, int* freq) {
    for (int i = 0; word[i] != '\0'; i++) {
        freq[word[i] - 'a']++;
    }
}

void getMaxFrequencyForWords2(char** words2, int words2Size, int* maxFreq) {
    for (int i = 0; i < words2Size; i++) {
        int freq[26] = {0};
        countCharFrequency(words2[i], freq);
        for (int j = 0; j < 26; j++) {
            if (freq[j] > maxFreq[j]) {
                maxFreq[j] = freq[j];
            }
        }
    }
}

int isUniversal(const char* word, int* maxFreq) {
    int freq[26] = {0};
    countCharFrequency(word, freq);
    for (int i = 0; i < 26; i++) {
        if (freq[i] < maxFreq[i]) {
            return 0;
        }
    }
    return 1;
}

char** wordSubsets(char** words1, int words1Size, char** words2, int words2Size, int* returnSize) {
    int maxFreq[26] = {0};
    getMaxFrequencyForWords2(words2, words2Size, maxFreq);

    char** result = (char**)malloc(words1Size * sizeof(char*));
    int resultIndex = 0;

    for (int i = 0; i < words1Size; i++) {
        if (isUniversal(words1[i], maxFreq)) {
            result[resultIndex] = (char*)malloc((strlen(words1[i]) + 1) * sizeof(char));
            strcpy(result[resultIndex], words1[i]);
            resultIndex++;
        }
    }

    *returnSize = resultIndex;
    return result;
}
