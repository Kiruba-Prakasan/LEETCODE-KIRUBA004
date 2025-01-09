bool isPalindrome(char* s) {
    /*
    without lib func
    int k=0;
    for(int i=0;i<strlen(s);i++){
        if((s[i]>='A' && s[i]<='Z') || (s[i]>='a' && s[i]<='z') || (s[i]>='0' && s[i]<='9')){
            s[k++]=s[i];
        }
    }
    s[k]='\0';
    printf("%s",s);
    int i=0,j=strlen(s)-1;
    while(i<j){
        char c1 = s[i];
        char c2 = s[j];
        if(c1>='A' && c1<='Z'){
            c1 = c1+32;
        }
        if(c2>='A' && c2<='Z'){
            c2 = c2+32;
        }
        if(c1!=c2){
            return false;
        }
        i++;
        j--;
    }
    */
    int i=0,j=strlen(s);
    while(i<j){
        while(i<j && !isalnum(s[i])){
            i++;
        }
        while(i<j && !isalnum(s[j])){
            j--;
        }
        if(tolower(s[i])!=tolower(s[j])){
            return false;
        }
        i++;
        j--;
    }
    return true;
}