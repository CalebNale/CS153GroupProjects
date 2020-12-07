Program TestCheck;

int max(int x, int y, int z){
    if(x > y){
        if(x > z){
            return x;
        }
        else{
            return z;
        }
    }
    else{
        if(y > z){
            return y;
        }
        else{
            return z;
        }
    }
}

void printmyname(string name){
    print("Name is: %s\n",name);
}

void output(){
    printmyname("rahulg");
    print("printing something...");
}

string makestring(){
    return "hello, there";
}

char getchar(char ch){
    switch (ch)
    {
    case 'a':
        return 'a';
        break;
    case 'd':
        return 'd';
        break;
    default:
        return 'b';
        break;
    }
}

int main()
{
    print("Max Value is: %d\n", max(2,4,3));
    printmyname("FreeAssange");
    print("Char is: %c\n", getchar('c'));
    output();
}