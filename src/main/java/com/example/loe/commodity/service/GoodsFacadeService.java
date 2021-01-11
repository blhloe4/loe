package com.example.loe.commodity.service;

import com.example.loe.commodity.domain.GoodsSkuDTO;

public interface GoodsFacadeService {
    GoodsSkuDTO getGoodsSkuById(Long goodsSkuId);
}
