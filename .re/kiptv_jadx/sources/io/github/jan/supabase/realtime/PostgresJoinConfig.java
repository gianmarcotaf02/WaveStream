package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%JF\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010%¨\u00062"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "", "", "schema", "table", "filter", "event", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$realtime_kt_release", "(Lio/github/jan/supabase/realtime/PostgresJoinConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "toString", "Ljava/lang/String;", "getSchema", "getTable", "getFilter", "getEvent", "J", "getId", "Companion", "$serializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@io.github.jan.supabase.annotations.SupabaseInternal
@p119n8.i
public final /* data */ class PostgresJoinConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.PostgresJoinConfig.Companion INSTANCE = new io.github.jan.supabase.realtime.PostgresJoinConfig.Companion(null);
    private final java.lang.String event;
    private final java.lang.String filter;
    private final long id;
    private final java.lang.String schema;
    private final java.lang.String table;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresJoinConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.realtime.PostgresJoinConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ PostgresJoinConfig(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, p153r8.k0 k0Var) {
        if (9 != (i3 & 9)) {
            p153r8.AbstractC2686a0.l(i3, 9, io.github.jan.supabase.realtime.PostgresJoinConfig$$serializer.INSTANCE.getDescriptor());
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

    public static /* synthetic */ io.github.jan.supabase.realtime.PostgresJoinConfig copy$default(io.github.jan.supabase.realtime.PostgresJoinConfig postgresJoinConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, int i3, java.lang.Object obj) {
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

    public static final /* synthetic */ void write$Self$realtime_kt_release(io.github.jan.supabase.realtime.PostgresJoinConfig self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.schema);
        if (output.E(serialDesc) || self.table != null) {
            output.t(serialDesc, 1, p153r8.p0.f26988a, self.table);
        }
        if (output.E(serialDesc) || self.filter != null) {
            output.t(serialDesc, 2, p153r8.p0.f26988a, self.filter);
        }
        output.s(serialDesc, 3, self.event);
        if (!output.E(serialDesc) && self.id == 0) {
            return;
        }
        output.D(serialDesc, 4, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getSchema() {
        return this.schema;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getTable() {
        return this.table;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getFilter() {
        return this.filter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final io.github.jan.supabase.realtime.PostgresJoinConfig copy(java.lang.String schema, java.lang.String table, java.lang.String filter, java.lang.String event, long id) {
        kotlin.jvm.internal.m.e(schema, "schema");
        kotlin.jvm.internal.m.e(event, "event");
        return new io.github.jan.supabase.realtime.PostgresJoinConfig(schema, table, filter, event, id);
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof io.github.jan.supabase.realtime.PostgresJoinConfig)) {
            return false;
        }
        io.github.jan.supabase.realtime.PostgresJoinConfig postgresJoinConfig = (io.github.jan.supabase.realtime.PostgresJoinConfig) other;
        return kotlin.jvm.internal.m.a(postgresJoinConfig.schema, this.schema) && kotlin.jvm.internal.m.a(postgresJoinConfig.table, this.table) && kotlin.jvm.internal.m.a(postgresJoinConfig.filter, this.filter) && (kotlin.jvm.internal.m.a(postgresJoinConfig.event, this.event) || kotlin.jvm.internal.m.a(postgresJoinConfig.event, "*"));
    }

    public final java.lang.String getEvent() {
        return this.event;
    }

    public final java.lang.String getFilter() {
        return this.filter;
    }

    public final long getId() {
        return this.id;
    }

    public final java.lang.String getSchema() {
        return this.schema;
    }

    public final java.lang.String getTable() {
        return this.table;
    }

    public int hashCode() {
        int iHashCode = this.schema.hashCode() * 31;
        java.lang.String str = this.table;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.filter;
        return this.event.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public java.lang.String toString() {
        return "PostgresJoinConfig(schema=" + this.schema + ", table=" + this.table + ", filter=" + this.filter + ", event=" + this.event + ", id=" + this.id + ')';
    }

    public PostgresJoinConfig(java.lang.String schema, java.lang.String str, java.lang.String str2, java.lang.String event, long j) {
        kotlin.jvm.internal.m.e(schema, "schema");
        kotlin.jvm.internal.m.e(event, "event");
        this.schema = schema;
        this.table = str;
        this.filter = str2;
        this.event = event;
        this.id = j;
    }

    public /* synthetic */ PostgresJoinConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, str4, (i3 & 16) != 0 ? 0L : j);
    }
}
