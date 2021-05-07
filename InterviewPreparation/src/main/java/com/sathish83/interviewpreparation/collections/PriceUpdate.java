package com.sathish83.interviewpreparation.collections;

import java.time.LocalDateTime;


public class PriceUpdate {

    private String storeId;

    private LocalDateTime effectiveDateTime;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public LocalDateTime getEffectiveDateTime() {
        return effectiveDateTime;
    }

    public void setEffectiveDateTime(LocalDateTime effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }
}
