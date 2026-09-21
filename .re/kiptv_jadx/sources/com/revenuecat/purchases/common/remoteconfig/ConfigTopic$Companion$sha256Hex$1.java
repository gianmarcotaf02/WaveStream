package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConfigTopic$Companion$sha256Hex$1 extends kotlin.jvm.internal.o implements p194x6.j {
    public static final com.revenuecat.purchases.common.remoteconfig.ConfigTopic$Companion$sha256Hex$1 INSTANCE = new com.revenuecat.purchases.common.remoteconfig.ConfigTopic$Companion$sha256Hex$1();

    public ConfigTopic$Companion$sha256Hex$1() {
        super(1);
    }

    public final java.lang.CharSequence invoke(byte b9) {
        return java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(b9 & 255)}, 1));
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return invoke(((java.lang.Number) obj).byteValue());
    }
}
