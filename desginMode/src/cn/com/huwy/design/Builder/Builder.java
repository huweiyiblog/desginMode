package cn.com.huwy.design.Builder;

import cn.com.huwy.design.factoryMethod.MailSender;
import cn.com.huwy.design.factoryMethod.Sender;
import cn.com.huwy.design.factoryMethod.SsmSender;
import java.util.ArrayList;
import java.util.List;

public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int n = 0; n < count; n++) {
            list.add(new MailSender());
        }
    }

    public void produceSsmSender(int count) {
        for (int i = 0; i < count; i++) {
            SsmSender ssmSender = new SsmSender();
        }
    }
}
