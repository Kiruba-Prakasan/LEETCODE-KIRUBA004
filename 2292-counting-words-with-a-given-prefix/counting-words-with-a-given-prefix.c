int prefixCount(char** words, int wordsSize, char* pref) {
    int count = 0;
    
    for (int i = 0; i < wordsSize; i++) {
        if (strncmp(words[i], pref, strlen(pref)) == 0) {
            count++;
        }
    }
    return count;
}
