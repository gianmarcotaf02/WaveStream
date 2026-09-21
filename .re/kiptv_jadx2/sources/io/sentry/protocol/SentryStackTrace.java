package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class SentryStackTrace implements JsonUnknown, JsonSerializable {
    private List<SentryStackFrame> frames;
    private Map<String, String> registers;
    private Boolean snapshot;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<SentryStackTrace> {
        @Override
        public SentryStackTrace deserialize(ObjectReader objectReader, ILogger iLogger) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace();
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "frames":
                        sentryStackTrace.frames = objectReader.nextListOrNull(iLogger, new SentryStackFrame.Deserializer());
                        break;
                    case "registers":
                        sentryStackTrace.registers = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "snapshot":
                        sentryStackTrace.snapshot = objectReader.nextBooleanOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryStackTrace.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryStackTrace;
        }
    }

    public static final class JsonKeys {
        public static final String FRAMES = "frames";
        public static final String REGISTERS = "registers";
        public static final String SNAPSHOT = "snapshot";
    }

    public SentryStackTrace() {
    }

    public List<SentryStackFrame> getFrames() {
        return this.frames;
    }

    public Map<String, String> getRegisters() {
        return this.registers;
    }

    public Boolean getSnapshot() {
        return this.snapshot;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.frames != null) {
            objectWriter.name(JsonKeys.FRAMES).value(iLogger, this.frames);
        }
        if (this.registers != null) {
            objectWriter.name(JsonKeys.REGISTERS).value(iLogger, this.registers);
        }
        if (this.snapshot != null) {
            objectWriter.name(JsonKeys.SNAPSHOT).value(this.snapshot);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setFrames(List<SentryStackFrame> list) {
        this.frames = list;
    }

    public void setRegisters(Map<String, String> map) {
        this.registers = map;
    }

    public void setSnapshot(Boolean bool) {
        this.snapshot = bool;
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryStackTrace(List<SentryStackFrame> list) {
        this.frames = list;
    }
}
