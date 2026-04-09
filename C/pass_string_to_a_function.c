#include<stdio.h>
void fortune_cookie(char msg[])
{
    printf("message reads:%s\n",msg);
    printf("message length:%i\n",sizeof(msg));

}
int main()
{
    char quote[]="cookies make you fat";
    fortune_cookie(quote);
    printf("the quote string is stored at:%p\n",quote);
    return 0;
}