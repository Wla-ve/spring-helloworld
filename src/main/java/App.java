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
        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        Cat catCloneBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean == beanCloneHelloWorld);
        System.out.println(bean.equals(beanCloneHelloWorld));
        System.out.println("=====================================");
        System.out.println(catBean == catCloneBean);
        System.out.println(catBean.equals(catCloneBean));
    }
}