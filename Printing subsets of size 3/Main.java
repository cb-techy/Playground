#include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int arr[n];
  for(int i=0;i<n;i++) {
  	scanf("%d", &arr[i]);
  }
  for(int i=0;i<n;i++) {
  	for(int j=i+1;j<n;j++){
    	for(int k=j+1;k<n;k++) {
        	printf("(%d, %d, %d) ", arr[i], arr[j], arr[k]);
        }
    }
    if(i!=n-1) printf("\n");
  }
  return 0;
}