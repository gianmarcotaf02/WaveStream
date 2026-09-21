package com.revenuecat.purchases.models;

import O7.q;
import O7.x;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<no name provided>", "", "part", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PeriodKt$toPeriod$1$toInt$1 extends o implements j {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    public PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override
    public final Integer invoke(String part) {
        m.e(part, "part");
        Integer numZ0 = x.z0(q.E0(1, part));
        return Integer.valueOf(numZ0 != null ? numZ0.intValue() : 0);
    }
}
