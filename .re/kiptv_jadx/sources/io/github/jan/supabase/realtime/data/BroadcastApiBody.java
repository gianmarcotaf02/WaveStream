package io.github.jan.supabase.realtime.data;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lio/github/jan/supabase/realtime/data/BroadcastApiBody;", "", "", "Lio/github/jan/supabase/realtime/data/BroadcastApiMessage;", "messages", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$realtime_kt_release", "(Lio/github/jan/supabase/realtime/data/BroadcastApiBody;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/github/jan/supabase/realtime/data/BroadcastApiBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMessages", "Companion", "$serializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class BroadcastApiBody {
    private final java.util.List<io.github.jan.supabase.realtime.data.BroadcastApiMessage> messages;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.data.BroadcastApiBody.Companion INSTANCE = new io.github.jan.supabase.realtime.data.BroadcastApiBody.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {new p153r8.C2691d(io.github.jan.supabase.realtime.data.BroadcastApiMessage$$serializer.INSTANCE, 0)};

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/data/BroadcastApiBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/data/BroadcastApiBody;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.realtime.data.BroadcastApiBody$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ BroadcastApiBody(int i3, java.util.List list, p153r8.k0 k0Var) {
        if (1 == (i3 & 1)) {
            this.messages = list;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, io.github.jan.supabase.realtime.data.BroadcastApiBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.github.jan.supabase.realtime.data.BroadcastApiBody copy$default(io.github.jan.supabase.realtime.data.BroadcastApiBody broadcastApiBody, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            list = broadcastApiBody.messages;
        }
        return broadcastApiBody.copy(list);
    }

    public final java.util.List<io.github.jan.supabase.realtime.data.BroadcastApiMessage> component1() {
        return this.messages;
    }

    public final io.github.jan.supabase.realtime.data.BroadcastApiBody copy(java.util.List<io.github.jan.supabase.realtime.data.BroadcastApiMessage> messages) {
        kotlin.jvm.internal.m.e(messages, "messages");
        return new io.github.jan.supabase.realtime.data.BroadcastApiBody(messages);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof io.github.jan.supabase.realtime.data.BroadcastApiBody) && kotlin.jvm.internal.m.a(this.messages, ((io.github.jan.supabase.realtime.data.BroadcastApiBody) other).messages);
    }

    public final java.util.List<io.github.jan.supabase.realtime.data.BroadcastApiMessage> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode();
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.play_billing.M0.n(new java.lang.StringBuilder("BroadcastApiBody(messages="), this.messages, ')');
    }

    public BroadcastApiBody(java.util.List<io.github.jan.supabase.realtime.data.BroadcastApiMessage> messages) {
        kotlin.jvm.internal.m.e(messages, "messages");
        this.messages = messages;
    }
}
