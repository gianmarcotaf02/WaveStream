package com.revenuecat.purchases.ads.events.types;

import B2.a;
import O7.q;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", Request.JsonKeys.OTHER, "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdFormat {
    private final String value;

    public static final Companion INSTANCE = new Companion(null);
    private static final String OTHER = m83constructorimpl(Request.JsonKeys.OTHER);
    private static final String BANNER = m83constructorimpl("banner");
    private static final String INTERSTITIAL = m83constructorimpl("interstitial");
    private static final String REWARDED = m83constructorimpl("rewarded");
    private static final String REWARDED_INTERSTITIAL = m83constructorimpl("rewarded_interstitial");
    private static final String NATIVE = m83constructorimpl(SentryStackFrame.JsonKeys.NATIVE);
    private static final String APP_OPEN = m83constructorimpl("app_open");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFormat$Companion;", "", "()V", "APP_OPEN", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "getAPP_OPEN-y0COY5Q", "()Ljava/lang/String;", "Ljava/lang/String;", "BANNER", "getBANNER-y0COY5Q", "INTERSTITIAL", "getINTERSTITIAL-y0COY5Q", "NATIVE", "getNATIVE-y0COY5Q", "OTHER", "getOTHER-y0COY5Q", "REWARDED", "getREWARDED-y0COY5Q", "REWARDED_INTERSTITIAL", "getREWARDED_INTERSTITIAL-y0COY5Q", "fromString", "value", "", "fromString-XxFlno4", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final String m89fromStringXxFlno4(String value) {
            m.e(value, "value");
            String string = q.r1(value).toString();
            switch (string.hashCode()) {
                case -1396342996:
                    if (string.equals("banner")) {
                        return m91getBANNERy0COY5Q();
                    }
                    break;
                case -1052618729:
                    if (string.equals(SentryStackFrame.JsonKeys.NATIVE)) {
                        return m93getNATIVEy0COY5Q();
                    }
                    break;
                case -239580146:
                    if (string.equals("rewarded")) {
                        return m95getREWARDEDy0COY5Q();
                    }
                    break;
                case 106069776:
                    if (string.equals(Request.JsonKeys.OTHER)) {
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
            return AdFormat.m83constructorimpl(value);
        }

        public final String m90getAPP_OPENy0COY5Q() {
            return AdFormat.APP_OPEN;
        }

        public final String m91getBANNERy0COY5Q() {
            return AdFormat.BANNER;
        }

        public final String m92getINTERSTITIALy0COY5Q() {
            return AdFormat.INTERSTITIAL;
        }

        public final String m93getNATIVEy0COY5Q() {
            return AdFormat.NATIVE;
        }

        public final String m94getOTHERy0COY5Q() {
            return AdFormat.OTHER;
        }

        public final String m95getREWARDEDy0COY5Q() {
            return AdFormat.REWARDED;
        }

        public final String m96getREWARDED_INTERSTITIALy0COY5Q() {
            return AdFormat.REWARDED_INTERSTITIAL;
        }

        private Companion() {
        }
    }

    private AdFormat(String str) {
        this.value = str;
    }

    public static final AdFormat m82boximpl(String str) {
        return new AdFormat(str);
    }

    public static String m83constructorimpl(String value) {
        m.e(value, "value");
        return value;
    }

    public static boolean m84equalsimpl(String str, Object obj) {
        return (obj instanceof AdFormat) && m.a(str, ((AdFormat) obj).getValue());
    }

    public static final boolean m85equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    public static int m86hashCodeimpl(String str) {
        return str.hashCode();
    }

    public static String m87toStringimpl(String str) {
        return a.i(')', "AdFormat(value=", str);
    }

    public boolean equals(Object obj) {
        return m84equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m86hashCodeimpl(this.value);
    }

    public String toString() {
        return m87toStringimpl(this.value);
    }

    public final String getValue() {
        return this.value;
    }
}
