package cn.com.huwy.design.singleton;

public class singleton {

    //持有是由静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static  singleton instance = null;

    //私有构造方法，防止被实例化
    private singleton() {
    }

    //静态工程方法，创建实例
    public static  singleton getInstance() {
        /**
         * 千万不要把synchronized关键字写在getInstance方法上
         * 因为每次getInstance方法都要对对象上锁，实事上，只有在第一次创建对象的时候需要加锁，
         */
        if (instance == null) {
            synchronized (instance) {
                instance = new singleton();
            }
        }

        return instance;
    }

    //如果该对象
    public Object readResolve() {
        return instance;
    }

}
