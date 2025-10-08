 #include<stdio.h>
// /*TO PRINT THE MAXIMUM NUMBER IN AN ARRAY*/
// #include<limits.h>
// int main(){
//     int arr[6]={1,2,3,4,5,6};
//     int max=INT_MIN;
//     for(int i=0;i<6;i++){
//         if(max<arr[i]){
//             max=arr[i];
//         }

//     }
//     printf("%d is the maximum number\n",max);
// }
/*T0 PRINT THE SECOND LARGEST ELEMENT IN THE GIVEN ARRAY*/
#include<limits.h>
int main(){
    int arr[6]={1,1,1,1,2,0};
    int max=INT_MIN;
    int smax=INT_MIN;
    for(int i=0;i<6;i++){
        if(max<arr[i]){
            smax=max;
            max=arr[i];
        }
        else if(smax<arr[i] && arr[i]!=max){
            smax=arr[i];

        }
    }
printf("%d is the sec largest element here.",smax);
}