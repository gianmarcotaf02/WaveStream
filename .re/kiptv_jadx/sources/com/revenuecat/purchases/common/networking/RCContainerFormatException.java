package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/RCContainerFormatException;", "Lcom/revenuecat/purchases/utils/SerializationException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RCContainerFormatException extends com.revenuecat.purchases.utils.SerializationException {
    public /* synthetic */ RCContainerFormatException(java.lang.String str, java.lang.Throwable th, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, (i3 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCContainerFormatException(java.lang.String message, java.lang.Throwable th) {
        super(message, th);
        kotlin.jvm.internal.m.e(message, "message");
    }
}
