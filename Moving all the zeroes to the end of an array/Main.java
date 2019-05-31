#include<stdio.h>
int main()
{
  int i, n, indn, indp=0;
  scanf("%d", &n);
  int arr[n], arrs[n];
  indn = n-1;
  for(i=0;i<n;i++) {
  	scanf("%d", &arr[i]);
  }
  for(i=0;i<n;i++) {
  	if(arr[i]==0) arrs[indn--] = arr[i];
    else arrs[indp++] = arr[i];
  }
  for(i=0;i<n;i++) {
  	printf("%d ", arrs[i]);
  }
  return 0;
}