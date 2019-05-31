#include<stdio.h>
int main()
{
  int i, n, s1=0, s2=0;
  scanf("%d", &n);
  int arr[n];
  for(i=0;i<n;i++) {
    scanf("%d", &arr[i]);
  	if(i<3) s1+=arr[i];
    else s2+=arr[i];
  }
  if(s1==s2) printf("Perfect Batch");
  else printf("Not a Perfect Batch");
  return 0;
}