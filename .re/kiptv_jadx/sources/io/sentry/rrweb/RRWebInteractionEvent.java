package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public final class RRWebInteractionEvent extends io.sentry.rrweb.RRWebIncrementalSnapshotEvent implements io.sentry.JsonSerializable, io.sentry.JsonUnknown {
    private static final int POINTER_TYPE_TOUCH = 2;
    private java.util.Map<java.lang.String, java.lang.Object> dataUnknown;
    private int id;
    private io.sentry.rrweb.RRWebInteractionEvent.InteractionType interactionType;
    private int pointerId;
    private int pointerType;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f23539x;
    private float y;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebInteractionEvent> {
        private void deserializeData(io.sentry.rrweb.RRWebInteractionEvent rRWebInteractionEvent, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.rrweb.RRWebIncrementalSnapshotEvent.Deserializer deserializer = new io.sentry.rrweb.RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "x":
                        rRWebInteractionEvent.f23539x = objectReader.nextFloat();
                        break;
                    case "y":
                        rRWebInteractionEvent.y = objectReader.nextFloat();
                        break;
                    case "id":
                        rRWebInteractionEvent.id = objectReader.nextInt();
                        break;
                    case "type":
                        rRWebInteractionEvent.interactionType = (io.sentry.rrweb.RRWebInteractionEvent.InteractionType) objectReader.nextOrNull(iLogger, new io.sentry.rrweb.RRWebInteractionEvent.InteractionType.Deserializer());
                        break;
                    case "pointerType":
                        rRWebInteractionEvent.pointerType = objectReader.nextInt();
                        break;
                    case "pointerId":
                        rRWebInteractionEvent.pointerId = objectReader.nextInt();
                        break;
                    default:
                        if (!deserializer.deserializeValue(rRWebInteractionEvent, strNextName, objectReader, iLogger)) {
                            if (map == null) {
                                map = new java.util.HashMap();
                            }
                            objectReader.nextUnknown(iLogger, map, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            rRWebInteractionEvent.setDataUnknown(map);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.rrweb.RRWebInteractionEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.rrweb.RRWebInteractionEvent rRWebInteractionEvent = new io.sentry.rrweb.RRWebInteractionEvent();
            io.sentry.rrweb.RRWebEvent.Deserializer deserializer = new io.sentry.rrweb.RRWebEvent.Deserializer();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebInteractionEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebInteractionEvent;
        }
    }

    public enum InteractionType implements io.sentry.JsonSerializable {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebInteractionEvent.InteractionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public io.sentry.rrweb.RRWebInteractionEvent.InteractionType deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
                return io.sentry.rrweb.RRWebInteractionEvent.InteractionType.values()[objectReader.nextInt()];
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
            objectWriter.value(ordinal());
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String DATA = "data";
        public static final java.lang.String ID = "id";
        public static final java.lang.String POINTER_ID = "pointerId";
        public static final java.lang.String POINTER_TYPE = "pointerType";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String X = "x";

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final java.lang.String f23540Y = "y";
    }

    public RRWebInteractionEvent() {
        super(io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction);
        this.pointerType = 2;
    }

    private void serializeData(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        new io.sentry.rrweb.RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("type").value(iLogger, this.interactionType);
        objectWriter.name("id").value(this.id);
        objectWriter.name("x").value(this.f23539x);
        objectWriter.name("y").value(this.y);
        objectWriter.name(io.sentry.rrweb.RRWebInteractionEvent.JsonKeys.POINTER_TYPE).value(this.pointerType);
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

    public int getId() {
        return this.id;
    }

    public io.sentry.rrweb.RRWebInteractionEvent.InteractionType getInteractionType() {
        return this.interactionType;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public int getPointerType() {
        return this.pointerType;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public float getX() {
        return this.f23539x;
    }

    public float getY() {
        return this.y;
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

    public void setId(int i3) {
        this.id = i3;
    }

    public void setInteractionType(io.sentry.rrweb.RRWebInteractionEvent.InteractionType interactionType) {
        this.interactionType = interactionType;
    }

    public void setPointerId(int i3) {
        this.pointerId = i3;
    }

    public void setPointerType(int i3) {
        this.pointerType = i3;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setX(float f9) {
        this.f23539x = f9;
    }

    public void setY(float f9) {
        this.y = f9;
    }
}
