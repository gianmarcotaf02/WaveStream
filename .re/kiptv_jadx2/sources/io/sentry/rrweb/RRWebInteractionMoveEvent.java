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
import java.util.List;
import java.util.Map;

public final class RRWebInteractionMoveEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable, JsonUnknown {
    private Map<String, Object> dataUnknown;
    private int pointerId;
    private List<Position> positions;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<RRWebInteractionMoveEvent> {
        private void deserializeData(RRWebInteractionMoveEvent rRWebInteractionMoveEvent, ObjectReader objectReader, ILogger iLogger) {
            RRWebIncrementalSnapshotEvent.Deserializer deserializer = new RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("pointerId")) {
                    rRWebInteractionMoveEvent.pointerId = objectReader.nextInt();
                } else if (strNextName.equals(JsonKeys.POSITIONS)) {
                    rRWebInteractionMoveEvent.positions = objectReader.nextListOrNull(iLogger, new Position.Deserializer());
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setDataUnknown(map);
            objectReader.endObject();
        }

        @Override
        public RRWebInteractionMoveEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebInteractionMoveEvent rRWebInteractionMoveEvent = new RRWebInteractionMoveEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebInteractionMoveEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
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
        public static final String DATA = "data";
        public static final String POINTER_ID = "pointerId";
        public static final String POSITIONS = "positions";
    }

    public static final class Position implements JsonSerializable, JsonUnknown {
        private int id;
        private long timeOffset;
        private Map<String, Object> unknown;

        private float f23541x;
        private float y;

        public static final class Deserializer implements JsonDeserializer<Position> {
            @Override
            public Position deserialize(ObjectReader objectReader, ILogger iLogger) {
                objectReader.beginObject();
                Position position = new Position();
                HashMap map = null;
                while (objectReader.peek() == JsonToken.NAME) {
                    String strNextName = objectReader.nextName();
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
                                map = new HashMap();
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
            public static final String ID = "id";
            public static final String TIME_OFFSET = "timeOffset";
            public static final String X = "x";

            public static final String f23542Y = "y";
        }

        public int getId() {
            return this.id;
        }

        public long getTimeOffset() {
            return this.timeOffset;
        }

        @Override
        public Map<String, Object> getUnknown() {
            return this.unknown;
        }

        public float getX() {
            return this.f23541x;
        }

        public float getY() {
            return this.y;
        }

        @Override
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.beginObject();
            objectWriter.name("id").value(this.id);
            objectWriter.name("x").value(this.f23541x);
            objectWriter.name("y").value(this.y);
            objectWriter.name(JsonKeys.TIME_OFFSET).value(this.timeOffset);
            Map<String, Object> map = this.unknown;
            if (map != null) {
                for (String str : map.keySet()) {
                    M0.x(this.unknown, str, objectWriter, str, iLogger);
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

        @Override
        public void setUnknown(Map<String, Object> map) {
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
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove);
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        List<Position> list = this.positions;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.POSITIONS).value(iLogger, this.positions);
        }
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

    public int getPointerId() {
        return this.pointerId;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
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

    public void setPointerId(int i3) {
        this.pointerId = i3;
    }

    public void setPositions(List<Position> list) {
        this.positions = list;
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
