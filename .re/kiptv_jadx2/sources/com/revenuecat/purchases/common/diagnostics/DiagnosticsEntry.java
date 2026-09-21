package com.revenuecat.purchases.common.diagnostics;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.utils.Event;
import com.revenuecat.purchases.utils.Iso8601Utils;
import io.sentry.protocol.Request;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 *2\u00020\u0001:\u0001*BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\bH\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "Lcom/revenuecat/purchases/utils/Event;", "id", "Ljava/util/UUID;", "name", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", DiagnosticsEntry.PROPERTIES_KEY, "", "", "", "appSessionID", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateTime", "Ljava/util/Date;", "(Ljava/util/UUID;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;Ljava/util/Map;Ljava/util/UUID;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;)V", "getAppSessionID", "()Ljava/util/UUID;", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDateTime", "()Ljava/util/Date;", "getId", "getName", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DiagnosticsEntry implements Event {

    @Deprecated
    public static final String APP_SESSION_ID_KEY = "app_session_id";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ID_KEY = "id";

    @Deprecated
    public static final String NAME_KEY = "name";

    @Deprecated
    public static final String PROPERTIES_KEY = "properties";

    @Deprecated
    public static final String TIMESTAMP_KEY = "timestamp";

    @Deprecated
    public static final int VERSION = 1;

    @Deprecated
    public static final String VERSION_KEY = "version";
    private final UUID appSessionID;
    private final DateProvider dateProvider;
    private final Date dateTime;
    private final UUID id;
    private final DiagnosticsEntryName name;
    private final Map<String, Object> properties;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Companion;", "", "()V", "APP_SESSION_ID_KEY", "", "ID_KEY", "NAME_KEY", "PROPERTIES_KEY", "TIMESTAMP_KEY", "VERSION", "", "VERSION_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    public DiagnosticsEntry(UUID id, DiagnosticsEntryName name, Map<String, ? extends Object> properties, UUID appSessionID, DateProvider dateProvider, Date dateTime) {
        m.e(id, "id");
        m.e(name, "name");
        m.e(properties, "properties");
        m.e(appSessionID, "appSessionID");
        m.e(dateProvider, "dateProvider");
        m.e(dateTime, "dateTime");
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.appSessionID = appSessionID;
        this.dateProvider = dateProvider;
        this.dateTime = dateTime;
    }

    public static DiagnosticsEntry copy$default(DiagnosticsEntry diagnosticsEntry, UUID uuid, DiagnosticsEntryName diagnosticsEntryName, Map map, UUID uuid2, DateProvider dateProvider, Date date, int i3, Object obj) {
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
        DateProvider dateProvider2 = dateProvider;
        Date date2 = date;
        return diagnosticsEntry.copy(uuid, diagnosticsEntryName, map, uuid2, dateProvider2, date2);
    }

    private final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("version", 1);
        String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        jSONObject.put("name", lowerCase);
        jSONObject.put(PROPERTIES_KEY, new JSONObject(this.properties));
        jSONObject.put(APP_SESSION_ID_KEY, this.appSessionID);
        jSONObject.put("timestamp", Iso8601Utils.format(this.dateTime));
        return jSONObject;
    }

    public final UUID getId() {
        return this.id;
    }

    public final DiagnosticsEntryName getName() {
        return this.name;
    }

    public final Map<String, Object> component3() {
        return this.properties;
    }

    public final UUID getAppSessionID() {
        return this.appSessionID;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final Date getDateTime() {
        return this.dateTime;
    }

    public final DiagnosticsEntry copy(UUID id, DiagnosticsEntryName name, Map<String, ? extends Object> properties, UUID appSessionID, DateProvider dateProvider, Date dateTime) {
        m.e(id, "id");
        m.e(name, "name");
        m.e(properties, "properties");
        m.e(appSessionID, "appSessionID");
        m.e(dateProvider, "dateProvider");
        m.e(dateTime, "dateTime");
        return new DiagnosticsEntry(id, name, properties, appSessionID, dateProvider, dateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiagnosticsEntry)) {
            return false;
        }
        DiagnosticsEntry diagnosticsEntry = (DiagnosticsEntry) other;
        return m.a(this.id, diagnosticsEntry.id) && this.name == diagnosticsEntry.name && m.a(this.properties, diagnosticsEntry.properties) && m.a(this.appSessionID, diagnosticsEntry.appSessionID) && m.a(this.dateProvider, diagnosticsEntry.dateProvider) && m.a(this.dateTime, diagnosticsEntry.dateTime);
    }

    public final UUID getAppSessionID() {
        return this.appSessionID;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final Date getDateTime() {
        return this.dateTime;
    }

    public final UUID getId() {
        return this.id;
    }

    public final DiagnosticsEntryName getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.dateTime.hashCode() + ((this.dateProvider.hashCode() + ((this.appSessionID.hashCode() + a.c((this.name.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.properties)) * 31)) * 31);
    }

    @Override
    public String toString() {
        String string = toJSONObject().toString();
        m.d(string, "toJSONObject().toString()");
        return string;
    }

    public DiagnosticsEntry(UUID uuid, DiagnosticsEntryName diagnosticsEntryName, Map map, UUID uuid2, DateProvider dateProvider, Date date, int i3, AbstractC2541f abstractC2541f) {
        if ((i3 & 1) != 0) {
            uuid = UUID.randomUUID();
            m.d(uuid, "randomUUID()");
        }
        UUID uuid3 = uuid;
        DateProvider defaultDateProvider = (i3 & 16) != 0 ? new DefaultDateProvider() : dateProvider;
        this(uuid3, diagnosticsEntryName, map, uuid2, defaultDateProvider, (i3 & 32) != 0 ? defaultDateProvider.getNow() : date);
    }
}
