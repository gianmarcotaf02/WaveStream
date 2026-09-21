package com.revenuecat.purchases.common.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public /* synthetic */ class EventsManager$Companion$paywalls$1 extends kotlin.jvm.internal.j implements p194x6.j {
    public static final com.revenuecat.purchases.common.events.EventsManager$Companion$paywalls$1 INSTANCE = new com.revenuecat.purchases.common.events.EventsManager$Companion$paywalls$1();

    public EventsManager$Companion$paywalls$1() {
        super(1, com.revenuecat.purchases.paywalls.events.PaywallStoredEvent.class, "toString", "toString()Ljava/lang/String;", 0);
    }

    @Override // p194x6.j
    public final java.lang.String invoke(com.revenuecat.purchases.paywalls.events.PaywallStoredEvent p2) {
        kotlin.jvm.internal.m.e(p2, "p0");
        return p2.toString();
    }
}
