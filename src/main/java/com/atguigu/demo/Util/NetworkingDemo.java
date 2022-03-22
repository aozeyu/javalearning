package com.atguigu.demo.Util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.simplilearn.com";
        InetAddress inetAddress = InetAddress.getByName(url);
        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));
        System.out.println("Host Address: " + inetAddress.getHostAddress());
        System.out.println("isAnyLocalAddress: " + inetAddress.isAnyLocalAddress());
        System.out.println("isLinkLocalAddress: " + inetAddress.isLinkLocalAddress());
        System.out.println("isLoopBackAddress: " + inetAddress.isLoopbackAddress());
        System.out.println("hashCode : " + inetAddress.hashCode());
    }
}
