package Lab_4;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        MyClass elem = new MyClass();
        for(Method i : elem.getClass().getDeclaredMethods()) {
            try {
                if (i.isAnnotationPresent(Annotation.class)){
                    i.setAccessible(true);
                    Annotation ann = i.getAnnotation(Annotation.class);
                    int count = ann.callCount();
                    while (count > 0){
                        i.invoke(elem);
                        count--;
                    }
                }
            }catch (Exception e) {
               e.printStackTrace();
            }
        }
    }
}

