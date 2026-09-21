package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RRWebIncrementalSnapshotEvent extends io.sentry.rrweb.RRWebEvent {
    private io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource source;

    public static final class Deserializer {
        public boolean deserializeValue(io.sentry.rrweb.RRWebIncrementalSnapshotEvent rRWebIncrementalSnapshotEvent, java.lang.String str, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            rRWebIncrementalSnapshotEvent.source = (io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource) io.sentry.util.Objects.requireNonNull((io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource) objectReader.nextOrNull(iLogger, new io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource.Deserializer()), "");
            return true;
        }
    }

    public enum IncrementalSource implements io.sentry.JsonSerializable {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
                return io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource.values()[objectReader.nextInt()];
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
            objectWriter.value(ordinal());
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String SOURCE = "source";
    }

    public static final class Serializer {
        public void serialize(io.sentry.rrweb.RRWebIncrementalSnapshotEvent rRWebIncrementalSnapshotEvent, io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
            objectWriter.name("source").value(iLogger, rRWebIncrementalSnapshotEvent.source);
        }
    }

    public RRWebIncrementalSnapshotEvent(io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource incrementalSource) {
        super(io.sentry.rrweb.RRWebEventType.IncrementalSnapshot);
        this.source = incrementalSource;
    }

    public io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource getSource() {
        return this.source;
    }

    public void setSource(io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource incrementalSource) {
        this.source = incrementalSource;
    }
}
