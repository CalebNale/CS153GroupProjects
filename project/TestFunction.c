Program TestFunction;

int exp(int num, int power)
{
    int i = 0;
    int result = 1;
    while(i < power)
    {
        result = result * num;
        i = i + 1;
    }

    return result;
}

int main()
{
   int num = exp(3, 2);
   print("%d", num);
}