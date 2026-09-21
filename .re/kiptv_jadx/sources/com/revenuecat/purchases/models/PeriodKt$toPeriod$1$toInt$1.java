package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<no name provided>", "", "part", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PeriodKt$toPeriod$1$toInt$1 extends kotlin.jvm.internal.o implements p194x6.j {
    public static final com.revenuecat.purchases.models.PeriodKt$toPeriod$1$toInt$1 INSTANCE = new com.revenuecat.purchases.models.PeriodKt$toPeriod$1$toInt$1();

    public PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override // p194x6.j
    public final java.lang.Integer invoke(java.lang.String part) {
        kotlin.jvm.internal.m.e(part, "part");
        java.lang.Integer numZ0 = O7.x.z0(O7.q.E0(1, part));
        return java.lang.Integer.valueOf(numZ0 != null ? numZ0.intValue() : 0);
    }
}
