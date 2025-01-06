char* shiftingLetters(char* s, int** shifts, int row, int* col) {
    /*
    TLE error 
    for(int i=0;i<row;i++){
        int st=shifts[i][0];
        int en=shifts[i][1];
        int dir=shifts[i][2];
        //backward shift
        if(dir==0){
            for(int j=st;j<=en;j++){
                 s[j] = (s[j] - 'a' - 1 + 26) % 26 + 'a';
            }
        }
        //forward shift
        if(dir==1){
            for(int j=st;j<=en;j++){
                 s[j] = (s[j] - 'a' + 1) % 26 + 'a';
            }
        }
    }
    return s;
    */

    int n = strlen(s);
    int* e = (int*)calloc(n+1,sizeof(int));
    for(int i=0;i<row;i++){
        int st=shifts[i][0];
        int en=shifts[i][1];
        int dir=shifts[i][2];
        if(dir==1){
            e[st]+=1;
            e[en+1]-=1;
        }
        else{
            e[st]-=1;
            e[en+1]+=1;
        }
    }
    int t=0;
    for(int i=0;i<n;i++){
        t+=e[i];
        t=(t%26+26)%26;
        s[i]=(s[i]-'a'+ t )%26+'a';
    }
    free(e);
    return s;
}