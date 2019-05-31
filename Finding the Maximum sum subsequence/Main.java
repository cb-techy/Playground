#include<stdio.h>
int main(){
        int i, j, n;
        scanf("%d",&n);
        int arr[100];
        for(i=0; i<n; i++){
            scanf("%d",&arr[i]);
        }
        printf("%d",func( arr, n ));
        return 0;
}

int func( int arr[], int n ){
  int r, maxx, i;
  r = arr[0];
  maxx = arr[0];
  for(i = 1; i < n; i++){
    if(arr[i] > arr[i-1]) r += arr[i];
	else r = arr[i];
    
    if(r > maxx) maxx = r;
    }
  return maxx;
}