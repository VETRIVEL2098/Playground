#include<stdio.h>

int main()
{
  int num;
  scanf("%d",&num);
  if(num%2==1)
  {
    int number=num-1;
    printf("%d",number);
  }
  else
  {
    int number=num/2;
    int res=number-1;
    printf("%d",res);
  }
  return 0;
}