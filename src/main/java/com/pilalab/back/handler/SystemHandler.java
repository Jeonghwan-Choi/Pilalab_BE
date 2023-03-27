package com.pilalab.back.handler;

import java.util.UUID;

public class SystemHandler {

    public static String generate() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}
