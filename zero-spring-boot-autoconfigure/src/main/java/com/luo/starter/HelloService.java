package com.luo.starter;

/**
 * @author luo Fuqiang
 * @date 2020/12/22 17:42
 */
public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHelloZero(String name){
        return helloProperties.getPrefix() + name + helloProperties.getSuffix();
    }
}
