package com.sharding.jdbc.shardingjdbc.config;

import com.sharding.jdbc.shardingjdbc.util.GsonSingleton;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * 自定义分片规则
 */
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {


    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        System.out.println("collection:{}" + GsonSingleton.getInstance().toJson(collection));
        System.out.println("preciseShardingValue:{}" + GsonSingleton.getInstance().toJson(preciseShardingValue));
        for (String table : collection) {
            if (table.endsWith(String.valueOf(preciseShardingValue.getValue().hashCode() % 2))) {
                return table;
            }
        }
        return null;
    }
}
