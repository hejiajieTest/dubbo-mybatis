基于mybatis项目，将dubbo集成进去，目前没有做集群操作，
引入dubbo的jar包的时候，需要将spring包移除，不然会冲突，
会报需要1.5或者以上jre运行环境， 但是此时jre配置的是1.8了。
spring注解扫描没法识别@Reference注解，dubbo注解没法扫描@Controller，
应该先spring注解扫好了之后，在去加载reference注解
对于此问题，解决办法，网上给的结论是spring和dubbo扫描顺序问题，修改顺序之后，仍会报空指针，
后面再无意中发现是项目中dubbo-provider.xml中<dubbo:annotation package="cn.ffcs.tsp.dubboService.impl" />
package中dubboService写成了dubboservice导致扫描不到，从而一直为空。
 
1、先搭建简单的mybatis项目
2、在搭建简单的dubbodemo
3、将dubbo与mybatis集成起来，用到zk的jar包和dubbo的jar包，
4、采用main方式测试调用
5、改用jetty方式部署。
使用jetty启动，报错 javax.servlet.http.HttpSessionIdListener
原因需要删除javax-servlet-api jar包
有个大坑：provider无法注册，报的错误有两种No provider available for the service，这种很明显的错误
第二种：javax.servlet.http.HttpServletResponse.getStatus()I
第二种说是spring4.1与servlet.api版本冲突，
这两种情况根本原因还是因为provider没有注册成功，但是直接访问index.jsp是可以访问的，具体原因不清除，
调试过程中，总感觉provider中的信息未执行，于是我修改启动方式，web.xml中直接指向applicationContext.xml,
而不通过WEB-InFo底下的springmvc-servlet.xml中import文件applicationContext,再次运行tomcat或者jetty时，都可以成功。
tomcat测试地址：http://localhost:8080/dubbo-customer/manualInfo/findAll.do
jetty测试地址：http://localhost:1800/consumer/manualInfo/findAll.do
