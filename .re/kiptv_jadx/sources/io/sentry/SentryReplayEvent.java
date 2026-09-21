package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryReplayEvent extends io.sentry.SentryBaseEvent implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String REPLAY_EVENT_TYPE = "replay_event";
    public static final long REPLAY_VIDEO_MAX_SIZE = 10485760;
    private java.util.Date replayStartTimestamp;
    private int segmentId;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.io.File videoFile;
    private io.sentry.protocol.SentryId replayId = new io.sentry.protocol.SentryId();
    private java.lang.String type = REPLAY_EVENT_TYPE;
    private io.sentry.SentryReplayEvent.ReplayType replayType = io.sentry.SentryReplayEvent.ReplayType.SESSION;
    private java.util.List<java.lang.String> errorIds = new java.util.ArrayList();
    private java.util.List<java.lang.String> traceIds = new java.util.ArrayList();
    private java.util.List<java.lang.String> urls = new java.util.ArrayList();
    private java.util.Date timestamp = io.sentry.DateUtils.getCurrentDateTime();

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryReplayEvent> {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:7:0x0031  */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SentryReplayEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.SentryBaseEvent.Deserializer deserializer = new io.sentry.SentryBaseEvent.Deserializer();
            io.sentry.SentryReplayEvent sentryReplayEvent = new io.sentry.SentryReplayEvent();
            objectReader.beginObject();
            java.lang.String strNextStringOrNull = null;
            io.sentry.SentryReplayEvent.ReplayType replayType = null;
            java.lang.Integer numNextIntegerOrNull = null;
            java.util.Date dateNextDateOrNull = null;
            java.util.HashMap map = null;
            io.sentry.protocol.SentryId sentryId = null;
            java.util.Date dateNextDateOrNull2 = null;
            java.util.List<java.lang.String> list = null;
            java.util.List<java.lang.String> list2 = null;
            java.util.List<java.lang.String> list3 = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "replay_id":
                        sentryId = (io.sentry.protocol.SentryId) objectReader.nextOrNull(iLogger, new io.sentry.protocol.SentryId.Deserializer());
                        break;
                    case "replay_start_timestamp":
                        dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "type":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "urls":
                        list = (java.util.List) objectReader.nextObjectOrNull();
                        break;
                    case "timestamp":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "error_ids":
                        list2 = (java.util.List) objectReader.nextObjectOrNull();
                        break;
                    case "trace_ids":
                        list3 = (java.util.List) objectReader.nextObjectOrNull();
                        break;
                    case "replay_type":
                        replayType = (io.sentry.SentryReplayEvent.ReplayType) objectReader.nextOrNull(iLogger, new io.sentry.SentryReplayEvent.ReplayType.Deserializer());
                        break;
                    case "segment_id":
                        numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (!deserializer.deserializeValue(sentryReplayEvent, strNextName, objectReader, iLogger)) {
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
            objectReader.endObject();
            if (strNextStringOrNull != null) {
                sentryReplayEvent.setType(strNextStringOrNull);
            }
            if (replayType != null) {
                sentryReplayEvent.setReplayType(replayType);
            }
            if (numNextIntegerOrNull != null) {
                sentryReplayEvent.setSegmentId(numNextIntegerOrNull.intValue());
            }
            if (dateNextDateOrNull != null) {
                sentryReplayEvent.setTimestamp(dateNextDateOrNull);
            }
            sentryReplayEvent.setReplayId(sentryId);
            sentryReplayEvent.setReplayStartTimestamp(dateNextDateOrNull2);
            sentryReplayEvent.setUrls(list);
            sentryReplayEvent.setErrorIds(list2);
            sentryReplayEvent.setTraceIds(list3);
            sentryReplayEvent.setUnknown(map);
            return sentryReplayEvent;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ERROR_IDS = "error_ids";
        public static final java.lang.String REPLAY_ID = "replay_id";
        public static final java.lang.String REPLAY_START_TIMESTAMP = "replay_start_timestamp";
        public static final java.lang.String REPLAY_TYPE = "replay_type";
        public static final java.lang.String SEGMENT_ID = "segment_id";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TRACE_IDS = "trace_ids";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String URLS = "urls";
    }

    public enum ReplayType implements io.sentry.JsonSerializable {
        SESSION,
        BUFFER;

        public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryReplayEvent.ReplayType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public io.sentry.SentryReplayEvent.ReplayType deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
                return io.sentry.SentryReplayEvent.ReplayType.valueOf(objectReader.nextString().toUpperCase(java.util.Locale.ROOT));
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
            objectWriter.value(name().toLowerCase(java.util.Locale.ROOT));
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.SentryReplayEvent.class == obj.getClass()) {
            io.sentry.SentryReplayEvent sentryReplayEvent = (io.sentry.SentryReplayEvent) obj;
            if (this.segmentId == sentryReplayEvent.segmentId && io.sentry.util.Objects.equals(this.type, sentryReplayEvent.type) && this.replayType == sentryReplayEvent.replayType && io.sentry.util.Objects.equals(this.replayId, sentryReplayEvent.replayId) && io.sentry.util.Objects.equals(this.urls, sentryReplayEvent.urls) && io.sentry.util.Objects.equals(this.errorIds, sentryReplayEvent.errorIds) && io.sentry.util.Objects.equals(this.traceIds, sentryReplayEvent.traceIds)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List<java.lang.String> getErrorIds() {
        return this.errorIds;
    }

    public io.sentry.protocol.SentryId getReplayId() {
        return this.replayId;
    }

    public java.util.Date getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    public io.sentry.SentryReplayEvent.ReplayType getReplayType() {
        return this.replayType;
    }

    public int getSegmentId() {
        return this.segmentId;
    }

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    public java.util.List<java.lang.String> getTraceIds() {
        return this.traceIds;
    }

    public java.lang.String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.util.List<java.lang.String> getUrls() {
        return this.urls;
    }

    public java.io.File getVideoFile() {
        return this.videoFile;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.type, this.replayType, this.replayId, java.lang.Integer.valueOf(this.segmentId), this.urls, this.errorIds, this.traceIds);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("type").value(this.type);
        objectWriter.name(io.sentry.SentryReplayEvent.JsonKeys.REPLAY_TYPE).value(iLogger, this.replayType);
        objectWriter.name("segment_id").value(this.segmentId);
        objectWriter.name("timestamp").value(iLogger, this.timestamp);
        if (this.replayId != null) {
            objectWriter.name("replay_id").value(iLogger, this.replayId);
        }
        if (this.replayStartTimestamp != null) {
            objectWriter.name(io.sentry.SentryReplayEvent.JsonKeys.REPLAY_START_TIMESTAMP).value(iLogger, this.replayStartTimestamp);
        }
        if (this.urls != null) {
            objectWriter.name(io.sentry.SentryReplayEvent.JsonKeys.URLS).value(iLogger, this.urls);
        }
        if (this.errorIds != null) {
            objectWriter.name(io.sentry.SentryReplayEvent.JsonKeys.ERROR_IDS).value(iLogger, this.errorIds);
        }
        if (this.traceIds != null) {
            objectWriter.name(io.sentry.SentryReplayEvent.JsonKeys.TRACE_IDS).value(iLogger, this.traceIds);
        }
        new io.sentry.SentryBaseEvent.Serializer().serialize(this, objectWriter, iLogger);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setErrorIds(java.util.List<java.lang.String> list) {
        this.errorIds = list;
    }

    public void setReplayId(io.sentry.protocol.SentryId sentryId) {
        this.replayId = sentryId;
    }

    public void setReplayStartTimestamp(java.util.Date date) {
        this.replayStartTimestamp = date;
    }

    public void setReplayType(io.sentry.SentryReplayEvent.ReplayType replayType) {
        this.replayType = replayType;
    }

    public void setSegmentId(int i3) {
        this.segmentId = i3;
    }

    public void setTimestamp(java.util.Date date) {
        this.timestamp = date;
    }

    public void setTraceIds(java.util.List<java.lang.String> list) {
        this.traceIds = list;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setUrls(java.util.List<java.lang.String> list) {
        this.urls = list;
    }

    public void setVideoFile(java.io.File file) {
        this.videoFile = file;
    }
}
