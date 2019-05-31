#include<stdio.h>
int main()
{
  int x, y;
  scanf("%d %d", &x, &y);
  int arr[2][x][y];
  for(int g=0;g<2;g++) {
  	for(int i=0;i<x;i++){
    	for(int j=0;j<y;j++) {
        	scanf("%d", &arr[g][i][j]);
        }
    }
  }
  for(int i=0;i<x;i++){
    for(int j=0;j<y;j++) {
      printf("%d ", arr[0][i][j]- arr[1][i][j]);
    }
    printf("\n");
  }
  return 0;
}