#include <stdio.h>
int main() {
  int i,a;
  scanf("%d", &a);
  int secondNumber, tempVal=a;
  while(tempVal/10!=0) {
  	secondNumber = tempVal%10;
    tempVal/=10;
  }
  printf("%d", secondNumber);
  return 0;
}