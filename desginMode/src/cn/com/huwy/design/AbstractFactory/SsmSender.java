package cn.com.huwy.design.AbstractFactory;

public class SsmSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SsmSender....");
    }
}
