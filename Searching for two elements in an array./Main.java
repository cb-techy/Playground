#include<stdio.h>
int main(){
  int s1found=0, s2found=0, sze, i, s1, s2;
  scanf("%d", &sze);
  int arr[sze];
  for(i=0;i<sze;i++) {
  	scanf("%d", &arr[i]);
  }
  scanf("%d", &s1);
  scanf("%d", &s2);
  for(i=0;i<sze;i++) {
    if(s1==arr[i]){
      s1found++;
      printf("%d\n", i);
      break;
  	}
  }
  if(s1found==0)
    printf("-1\n");
  for(i=0;i<sze;i++) {
    if(s2==arr[i]){
      s2found++;
      printf("%d\n", i);
      break;
  	}
  }
  if(s2found==0)
    printf("-1\n");
  return 0;
}