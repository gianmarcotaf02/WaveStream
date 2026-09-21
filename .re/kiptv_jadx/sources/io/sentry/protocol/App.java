package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class App implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    public static final java.lang.String TYPE = "app";
    private java.lang.String appBuild;
    private java.lang.String appIdentifier;
    private java.lang.String appName;
    private java.util.Date appStartTime;
    private java.lang.String appVersion;
    private java.lang.String buildType;
    private java.lang.String deviceAppHash;
    private java.lang.Boolean inForeground;
    private java.lang.Boolean isSplitApks;
    private java.util.Map<java.lang.String, java.lang.String> permissions;
    private java.util.List<java.lang.String> splitNames;
    private java.lang.String startType;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.util.List<java.lang.String> viewNames;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.App> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.App deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.App app = new io.sentry.protocol.App();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "split_names":
                        java.util.List<java.lang.String> list = (java.util.List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            app.setSplitNames(list);
                            break;
                        }
                        break;
                    case "device_app_hash":
                        app.deviceAppHash = objectReader.nextStringOrNull();
                        break;
                    case "start_type":
                        app.startType = objectReader.nextStringOrNull();
                        break;
                    case "view_names":
                        java.util.List<java.lang.String> list2 = (java.util.List) objectReader.nextObjectOrNull();
                        if (list2 == null) {
                            break;
                        } else {
                            app.setViewNames(list2);
                            break;
                        }
                        break;
                    case "app_version":
                        app.appVersion = objectReader.nextStringOrNull();
                        break;
                    case "in_foreground":
                        app.inForeground = objectReader.nextBooleanOrNull();
                        break;
                    case "build_type":
                        app.buildType = objectReader.nextStringOrNull();
                        break;
                    case "app_identifier":
                        app.appIdentifier = objectReader.nextStringOrNull();
                        break;
                    case "app_start_time":
                        app.appStartTime = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "permissions":
                        app.permissions = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        break;
                    case "app_name":
                        app.appName = objectReader.nextStringOrNull();
                        break;
                    case "app_build":
                        app.appBuild = objectReader.nextStringOrNull();
                        break;
                    case "is_split_apks":
                        app.isSplitApks = objectReader.nextBooleanOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            app.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return app;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String APP_BUILD = "app_build";
        public static final java.lang.String APP_IDENTIFIER = "app_identifier";
        public static final java.lang.String APP_NAME = "app_name";
        public static final java.lang.String APP_PERMISSIONS = "permissions";
        public static final java.lang.String APP_START_TIME = "app_start_time";
        public static final java.lang.String APP_VERSION = "app_version";
        public static final java.lang.String BUILD_TYPE = "build_type";
        public static final java.lang.String DEVICE_APP_HASH = "device_app_hash";
        public static final java.lang.String IN_FOREGROUND = "in_foreground";
        public static final java.lang.String IS_SPLIT_APKS = "is_split_apks";
        public static final java.lang.String SPLIT_NAMES = "split_names";
        public static final java.lang.String START_TYPE = "start_type";
        public static final java.lang.String VIEW_NAMES = "view_names";
    }

    public App() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.protocol.App.class == obj.getClass()) {
            io.sentry.protocol.App app = (io.sentry.protocol.App) obj;
            if (io.sentry.util.Objects.equals(this.appIdentifier, app.appIdentifier) && io.sentry.util.Objects.equals(this.appStartTime, app.appStartTime) && io.sentry.util.Objects.equals(this.deviceAppHash, app.deviceAppHash) && io.sentry.util.Objects.equals(this.buildType, app.buildType) && io.sentry.util.Objects.equals(this.appName, app.appName) && io.sentry.util.Objects.equals(this.appVersion, app.appVersion) && io.sentry.util.Objects.equals(this.appBuild, app.appBuild) && io.sentry.util.Objects.equals(this.permissions, app.permissions) && io.sentry.util.Objects.equals(this.inForeground, app.inForeground) && io.sentry.util.Objects.equals(this.viewNames, app.viewNames) && io.sentry.util.Objects.equals(this.startType, app.startType) && io.sentry.util.Objects.equals(this.isSplitApks, app.isSplitApks) && io.sentry.util.Objects.equals(this.splitNames, app.splitNames)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getAppBuild() {
        return this.appBuild;
    }

    public java.lang.String getAppIdentifier() {
        return this.appIdentifier;
    }

    public java.lang.String getAppName() {
        return this.appName;
    }

    public java.util.Date getAppStartTime() {
        java.util.Date date = this.appStartTime;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    public java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public java.lang.String getBuildType() {
        return this.buildType;
    }

    public java.lang.String getDeviceAppHash() {
        return this.deviceAppHash;
    }

    public java.lang.Boolean getInForeground() {
        return this.inForeground;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPermissions() {
        return this.permissions;
    }

    public java.lang.Boolean getSplitApks() {
        return this.isSplitApks;
    }

    public java.util.List<java.lang.String> getSplitNames() {
        return this.splitNames;
    }

    public java.lang.String getStartType() {
        return this.startType;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.util.List<java.lang.String> getViewNames() {
        return this.viewNames;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.appIdentifier, this.appStartTime, this.deviceAppHash, this.buildType, this.appName, this.appVersion, this.appBuild, this.permissions, this.inForeground, this.viewNames, this.startType, this.isSplitApks, this.splitNames);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.appIdentifier != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.APP_IDENTIFIER).value(this.appIdentifier);
        }
        if (this.appStartTime != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.APP_START_TIME).value(iLogger, this.appStartTime);
        }
        if (this.deviceAppHash != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.DEVICE_APP_HASH).value(this.deviceAppHash);
        }
        if (this.buildType != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.BUILD_TYPE).value(this.buildType);
        }
        if (this.appName != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.APP_NAME).value(this.appName);
        }
        if (this.appVersion != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.APP_VERSION).value(this.appVersion);
        }
        if (this.appBuild != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.APP_BUILD).value(this.appBuild);
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.permissions;
        if (map != null && !map.isEmpty()) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.APP_PERMISSIONS).value(iLogger, this.permissions);
        }
        if (this.inForeground != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.IN_FOREGROUND).value(this.inForeground);
        }
        if (this.viewNames != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.VIEW_NAMES).value(iLogger, this.viewNames);
        }
        if (this.startType != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.START_TYPE).value(this.startType);
        }
        if (this.isSplitApks != null) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.IS_SPLIT_APKS).value(this.isSplitApks);
        }
        java.util.List<java.lang.String> list = this.splitNames;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(io.sentry.protocol.App.JsonKeys.SPLIT_NAMES).value(iLogger, this.splitNames);
        }
        java.util.Map<java.lang.String, java.lang.Object> map2 = this.unknown;
        if (map2 != null) {
            for (java.lang.String str : map2.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAppBuild(java.lang.String str) {
        this.appBuild = str;
    }

    public void setAppIdentifier(java.lang.String str) {
        this.appIdentifier = str;
    }

    public void setAppName(java.lang.String str) {
        this.appName = str;
    }

    public void setAppStartTime(java.util.Date date) {
        this.appStartTime = date;
    }

    public void setAppVersion(java.lang.String str) {
        this.appVersion = str;
    }

    public void setBuildType(java.lang.String str) {
        this.buildType = str;
    }

    public void setDeviceAppHash(java.lang.String str) {
        this.deviceAppHash = str;
    }

    public void setInForeground(java.lang.Boolean bool) {
        this.inForeground = bool;
    }

    public void setPermissions(java.util.Map<java.lang.String, java.lang.String> map) {
        this.permissions = map;
    }

    public void setSplitApks(java.lang.Boolean bool) {
        this.isSplitApks = bool;
    }

    public void setSplitNames(java.util.List<java.lang.String> list) {
        this.splitNames = list;
    }

    public void setStartType(java.lang.String str) {
        this.startType = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setViewNames(java.util.List<java.lang.String> list) {
        this.viewNames = list;
    }

    public App(io.sentry.protocol.App app) {
        this.appBuild = app.appBuild;
        this.appIdentifier = app.appIdentifier;
        this.appName = app.appName;
        this.appStartTime = app.appStartTime;
        this.appVersion = app.appVersion;
        this.buildType = app.buildType;
        this.deviceAppHash = app.deviceAppHash;
        this.permissions = io.sentry.util.CollectionUtils.newConcurrentHashMap(app.permissions);
        this.inForeground = app.inForeground;
        this.viewNames = io.sentry.util.CollectionUtils.newArrayList(app.viewNames);
        this.startType = app.startType;
        this.isSplitApks = app.isSplitApks;
        this.splitNames = app.splitNames;
        this.unknown = io.sentry.util.CollectionUtils.newConcurrentHashMap(app.unknown);
    }
}
