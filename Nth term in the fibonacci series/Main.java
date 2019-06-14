#include<stdio.h>
int main()
{
  int num,a=1,b=2,c;
  scanf("%d",&num);
  if(num==1)
    printf("1");
  else if(num==2)
    printf("2");
  else
  { 
    for(int i=3;i<=num;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  }
  printf("%d",c);

return 0;
  
}