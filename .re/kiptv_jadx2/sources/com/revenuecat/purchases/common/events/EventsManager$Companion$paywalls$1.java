package com.revenuecat.purchases.common.events;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

@Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class EventsManager$Companion$paywalls$1 extends j implements p194x6.j {
    public static final EventsManager$Companion$paywalls$1 INSTANCE = new EventsManager$Companion$paywalls$1();

    public EventsManager$Companion$paywalls$1() {
        super(1, PaywallStoredEvent.class, "toString", "toString()Ljava/lang/String;", 0);
    }

    @Override
    public final String invoke(PaywallStoredEvent p2) {
        m.e(p2, "p0");
        return p2.toString();
    }
}
