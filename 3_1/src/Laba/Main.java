package Laba;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> ipList = new ArrayList();
        List<String> reachableList = new ArrayList();
        for (int i = 0; i < 255; i++) {
            String IP = "10.13.237." + i;
            ipList.add(IP);
        }

        for (String IP : ipList) {
            InetAddress a = InetAddress.getByName(IP);
            if (a.isReachable(100)) {
                reachableList.add(IP);
            }
        }

        System.out.println("reachable hosts:");
        for (String reachable : reachableList) {
            System.out.println(reachable);
        }
    }
}

