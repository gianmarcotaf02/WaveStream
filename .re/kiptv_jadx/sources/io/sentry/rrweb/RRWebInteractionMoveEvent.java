package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public final class RRWebInteractionMoveEvent extends io.sentry.rrweb.RRWebIncrementalSnapshotEvent implements io.sentry.JsonSerializable, io.sentry.JsonUnknown {
    private java.util.Map<java.lang.String, java.lang.Object> dataUnknown;
    private int pointerId;
    private java.util.List<io.sentry.rrweb.RRWebInteractionMoveEvent.Position> positions;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebInteractionMoveEvent> {
        private void deserializeData(io.sentry.rrweb.RRWebInteractionMoveEvent rRWebInteractionMoveEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.rrweb.RRWebIncrementalSnapshotEvent.Deserializer deserializer = new io.sentry.rrweb.RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("pointerId")) {
                    rRWebInteractionMoveEvent.pointerId = objectReader.nextInt();
                } else if (strNextName.equals(io.sentry.rrweb.RRWebInteractionMoveEvent.JsonKeys.POSITIONS)) {
                    rRWebInteractionMoveEvent.positions = objectReader.nextListOrNull(iLogger, new io.sentry.rrweb.RRWebInteractionMoveEvent.Position.Deserializer());
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setDataUnknown(map);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.rrweb.RRWebInteractionMoveEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.rrweb.RRWebInteractionMoveEvent rRWebInteractionMoveEvent = new io.sentry.rrweb.RRWebInteractionMoveEvent();
            io.sentry.rrweb.RRWebEvent.Deserializer deserializer = new io.sentry.rrweb.RRWebEvent.Deserializer();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebInteractionMoveEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebInteractionMoveEvent;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String DATA = "data";
        public static final java.lang.String POINTER_ID = "pointerId";
        public static final java.lang.String POSITIONS = "positions";
    }

    public static final class Position implements io.sentry.JsonSerializable, io.sentry.JsonUnknown {
        private int id;
        private long timeOffset;
        private java.util.Map<java.lang.String, java.lang.Object> unknown;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f23541x;
        private float y;

        public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebInteractionMoveEvent.Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public io.sentry.rrweb.RRWebInteractionMoveEvent.Position deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
                objectReader.beginObject();
                io.sentry.rrweb.RRWebInteractionMoveEvent.Position position = new io.sentry.rrweb.RRWebInteractionMoveEvent.Position();
                java.util.HashMap map = null;
                while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                    java.lang.String strNextName = objectReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "x":
                            position.f23541x = objectReader.nextFloat();
                            break;
                        case "y":
                            position.y = objectReader.nextFloat();
                            break;
                        case "id":
                            position.id = objectReader.nextInt();
                            break;
                        case "timeOffset":
                            position.timeOffset = objectReader.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new java.util.HashMap();
                            }
                            objectReader.nextUnknown(iLogger, map, strNextName);
                            break;
                    }
                }
                position.setUnknown(map);
                objectReader.endObject();
                return position;
            }
        }

        public static final class JsonKeys {
            public static final java.lang.String ID = "id";
            public static final java.lang.String TIME_OFFSET = "timeOffset";
            public static final java.lang.String X = "x";

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final java.lang.String f23542Y = "y";
        }

        public int getId() {
            return this.id;
        }

        public long getTimeOffset() {
            return this.timeOffset;
        }

        @Override // io.sentry.JsonUnknown
        public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
            return this.unknown;
        }

        public float getX() {
            return this.f23541x;
        }

        public float getY() {
            return this.y;
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
            objectWriter.beginObject();
            objectWriter.name("id").value(this.id);
            objectWriter.name("x").value(this.f23541x);
            objectWriter.name("y").value(this.y);
            objectWriter.name(io.sentry.rrweb.RRWebInteractionMoveEvent.Position.JsonKeys.TIME_OFFSET).value(this.timeOffset);
            java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
            if (map != null) {
                for (java.lang.String str : map.keySet()) {
                    com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
                }
            }
            objectWriter.endObject();
        }

        public void setId(int i3) {
            this.id = i3;
        }

        public void setTimeOffset(long j) {
            this.timeOffset = j;
        }

        @Override // io.sentry.JsonUnknown
        public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.unknown = map;
        }

        public void setX(float f9) {
            this.f23541x = f9;
        }

        public void setY(float f9) {
            this.y = f9;
        }
    }

    public RRWebInteractionMoveEvent() {
        super(io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove);
    }

    private void serializeData(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        new io.sentry.rrweb.RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        java.util.List<io.sentry.rrweb.RRWebInteractionMoveEvent.Position> list = this.positions;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(io.sentry.rrweb.RRWebInteractionMoveEvent.JsonKeys.POSITIONS).value(iLogger, this.positions);
        }
        objectWriter.name("pointerId").value(this.pointerId);
        java.util.Map<java.lang.String, java.lang.Object> map = this.dataUnknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.dataUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public java.util.Map<java.lang.String, java.lang.Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public java.util.List<io.sentry.rrweb.RRWebInteractionMoveEvent.Position> getPositions() {
        return this.positions;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        new io.sentry.rrweb.RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setDataUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.dataUnknown = map;
    }

    public void setPointerId(int i3) {
        this.pointerId = i3;
    }

    public void setPositions(java.util.List<io.sentry.rrweb.RRWebInteractionMoveEvent.Position> list) {
        this.positions = list;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
