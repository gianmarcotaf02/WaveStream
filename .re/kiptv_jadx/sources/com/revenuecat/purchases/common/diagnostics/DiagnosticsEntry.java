package com.revenuecat.purchases.common.diagnostics;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 *2\u00020\u0001:\u0001*BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\bH\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "Lcom/revenuecat/purchases/utils/Event;", "id", "Ljava/util/UUID;", "name", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.PROPERTIES_KEY, "", "", "", "appSessionID", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateTime", "Ljava/util/Date;", "(Ljava/util/UUID;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;Ljava/util/Map;Ljava/util/UUID;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;)V", "getAppSessionID", "()Ljava/util/UUID;", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDateTime", "()Ljava/util/Date;", "getId", "getName", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class DiagnosticsEntry implements com.revenuecat.purchases.utils.Event {

    @java.lang.Deprecated
    public static final java.lang.String APP_SESSION_ID_KEY = "app_session_id";
    private static final com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.Companion Companion = new com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String ID_KEY = "id";

    @java.lang.Deprecated
    public static final java.lang.String NAME_KEY = "name";

    @java.lang.Deprecated
    public static final java.lang.String PROPERTIES_KEY = "properties";

    @java.lang.Deprecated
    public static final java.lang.String TIMESTAMP_KEY = "timestamp";

    @java.lang.Deprecated
    public static final int VERSION = 1;

    @java.lang.Deprecated
    public static final java.lang.String VERSION_KEY = "version";
    private final java.util.UUID appSessionID;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final java.util.Date dateTime;
    private final java.util.UUID id;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName name;
    private final java.util.Map<java.lang.String, java.lang.Object> properties;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Companion;", "", "()V", "APP_SESSION_ID_KEY", "", "ID_KEY", "NAME_KEY", "PROPERTIES_KEY", "TIMESTAMP_KEY", "VERSION", "", "VERSION_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    public DiagnosticsEntry(java.util.UUID id, com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName name, java.util.Map<java.lang.String, ? extends java.lang.Object> properties, java.util.UUID appSessionID, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date dateTime) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(properties, "properties");
        kotlin.jvm.internal.m.e(appSessionID, "appSessionID");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(dateTime, "dateTime");
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.appSessionID = appSessionID;
        this.dateProvider = dateProvider;
        this.dateTime = dateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry copy$default(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry diagnosticsEntry, java.util.UUID uuid, com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName diagnosticsEntryName, java.util.Map map, java.util.UUID uuid2, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date date, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            uuid = diagnosticsEntry.id;
        }
        if ((i3 & 2) != 0) {
            diagnosticsEntryName = diagnosticsEntry.name;
        }
        if ((i3 & 4) != 0) {
            map = diagnosticsEntry.properties;
        }
        if ((i3 & 8) != 0) {
            uuid2 = diagnosticsEntry.appSessionID;
        }
        if ((i3 & 16) != 0) {
            dateProvider = diagnosticsEntry.dateProvider;
        }
        if ((i3 & 32) != 0) {
            date = diagnosticsEntry.dateTime;
        }
        com.revenuecat.purchases.common.DateProvider dateProvider2 = dateProvider;
        java.util.Date date2 = date;
        return diagnosticsEntry.copy(uuid, diagnosticsEntryName, map, uuid2, dateProvider2, date2);
    }

    private final org.json.JSONObject toJSONObject() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("version", 1);
        java.lang.String lowerCase = this.name.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        jSONObject.put("name", lowerCase);
        jSONObject.put(PROPERTIES_KEY, new org.json.JSONObject(this.properties));
        jSONObject.put(APP_SESSION_ID_KEY, this.appSessionID);
        jSONObject.put("timestamp", com.revenuecat.purchases.utils.Iso8601Utils.format(this.dateTime));
        return jSONObject;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.util.UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName getName() {
        return this.name;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return this.properties;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.util.UUID getAppSessionID() {
        return this.appSessionID;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.revenuecat.purchases.common.DateProvider getDateProvider() {
        return this.dateProvider;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.util.Date getDateTime() {
        return this.dateTime;
    }

    public final com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry copy(java.util.UUID id, com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName name, java.util.Map<java.lang.String, ? extends java.lang.Object> properties, java.util.UUID appSessionID, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date dateTime) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(properties, "properties");
        kotlin.jvm.internal.m.e(appSessionID, "appSessionID");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(dateTime, "dateTime");
        return new com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry(id, name, properties, appSessionID, dateProvider, dateTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry)) {
            return false;
        }
        com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry diagnosticsEntry = (com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry) other;
        return kotlin.jvm.internal.m.a(this.id, diagnosticsEntry.id) && this.name == diagnosticsEntry.name && kotlin.jvm.internal.m.a(this.properties, diagnosticsEntry.properties) && kotlin.jvm.internal.m.a(this.appSessionID, diagnosticsEntry.appSessionID) && kotlin.jvm.internal.m.a(this.dateProvider, diagnosticsEntry.dateProvider) && kotlin.jvm.internal.m.a(this.dateTime, diagnosticsEntry.dateTime);
    }

    public final java.util.UUID getAppSessionID() {
        return this.appSessionID;
    }

    public final com.revenuecat.purchases.common.DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final java.util.Date getDateTime() {
        return this.dateTime;
    }

    public final java.util.UUID getId() {
        return this.id;
    }

    public final com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName getName() {
        return this.name;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.dateTime.hashCode() + ((this.dateProvider.hashCode() + ((this.appSessionID.hashCode() + B2.a.c((this.name.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.properties)) * 31)) * 31);
    }

    @Override // com.revenuecat.purchases.utils.Event
    public java.lang.String toString() {
        java.lang.String string = toJSONObject().toString();
        kotlin.jvm.internal.m.d(string, "toJSONObject().toString()");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DiagnosticsEntry(java.util.UUID uuid, com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName diagnosticsEntryName, java.util.Map map, java.util.UUID uuid2, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date date, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        if ((i3 & 1) != 0) {
            uuid = java.util.UUID.randomUUID();
            kotlin.jvm.internal.m.d(uuid, "randomUUID()");
        }
        java.util.UUID uuid3 = uuid;
        com.revenuecat.purchases.common.DateProvider defaultDateProvider = (i3 & 16) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider;
        this(uuid3, diagnosticsEntryName, map, uuid2, defaultDateProvider, (i3 & 32) != 0 ? defaultDateProvider.getNow() : date);
    }
}
