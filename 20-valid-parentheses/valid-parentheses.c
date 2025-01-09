#define MAX 10000  

char st[MAX];
int top;

void init() {
    top = -1;
}

void push(char c) {
    if(top < MAX - 1) {
        st[++top] = c;
    }
}

char peek() {
    if(top >= 0) {
        return st[top];
    }
    return '\0';
}

void pop() {
    if(top >= 0) {
        top--;
    }
}

bool isValid(char* s) {
    init();
    
    for(int i = 0; s[i] != '\0'; i++) {
        char c = s[i];
        if(c == '(' || c == '[' || c == '{') {
            push(c);
        }
        else if(c == ')' || c == ']' || c == '}') {
            if(top == -1) return false;
            char t = peek();
            if((t == '(' && c == ')') || (t == '[' && c == ']') || (t == '{' && c == '}')) {
                pop();
            } else {
                return false;
            }
        }
    }
    return top == -1;
}