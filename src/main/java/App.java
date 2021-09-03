import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld beanCloneHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == beanCloneHelloWorld);
        System.out.println(bean.equals(beanCloneHelloWorld));
        System.out.println("================Another pair================");

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCloneCat = (Cat) applicationContext.getBean("cat");

        System.out.println(beanCat == beanCloneCat);
        System.out.println(beanCat.equals(beanCloneCat));
    }
}