package io.github.jan.supabase.realtime;

import Y6.f;
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
import p162s8.x;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeMessage;", "", "", "topic", "event", "Lkotlinx/serialization/json/c;", "payload", "ref", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$realtime_kt_release", "(Lio/github/jan/supabase/realtime/RealtimeMessage;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/c;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;)Lio/github/jan/supabase/realtime/RealtimeMessage;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopic", "getEvent", "Lkotlinx/serialization/json/c;", "getPayload", "getRef", "Companion", "$serializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@SupabaseInternal
@i
public final class RealtimeMessage {

    public static final Companion INSTANCE = new Companion(null);
    private final String event;
    private final kotlinx.serialization.json.c payload;
    private final String ref;
    private final String topic;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/RealtimeMessage;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return RealtimeMessage$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public RealtimeMessage(int i3, String str, String str2, kotlinx.serialization.json.c cVar, String str3, k0 k0Var) {
        if (15 != (i3 & 15)) {
            AbstractC2686a0.l(i3, 15, RealtimeMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.topic = str;
        this.event = str2;
        this.payload = cVar;
        this.ref = str3;
    }

    public static RealtimeMessage copy$default(RealtimeMessage realtimeMessage, String str, String str2, kotlinx.serialization.json.c cVar, String str3, int i3, Object obj) {
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

    public static final void write$Self$realtime_kt_release(RealtimeMessage self, p143q8.b output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.topic);
        output.s(serialDesc, 1, self.event);
        output.h(serialDesc, 2, x.f27430a, self.payload);
        output.t(serialDesc, 3, p0.f26988a, self.ref);
    }

    public final String getTopic() {
        return this.topic;
    }

    public final String getEvent() {
        return this.event;
    }

    public final kotlinx.serialization.json.c getPayload() {
        return this.payload;
    }

    public final String getRef() {
        return this.ref;
    }

    public final RealtimeMessage copy(String topic, String event, kotlinx.serialization.json.c payload, String ref) {
        m.e(topic, "topic");
        m.e(event, "event");
        m.e(payload, "payload");
        return new RealtimeMessage(topic, event, payload, ref);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealtimeMessage)) {
            return false;
        }
        RealtimeMessage realtimeMessage = (RealtimeMessage) other;
        return m.a(this.topic, realtimeMessage.topic) && m.a(this.event, realtimeMessage.event) && m.a(this.payload, realtimeMessage.payload) && m.a(this.ref, realtimeMessage.ref);
    }

    public final String getEvent() {
        return this.event;
    }

    public final kotlinx.serialization.json.c getPayload() {
        return this.payload;
    }

    public final String getRef() {
        return this.ref;
    }

    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        int iC = B2.a.c(B2.a.a(this.topic.hashCode() * 31, 31, this.event), 31, this.payload.f24558h);
        String str = this.ref;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RealtimeMessage(topic=");
        sb.append(this.topic);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", ref=");
        return f.l(sb, this.ref, ')');
    }

    public RealtimeMessage(String topic, String event, kotlinx.serialization.json.c payload, String str) {
        m.e(topic, "topic");
        m.e(event, "event");
        m.e(payload, "payload");
        this.topic = topic;
        this.event = event;
        this.payload = payload;
        this.ref = str;
    }
}
