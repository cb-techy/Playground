#include<stdio.h>
int main()
{
  int n, k;
  scanf("%d", &n);
  int arr[n];
  for(int i=0;i<n;i++) {
  	scanf("%d", &arr[i]);
  }
  scanf("%d", &k);
  for(int i=0;i<n;i++) {
  	for(int j=0;j<i;j++) {
    	if(arr[j]>arr[i]){
        	int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
    }
  }
  printf("%d", arr[n-k]);
  return 0;
}