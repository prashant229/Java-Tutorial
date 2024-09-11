package Java_Tutorials ;
class MyGeneric<T1 , T2> {
    int a ;
    T1 b;
    T2 c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public T1 getB() {
        return b;
    }

    public void setB(T1 b) {
        this.b = b;
    }

    public T2 getC() {
        return c;
    }

    public void setC(T2 c) {
        this.c = c;
    }

    public MyGeneric(int a, T1 b, T2 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}


public class Generics {
    public static void main(String[] args){
        MyGeneric<String , Integer> myGeneric = new MyGeneric<>(10 ,"Hello World" , 20); ;
        int a  = myGeneric.getA() ;
        String b = myGeneric.getB() ;
        Integer c = myGeneric.getC() ;
        System.out.println(a + " " + b + " " + c);
    }
}
