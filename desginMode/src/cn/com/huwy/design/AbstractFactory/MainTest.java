package cn.com.huwy.design.AbstractFactory;

public class MainTest {

    public static void main(String[] args) {

        Provider provider = new SendMailFactory();

        Sender sender = provider.produce();

        sender.send();

    }
}
