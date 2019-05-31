/*#include<stdio.h>
int main()
{
  int i, n, l, ind=0;
  char a[200], b[200];
  scanf("%s", &a);
  l = strlen(a);
  for(i=strlen(i)-1;i>=0;i--) {
  	if(a[i] == ' '){
      int j;
      for(j=i+1;j<l;j++) {
      	b[ind++] = a[j];
      }
      b[ind++] = " ";
      l = i;
    }
  }
  
  printf("%s", b);
  return 0;
}*/

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 
int main()
{
    char str[100], reverse[100];
    int len, i, index, wordStart, wordEnd;
    gets(str);
    len   = strlen(str);
    index = 0;
  	wordStart = len - 1;
    wordEnd   = len - 1;
    while(wordStart > 0){
        if(str[wordStart] == ' ')
        {
            i = wordStart + 1;
            while(i <= wordEnd){
                reverse[index] = str[i];
                i++;
                index++;
            }
            reverse[index++] = ' ';
            wordEnd = wordStart - 1;
        }
      wordStart--;
    }
    for(i=0; i<=wordEnd; i++)
    {
        reverse[index] = str[i];
        index++;
    }
    reverse[index] = '\0'; 
    printf("%s", reverse);
    return 0;
}