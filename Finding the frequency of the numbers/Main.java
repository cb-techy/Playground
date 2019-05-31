#include<stdio.h>
int main()
{
  int n, k;
  scanf("%d", &n);
  int arr[n];
  scanf("%d", &k);
  for(int i=0;i<n;i++) {
  	scanf("%d", &arr[i]);
  }
  for(int i=1;i<=k;i++) {
  	int c=0;
    for(int j=0;j<n;j++) {
    	if(arr[j] == i) c++;
    }
    printf("%d %d\n", i, c);
  }
  return 0;
}