package io.sentry.rrweb;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

public final class RRWebInteractionEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable, JsonUnknown {
    private static final int POINTER_TYPE_TOUCH = 2;
    private Map<String, Object> dataUnknown;
    private int id;
    private InteractionType interactionType;
    private int pointerId;
    private int pointerType;
    private Map<String, Object> unknown;

    private float f23539x;
    private float y;

    public static final class Deserializer implements JsonDeserializer<RRWebInteractionEvent> {
        private void deserializeData(RRWebInteractionEvent rRWebInteractionEvent, ObjectReader objectReader, ILogger iLogger) {
            RRWebIncrementalSnapshotEvent.Deserializer deserializer = new RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
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
                        rRWebInteractionEvent.interactionType = (InteractionType) objectReader.nextOrNull(iLogger, new InteractionType.Deserializer());
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
                                map = new HashMap();
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

        @Override
        public RRWebInteractionEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebInteractionEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebInteractionEvent;
        }
    }

    public enum InteractionType implements JsonSerializable {
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

        public static final class Deserializer implements JsonDeserializer<InteractionType> {
            @Override
            public InteractionType deserialize(ObjectReader objectReader, ILogger iLogger) {
                return InteractionType.values()[objectReader.nextInt()];
            }
        }

        @Override
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.value(ordinal());
        }
    }

    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String ID = "id";
        public static final String POINTER_ID = "pointerId";
        public static final String POINTER_TYPE = "pointerType";
        public static final String TYPE = "type";
        public static final String X = "x";

        public static final String f23540Y = "y";
    }

    public RRWebInteractionEvent() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction);
        this.pointerType = 2;
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("type").value(iLogger, this.interactionType);
        objectWriter.name("id").value(this.id);
        objectWriter.name("x").value(this.f23539x);
        objectWriter.name("y").value(this.y);
        objectWriter.name(JsonKeys.POINTER_TYPE).value(this.pointerType);
        objectWriter.name("pointerId").value(this.pointerId);
        Map<String, Object> map = this.dataUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.dataUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public int getId() {
        return this.id;
    }

    public InteractionType getInteractionType() {
        return this.interactionType;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public int getPointerType() {
        return this.pointerType;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public float getX() {
        return this.f23539x;
    }

    public float getY() {
        return this.y;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setId(int i3) {
        this.id = i3;
    }

    public void setInteractionType(InteractionType interactionType) {
        this.interactionType = interactionType;
    }

    public void setPointerId(int i3) {
        this.pointerId = i3;
    }

    public void setPointerType(int i3) {
        this.pointerType = i3;
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setX(float f9) {
        this.f23539x = f9;
    }

    public void setY(float f9) {
        this.y = f9;
    }
}
