package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeJoinPayload;", "", "Lio/github/jan/supabase/realtime/RealtimeJoinConfig;", "config", "<init>", "(Lio/github/jan/supabase/realtime/RealtimeJoinConfig;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILio/github/jan/supabase/realtime/RealtimeJoinConfig;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$realtime_kt_release", "(Lio/github/jan/supabase/realtime/RealtimeJoinPayload;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/github/jan/supabase/realtime/RealtimeJoinConfig;", "copy", "(Lio/github/jan/supabase/realtime/RealtimeJoinConfig;)Lio/github/jan/supabase/realtime/RealtimeJoinPayload;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lio/github/jan/supabase/realtime/RealtimeJoinConfig;", "getConfig", "Companion", "$serializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@io.github.jan.supabase.annotations.SupabaseInternal
@p119n8.i
public final /* data */ class RealtimeJoinPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.RealtimeJoinPayload.Companion INSTANCE = new io.github.jan.supabase.realtime.RealtimeJoinPayload.Companion(null);
    private final io.github.jan.supabase.realtime.RealtimeJoinConfig config;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeJoinPayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/RealtimeJoinPayload;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.realtime.RealtimeJoinPayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ RealtimeJoinPayload(int i3, io.github.jan.supabase.realtime.RealtimeJoinConfig realtimeJoinConfig, p153r8.k0 k0Var) {
        if (1 == (i3 & 1)) {
            this.config = realtimeJoinConfig;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, io.github.jan.supabase.realtime.RealtimeJoinPayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ io.github.jan.supabase.realtime.RealtimeJoinPayload copy$default(io.github.jan.supabase.realtime.RealtimeJoinPayload realtimeJoinPayload, io.github.jan.supabase.realtime.RealtimeJoinConfig realtimeJoinConfig, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            realtimeJoinConfig = realtimeJoinPayload.config;
        }
        return realtimeJoinPayload.copy(realtimeJoinConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final io.github.jan.supabase.realtime.RealtimeJoinConfig getConfig() {
        return this.config;
    }

    public final io.github.jan.supabase.realtime.RealtimeJoinPayload copy(io.github.jan.supabase.realtime.RealtimeJoinConfig config) {
        kotlin.jvm.internal.m.e(config, "config");
        return new io.github.jan.supabase.realtime.RealtimeJoinPayload(config);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof io.github.jan.supabase.realtime.RealtimeJoinPayload) && kotlin.jvm.internal.m.a(this.config, ((io.github.jan.supabase.realtime.RealtimeJoinPayload) other).config);
    }

    public final io.github.jan.supabase.realtime.RealtimeJoinConfig getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    public java.lang.String toString() {
        return "RealtimeJoinPayload(config=" + this.config + ')';
    }

    public RealtimeJoinPayload(io.github.jan.supabase.realtime.RealtimeJoinConfig config) {
        kotlin.jvm.internal.m.e(config, "config");
        this.config = config;
    }
}
