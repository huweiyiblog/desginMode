package cn.com.huwy.design.factoryMethod;

public class SsmSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SsmSender....");
    }
}
