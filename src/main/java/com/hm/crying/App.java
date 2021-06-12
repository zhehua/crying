package com.hm.crying;

import com.github.monkeywie.proxyee.server.HttpProxyServer;

public class App {
    public static void main(String[] args) {
        new HttpProxyServer().start(9999);
    }
}
