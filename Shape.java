class Shape1 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.methodB(10));
    }
}

class A {
    int methodA(int k) {
    	return 0;
    }

    int methodB(int i) {
        return 0;
    }

    int methodC(int i) {
        return methodB(++i);
    }
}

class B extends A {
    public int methodB(int i) {
        return ++i;
    }
}

public abstract class Shape {
    int num1;
    int num2;

    Shape(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public abstract void add();
}
