package com.xiaozhangge.consumer.feign.fallback;

import com.xiaozhangge.consumer.feign.ProducerService;
import org.springframework.stereotype.Component;

/**
 * Created by xiaozhangge on 2019-03-16.
 */
@Component
public class ProducerFallback implements ProducerService {

    @Override
    public String index(String name) {
        return String.format("life-example-producer 服务不可用 param:%s", name);
    }
}
