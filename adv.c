#include <stdlib.h>
#include <time.h>
#include <stdio.h>
void
 eleat() {
    printf("oi");
    }
int main() {
    srand(time(NULL));
    int num = rand() %100;
    printf("%d", num);
    int robot = num;
    printf(":");
    scanf("%d", &robot);
    for (int i; i < num; i = 3){
    if (robot == num){
       printf("✓");
    } if(robot != num){
    printf(":");
    scanf("%d", &robot);
        }
    }
}