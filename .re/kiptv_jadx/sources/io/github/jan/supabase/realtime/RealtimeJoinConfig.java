package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J>\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010 R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00105\u0012\u0004\b8\u00104\u001a\u0004\b\n\u0010\"\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeJoinConfig;", "", "Lio/github/jan/supabase/realtime/BroadcastJoinConfig;", "broadcast", "Lio/github/jan/supabase/realtime/PresenceJoinConfig;", "presence", "", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "postgresChanges", "", "isPrivate", "<init>", "(Lio/github/jan/supabase/realtime/BroadcastJoinConfig;Lio/github/jan/supabase/realtime/PresenceJoinConfig;Ljava/util/List;Z)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILio/github/jan/supabase/realtime/BroadcastJoinConfig;Lio/github/jan/supabase/realtime/PresenceJoinConfig;Ljava/util/List;ZLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$realtime_kt_release", "(Lio/github/jan/supabase/realtime/RealtimeJoinConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/github/jan/supabase/realtime/BroadcastJoinConfig;", "component2", "()Lio/github/jan/supabase/realtime/PresenceJoinConfig;", "component3", "()Ljava/util/List;", "component4", "()Z", "copy", "(Lio/github/jan/supabase/realtime/BroadcastJoinConfig;Lio/github/jan/supabase/realtime/PresenceJoinConfig;Ljava/util/List;Z)Lio/github/jan/supabase/realtime/RealtimeJoinConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lio/github/jan/supabase/realtime/BroadcastJoinConfig;", "getBroadcast", "Lio/github/jan/supabase/realtime/PresenceJoinConfig;", "getPresence", "Ljava/util/List;", "getPostgresChanges", "getPostgresChanges$annotations", "()V", "Z", "setPrivate", "(Z)V", "isPrivate$annotations", "Companion", "$serializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@io.github.jan.supabase.annotations.SupabaseInternal
@p119n8.i
public final /* data */ class RealtimeJoinConfig {
    private final io.github.jan.supabase.realtime.BroadcastJoinConfig broadcast;
    private boolean isPrivate;
    private final java.util.List<io.github.jan.supabase.realtime.PostgresJoinConfig> postgresChanges;
    private final io.github.jan.supabase.realtime.PresenceJoinConfig presence;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.RealtimeJoinConfig.Companion INSTANCE = new io.github.jan.supabase.realtime.RealtimeJoinConfig.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {null, null, new p153r8.C2691d(io.github.jan.supabase.realtime.PostgresJoinConfig$$serializer.INSTANCE, 0), null};

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeJoinConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/RealtimeJoinConfig;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.realtime.RealtimeJoinConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ RealtimeJoinConfig(int i3, io.github.jan.supabase.realtime.BroadcastJoinConfig broadcastJoinConfig, io.github.jan.supabase.realtime.PresenceJoinConfig presenceJoinConfig, java.util.List list, boolean z6, p153r8.k0 k0Var) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, io.github.jan.supabase.realtime.RealtimeJoinConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.broadcast = broadcastJoinConfig;
        this.presence = presenceJoinConfig;
        this.postgresChanges = list;
        this.isPrivate = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.github.jan.supabase.realtime.RealtimeJoinConfig copy$default(io.github.jan.supabase.realtime.RealtimeJoinConfig realtimeJoinConfig, io.github.jan.supabase.realtime.BroadcastJoinConfig broadcastJoinConfig, io.github.jan.supabase.realtime.PresenceJoinConfig presenceJoinConfig, java.util.List list, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            broadcastJoinConfig = realtimeJoinConfig.broadcast;
        }
        if ((i3 & 2) != 0) {
            presenceJoinConfig = realtimeJoinConfig.presence;
        }
        if ((i3 & 4) != 0) {
            list = realtimeJoinConfig.postgresChanges;
        }
        if ((i3 & 8) != 0) {
            z6 = realtimeJoinConfig.isPrivate;
        }
        return realtimeJoinConfig.copy(broadcastJoinConfig, presenceJoinConfig, list, z6);
    }

    @p119n8.h("postgres_changes")
    public static /* synthetic */ void getPostgresChanges$annotations() {
    }

    @p119n8.h(io.ktor.client.utils.CacheControl.PRIVATE)
    public static /* synthetic */ void isPrivate$annotations() {
    }

    public static final /* synthetic */ void write$Self$realtime_kt_release(io.github.jan.supabase.realtime.RealtimeJoinConfig self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.h(serialDesc, 0, io.github.jan.supabase.realtime.BroadcastJoinConfig$$serializer.INSTANCE, self.broadcast);
        output.h(serialDesc, 1, io.github.jan.supabase.realtime.PresenceJoinConfig$$serializer.INSTANCE, self.presence);
        output.h(serialDesc, 2, kSerializerArr[2], self.postgresChanges);
        output.q(serialDesc, 3, self.isPrivate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final io.github.jan.supabase.realtime.BroadcastJoinConfig getBroadcast() {
        return this.broadcast;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final io.github.jan.supabase.realtime.PresenceJoinConfig getPresence() {
        return this.presence;
    }

    public final java.util.List<io.github.jan.supabase.realtime.PostgresJoinConfig> component3() {
        return this.postgresChanges;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    public final io.github.jan.supabase.realtime.RealtimeJoinConfig copy(io.github.jan.supabase.realtime.BroadcastJoinConfig broadcast, io.github.jan.supabase.realtime.PresenceJoinConfig presence, java.util.List<io.github.jan.supabase.realtime.PostgresJoinConfig> postgresChanges, boolean isPrivate) {
        kotlin.jvm.internal.m.e(broadcast, "broadcast");
        kotlin.jvm.internal.m.e(presence, "presence");
        kotlin.jvm.internal.m.e(postgresChanges, "postgresChanges");
        return new io.github.jan.supabase.realtime.RealtimeJoinConfig(broadcast, presence, postgresChanges, isPrivate);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.realtime.RealtimeJoinConfig)) {
            return false;
        }
        io.github.jan.supabase.realtime.RealtimeJoinConfig realtimeJoinConfig = (io.github.jan.supabase.realtime.RealtimeJoinConfig) other;
        return kotlin.jvm.internal.m.a(this.broadcast, realtimeJoinConfig.broadcast) && kotlin.jvm.internal.m.a(this.presence, realtimeJoinConfig.presence) && kotlin.jvm.internal.m.a(this.postgresChanges, realtimeJoinConfig.postgresChanges) && this.isPrivate == realtimeJoinConfig.isPrivate;
    }

    public final io.github.jan.supabase.realtime.BroadcastJoinConfig getBroadcast() {
        return this.broadcast;
    }

    public final java.util.List<io.github.jan.supabase.realtime.PostgresJoinConfig> getPostgresChanges() {
        return this.postgresChanges;
    }

    public final io.github.jan.supabase.realtime.PresenceJoinConfig getPresence() {
        return this.presence;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.isPrivate) + B2.a.b((this.presence.hashCode() + (this.broadcast.hashCode() * 31)) * 31, 31, this.postgresChanges);
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final void setPrivate(boolean z6) {
        this.isPrivate = z6;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RealtimeJoinConfig(broadcast=");
        sb.append(this.broadcast);
        sb.append(", presence=");
        sb.append(this.presence);
        sb.append(", postgresChanges=");
        sb.append(this.postgresChanges);
        sb.append(", isPrivate=");
        return v5.L.a(sb, this.isPrivate, ')');
    }

    public RealtimeJoinConfig(io.github.jan.supabase.realtime.BroadcastJoinConfig broadcast, io.github.jan.supabase.realtime.PresenceJoinConfig presence, java.util.List<io.github.jan.supabase.realtime.PostgresJoinConfig> postgresChanges, boolean z6) {
        kotlin.jvm.internal.m.e(broadcast, "broadcast");
        kotlin.jvm.internal.m.e(presence, "presence");
        kotlin.jvm.internal.m.e(postgresChanges, "postgresChanges");
        this.broadcast = broadcast;
        this.presence = presence;
        this.postgresChanges = postgresChanges;
        this.isPrivate = z6;
    }
}
