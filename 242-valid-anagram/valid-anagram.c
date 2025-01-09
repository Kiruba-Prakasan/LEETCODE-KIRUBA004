bool isAnagram(char* s, char* t) {
    if(strlen(s)!=strlen(t)){
        return false;
    }
    int sf[26]={0};
    int tf[26]={0};
    for(int i=0;i<strlen(s);i++){
        sf[s[i]-'a']++;
        tf[t[i]-'a']++;
    }
    for(int i=0;i<26;i++){
        if(sf[i]!=tf[i]){
            return false;
        }
    }
    return true;
}