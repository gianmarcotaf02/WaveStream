package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class ReplayRecording implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.util.List<? extends io.sentry.rrweb.RRWebEvent> payload;
    private java.lang.Integer segmentId;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    /* JADX INFO: renamed from: io.sentry.ReplayRecording$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$rrweb$RRWebEventType;
        static final /* synthetic */ int[] $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource;

        static {
            int[] iArr = new int[io.sentry.rrweb.RRWebEventType.values().length];
            $SwitchMap$io$sentry$rrweb$RRWebEventType = iArr;
            try {
                iArr[io.sentry.rrweb.RRWebEventType.IncrementalSnapshot.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebEventType[io.sentry.rrweb.RRWebEventType.Meta.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebEventType[io.sentry.rrweb.RRWebEventType.Custom.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource.values().length];
            $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource = iArr2;
            try {
                iArr2[io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource[io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.ReplayRecording> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.ReplayRecording deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.ReplayRecording replayRecording = new io.sentry.ReplayRecording();
            objectReader.beginObject();
            java.util.ArrayList arrayList = null;
            java.util.HashMap map = null;
            java.lang.Integer numNextIntegerOrNull = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("segment_id")) {
                    numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                } else {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            objectReader.setLenient(true);
            java.util.List list = (java.util.List) objectReader.nextObjectOrNull();
            objectReader.setLenient(false);
            if (list != null) {
                arrayList = new java.util.ArrayList(list.size());
                for (java.lang.Object obj : list) {
                    if (obj instanceof java.util.Map) {
                        java.util.Map map2 = (java.util.Map) obj;
                        io.sentry.util.MapObjectReader mapObjectReader = new io.sentry.util.MapObjectReader(map2);
                        for (java.util.Map.Entry entry : map2.entrySet()) {
                            java.lang.String str = (java.lang.String) entry.getKey();
                            java.lang.Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.RRWebEventType rRWebEventType = io.sentry.rrweb.RRWebEventType.values()[((java.lang.Integer) value).intValue()];
                                int i3 = io.sentry.ReplayRecording.AnonymousClass1.$SwitchMap$io$sentry$rrweb$RRWebEventType[rRWebEventType.ordinal()];
                                if (i3 == 1) {
                                    java.util.Map map3 = (java.util.Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = java.util.Collections.EMPTY_MAP;
                                    }
                                    java.lang.Integer num = (java.lang.Integer) map3.get("source");
                                    if (num != null) {
                                        io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource incrementalSource = io.sentry.rrweb.RRWebIncrementalSnapshotEvent.IncrementalSource.values()[num.intValue()];
                                        int i9 = io.sentry.ReplayRecording.AnonymousClass1.$SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource[incrementalSource.ordinal()];
                                        if (i9 == 1) {
                                            arrayList.add(new io.sentry.rrweb.RRWebInteractionEvent.Deserializer().deserialize((io.sentry.ObjectReader) mapObjectReader, iLogger));
                                        } else if (i9 != 2) {
                                            iLogger.log(io.sentry.SentryLevel.DEBUG, "Unsupported rrweb incremental snapshot type %s", incrementalSource);
                                        } else {
                                            arrayList.add(new io.sentry.rrweb.RRWebInteractionMoveEvent.Deserializer().deserialize((io.sentry.ObjectReader) mapObjectReader, iLogger));
                                        }
                                    }
                                } else if (i3 == 2) {
                                    arrayList.add(new io.sentry.rrweb.RRWebMetaEvent.Deserializer().deserialize((io.sentry.ObjectReader) mapObjectReader, iLogger));
                                } else if (i3 != 3) {
                                    iLogger.log(io.sentry.SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                } else {
                                    java.util.Map map4 = (java.util.Map) map2.get("data");
                                    if (map4 == null) {
                                        map4 = java.util.Collections.EMPTY_MAP;
                                    }
                                    java.lang.String str2 = (java.lang.String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(new io.sentry.rrweb.RRWebSpanEvent.Deserializer().deserialize((io.sentry.ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            case "video":
                                                arrayList.add(new io.sentry.rrweb.RRWebVideoEvent.Deserializer().deserialize((io.sentry.ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(new io.sentry.rrweb.RRWebBreadcrumbEvent.Deserializer().deserialize((io.sentry.ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            default:
                                                iLogger.log(io.sentry.SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            replayRecording.setSegmentId(numNextIntegerOrNull);
            replayRecording.setPayload(arrayList);
            replayRecording.setUnknown(map);
            return replayRecording;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String SEGMENT_ID = "segment_id";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.ReplayRecording.class == obj.getClass()) {
            io.sentry.ReplayRecording replayRecording = (io.sentry.ReplayRecording) obj;
            if (io.sentry.util.Objects.equals(this.segmentId, replayRecording.segmentId) && io.sentry.util.Objects.equals(this.payload, replayRecording.payload)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List<? extends io.sentry.rrweb.RRWebEvent> getPayload() {
        return this.payload;
    }

    public java.lang.Integer getSegmentId() {
        return this.segmentId;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.segmentId, this.payload);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.segmentId != null) {
            objectWriter.name("segment_id").value(this.segmentId);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
        objectWriter.setLenient(true);
        if (this.segmentId != null) {
            objectWriter.jsonValue("\n");
        }
        java.util.List<? extends io.sentry.rrweb.RRWebEvent> list = this.payload;
        if (list != null) {
            objectWriter.value(iLogger, list);
        }
        objectWriter.setLenient(false);
    }

    public void setPayload(java.util.List<? extends io.sentry.rrweb.RRWebEvent> list) {
        this.payload = list;
    }

    public void setSegmentId(java.lang.Integer num) {
        this.segmentId = num;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
