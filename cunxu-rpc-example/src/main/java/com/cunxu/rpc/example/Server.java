package com.cunxu.rpc.example;

import com.cunxu.rpc.server.RpcServer;
import com.cunxu.rpc.server.RpcServerConfig;

public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer(new RpcServerConfig());
        server.register(CalcService.class, new CalcServiceImpl());
        server.start();
    }
}
