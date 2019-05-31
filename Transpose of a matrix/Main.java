#include<stdio.h>
int main()
{
  int i, j, x, y;
  scanf("%d %d", &x, &y);
  int arrf[y][x];
  for(int i=0;i<x;i++) {
  	for(int j=0;j<y;j++) {
      scanf("%d", &arrf[j][i]);
    }
  }
  for(int i=0;i<y;i++) {
  	for(int j=0;j<x;j++) {
    	printf("%d ", arrf[i][j]);
    }
    printf("\n");
  }
  return 0;
}