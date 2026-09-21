package com.revenuecat.purchases.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p135p8.a;
import p194x6.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp8/a;", "Lh6/A;", "invoke", "(Lp8/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PricingPhaseSerializer$descriptor$1 extends o implements j {
    public static final PricingPhaseSerializer$descriptor$1 INSTANCE = new PricingPhaseSerializer$descriptor$1();

    public PricingPhaseSerializer$descriptor$1() {
        super(1);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((a) obj);
        return A.f22523a;
    }

    public final void invoke(a buildClassSerialDescriptor) {
        m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("billing_period", PeriodSerializer.INSTANCE.getDescriptor(), (12 & 8) == 0);
        buildClassSerialDescriptor.a("recurrence_mode", RecurrenceModeSerializer.INSTANCE.getDescriptor(), (12 & 8) == 0);
        buildClassSerialDescriptor.a("billing_cycle_count", PricingPhaseSerializer.nullableIntSerializer.getDescriptor(), (12 & 8) == 0);
        buildClassSerialDescriptor.a("price", PriceSerializer.INSTANCE.getDescriptor(), (12 & 8) == 0);
    }
}
