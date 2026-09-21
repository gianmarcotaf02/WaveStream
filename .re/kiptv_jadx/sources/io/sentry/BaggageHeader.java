package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class BaggageHeader {
    public static final java.lang.String BAGGAGE_HEADER = "baggage";
    private final java.lang.String value;

    public BaggageHeader(java.lang.String str) {
        this.value = str;
    }

    public static io.sentry.BaggageHeader fromBaggageAndOutgoingHeader(io.sentry.Baggage baggage, java.util.List<java.lang.String> list) {
        java.lang.String headerString = baggage.toHeaderString(io.sentry.Baggage.fromHeader(list, true, baggage.logger).getThirdPartyHeader());
        if (headerString.isEmpty()) {
            return null;
        }
        return new io.sentry.BaggageHeader(headerString);
    }

    public java.lang.String getName() {
        return BAGGAGE_HEADER;
    }

    public java.lang.String getValue() {
        return this.value;
    }
}
