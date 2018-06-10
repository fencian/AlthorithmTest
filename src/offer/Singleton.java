package offer;

public class Singleton {
/*   懒汉式线程安全
    private static Singleton singleton  ;
    public Singleton(){

    }

    public static synchronized Singleton getSingleton() {
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
   */
/*
//饿汉式线程安全
    private static Singleton singleton = new Singleton();
    public Singleton(){
    }

    public static Singleton getSingleton() {
        return singleton;
    }*/
/*
//静态类内部加载
    private static class Singletonloader{
        private static Singleton singleton = new Singleton();
    }
    private Singleton(){
        System.out.println("Singleton has loaded");
    }
    public static Singleton getSingleton(){
     return Singletonloader.singleton;
    }*/
/*
//双重校验锁

/**
     *
     STEP 1. 线程A访问getInstance()方法，因为单例还没有实例化，所以进入了锁定块。

     STEP 2. 线程B访问getInstance()方法，因为单例还没有实例化，得以访问接下来代码块，而接下来代码块已经被线程1锁定。

     STEP 3. 线程A进入下一判断，因为单例还没有实例化，所以进行单例实例化，成功实例化后退出代码块，解除锁定。

     STEP 4. 线程B进入接下来代码块，锁定线程，进入下一判断，因为已经实例化，退出代码块，解除锁定。

     STEP 5. 线程A初始化并获取到了单例实例并返回，线程B获取了在线程A中初始化的单例。
     */
/*

    private volatile static Singleton singleton;
    public Singleton(){
        System.out.println("Singleton is loaded");
    }

    public static Singleton getSingleton() {
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
*/
//单例模式指创建后只有一个 无论在新建都用这一个
/*    public static void main(String[] args) {
        Singleton s = Singleton.getSingleton();
        Singleton s1 = Singleton.getSingleton();
    }*/
}
