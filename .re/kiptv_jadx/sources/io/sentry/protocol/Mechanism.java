package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Mechanism implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.util.Map<java.lang.String, java.lang.Object> data;
    private java.lang.String description;
    private java.lang.Boolean exceptionGroup;
    private java.lang.Integer exceptionId;
    private java.lang.Boolean handled;
    private java.lang.String helpLink;
    private java.util.Map<java.lang.String, java.lang.Object> meta;
    private java.lang.Integer parentId;
    private java.lang.Boolean synthetic;
    private final transient java.lang.Thread thread;
    private java.lang.String type;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Mechanism> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Mechanism deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.Mechanism mechanism = new io.sentry.protocol.Mechanism();
            objectReader.beginObject();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "description":
                        mechanism.description = objectReader.nextStringOrNull();
                        break;
                    case "exception_id":
                        mechanism.exceptionId = objectReader.nextIntegerOrNull();
                        break;
                    case "data":
                        mechanism.data = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        break;
                    case "meta":
                        mechanism.meta = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        break;
                    case "type":
                        mechanism.type = objectReader.nextStringOrNull();
                        break;
                    case "handled":
                        mechanism.handled = objectReader.nextBooleanOrNull();
                        break;
                    case "synthetic":
                        mechanism.synthetic = objectReader.nextBooleanOrNull();
                        break;
                    case "is_exception_group":
                        mechanism.exceptionGroup = objectReader.nextBooleanOrNull();
                        break;
                    case "help_link":
                        mechanism.helpLink = objectReader.nextStringOrNull();
                        break;
                    case "parent_id":
                        mechanism.parentId = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new java.util.HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            mechanism.setUnknown(map);
            return mechanism;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String DATA = "data";
        public static final java.lang.String DESCRIPTION = "description";
        public static final java.lang.String EXCEPTION_ID = "exception_id";
        public static final java.lang.String HANDLED = "handled";
        public static final java.lang.String HELP_LINK = "help_link";
        public static final java.lang.String IS_EXCEPTION_GROUP = "is_exception_group";
        public static final java.lang.String META = "meta";
        public static final java.lang.String PARENT_ID = "parent_id";
        public static final java.lang.String SYNTHETIC = "synthetic";
        public static final java.lang.String TYPE = "type";
    }

    public Mechanism() {
        this(null);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.Integer getExceptionId() {
        return this.exceptionId;
    }

    public java.lang.String getHelpLink() {
        return this.helpLink;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMeta() {
        return this.meta;
    }

    public java.lang.Integer getParentId() {
        return this.parentId;
    }

    public java.lang.Boolean getSynthetic() {
        return this.synthetic;
    }

    public java.lang.Thread getThread() {
        return this.thread;
    }

    public java.lang.String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.Boolean isExceptionGroup() {
        return this.exceptionGroup;
    }

    public java.lang.Boolean isHandled() {
        return this.handled;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        if (this.helpLink != null) {
            objectWriter.name(io.sentry.protocol.Mechanism.JsonKeys.HELP_LINK).value(this.helpLink);
        }
        if (this.handled != null) {
            objectWriter.name(io.sentry.protocol.Mechanism.JsonKeys.HANDLED).value(this.handled);
        }
        if (this.meta != null) {
            objectWriter.name(io.sentry.protocol.Mechanism.JsonKeys.META).value(iLogger, this.meta);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (this.synthetic != null) {
            objectWriter.name(io.sentry.protocol.Mechanism.JsonKeys.SYNTHETIC).value(this.synthetic);
        }
        if (this.exceptionId != null) {
            objectWriter.name(io.sentry.protocol.Mechanism.JsonKeys.EXCEPTION_ID).value(iLogger, this.exceptionId);
        }
        if (this.parentId != null) {
            objectWriter.name(io.sentry.protocol.Mechanism.JsonKeys.PARENT_ID).value(iLogger, this.parentId);
        }
        if (this.exceptionGroup != null) {
            objectWriter.name(io.sentry.protocol.Mechanism.JsonKeys.IS_EXCEPTION_GROUP).value(this.exceptionGroup);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setData(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.data = io.sentry.util.CollectionUtils.newHashMap(map);
    }

    public void setDescription(java.lang.String str) {
        this.description = str;
    }

    public void setExceptionGroup(java.lang.Boolean bool) {
        this.exceptionGroup = bool;
    }

    public void setExceptionId(java.lang.Integer num) {
        this.exceptionId = num;
    }

    public void setHandled(java.lang.Boolean bool) {
        this.handled = bool;
    }

    public void setHelpLink(java.lang.String str) {
        this.helpLink = str;
    }

    public void setMeta(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.meta = io.sentry.util.CollectionUtils.newHashMap(map);
    }

    public void setParentId(java.lang.Integer num) {
        this.parentId = num;
    }

    public void setSynthetic(java.lang.Boolean bool) {
        this.synthetic = bool;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public Mechanism(java.lang.Thread thread) {
        this.thread = thread;
    }
}
