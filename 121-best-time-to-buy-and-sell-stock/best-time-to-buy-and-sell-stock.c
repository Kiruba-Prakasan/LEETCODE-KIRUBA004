int maxProfit(int* prices, int n) {
    int prof = INT_MIN;
    int min = INT_MAX;
    for(int i=0;i<n;i++){
        if(prices[i]<min){
            min = prices[i];
        }
        if((prices[i]-min)>prof){
            prof = prices[i]-min;
        }
    }
    return prof;
}