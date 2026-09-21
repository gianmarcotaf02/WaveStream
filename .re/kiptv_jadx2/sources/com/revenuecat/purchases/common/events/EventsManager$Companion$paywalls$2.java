package com.revenuecat.purchases.common.events;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

@Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class EventsManager$Companion$paywalls$2 extends j implements p194x6.j {
    public EventsManager$Companion$paywalls$2(Object obj) {
        super(1, 0, PaywallStoredEvent.Companion.class, obj, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;");
    }

    @Override
    public final PaywallStoredEvent invoke(String p2) {
        m.e(p2, "p0");
        return ((PaywallStoredEvent.Companion) this.receiver).fromString(p2);
    }
}
