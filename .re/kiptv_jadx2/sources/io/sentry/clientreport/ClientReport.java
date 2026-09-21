package io.sentry.clientreport;

import Y6.f;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ClientReport implements JsonUnknown, JsonSerializable {
    private final List<DiscardedEvent> discardedEvents;
    private final Date timestamp;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<ClientReport> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strH = f.h("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strH);
            iLogger.log(SentryLevel.ERROR, strH, illegalStateException);
            return illegalStateException;
        }

        @Override
        public ClientReport deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            objectReader.beginObject();
            Date dateNextDateOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(JsonKeys.DISCARDED_EVENTS)) {
                    arrayList.addAll(objectReader.nextListOrNull(iLogger, new DiscardedEvent.Deserializer()));
                } else if (strNextName.equals("timestamp")) {
                    dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            if (dateNextDateOrNull == null) {
                throw missingRequiredFieldException("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw missingRequiredFieldException(JsonKeys.DISCARDED_EVENTS, iLogger);
            }
            ClientReport clientReport = new ClientReport(dateNextDateOrNull, arrayList);
            clientReport.setUnknown(map);
            return clientReport;
        }
    }

    public static final class JsonKeys {
        public static final String DISCARDED_EVENTS = "discarded_events";
        public static final String TIMESTAMP = "timestamp";
    }

    public ClientReport(Date date, List<DiscardedEvent> list) {
        this.timestamp = date;
        this.discardedEvents = list;
    }

    public List<DiscardedEvent> getDiscardedEvents() {
        return this.discardedEvents;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(DateUtils.getTimestamp(this.timestamp));
        objectWriter.name(JsonKeys.DISCARDED_EVENTS).value(iLogger, this.discardedEvents);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
