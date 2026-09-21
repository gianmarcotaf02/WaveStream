package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp8/a;", "Lh6/A;", "invoke", "(Lp8/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PricingPhaseSerializer$descriptor$1 extends kotlin.jvm.internal.o implements p194x6.j {
    public static final com.revenuecat.purchases.models.PricingPhaseSerializer$descriptor$1 INSTANCE = new com.revenuecat.purchases.models.PricingPhaseSerializer$descriptor$1();

    public PricingPhaseSerializer$descriptor$1() {
        super(1);
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((p135p8.a) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(p135p8.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("billing_period", com.revenuecat.purchases.models.PeriodSerializer.INSTANCE.getDescriptor(), (12 & 8) == 0);
        buildClassSerialDescriptor.a("recurrence_mode", com.revenuecat.purchases.models.RecurrenceModeSerializer.INSTANCE.getDescriptor(), (12 & 8) == 0);
        buildClassSerialDescriptor.a("billing_cycle_count", com.revenuecat.purchases.models.PricingPhaseSerializer.nullableIntSerializer.getDescriptor(), (12 & 8) == 0);
        buildClassSerialDescriptor.a("price", com.revenuecat.purchases.models.PriceSerializer.INSTANCE.getDescriptor(), (12 & 8) == 0);
    }
}
