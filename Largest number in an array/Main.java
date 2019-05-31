#include<stdio.h>
int main()
{
  int i, n;
  scanf("%d", &n);
  int arr[n];
  for(i=0;i<n;i++) {
  	scanf("%d", &arr[i]);
  }
  int large = arr[0];
  for(i=1;i<n;i++) {
  	if(arr[i]>large) large=arr[i];
  }
  printf("%d", large);
  return 0;
}