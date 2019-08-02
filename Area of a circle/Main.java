#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  float r,area;
  r=(float)a/2;
  area=3.14*r*r;
  printf("%0.2f",area);
  return 0;
}