package com.revenuecat.purchases.galaxy;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class GalaxyBillingMode {
    private final java.lang.String name;
    public static final com.revenuecat.purchases.galaxy.GalaxyBillingMode PRODUCTION = new com.revenuecat.purchases.galaxy.GalaxyBillingMode() { // from class: com.revenuecat.purchases.galaxy.GalaxyBillingMode$Companion$PRODUCTION$1
    };
    public static final com.revenuecat.purchases.galaxy.GalaxyBillingMode TEST = new com.revenuecat.purchases.galaxy.GalaxyBillingMode() { // from class: com.revenuecat.purchases.galaxy.GalaxyBillingMode$Companion$TEST$1
    };
    public static final com.revenuecat.purchases.galaxy.GalaxyBillingMode ALWAYS_FAIL = new com.revenuecat.purchases.galaxy.GalaxyBillingMode() { // from class: com.revenuecat.purchases.galaxy.GalaxyBillingMode$Companion$ALWAYS_FAIL$1
    };

    public GalaxyBillingMode(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        this.name = name;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public java.lang.String toString() {
        return this.name;
    }
}
