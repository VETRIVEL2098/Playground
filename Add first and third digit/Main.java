#include<stdio.h>
int main()
{
  int num,num1,num2,sum;
  scanf("%d",&num);
  num1=num/100;
  num2=num%10;
  sum=num1+num2;
  printf("%d",sum);
  return 0;
}