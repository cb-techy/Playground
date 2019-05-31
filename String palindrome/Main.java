#include<stdio.h>
#include<string.h>
int main()
{
  char str[100], strx[100];
  fgets(str, 100, stdin);
  for(int i=0; i<strlen(str); i++) {
  	strx[strlen(str)-i-1] = str[i];
  }
  int x=0;
  for(int i=0;i<strlen(str);i++) {
  	if(str[i] != strx[i]) x++;
  }
  if(x==0) printf("%s is a palindrome", str);
  else printf("%s is not a palindrome", str);
  return 0;
}