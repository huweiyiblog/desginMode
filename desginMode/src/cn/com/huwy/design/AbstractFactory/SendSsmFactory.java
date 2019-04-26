package cn.com.huwy.design.AbstractFactory;

public class SendSsmFactory implements  Provider {
    @Override
    public Sender produce() {
        return new SsmSender();
    }
}
