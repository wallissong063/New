#include <stdio.h>

int main() {
    int variavel = 10;
    printf("Content-Type: text/html\n\n");
    printf("<html><body>");
    printf("<h1>Valor da variável: %d</h1>", variavel);
    printf("</body></html>");
    return 0;
}