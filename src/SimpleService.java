import java.util.Random;
//注意不能存在包名
//测试修改
//再来修改
public class SimpleService {
    public  String getGreeting(String name){
        return "Hello " + name;
    }

    public int getPrice(){
        return new Random().nextInt(100);
    }
}
