package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class TransactionInfo implements JsonSerializable, JsonUnknown {
    private final String source;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<TransactionInfo> {
        @Override
        public TransactionInfo deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            String strNextStringOrNull = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("source")) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            TransactionInfo transactionInfo = new TransactionInfo(strNextStringOrNull);
            transactionInfo.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return transactionInfo;
        }
    }

    public static final class JsonKeys {
        public static final String SOURCE = "source";
    }

    public TransactionInfo(String str) {
        this.source = str;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.source != null) {
            objectWriter.name("source").value(iLogger, this.source);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
