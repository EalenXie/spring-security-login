SpringBoot整合SpringSecurity简单实现登入登出从零搭建
========================

1. 这是SpringSecurity实现登录和登出的一个简单示例，基于 Spring Boot 1.5.6
    
    基本实现 : 用户信息存储在数据库中,登陆时从数据库中查询匹配用户信息。用户登入登出，默认session失效重新登陆。
    
    ![avatar](https://images2018.cnblogs.com/blog/994599/201807/994599-20180711154124007-1732228495.png)
    
    点击登录,登录失败会留在当前页面重新登录,成功则进入index.html,登录如果成功，可以看到后台打印登录成功的日志: 

    ![avatar](https://images2018.cnblogs.com/blog/994599/201807/994599-20180711154258208-1381186085.png)
    
    页面进入index.html: 
    
    ![avatar](https://images2018.cnblogs.com/blog/994599/201807/994599-20180711154337891-1871092340.png)

    点击注销 ，则回重新跳转到login.html，后台也会打印登出成功的日志 : 
    
    ![avatar]( https://images2018.cnblogs.com/blog/994599/201807/994599-20180711154539312-15547252.png)

2. 在你运行该应用之前 : 
    
    1. 请修改你自己的数据库配置: /application.yml 

    2. 请为这个例子准备一个用户表: user.sql

    3. 请在数据库中插入一条包含测试用户名和密码(密码是加密的)的用户记录，加密的密码请参考测试类TestEncoder : 
       ```java 
            @Test
            public void encoder() {
                String password = "admin";
                BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
                String enPassword = encoder.encode(password);
                System.out.println(enPassword);
            }
        ```
    4. 访问 : localhost:8083/login

3. 本例博客说明链接 : https://www.cnblogs.com/ealenxie/p/9293768.html

















