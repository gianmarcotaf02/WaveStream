package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010%R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\"\u0012\u0004\b*\u0010'\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010%¨\u0006-"}, d2 = {"Lio/github/jan/supabase/realtime/BroadcastJoinConfig;", "", "", "acknowledgeBroadcasts", "receiveOwnBroadcasts", "<init>", "(ZZ)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(IZZLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$realtime_kt_release", "(Lio/github/jan/supabase/realtime/BroadcastJoinConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lio/github/jan/supabase/realtime/BroadcastJoinConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getAcknowledgeBroadcasts", "setAcknowledgeBroadcasts", "(Z)V", "getAcknowledgeBroadcasts$annotations", "()V", "getReceiveOwnBroadcasts", "setReceiveOwnBroadcasts", "getReceiveOwnBroadcasts$annotations", "Companion", "$serializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class BroadcastJoinConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.BroadcastJoinConfig.Companion INSTANCE = new io.github.jan.supabase.realtime.BroadcastJoinConfig.Companion(null);
    private boolean acknowledgeBroadcasts;
    private boolean receiveOwnBroadcasts;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/BroadcastJoinConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/BroadcastJoinConfig;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.realtime.BroadcastJoinConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ BroadcastJoinConfig(int i3, boolean z6, boolean z9, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, io.github.jan.supabase.realtime.BroadcastJoinConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.acknowledgeBroadcasts = z6;
        this.receiveOwnBroadcasts = z9;
    }

    public static /* synthetic */ io.github.jan.supabase.realtime.BroadcastJoinConfig copy$default(io.github.jan.supabase.realtime.BroadcastJoinConfig broadcastJoinConfig, boolean z6, boolean z9, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = broadcastJoinConfig.acknowledgeBroadcasts;
        }
        if ((i3 & 2) != 0) {
            z9 = broadcastJoinConfig.receiveOwnBroadcasts;
        }
        return broadcastJoinConfig.copy(z6, z9);
    }

    @p119n8.h("ack")
    public static /* synthetic */ void getAcknowledgeBroadcasts$annotations() {
    }

    @p119n8.h("self")
    public static /* synthetic */ void getReceiveOwnBroadcasts$annotations() {
    }

    public static final /* synthetic */ void write$Self$realtime_kt_release(io.github.jan.supabase.realtime.BroadcastJoinConfig self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.acknowledgeBroadcasts);
        output.q(serialDesc, 1, self.receiveOwnBroadcasts);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAcknowledgeBroadcasts() {
        return this.acknowledgeBroadcasts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getReceiveOwnBroadcasts() {
        return this.receiveOwnBroadcasts;
    }

    public final io.github.jan.supabase.realtime.BroadcastJoinConfig copy(boolean acknowledgeBroadcasts, boolean receiveOwnBroadcasts) {
        return new io.github.jan.supabase.realtime.BroadcastJoinConfig(acknowledgeBroadcasts, receiveOwnBroadcasts);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.realtime.BroadcastJoinConfig)) {
            return false;
        }
        io.github.jan.supabase.realtime.BroadcastJoinConfig broadcastJoinConfig = (io.github.jan.supabase.realtime.BroadcastJoinConfig) other;
        return this.acknowledgeBroadcasts == broadcastJoinConfig.acknowledgeBroadcasts && this.receiveOwnBroadcasts == broadcastJoinConfig.receiveOwnBroadcasts;
    }

    public final boolean getAcknowledgeBroadcasts() {
        return this.acknowledgeBroadcasts;
    }

    public final boolean getReceiveOwnBroadcasts() {
        return this.receiveOwnBroadcasts;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.receiveOwnBroadcasts) + (java.lang.Boolean.hashCode(this.acknowledgeBroadcasts) * 31);
    }

    public final void setAcknowledgeBroadcasts(boolean z6) {
        this.acknowledgeBroadcasts = z6;
    }

    public final void setReceiveOwnBroadcasts(boolean z6) {
        this.receiveOwnBroadcasts = z6;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BroadcastJoinConfig(acknowledgeBroadcasts=");
        sb.append(this.acknowledgeBroadcasts);
        sb.append(", receiveOwnBroadcasts=");
        return v5.L.a(sb, this.receiveOwnBroadcasts, ')');
    }

    public BroadcastJoinConfig(boolean z6, boolean z9) {
        this.acknowledgeBroadcasts = z6;
        this.receiveOwnBroadcasts = z9;
    }
}
