package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SentryBaseEvent {
    public static final java.lang.String DEFAULT_PLATFORM = "java";
    private java.util.List<io.sentry.Breadcrumb> breadcrumbs;
    private final io.sentry.protocol.Contexts contexts;
    private io.sentry.protocol.DebugMeta debugMeta;
    private java.lang.String dist;
    private java.lang.String environment;
    private io.sentry.protocol.SentryId eventId;
    private java.util.Map<java.lang.String, java.lang.Object> extra;
    private java.lang.String platform;
    private java.lang.String release;
    private io.sentry.protocol.Request request;
    private io.sentry.protocol.SdkVersion sdk;
    private java.lang.String serverName;
    private java.util.Map<java.lang.String, java.lang.String> tags;
    protected transient java.lang.Throwable throwable;
    private io.sentry.protocol.User user;

    public static final class Deserializer {
        public boolean deserializeValue(io.sentry.SentryBaseEvent sentryBaseEvent, java.lang.String str, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            str.getClass();
            switch (str) {
                case "debug_meta":
                    sentryBaseEvent.debugMeta = (io.sentry.protocol.DebugMeta) objectReader.nextOrNull(iLogger, new io.sentry.protocol.DebugMeta.Deserializer());
                    return true;
                case "server_name":
                    sentryBaseEvent.serverName = objectReader.nextStringOrNull();
                    return true;
                case "contexts":
                    sentryBaseEvent.contexts.putAll(new io.sentry.protocol.Contexts.Deserializer().deserialize(objectReader, iLogger));
                    return true;
                case "environment":
                    sentryBaseEvent.environment = objectReader.nextStringOrNull();
                    return true;
                case "breadcrumbs":
                    sentryBaseEvent.breadcrumbs = objectReader.nextListOrNull(iLogger, new io.sentry.Breadcrumb.Deserializer());
                    return true;
                case "sdk":
                    sentryBaseEvent.sdk = (io.sentry.protocol.SdkVersion) objectReader.nextOrNull(iLogger, new io.sentry.protocol.SdkVersion.Deserializer());
                    return true;
                case "dist":
                    sentryBaseEvent.dist = objectReader.nextStringOrNull();
                    return true;
                case "tags":
                    sentryBaseEvent.tags = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                    return true;
                case "user":
                    sentryBaseEvent.user = (io.sentry.protocol.User) objectReader.nextOrNull(iLogger, new io.sentry.protocol.User.Deserializer());
                    return true;
                case "extra":
                    sentryBaseEvent.extra = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                    return true;
                case "event_id":
                    sentryBaseEvent.eventId = (io.sentry.protocol.SentryId) objectReader.nextOrNull(iLogger, new io.sentry.protocol.SentryId.Deserializer());
                    return true;
                case "release":
                    sentryBaseEvent.release = objectReader.nextStringOrNull();
                    return true;
                case "request":
                    sentryBaseEvent.request = (io.sentry.protocol.Request) objectReader.nextOrNull(iLogger, new io.sentry.protocol.Request.Deserializer());
                    return true;
                case "platform":
                    sentryBaseEvent.platform = objectReader.nextStringOrNull();
                    return true;
                default:
                    return false;
            }
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String BREADCRUMBS = "breadcrumbs";
        public static final java.lang.String CONTEXTS = "contexts";
        public static final java.lang.String DEBUG_META = "debug_meta";
        public static final java.lang.String DIST = "dist";
        public static final java.lang.String ENVIRONMENT = "environment";
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String EXTRA = "extra";
        public static final java.lang.String PLATFORM = "platform";
        public static final java.lang.String RELEASE = "release";
        public static final java.lang.String REQUEST = "request";
        public static final java.lang.String SDK = "sdk";
        public static final java.lang.String SERVER_NAME = "server_name";
        public static final java.lang.String TAGS = "tags";
        public static final java.lang.String USER = "user";
    }

    public static final class Serializer {
        public void serialize(io.sentry.SentryBaseEvent sentryBaseEvent, io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
            if (sentryBaseEvent.eventId != null) {
                objectWriter.name("event_id").value(iLogger, sentryBaseEvent.eventId);
            }
            objectWriter.name("contexts").value(iLogger, sentryBaseEvent.contexts);
            if (sentryBaseEvent.sdk != null) {
                objectWriter.name("sdk").value(iLogger, sentryBaseEvent.sdk);
            }
            if (sentryBaseEvent.request != null) {
                objectWriter.name(io.sentry.SentryBaseEvent.JsonKeys.REQUEST).value(iLogger, sentryBaseEvent.request);
            }
            if (sentryBaseEvent.tags != null && !sentryBaseEvent.tags.isEmpty()) {
                objectWriter.name("tags").value(iLogger, sentryBaseEvent.tags);
            }
            if (sentryBaseEvent.release != null) {
                objectWriter.name("release").value(sentryBaseEvent.release);
            }
            if (sentryBaseEvent.environment != null) {
                objectWriter.name("environment").value(sentryBaseEvent.environment);
            }
            if (sentryBaseEvent.platform != null) {
                objectWriter.name("platform").value(sentryBaseEvent.platform);
            }
            if (sentryBaseEvent.user != null) {
                objectWriter.name(io.sentry.SentryBaseEvent.JsonKeys.USER).value(iLogger, sentryBaseEvent.user);
            }
            if (sentryBaseEvent.serverName != null) {
                objectWriter.name(io.sentry.SentryBaseEvent.JsonKeys.SERVER_NAME).value(sentryBaseEvent.serverName);
            }
            if (sentryBaseEvent.dist != null) {
                objectWriter.name(io.sentry.SentryBaseEvent.JsonKeys.DIST).value(sentryBaseEvent.dist);
            }
            if (sentryBaseEvent.breadcrumbs != null && !sentryBaseEvent.breadcrumbs.isEmpty()) {
                objectWriter.name(io.sentry.SentryBaseEvent.JsonKeys.BREADCRUMBS).value(iLogger, sentryBaseEvent.breadcrumbs);
            }
            if (sentryBaseEvent.debugMeta != null) {
                objectWriter.name(io.sentry.SentryBaseEvent.JsonKeys.DEBUG_META).value(iLogger, sentryBaseEvent.debugMeta);
            }
            if (sentryBaseEvent.extra == null || sentryBaseEvent.extra.isEmpty()) {
                return;
            }
            objectWriter.name(io.sentry.SentryBaseEvent.JsonKeys.EXTRA).value(iLogger, sentryBaseEvent.extra);
        }
    }

    public SentryBaseEvent(io.sentry.protocol.SentryId sentryId) {
        this.contexts = new io.sentry.protocol.Contexts();
        this.eventId = sentryId;
    }

    public void addBreadcrumb(io.sentry.Breadcrumb breadcrumb) {
        if (this.breadcrumbs == null) {
            this.breadcrumbs = new java.util.ArrayList();
        }
        this.breadcrumbs.add(breadcrumb);
    }

    public java.util.List<io.sentry.Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public io.sentry.protocol.Contexts getContexts() {
        return this.contexts;
    }

    public io.sentry.protocol.DebugMeta getDebugMeta() {
        return this.debugMeta;
    }

    public java.lang.String getDist() {
        return this.dist;
    }

    public java.lang.String getEnvironment() {
        return this.environment;
    }

    public io.sentry.protocol.SentryId getEventId() {
        return this.eventId;
    }

    public java.lang.Object getExtra(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extra;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getExtras() {
        return this.extra;
    }

    public java.lang.String getPlatform() {
        return this.platform;
    }

    public java.lang.String getRelease() {
        return this.release;
    }

    public io.sentry.protocol.Request getRequest() {
        return this.request;
    }

    public io.sentry.protocol.SdkVersion getSdk() {
        return this.sdk;
    }

    public java.lang.String getServerName() {
        return this.serverName;
    }

    public java.lang.String getTag(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> map = this.tags;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.String> getTags() {
        return this.tags;
    }

    public java.lang.Throwable getThrowable() {
        java.lang.Throwable th = this.throwable;
        return th instanceof io.sentry.exception.ExceptionMechanismException ? ((io.sentry.exception.ExceptionMechanismException) th).getThrowable() : th;
    }

    public java.lang.Throwable getThrowableMechanism() {
        return this.throwable;
    }

    public io.sentry.protocol.User getUser() {
        return this.user;
    }

    public void removeExtra(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extra;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void removeTag(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> map = this.tags;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void setBreadcrumbs(java.util.List<io.sentry.Breadcrumb> list) {
        this.breadcrumbs = io.sentry.util.CollectionUtils.newArrayList(list);
    }

    public void setDebugMeta(io.sentry.protocol.DebugMeta debugMeta) {
        this.debugMeta = debugMeta;
    }

    public void setDist(java.lang.String str) {
        this.dist = str;
    }

    public void setEnvironment(java.lang.String str) {
        this.environment = str;
    }

    public void setEventId(io.sentry.protocol.SentryId sentryId) {
        this.eventId = sentryId;
    }

    public void setExtra(java.lang.String str, java.lang.Object obj) {
        if (this.extra == null) {
            this.extra = new java.util.HashMap();
        }
        if (str == null) {
            return;
        }
        if (obj == null) {
            removeExtra(str);
        } else {
            this.extra.put(str, obj);
        }
    }

    public void setExtras(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.extra = io.sentry.util.CollectionUtils.newHashMap(map);
    }

    public void setPlatform(java.lang.String str) {
        this.platform = str;
    }

    public void setRelease(java.lang.String str) {
        this.release = str;
    }

    public void setRequest(io.sentry.protocol.Request request) {
        this.request = request;
    }

    public void setSdk(io.sentry.protocol.SdkVersion sdkVersion) {
        this.sdk = sdkVersion;
    }

    public void setServerName(java.lang.String str) {
        this.serverName = str;
    }

    public void setTag(java.lang.String str, java.lang.String str2) {
        if (this.tags == null) {
            this.tags = new java.util.HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeTag(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setTags(java.util.Map<java.lang.String, java.lang.String> map) {
        this.tags = io.sentry.util.CollectionUtils.newHashMap(map);
    }

    public void setThrowable(java.lang.Throwable th) {
        this.throwable = th;
    }

    public void setUser(io.sentry.protocol.User user) {
        this.user = user;
    }

    public SentryBaseEvent() {
        this(new io.sentry.protocol.SentryId());
    }

    public void addBreadcrumb(java.lang.String str) {
        addBreadcrumb(new io.sentry.Breadcrumb(str));
    }
}
