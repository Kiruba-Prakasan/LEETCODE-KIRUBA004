int countPalindromicSubsequence(char* s) {
    int n = strlen(s);
    int count = 0;
    int first[26],last[26];
    for(int i=0;i<26;i++){
        first[i]=-1;
        last[i]=-1;
    }
    for(int i=0;i<n;i++){
        int ind = s[i]-'a';
        if(first[ind]==-1){
            first[ind]=i;
        }
        last[ind]=i;
    }
    for(int i=0;i<26;i++){
        if(first[i]!=-1&&last[i]!=-1&&first[i]<last[i]){
            int seen[26];
            for(int j=0;j<26;j++){
                seen[j]=0;
            }
            for(int j=first[i]+1;j<last[i];j++){
                int mid = s[j]-'a';
                seen[mid] = 1;
            }
            for(int j=0;j<26;j++){
                if(seen[j]==1){
                    count++;
                }
            }
        }
    }
    return count;
}