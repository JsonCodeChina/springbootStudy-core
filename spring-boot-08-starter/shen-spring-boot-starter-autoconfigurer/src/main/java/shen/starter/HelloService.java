package shen.starter;

public class HelloService {

    HelloProperties helloProperties;



    public String sayHelloShen(String name){

        return helloProperties.getPrefix()+"-"+name+helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
