package com.sharding.jdbc.shardingjdbc.util;

import java.util.UUID;

public class UUIDUtil {

    public static Integer getUUID() {
        int hashCode = UUID.randomUUID().hashCode();
        return Math.abs(hashCode);
    }



}
