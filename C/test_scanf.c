#include <stdio.h>
int main(){
     char first_name[20];
     char last_name[20];
     printf("enter first and last name:\n");
     scanf("%19s %19s", first_name, last_name);
     printf("first:%s last:%s\n", first_name, last_name);
     return 0;
}