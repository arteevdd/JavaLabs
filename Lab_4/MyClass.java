package Lab_4;

@SuppressWarnings("all")
public class MyClass {
    @Annotation(callCount = 1)
    private void method1(){
        System.out.println("Be called first method");
    }

    @Annotation(callCount = 2)
    private void method2(){
        System.out.println("Be called second method");
    }

    @Annotation(callCount = 3)
    private void method3(){
        System.out.println("Be called third method");
    }

    @Annotation(callCount = 4)
    private void method4(){
        System.out.println("Be called fourth method");
    }
}
