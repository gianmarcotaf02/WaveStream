package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewHierarchyNode implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.Double alpha;
    private java.util.List<io.sentry.protocol.ViewHierarchyNode> children;
    private java.lang.Double height;
    private java.lang.String identifier;
    private java.lang.String renderingSystem;
    private java.lang.String tag;
    private java.lang.String type;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String visibility;
    private java.lang.Double width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private java.lang.Double f23528x;
    private java.lang.Double y;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.ViewHierarchyNode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.ViewHierarchyNode deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.ViewHierarchyNode viewHierarchyNode = new io.sentry.protocol.ViewHierarchyNode();
            objectReader.beginObject();
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "rendering_system":
                        viewHierarchyNode.renderingSystem = objectReader.nextStringOrNull();
                        break;
                    case "identifier":
                        viewHierarchyNode.identifier = objectReader.nextStringOrNull();
                        break;
                    case "height":
                        viewHierarchyNode.height = objectReader.nextDoubleOrNull();
                        break;
                    case "x":
                        viewHierarchyNode.f23528x = objectReader.nextDoubleOrNull();
                        break;
                    case "y":
                        viewHierarchyNode.y = objectReader.nextDoubleOrNull();
                        break;
                    case "tag":
                        viewHierarchyNode.tag = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        viewHierarchyNode.type = objectReader.nextStringOrNull();
                        break;
                    case "alpha":
                        viewHierarchyNode.alpha = objectReader.nextDoubleOrNull();
                        break;
                    case "width":
                        viewHierarchyNode.width = objectReader.nextDoubleOrNull();
                        break;
                    case "children":
                        viewHierarchyNode.children = objectReader.nextListOrNull(iLogger, this);
                        break;
                    case "visibility":
                        viewHierarchyNode.visibility = objectReader.nextStringOrNull();
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
            viewHierarchyNode.setUnknown(map);
            return viewHierarchyNode;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ALPHA = "alpha";
        public static final java.lang.String CHILDREN = "children";
        public static final java.lang.String HEIGHT = "height";
        public static final java.lang.String IDENTIFIER = "identifier";
        public static final java.lang.String RENDERING_SYSTEM = "rendering_system";
        public static final java.lang.String TAG = "tag";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String VISIBILITY = "visibility";
        public static final java.lang.String WIDTH = "width";
        public static final java.lang.String X = "x";

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final java.lang.String f23529Y = "y";
    }

    public java.lang.Double getAlpha() {
        return this.alpha;
    }

    public java.util.List<io.sentry.protocol.ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public java.lang.Double getHeight() {
        return this.height;
    }

    public java.lang.String getIdentifier() {
        return this.identifier;
    }

    public java.lang.String getRenderingSystem() {
        return this.renderingSystem;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public java.lang.String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getVisibility() {
        return this.visibility;
    }

    public java.lang.Double getWidth() {
        return this.width;
    }

    public java.lang.Double getX() {
        return this.f23528x;
    }

    public java.lang.Double getY() {
        return this.y;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.renderingSystem != null) {
            objectWriter.name("rendering_system").value(this.renderingSystem);
        }
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.identifier != null) {
            objectWriter.name(io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER).value(this.identifier);
        }
        if (this.tag != null) {
            objectWriter.name("tag").value(this.tag);
        }
        if (this.width != null) {
            objectWriter.name("width").value(this.width);
        }
        if (this.height != null) {
            objectWriter.name("height").value(this.height);
        }
        if (this.f23528x != null) {
            objectWriter.name("x").value(this.f23528x);
        }
        if (this.y != null) {
            objectWriter.name("y").value(this.y);
        }
        if (this.visibility != null) {
            objectWriter.name(io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY).value(this.visibility);
        }
        if (this.alpha != null) {
            objectWriter.name(io.sentry.protocol.ViewHierarchyNode.JsonKeys.ALPHA).value(this.alpha);
        }
        java.util.List<io.sentry.protocol.ViewHierarchyNode> list = this.children;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(io.sentry.protocol.ViewHierarchyNode.JsonKeys.CHILDREN).value(iLogger, this.children);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAlpha(java.lang.Double d4) {
        this.alpha = d4;
    }

    public void setChildren(java.util.List<io.sentry.protocol.ViewHierarchyNode> list) {
        this.children = list;
    }

    public void setHeight(java.lang.Double d4) {
        this.height = d4;
    }

    public void setIdentifier(java.lang.String str) {
        this.identifier = str;
    }

    public void setRenderingSystem(java.lang.String str) {
        this.renderingSystem = str;
    }

    public void setTag(java.lang.String str) {
        this.tag = str;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setVisibility(java.lang.String str) {
        this.visibility = str;
    }

    public void setWidth(java.lang.Double d4) {
        this.width = d4;
    }

    public void setX(java.lang.Double d4) {
        this.f23528x = d4;
    }

    public void setY(java.lang.Double d4) {
        this.y = d4;
    }
}
