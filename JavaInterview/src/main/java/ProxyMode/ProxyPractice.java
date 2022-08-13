package ProxyMode;

/**
 * @author:xxxxx
 * @create: 2022-07-06 21:34
 * @Description:
 */

public class ProxyPractice {

    public void TestStaticProxy()
    {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java");
    }

    public void TestJdkDynamicProxy()
    {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }

    public void TestCglibDynamicProxy() {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
    }
}

