bool isAnagram(char* s, char* t) {
    // Calculate the lengths of both strings
    int len_s = strlen(s);
    int len_t = strlen(t);
    
    // If lengths are not equal, return false
    if (len_s != len_t) {
        return false;
    }

    // Initialize frequency arrays to 0
    int sf[26] = {0};  // Frequency array for s
    int tf[26] = {0};  // Frequency array for t

    // Iterate over both strings and count frequency of characters
    for (int i = 0; i < len_s; i++) {
        sf[s[i] - 'a']++;
        tf[t[i] - 'a']++;
    }

    // Compare frequency arrays
    for (int i = 0; i < 26; i++) {
        if (sf[i] != tf[i]) {
            return false;
        }
    }

    return true;
}