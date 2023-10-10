package com.sharding.jdbc.shardingjdbc.util;

import java.util.UUID;

public class UUIDUtil {

    public static Integer getUUID() {
        UUID uuid = UUID.randomUUID();
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        return (int) (mostSignificantBits ^ (mostSignificantBits >>> 32)
                ^ leastSignificantBits ^ (leastSignificantBits >>> 32));
    }


}
