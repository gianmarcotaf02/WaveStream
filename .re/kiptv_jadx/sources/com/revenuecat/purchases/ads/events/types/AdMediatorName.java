package com.revenuecat.purchases.ads.events.types;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdMediatorName {
    private final java.lang.String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.ads.events.types.AdMediatorName.Companion INSTANCE = new com.revenuecat.purchases.ads.events.types.AdMediatorName.Companion(null);
    private static final java.lang.String AD_MOB = m100constructorimpl("AdMob");
    private static final java.lang.String APP_LOVIN = m100constructorimpl("AppLovin");

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdMediatorName$Companion;", "", "()V", "AD_MOB", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "getAD_MOB-GyoM_N4", "()Ljava/lang/String;", "Ljava/lang/String;", "APP_LOVIN", "getAPP_LOVIN-GyoM_N4", "fromString", "value", "", "fromString-CJOXPJU", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: renamed from: fromString-CJOXPJU, reason: not valid java name */
        public final java.lang.String m106fromStringCJOXPJU(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            java.lang.String string = O7.q.r1(value).toString();
            if (kotlin.jvm.internal.m.a(string, "AdMob")) {
                return m107getAD_MOBGyoM_N4();
            }
            return kotlin.jvm.internal.m.a(string, "AppLovin") ? m108getAPP_LOVINGyoM_N4() : com.revenuecat.purchases.ads.events.types.AdMediatorName.m100constructorimpl(value);
        }

        /* JADX INFO: renamed from: getAD_MOB-GyoM_N4, reason: not valid java name */
        public final java.lang.String m107getAD_MOBGyoM_N4() {
            return com.revenuecat.purchases.ads.events.types.AdMediatorName.AD_MOB;
        }

        /* JADX INFO: renamed from: getAPP_LOVIN-GyoM_N4, reason: not valid java name */
        public final java.lang.String m108getAPP_LOVINGyoM_N4() {
            return com.revenuecat.purchases.ads.events.types.AdMediatorName.APP_LOVIN;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdMediatorName(java.lang.String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.revenuecat.purchases.ads.events.types.AdMediatorName m99boximpl(java.lang.String str) {
        return new com.revenuecat.purchases.ads.events.types.AdMediatorName(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m100constructorimpl(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m101equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.revenuecat.purchases.ads.events.types.AdMediatorName) && kotlin.jvm.internal.m.a(str, ((com.revenuecat.purchases.ads.events.types.AdMediatorName) obj).getValue());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m102equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.m.a(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m103hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m104toStringimpl(java.lang.String str) {
        return B2.a.i(')', "AdMediatorName(value=", str);
    }

    public boolean equals(java.lang.Object obj) {
        return m101equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m103hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m104toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.String getValue() {
        return this.value;
    }
}
