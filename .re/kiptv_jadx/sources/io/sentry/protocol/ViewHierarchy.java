package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewHierarchy implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private final java.lang.String renderingSystem;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private final java.util.List<io.sentry.protocol.ViewHierarchyNode> windows;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.ViewHierarchy> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.ViewHierarchy deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            java.lang.String strNextStringOrNull = null;
            java.util.List listNextListOrNull = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("rendering_system")) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else if (strNextName.equals(io.sentry.protocol.ViewHierarchy.JsonKeys.WINDOWS)) {
                    listNextListOrNull = objectReader.nextListOrNull(iLogger, new io.sentry.protocol.ViewHierarchyNode.Deserializer());
                } else {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            io.sentry.protocol.ViewHierarchy viewHierarchy = new io.sentry.protocol.ViewHierarchy(strNextStringOrNull, listNextListOrNull);
            viewHierarchy.setUnknown(map);
            return viewHierarchy;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String RENDERING_SYSTEM = "rendering_system";
        public static final java.lang.String WINDOWS = "windows";
    }

    public ViewHierarchy(java.lang.String str, java.util.List<io.sentry.protocol.ViewHierarchyNode> list) {
        this.renderingSystem = str;
        this.windows = list;
    }

    public java.lang.String getRenderingSystem() {
        return this.renderingSystem;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.util.List<io.sentry.protocol.ViewHierarchyNode> getWindows() {
        return this.windows;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.renderingSystem != null) {
            objectWriter.name("rendering_system").value(this.renderingSystem);
        }
        if (this.windows != null) {
            objectWriter.name(io.sentry.protocol.ViewHierarchy.JsonKeys.WINDOWS).value(iLogger, this.windows);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
