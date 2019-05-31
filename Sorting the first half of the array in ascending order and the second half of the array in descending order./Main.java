#include<stdio.h>
int main()
{
  int i, j, n;
  scanf("%d", &n);
  int arr[n];
  for(int i=0;i<n;i++) {
  	scanf("%d", &arr[i]);
  }
  for(int i=0;i<n/2;i++) {
  	for (int j=0;j<i;j++) {
    	if(arr[j]>arr[i]) {
        	int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
    }
  }
  for(int i=n/2;i<n;i++) {
  	for (int j=n/2;j<i;j++) {
    	if(arr[j]<arr[i]) {
        	int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
    }
  }
  for(int i=0;i<n;i++) {
  	printf("%d ", arr[i]);
  }
  return 0; 
}