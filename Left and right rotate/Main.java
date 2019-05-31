#include<stdio.h>
void func(int l[],int size,int iter);
int main() {
   int size,l[10],i,iter;
   scanf("%d",&size);
   for( i = 0; i < size ; i++){
       scanf("%d",&l[i]);
   }
   scanf("%d",&iter);
   func(l,size,iter);
   return 0;  
}

 void func(int l[],int size,int iter)
 {
     int i , j ;
     int ot,et,oid,eid;
     oid = (size%2 == 0)? size -2:size-1;
     eid =(size%2 == 0)? size - 1: size-2 ;
    for( i = 0 ; i < iter ; i++)
    {
        ot = l[oid];
        for( j = oid; j >= 0 ; j=j-2){
            l[j]=l[j-2];
        }
        l[0] = ot;
        et = l[1];
        for( j = 1; j < size ; j = j+2){
            l[j] = l[j+2]; 
        }
        l[eid] = et;   
    }
    for( i = 0 ; i < size ; i++ ){
        printf( "%d ", l[i]);
    }
 }