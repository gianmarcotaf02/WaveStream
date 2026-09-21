package com.revenuecat.purchases.ads.rewardverification;

import B6.a;
import B6.c;
import B6.d;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Poller$defaultJitterSeconds$1 extends o implements Function0 {
    public static final Poller$defaultJitterSeconds$1 INSTANCE = new Poller$defaultJitterSeconds$1();

    public Poller$defaultJitterSeconds$1() {
        super(0);
    }

    @Override
    public final Double invoke() {
        double dNextDouble;
        c cVar = d.f817h;
        a aVar = d.f818i;
        aVar.getClass();
        if (!Double.isInfinite(0.5d) || Math.abs(0.75d) > Double.MAX_VALUE || Math.abs(1.25d) > Double.MAX_VALUE) {
            dNextDouble = 0.75d + (aVar.j().nextDouble() * 0.5d);
        } else {
            double d4 = 2;
            double dNextDouble2 = ((1.25d / d4) - (0.75d / d4)) * aVar.j().nextDouble();
            dNextDouble = 0.75d + dNextDouble2 + dNextDouble2;
        }
        if (dNextDouble >= 1.25d) {
            dNextDouble = Math.nextAfter(1.25d, Double.NEGATIVE_INFINITY);
        }
        return Double.valueOf(dNextDouble);
    }
}
