package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toHexString", "", "", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ChecksumKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.models.ChecksumKt$toHexString$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.models.ChecksumKt.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.models.ChecksumKt.AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final java.lang.CharSequence invoke(byte b9) {
            return java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b9)}, 1));
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Number) obj).byteValue());
        }
    }

    public static final java.lang.String toHexString(byte[] bArr) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return p078i6.m.u0(bArr, "", com.revenuecat.purchases.models.ChecksumKt.AnonymousClass1.INSTANCE, 30);
    }
}
