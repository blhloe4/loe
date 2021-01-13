package com.example.loe.purchase.service;

public interface PurchaseOrderService {

    Boolean informCreatedPurchaseInputOrderEvent(Long purcaseOrderId);

    Boolean informFinishedPurchaseInputOrderEvent(Long purcaseOrderId);

    Boolean informCreatedPurchaseSettlementOrderEvent(Long purcaseOrderId);

    Boolean informFinishedPurchaseSettlementOrderEvent(Long purchaseOrderId);
}
