package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeMessage;", "", "", "topic", "event", "Lkotlinx/serialization/json/c;", "payload", "ref", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$realtime_kt_release", "(Lio/github/jan/supabase/realtime/RealtimeMessage;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/c;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;)Lio/github/jan/supabase/realtime/RealtimeMessage;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopic", "getEvent", "Lkotlinx/serialization/json/c;", "getPayload", "getRef", "Companion", "$serializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@io.github.jan.supabase.annotations.SupabaseInternal
@p119n8.i
public final /* data */ class RealtimeMessage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.RealtimeMessage.Companion INSTANCE = new io.github.jan.supabase.realtime.RealtimeMessage.Companion(null);
    private final java.lang.String event;
    private final kotlinx.serialization.json.c payload;
    private final java.lang.String ref;
    private final java.lang.String topic;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/RealtimeMessage;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.realtime.RealtimeMessage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ RealtimeMessage(int i3, java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, java.lang.String str3, p153r8.k0 k0Var) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, io.github.jan.supabase.realtime.RealtimeMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.topic = str;
        this.event = str2;
        this.payload = cVar;
        this.ref = str3;
    }

    public static /* synthetic */ io.github.jan.supabase.realtime.RealtimeMessage copy$default(io.github.jan.supabase.realtime.RealtimeMessage realtimeMessage, java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, java.lang.String str3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = realtimeMessage.topic;
        }
        if ((i3 & 2) != 0) {
            str2 = realtimeMessage.event;
        }
        if ((i3 & 4) != 0) {
            cVar = realtimeMessage.payload;
        }
        if ((i3 & 8) != 0) {
            str3 = realtimeMessage.ref;
        }
        return realtimeMessage.copy(str, str2, cVar, str3);
    }

    public static final /* synthetic */ void write$Self$realtime_kt_release(io.github.jan.supabase.realtime.RealtimeMessage self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.topic);
        output.s(serialDesc, 1, self.event);
        output.h(serialDesc, 2, p162s8.x.f27430a, self.payload);
        output.t(serialDesc, 3, p153r8.p0.f26988a, self.ref);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final kotlinx.serialization.json.c getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getRef() {
        return this.ref;
    }

    public final io.github.jan.supabase.realtime.RealtimeMessage copy(java.lang.String topic, java.lang.String event, kotlinx.serialization.json.c payload, java.lang.String ref) {
        kotlin.jvm.internal.m.e(topic, "topic");
        kotlin.jvm.internal.m.e(event, "event");
        kotlin.jvm.internal.m.e(payload, "payload");
        return new io.github.jan.supabase.realtime.RealtimeMessage(topic, event, payload, ref);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.realtime.RealtimeMessage)) {
            return false;
        }
        io.github.jan.supabase.realtime.RealtimeMessage realtimeMessage = (io.github.jan.supabase.realtime.RealtimeMessage) other;
        return kotlin.jvm.internal.m.a(this.topic, realtimeMessage.topic) && kotlin.jvm.internal.m.a(this.event, realtimeMessage.event) && kotlin.jvm.internal.m.a(this.payload, realtimeMessage.payload) && kotlin.jvm.internal.m.a(this.ref, realtimeMessage.ref);
    }

    public final java.lang.String getEvent() {
        return this.event;
    }

    public final kotlinx.serialization.json.c getPayload() {
        return this.payload;
    }

    public final java.lang.String getRef() {
        return this.ref;
    }

    public final java.lang.String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        int iC = B2.a.c(B2.a.a(this.topic.hashCode() * 31, 31, this.event), 31, this.payload.f24558h);
        java.lang.String str = this.ref;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RealtimeMessage(topic=");
        sb.append(this.topic);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", ref=");
        return Y6.f.l(sb, this.ref, ')');
    }

    public RealtimeMessage(java.lang.String topic, java.lang.String event, kotlinx.serialization.json.c payload, java.lang.String str) {
        kotlin.jvm.internal.m.e(topic, "topic");
        kotlin.jvm.internal.m.e(event, "event");
        kotlin.jvm.internal.m.e(payload, "payload");
        this.topic = topic;
        this.event = event;
        this.payload = payload;
        this.ref = str;
    }
}
