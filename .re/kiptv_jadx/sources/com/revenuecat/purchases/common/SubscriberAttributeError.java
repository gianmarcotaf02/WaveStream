package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "", "keyName", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getKeyName", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class SubscriberAttributeError {
    private final java.lang.String keyName;
    private final java.lang.String message;

    public SubscriberAttributeError(java.lang.String keyName, java.lang.String message) {
        kotlin.jvm.internal.m.e(keyName, "keyName");
        kotlin.jvm.internal.m.e(message, "message");
        this.keyName = keyName;
        this.message = message;
    }

    public static /* synthetic */ com.revenuecat.purchases.common.SubscriberAttributeError copy$default(com.revenuecat.purchases.common.SubscriberAttributeError subscriberAttributeError, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = subscriberAttributeError.keyName;
        }
        if ((i3 & 2) != 0) {
            str2 = subscriberAttributeError.message;
        }
        return subscriberAttributeError.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getKeyName() {
        return this.keyName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final com.revenuecat.purchases.common.SubscriberAttributeError copy(java.lang.String keyName, java.lang.String message) {
        kotlin.jvm.internal.m.e(keyName, "keyName");
        kotlin.jvm.internal.m.e(message, "message");
        return new com.revenuecat.purchases.common.SubscriberAttributeError(keyName, message);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.SubscriberAttributeError)) {
            return false;
        }
        com.revenuecat.purchases.common.SubscriberAttributeError subscriberAttributeError = (com.revenuecat.purchases.common.SubscriberAttributeError) other;
        return kotlin.jvm.internal.m.a(this.keyName, subscriberAttributeError.keyName) && kotlin.jvm.internal.m.a(this.message, subscriberAttributeError.message);
    }

    public final java.lang.String getKeyName() {
        return this.keyName;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.keyName.hashCode() * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriberAttributeError(keyName=");
        sb.append(this.keyName);
        sb.append(", message=");
        return Y6.f.l(sb, this.message, ')');
    }
}
