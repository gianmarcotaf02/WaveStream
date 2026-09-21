package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelope {
    private final io.sentry.SentryEnvelopeHeader header;
    private final java.lang.Iterable<io.sentry.SentryEnvelopeItem> items;

    public SentryEnvelope(io.sentry.SentryEnvelopeHeader sentryEnvelopeHeader, java.lang.Iterable<io.sentry.SentryEnvelopeItem> iterable) {
        this.header = (io.sentry.SentryEnvelopeHeader) io.sentry.util.Objects.requireNonNull(sentryEnvelopeHeader, "SentryEnvelopeHeader is required.");
        this.items = (java.lang.Iterable) io.sentry.util.Objects.requireNonNull(iterable, "SentryEnvelope items are required.");
    }

    public static io.sentry.SentryEnvelope from(io.sentry.ISerializer iSerializer, io.sentry.Session session, io.sentry.protocol.SdkVersion sdkVersion) {
        io.sentry.util.Objects.requireNonNull(iSerializer, "Serializer is required.");
        io.sentry.util.Objects.requireNonNull(session, "session is required.");
        return new io.sentry.SentryEnvelope((io.sentry.protocol.SentryId) null, sdkVersion, io.sentry.SentryEnvelopeItem.fromSession(iSerializer, session));
    }

    public io.sentry.SentryEnvelopeHeader getHeader() {
        return this.header;
    }

    public java.lang.Iterable<io.sentry.SentryEnvelopeItem> getItems() {
        return this.items;
    }

    public SentryEnvelope(io.sentry.protocol.SentryId sentryId, io.sentry.protocol.SdkVersion sdkVersion, java.lang.Iterable<io.sentry.SentryEnvelopeItem> iterable) {
        this.header = new io.sentry.SentryEnvelopeHeader(sentryId, sdkVersion);
        this.items = (java.lang.Iterable) io.sentry.util.Objects.requireNonNull(iterable, "SentryEnvelope items are required.");
    }

    public static io.sentry.SentryEnvelope from(io.sentry.ISerializer iSerializer, io.sentry.SentryBaseEvent sentryBaseEvent, io.sentry.protocol.SdkVersion sdkVersion) {
        io.sentry.util.Objects.requireNonNull(iSerializer, "Serializer is required.");
        io.sentry.util.Objects.requireNonNull(sentryBaseEvent, "item is required.");
        return new io.sentry.SentryEnvelope(sentryBaseEvent.getEventId(), sdkVersion, io.sentry.SentryEnvelopeItem.fromEvent(iSerializer, sentryBaseEvent));
    }

    public SentryEnvelope(io.sentry.protocol.SentryId sentryId, io.sentry.protocol.SdkVersion sdkVersion, io.sentry.SentryEnvelopeItem sentryEnvelopeItem) {
        io.sentry.util.Objects.requireNonNull(sentryEnvelopeItem, "SentryEnvelopeItem is required.");
        this.header = new io.sentry.SentryEnvelopeHeader(sentryId, sdkVersion);
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(sentryEnvelopeItem);
        this.items = arrayList;
    }

    public static io.sentry.SentryEnvelope from(io.sentry.ISerializer iSerializer, io.sentry.ProfilingTraceData profilingTraceData, long j, io.sentry.protocol.SdkVersion sdkVersion) {
        io.sentry.util.Objects.requireNonNull(iSerializer, "Serializer is required.");
        io.sentry.util.Objects.requireNonNull(profilingTraceData, "Profiling trace data is required.");
        return new io.sentry.SentryEnvelope(new io.sentry.protocol.SentryId(profilingTraceData.getProfileId()), sdkVersion, io.sentry.SentryEnvelopeItem.fromProfilingTrace(profilingTraceData, j, iSerializer));
    }
}
