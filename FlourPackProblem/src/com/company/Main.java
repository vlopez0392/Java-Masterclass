package com.company;

import java.nio.channels.FileLock;

public class Main {

    public static void main(String[] args) {
        System.out.println(FlourPacker.canPack(5,0,4));   //False

        System.out.println(FlourPacker.canPack(4,18,19)); //True
    }
}
