package cn.com.huwy.design.AbstractFactory;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailSender...");
    }
}
