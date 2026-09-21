package com.revenuecat.purchases.ads.events.types;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdFormat {
    private final java.lang.String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.ads.events.types.AdFormat.Companion INSTANCE = new com.revenuecat.purchases.ads.events.types.AdFormat.Companion(null);
    private static final java.lang.String OTHER = m83constructorimpl(io.sentry.protocol.Request.JsonKeys.OTHER);
    private static final java.lang.String BANNER = m83constructorimpl("banner");
    private static final java.lang.String INTERSTITIAL = m83constructorimpl("interstitial");
    private static final java.lang.String REWARDED = m83constructorimpl("rewarded");
    private static final java.lang.String REWARDED_INTERSTITIAL = m83constructorimpl("rewarded_interstitial");
    private static final java.lang.String NATIVE = m83constructorimpl(io.sentry.protocol.SentryStackFrame.JsonKeys.NATIVE);
    private static final java.lang.String APP_OPEN = m83constructorimpl("app_open");

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFormat$Companion;", "", "()V", "APP_OPEN", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "getAPP_OPEN-y0COY5Q", "()Ljava/lang/String;", "Ljava/lang/String;", "BANNER", "getBANNER-y0COY5Q", "INTERSTITIAL", "getINTERSTITIAL-y0COY5Q", "NATIVE", "getNATIVE-y0COY5Q", "OTHER", "getOTHER-y0COY5Q", "REWARDED", "getREWARDED-y0COY5Q", "REWARDED_INTERSTITIAL", "getREWARDED_INTERSTITIAL-y0COY5Q", "fromString", "value", "", "fromString-XxFlno4", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: fromString-XxFlno4, reason: not valid java name */
        public final java.lang.String m89fromStringXxFlno4(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            java.lang.String string = O7.q.r1(value).toString();
            switch (string.hashCode()) {
                case -1396342996:
                    if (string.equals("banner")) {
                        return m91getBANNERy0COY5Q();
                    }
                    break;
                case -1052618729:
                    if (string.equals(io.sentry.protocol.SentryStackFrame.JsonKeys.NATIVE)) {
                        return m93getNATIVEy0COY5Q();
                    }
                    break;
                case -239580146:
                    if (string.equals("rewarded")) {
                        return m95getREWARDEDy0COY5Q();
                    }
                    break;
                case 106069776:
                    if (string.equals(io.sentry.protocol.Request.JsonKeys.OTHER)) {
                        return m94getOTHERy0COY5Q();
                    }
                    break;
                case 604727084:
                    if (string.equals("interstitial")) {
                        return m92getINTERSTITIALy0COY5Q();
                    }
                    break;
                case 1167692200:
                    if (string.equals("app_open")) {
                        return m90getAPP_OPENy0COY5Q();
                    }
                    break;
                case 1911491517:
                    if (string.equals("rewarded_interstitial")) {
                        return m96getREWARDED_INTERSTITIALy0COY5Q();
                    }
                    break;
            }
            return com.revenuecat.purchases.ads.events.types.AdFormat.m83constructorimpl(value);
        }

        /* JADX INFO: renamed from: getAPP_OPEN-y0COY5Q, reason: not valid java name */
        public final java.lang.String m90getAPP_OPENy0COY5Q() {
            return com.revenuecat.purchases.ads.events.types.AdFormat.APP_OPEN;
        }

        /* JADX INFO: renamed from: getBANNER-y0COY5Q, reason: not valid java name */
        public final java.lang.String m91getBANNERy0COY5Q() {
            return com.revenuecat.purchases.ads.events.types.AdFormat.BANNER;
        }

        /* JADX INFO: renamed from: getINTERSTITIAL-y0COY5Q, reason: not valid java name */
        public final java.lang.String m92getINTERSTITIALy0COY5Q() {
            return com.revenuecat.purchases.ads.events.types.AdFormat.INTERSTITIAL;
        }

        /* JADX INFO: renamed from: getNATIVE-y0COY5Q, reason: not valid java name */
        public final java.lang.String m93getNATIVEy0COY5Q() {
            return com.revenuecat.purchases.ads.events.types.AdFormat.NATIVE;
        }

        /* JADX INFO: renamed from: getOTHER-y0COY5Q, reason: not valid java name */
        public final java.lang.String m94getOTHERy0COY5Q() {
            return com.revenuecat.purchases.ads.events.types.AdFormat.OTHER;
        }

        /* JADX INFO: renamed from: getREWARDED-y0COY5Q, reason: not valid java name */
        public final java.lang.String m95getREWARDEDy0COY5Q() {
            return com.revenuecat.purchases.ads.events.types.AdFormat.REWARDED;
        }

        /* JADX INFO: renamed from: getREWARDED_INTERSTITIAL-y0COY5Q, reason: not valid java name */
        public final java.lang.String m96getREWARDED_INTERSTITIALy0COY5Q() {
            return com.revenuecat.purchases.ads.events.types.AdFormat.REWARDED_INTERSTITIAL;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdFormat(java.lang.String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.revenuecat.purchases.ads.events.types.AdFormat m82boximpl(java.lang.String str) {
        return new com.revenuecat.purchases.ads.events.types.AdFormat(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m83constructorimpl(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m84equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.revenuecat.purchases.ads.events.types.AdFormat) && kotlin.jvm.internal.m.a(str, ((com.revenuecat.purchases.ads.events.types.AdFormat) obj).getValue());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m85equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.m.a(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m86hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m87toStringimpl(java.lang.String str) {
        return B2.a.i(')', "AdFormat(value=", str);
    }

    public boolean equals(java.lang.Object obj) {
        return m84equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m86hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m87toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.String getValue() {
        return this.value;
    }
}
