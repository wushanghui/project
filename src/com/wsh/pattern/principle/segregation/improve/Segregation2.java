package com.wsh.pattern.principle.segregation.improve;

/**
 * class
 *
 * @author wsh
 * @date 2019-07-06 19:46
 */
public class Segregation2 {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        System.out.println("-------------------");
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }

}

//接口1
interface Interface1 {
    void operation1();
}
//接口2
interface Interface2 {
    void operation2();
    void operation3();
}
//接口3
interface Interface3 {
    void operation4();
    void operation5();
}

//实现类 B
class B implements Interface1, Interface2{

    @Override
    public void operation1() {
        System.out.println("B implement operation1 method");
    }

    @Override
    public void operation2() {
        System.out.println("B implement operation2 method");
    }

    @Override
    public void operation3() {
        System.out.println("B implement operation3 method");
    }

}

class D implements Interface1, Interface3{

    @Override
    public void operation1() {
        System.out.println("D implement operation1 method");
    }

    @Override
    public void operation4() {
        System.out.println("D implement operation4 method");
    }

    @Override
    public void operation5() {
        System.out.println("D implement operation5 method");
    }
}



//依赖类A
//A 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,2,3 方法

class A {

    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface2 i) {
        i.operation2();
    }
    public void depend3(Interface2 i) {
        i.operation3();
    }


}

//依赖类C
//C 类通过接口 Interface1 依赖(使用) C 类，但是只会用到 1,4,5 方法

class C {

    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface3 i) {
        i.operation4();
    }
    public void depend5(Interface3 i) {
        i.operation5();
    }

}