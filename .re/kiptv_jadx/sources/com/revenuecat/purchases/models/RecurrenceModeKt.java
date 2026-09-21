package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"toRecurrenceMode", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/RecurrenceMode;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RecurrenceModeKt {
    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    public static final com.revenuecat.purchases.models.RecurrenceMode toRecurrenceMode(java.lang.Integer num) {
        for (com.revenuecat.purchases.models.RecurrenceMode recurrenceMode : com.revenuecat.purchases.models.RecurrenceMode.values()) {
            if (kotlin.jvm.internal.m.a(recurrenceMode.getIdentifier(), num)) {
                if (recurrenceMode == null) {
                    return com.revenuecat.purchases.models.RecurrenceMode.UNKNOWN;
                }
                return recurrenceMode;
            }
        }
        recurrenceMode = null;
        if (recurrenceMode == null) {
            return com.revenuecat.purchases.models.RecurrenceMode.UNKNOWN;
        }
        return recurrenceMode;
    }
}
