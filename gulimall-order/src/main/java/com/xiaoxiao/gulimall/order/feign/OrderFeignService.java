package com.xiaoxiao.gulimall.order.feign;

import com.xiaoxiao.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-product")
public interface OrderFeignService {


    @RequestMapping("/product/brand/listBrand")
     R listBrand();
}
