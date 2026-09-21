package com.revenuecat.purchases.data;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/data/LogInResult;", "", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "created", "", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "getCreated", "()Z", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LogInResult {
    private final boolean created;
    private final com.revenuecat.purchases.CustomerInfo customerInfo;

    public LogInResult(com.revenuecat.purchases.CustomerInfo customerInfo, boolean z6) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        this.customerInfo = customerInfo;
        this.created = z6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.data.LogInResult)) {
            return false;
        }
        com.revenuecat.purchases.data.LogInResult logInResult = (com.revenuecat.purchases.data.LogInResult) obj;
        return kotlin.jvm.internal.m.a(this.customerInfo, logInResult.customerInfo) && this.created == logInResult.created;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final com.revenuecat.purchases.CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.created) + (this.customerInfo.hashCode() * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogInResult(customerInfo=");
        sb.append(this.customerInfo);
        sb.append(", created=");
        return v5.L.a(sb, this.created, ')');
    }
}
