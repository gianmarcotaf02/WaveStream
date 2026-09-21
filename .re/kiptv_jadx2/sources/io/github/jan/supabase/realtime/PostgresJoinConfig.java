package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p119n8.i;
import p153r8.AbstractC2686a0;
import p153r8.k0;
import p153r8.p0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%JF\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010%¨\u00062"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "", "", "schema", "table", "filter", "event", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$realtime_kt_release", "(Lio/github/jan/supabase/realtime/PostgresJoinConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "toString", "Ljava/lang/String;", "getSchema", "getTable", "getFilter", "getEvent", "J", "getId", "Companion", "$serializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@SupabaseInternal
@i
public final class PostgresJoinConfig {

    public static final Companion INSTANCE = new Companion(null);
    private final String event;
    private final String filter;
    private final long id;
    private final String schema;
    private final String table;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresJoinConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return PostgresJoinConfig$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public PostgresJoinConfig(int i3, String str, String str2, String str3, String str4, long j, k0 k0Var) {
        if (9 != (i3 & 9)) {
            AbstractC2686a0.l(i3, 9, PostgresJoinConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.schema = str;
        if ((i3 & 2) == 0) {
            this.table = null;
        } else {
            this.table = str2;
        }
        if ((i3 & 4) == 0) {
            this.filter = null;
        } else {
            this.filter = str3;
        }
        this.event = str4;
        if ((i3 & 16) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
    }

    public static PostgresJoinConfig copy$default(PostgresJoinConfig postgresJoinConfig, String str, String str2, String str3, String str4, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = postgresJoinConfig.schema;
        }
        if ((i3 & 2) != 0) {
            str2 = postgresJoinConfig.table;
        }
        if ((i3 & 4) != 0) {
            str3 = postgresJoinConfig.filter;
        }
        if ((i3 & 8) != 0) {
            str4 = postgresJoinConfig.event;
        }
        if ((i3 & 16) != 0) {
            j = postgresJoinConfig.id;
        }
        long j9 = j;
        return postgresJoinConfig.copy(str, str2, str3, str4, j9);
    }

    public static final void write$Self$realtime_kt_release(PostgresJoinConfig self, p143q8.b output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.schema);
        if (output.E(serialDesc) || self.table != null) {
            output.t(serialDesc, 1, p0.f26988a, self.table);
        }
        if (output.E(serialDesc) || self.filter != null) {
            output.t(serialDesc, 2, p0.f26988a, self.filter);
        }
        output.s(serialDesc, 3, self.event);
        if (!output.E(serialDesc) && self.id == 0) {
            return;
        }
        output.D(serialDesc, 4, self.id);
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTable() {
        return this.table;
    }

    public final String getFilter() {
        return this.filter;
    }

    public final String getEvent() {
        return this.event;
    }

    public final long getId() {
        return this.id;
    }

    public final PostgresJoinConfig copy(String schema, String table, String filter, String event, long id) {
        m.e(schema, "schema");
        m.e(event, "event");
        return new PostgresJoinConfig(schema, table, filter, event, id);
    }

    public boolean equals(Object other) {
        if (!(other instanceof PostgresJoinConfig)) {
            return false;
        }
        PostgresJoinConfig postgresJoinConfig = (PostgresJoinConfig) other;
        return m.a(postgresJoinConfig.schema, this.schema) && m.a(postgresJoinConfig.table, this.table) && m.a(postgresJoinConfig.filter, this.filter) && (m.a(postgresJoinConfig.event, this.event) || m.a(postgresJoinConfig.event, "*"));
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getFilter() {
        return this.filter;
    }

    public final long getId() {
        return this.id;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTable() {
        return this.table;
    }

    public int hashCode() {
        int iHashCode = this.schema.hashCode() * 31;
        String str = this.table;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.filter;
        return this.event.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "PostgresJoinConfig(schema=" + this.schema + ", table=" + this.table + ", filter=" + this.filter + ", event=" + this.event + ", id=" + this.id + ')';
    }

    public PostgresJoinConfig(String schema, String str, String str2, String event, long j) {
        m.e(schema, "schema");
        m.e(event, "event");
        this.schema = schema;
        this.table = str;
        this.filter = str2;
        this.event = event;
        this.id = j;
    }

    public PostgresJoinConfig(String str, String str2, String str3, String str4, long j, int i3, AbstractC2541f abstractC2541f) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, str4, (i3 & 16) != 0 ? 0L : j);
    }
}
