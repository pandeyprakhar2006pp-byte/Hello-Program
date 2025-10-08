#include<stdio.h>
int main(){
    int n,arm=0,original,r;
    printf("Enter any number: ");
    scanf("%d",&n);
    original=n;
    while(n!=0){
        r=n%10;
        arm=(r*r*r)+arm;
        n=n/10;

    }
    if(original==arm){
        printf("%d is an armstrong no.",arm);
    }
    else{
        printf("%d is not an armstrong",arm);
    }
}