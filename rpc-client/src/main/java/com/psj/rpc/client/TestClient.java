package com.psj.rpc.client;

import com.psj.rpc.api.HelloObject;
import com.psj.rpc.api.HelloService;
import com.psj.rpc.transport.RpcClientProxy;

public class TestClient {
    public static void main(String[] args) {
        RpcClientProxy proxy = new RpcClientProxy("192.168.149.1", 9000);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }
}
