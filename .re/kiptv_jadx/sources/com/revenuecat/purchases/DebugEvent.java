package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/DebugEvent;", "", "name", "Lcom/revenuecat/purchases/DebugEventName;", com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.PROPERTIES_KEY, "", "", "(Lcom/revenuecat/purchases/DebugEventName;Ljava/util/Map;)V", "getName", "()Lcom/revenuecat/purchases/DebugEventName;", "getProperties", "()Ljava/util/Map;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DebugEvent {
    private final com.revenuecat.purchases.DebugEventName name;
    private final java.util.Map<java.lang.String, java.lang.String> properties;

    public DebugEvent(com.revenuecat.purchases.DebugEventName name, java.util.Map<java.lang.String, java.lang.String> properties) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(properties, "properties");
        this.name = name;
        this.properties = properties;
    }

    public final com.revenuecat.purchases.DebugEventName getName() {
        return this.name;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getProperties() {
        return this.properties;
    }

    public /* synthetic */ DebugEvent(com.revenuecat.purchases.DebugEventName debugEventName, java.util.Map map, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(debugEventName, (i3 & 2) != 0 ? p078i6.x.f23206h : map);
    }
}
