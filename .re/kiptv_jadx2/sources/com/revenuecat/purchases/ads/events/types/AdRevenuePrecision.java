package com.revenuecat.purchases.ads.events.types;

import B2.a;
import O7.q;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", Request.JsonKeys.OTHER, "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdRevenuePrecision {
    private final String value;

    public static final Companion INSTANCE = new Companion(null);
    private static final String EXACT = m115constructorimpl("exact");
    private static final String PUBLISHER_DEFINED = m115constructorimpl("publisher_defined");
    private static final String ESTIMATED = m115constructorimpl("estimated");
    private static final String UNKNOWN = m115constructorimpl("unknown");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision$Companion;", "", "()V", "ESTIMATED", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "getESTIMATED-rAcPn4k", "()Ljava/lang/String;", "Ljava/lang/String;", "EXACT", "getEXACT-rAcPn4k", "PUBLISHER_DEFINED", "getPUBLISHER_DEFINED-rAcPn4k", "UNKNOWN", "getUNKNOWN-rAcPn4k", "fromString", "value", "", "fromString-QAIqrgA", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final String m121fromStringQAIqrgA(String value) {
            m.e(value, "value");
            String lowerCase = value.toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            String string = q.r1(lowerCase).toString();
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
            return AdRevenuePrecision.m115constructorimpl(value);
        }

        public final String m122getESTIMATEDrAcPn4k() {
            return AdRevenuePrecision.ESTIMATED;
        }

        public final String m123getEXACTrAcPn4k() {
            return AdRevenuePrecision.EXACT;
        }

        public final String m124getPUBLISHER_DEFINEDrAcPn4k() {
            return AdRevenuePrecision.PUBLISHER_DEFINED;
        }

        public final String m125getUNKNOWNrAcPn4k() {
            return AdRevenuePrecision.UNKNOWN;
        }

        private Companion() {
        }
    }

    private AdRevenuePrecision(String str) {
        this.value = str;
    }

    public static final AdRevenuePrecision m114boximpl(String str) {
        return new AdRevenuePrecision(str);
    }

    public static String m115constructorimpl(String value) {
        m.e(value, "value");
        return value;
    }

    public static boolean m116equalsimpl(String str, Object obj) {
        return (obj instanceof AdRevenuePrecision) && m.a(str, ((AdRevenuePrecision) obj).getValue());
    }

    public static final boolean m117equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    public static int m118hashCodeimpl(String str) {
        return str.hashCode();
    }

    public static String m119toStringimpl(String str) {
        return a.i(')', "AdRevenuePrecision(value=", str);
    }

    public boolean equals(Object obj) {
        return m116equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m118hashCodeimpl(this.value);
    }

    public String toString() {
        return m119toStringimpl(this.value);
    }

    public final String getValue() {
        return this.value;
    }
}
