#include <stdio.h>
#include<string.h>
char alph[26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
int main()
{
  int i, j, ind=0;
  char a[100], ab[100];
  gets(a);
  for(i=0; i<strlen(a); i++){
    char x = a[i];
    int exists = 0;
    for(j=0;j<strlen(ab); j++) {
    	if(ab[j] == x){
          exists++;
          break;
        }
    }
    if(exists == 0) {
    	ab[ind++] = x;
    }
  }
  
  for(i=0;i<strlen(alph);i++) {
  	int exists=0;
    char x = alph[i];
    for(j=0;j<strlen(ab);j++){
    	if(ab[j] == x) exists++;
    }
    if(exists==0) printf("%c ", x);
  }
  return 0;
}