package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Int$Companion;", "", "byteArray", "", "fromLittleEndianBytes", "(Lkotlin/jvm/internal/k;[B)I", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class IntExtensionsKt {
    public static final int fromLittleEndianBytes(kotlin.jvm.internal.k kVar, byte[] byteArray) {
        kotlin.jvm.internal.m.e(kVar, "<this>");
        kotlin.jvm.internal.m.e(byteArray, "byteArray");
        return java.nio.ByteBuffer.wrap(byteArray).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt();
    }
}
