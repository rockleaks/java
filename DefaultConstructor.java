class Display {
    int a = 9; // initializer expression
    int b = 4; // initializer expression
    int c; // assigned default value

    Display() {
        a = 4; // override default and initializer expression
    }

    void show() {
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println("Value of c : " + c);
    }
}

class DefaultConstructor {
    public static void main(String[] args) {
        Display data = new Display();
        data.show();
    }
}