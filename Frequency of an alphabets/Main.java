#include <stdio.h>
//char alph[26] = ['q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'];
int main()
{
  char a[100];
  int i, j, ind=0;
  gets(a);
  char ab[100];
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
  //SortKarna
  for(i=0;i<strlen(ab);i++) {
  	for(j=0;j<i;j++) {
    	if(ab[j]>ab[i]) {
          char temp = ab[j];
          ab[j] = ab[i];
          ab[i] = temp;
        }
    }
  }
  //SortKhatam
  //Kaam
 
  int count[strlen(ab)];
  for(i=0;i<strlen(ab);i++) {
  	int c=0;
    char x = ab[i];
    for(j=0;j<strlen(a);j++) {
    	if(a[j] == x) c++;
    }
    count[i] = c;
  }
  
  for(i=0; i<strlen(ab); i++) {
    if(ab[i]==' ') continue;
  	printf("%c%d ", ab[i], count[i]);
  }
  //KaamKhatam
  return 0;
}