package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;

public abstract class RRWebIncrementalSnapshotEvent extends RRWebEvent {
    private IncrementalSource source;

    public static final class Deserializer {
        public boolean deserializeValue(RRWebIncrementalSnapshotEvent rRWebIncrementalSnapshotEvent, String str, ObjectReader objectReader, ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            rRWebIncrementalSnapshotEvent.source = (IncrementalSource) Objects.requireNonNull((IncrementalSource) objectReader.nextOrNull(iLogger, new IncrementalSource.Deserializer()), "");
            return true;
        }
    }

    public enum IncrementalSource implements JsonSerializable {
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

        public static final class Deserializer implements JsonDeserializer<IncrementalSource> {
            @Override
            public IncrementalSource deserialize(ObjectReader objectReader, ILogger iLogger) {
                return IncrementalSource.values()[objectReader.nextInt()];
            }
        }

        @Override
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.value(ordinal());
        }
    }

    public static final class JsonKeys {
        public static final String SOURCE = "source";
    }

    public static final class Serializer {
        public void serialize(RRWebIncrementalSnapshotEvent rRWebIncrementalSnapshotEvent, ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.name("source").value(iLogger, rRWebIncrementalSnapshotEvent.source);
        }
    }

    public RRWebIncrementalSnapshotEvent(IncrementalSource incrementalSource) {
        super(RRWebEventType.IncrementalSnapshot);
        this.source = incrementalSource;
    }

    public IncrementalSource getSource() {
        return this.source;
    }

    public void setSource(IncrementalSource incrementalSource) {
        this.source = incrementalSource;
    }
}
