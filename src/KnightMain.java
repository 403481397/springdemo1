import org.springframework.context.support.ClassPathXmlApplicationContext;


public class KnightMain {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Knight knight=context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
        System.out.println("asdas" );
    }
}
