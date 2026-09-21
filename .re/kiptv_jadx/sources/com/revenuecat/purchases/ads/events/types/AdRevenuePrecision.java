package com.revenuecat.purchases.ads.events.types;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdRevenuePrecision {
    private final java.lang.String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.Companion INSTANCE = new com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.Companion(null);
    private static final java.lang.String EXACT = m115constructorimpl("exact");
    private static final java.lang.String PUBLISHER_DEFINED = m115constructorimpl("publisher_defined");
    private static final java.lang.String ESTIMATED = m115constructorimpl("estimated");
    private static final java.lang.String UNKNOWN = m115constructorimpl("unknown");

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision$Companion;", "", "()V", "ESTIMATED", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "getESTIMATED-rAcPn4k", "()Ljava/lang/String;", "Ljava/lang/String;", "EXACT", "getEXACT-rAcPn4k", "PUBLISHER_DEFINED", "getPUBLISHER_DEFINED-rAcPn4k", "UNKNOWN", "getUNKNOWN-rAcPn4k", "fromString", "value", "", "fromString-QAIqrgA", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: fromString-QAIqrgA, reason: not valid java name */
        public final java.lang.String m121fromStringQAIqrgA(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            java.lang.String lowerCase = value.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            java.lang.String string = O7.q.r1(lowerCase).toString();
            switch (string.hashCode()) {
                case -623607748:
                    if (string.equals("estimated")) {
                        return m122getESTIMATEDrAcPn4k();
                    }
                    break;
                case -284840886:
                    if (string.equals("unknown")) {
                        return m125getUNKNOWNrAcPn4k();
                    }
                    break;
                case 96946943:
                    if (string.equals("exact")) {
                        return m123getEXACTrAcPn4k();
                    }
                    break;
                case 655944390:
                    if (string.equals("publisher_defined")) {
                        return m124getPUBLISHER_DEFINEDrAcPn4k();
                    }
                    break;
            }
            return com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.m115constructorimpl(value);
        }

        /* JADX INFO: renamed from: getESTIMATED-rAcPn4k, reason: not valid java name */
        public final java.lang.String m122getESTIMATEDrAcPn4k() {
            return com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.ESTIMATED;
        }

        /* JADX INFO: renamed from: getEXACT-rAcPn4k, reason: not valid java name */
        public final java.lang.String m123getEXACTrAcPn4k() {
            return com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.EXACT;
        }

        /* JADX INFO: renamed from: getPUBLISHER_DEFINED-rAcPn4k, reason: not valid java name */
        public final java.lang.String m124getPUBLISHER_DEFINEDrAcPn4k() {
            return com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.PUBLISHER_DEFINED;
        }

        /* JADX INFO: renamed from: getUNKNOWN-rAcPn4k, reason: not valid java name */
        public final java.lang.String m125getUNKNOWNrAcPn4k() {
            return com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.UNKNOWN;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdRevenuePrecision(java.lang.String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.revenuecat.purchases.ads.events.types.AdRevenuePrecision m114boximpl(java.lang.String str) {
        return new com.revenuecat.purchases.ads.events.types.AdRevenuePrecision(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m115constructorimpl(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m116equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.revenuecat.purchases.ads.events.types.AdRevenuePrecision) && kotlin.jvm.internal.m.a(str, ((com.revenuecat.purchases.ads.events.types.AdRevenuePrecision) obj).getValue());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m117equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.m.a(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m118hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m119toStringimpl(java.lang.String str) {
        return B2.a.i(')', "AdRevenuePrecision(value=", str);
    }

    public boolean equals(java.lang.Object obj) {
        return m116equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m118hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m119toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.String getValue() {
        return this.value;
    }
}
