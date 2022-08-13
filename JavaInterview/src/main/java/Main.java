import ProxyMode.ProxyPractice;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main {
    public static void main(String[] args) throws RunnerException {

        CollectionPractice collectionPractice = new CollectionPractice();
//        collectionPractice.TestList();
//        collectionPractice.TestSet();
//        collectionPractice.TestQueue();
//        collectionPractice.TestMap();
//        collectionPractice.isValid("{[]}");
//        ThreadPractice threadPractice = new ThreadPractice();
//        threadPractice.TestLock();
        ProxyPractice proxyPractice = new ProxyPractice();
//        proxyPractice.TestStaticProxy();
        proxyPractice.TestJdkDynamicProxy();
        proxyPractice.TestCglibDynamicProxy();

        System.out.println("Hello world!");
    }
}