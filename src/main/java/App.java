import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        boolean c = bean == beanHW;
        System.out.println("references comparison: " + c);

        Cat cat1Bean = applicationContext.getBean("cat", Cat.class);
        Cat cat2Bean = applicationContext.getBean("cat", Cat.class);
        System.out.println("cats references comparison: " + (cat1Bean==cat2Bean));
    }
}