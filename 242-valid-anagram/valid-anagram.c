bool isAnagram(char* s, char* t) {
    if(strlen(s)!=strlen(t)){
        return false;
    }
    int f[26]={0};
    for(int i=0;i<strlen(s);i++){
        f[s[i]-'a']++;
        f[t[i]-'a']--;
    }
    for(int i=0;i<26;i++){
        if(f[i]!=0){
            return false;
        }
    }
    return true;
}