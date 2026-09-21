package com.revenuecat.purchases.ads.rewardverification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Poller$defaultJitterSeconds$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final com.revenuecat.purchases.ads.rewardverification.Poller$defaultJitterSeconds$1 INSTANCE = new com.revenuecat.purchases.ads.rewardverification.Poller$defaultJitterSeconds$1();

    public Poller$defaultJitterSeconds$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Double invoke() {
        double dNextDouble;
        B6.c cVar = B6.d.f817h;
        B6.a aVar = B6.d.f818i;
        aVar.getClass();
        if (!java.lang.Double.isInfinite(0.5d) || java.lang.Math.abs(0.75d) > Double.MAX_VALUE || java.lang.Math.abs(1.25d) > Double.MAX_VALUE) {
            dNextDouble = 0.75d + (aVar.j().nextDouble() * 0.5d);
        } else {
            double d4 = 2;
            double dNextDouble2 = ((1.25d / d4) - (0.75d / d4)) * aVar.j().nextDouble();
            dNextDouble = 0.75d + dNextDouble2 + dNextDouble2;
        }
        if (dNextDouble >= 1.25d) {
            dNextDouble = java.lang.Math.nextAfter(1.25d, Double.NEGATIVE_INFINITY);
        }
        return java.lang.Double.valueOf(dNextDouble);
    }
}
