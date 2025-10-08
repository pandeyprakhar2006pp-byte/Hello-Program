#include<stdio.h>
/*the fibo is:
1 1 2 3 5 8 13 21 34 55 89......*/
int main(){
int a=1;
int b=1;
int sum=1;
int n;
scanf("%d",&n);
for(int i=1;i<=n-2;i++){
 
    sum=a+b;
    a=b;
    b=sum;
}
    printf("%d\n",sum);


}