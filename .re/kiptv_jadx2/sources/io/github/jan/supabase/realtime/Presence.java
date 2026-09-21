package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.kiptv.core.model.C1933b;
import io.github.jan.supabase.SupabaseSerializer;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryThread;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import p070h6.A;
import p078i6.C;
import p119n8.i;
import p153r8.p0;
import p162s8.k;
import p162s8.l;
import p162s8.o;
import p162s8.v;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\n\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\n\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006!"}, d2 = {"Lio/github/jan/supabase/realtime/Presence;", "", "", "presenceRef", "Lkotlinx/serialization/json/c;", SentryThread.JsonKeys.STATE, "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)V", "T", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "stateAs", "(Lio/github/jan/supabase/SupabaseSerializer;)Ljava/lang/Object;", "stateAsOrNull", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/c;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)Lio/github/jan/supabase/realtime/Presence;", "toString", "", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPresenceRef", "Lkotlinx/serialization/json/c;", "getState", "Companion", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i(with = Companion.class)
public final class Presence {

    public static final Companion INSTANCE = new Companion(null);
    private static final SerialDescriptor descriptor = q0.j("io.github.jan.supabase.realtime.Presence", new SerialDescriptor[0], new C1933b(23));
    private final String presenceRef;
    private final kotlinx.serialization.json.c state;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/realtime/Presence$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/Presence;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/github/jan/supabase/realtime/Presence;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/github/jan/supabase/realtime/Presence;)V", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements KSerializer {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        @Override
        public SerialDescriptor getDescriptor() {
            return Presence.descriptor;
        }

        public final KSerializer serializer() {
            return Presence.INSTANCE;
        }

        private Companion() {
        }

        @Override
        public Presence deserialize(Decoder decoder) {
            kotlinx.serialization.json.b bVar;
            m.e(decoder, "decoder");
            kotlinx.serialization.json.c cVarI = l.i(((k) decoder).i());
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVarI.get("metas");
            if (bVar2 == null || (bVar = (kotlinx.serialization.json.b) l.h(bVar2).f24557h.get(0)) == null) {
                throw new IllegalStateException(("A presence should at least have metas. Full json: " + cVarI).toString());
            }
            kotlinx.serialization.json.c cVarI2 = l.i(bVar);
            kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) cVarI2.get("phx_ref");
            if (bVar3 != null) {
                kotlinx.serialization.json.d dVarJ = l.j(bVar3);
                String strD = dVarJ instanceof JsonNull ? null : dVarJ.d();
                if (strD != null) {
                    LinkedHashMap linkedHashMapZ0 = C.Z0(cVarI2);
                    linkedHashMapZ0.remove("phx_ref");
                    return new Presence(strD, new kotlinx.serialization.json.c(linkedHashMapZ0));
                }
            }
            throw new IllegalStateException(("A presence should at least have a phx_ref. Full json: " + cVarI).toString());
        }

        @Override
        public void serialize(Encoder encoder, Presence value) {
            m.e(encoder, "encoder");
            m.e(value, "value");
            v vVar = new v();
            P.m0("phx_ref", value.getPresenceRef(), vVar);
            vVar.b(SentryThread.JsonKeys.STATE, value.getState());
            ((o) encoder).w(vVar.a());
        }
    }

    public Presence(String presenceRef, kotlinx.serialization.json.c state) {
        m.e(presenceRef, "presenceRef");
        m.e(state, "state");
        this.presenceRef = presenceRef;
        this.state = state;
    }

    public static Presence copy$default(Presence presence, String str, kotlinx.serialization.json.c cVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = presence.presenceRef;
        }
        if ((i3 & 2) != 0) {
            cVar = presence.state;
        }
        return presence.copy(str, cVar);
    }

    public static final A descriptor$lambda$0(p135p8.a buildClassSerialDescriptor) {
        m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("phx_ref", p0.f26989b, (12 & 8) == 0);
        buildClassSerialDescriptor.a(SentryThread.JsonKeys.STATE, kotlinx.serialization.json.c.Companion.serializer().getDescriptor(), (12 & 8) == 0);
        return A.f22523a;
    }

    public final String getPresenceRef() {
        return this.presenceRef;
    }

    public final kotlinx.serialization.json.c getState() {
        return this.state;
    }

    public final Presence copy(String presenceRef, kotlinx.serialization.json.c state) {
        m.e(presenceRef, "presenceRef");
        m.e(state, "state");
        return new Presence(presenceRef, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Presence)) {
            return false;
        }
        Presence presence = (Presence) other;
        return m.a(this.presenceRef, presence.presenceRef) && m.a(this.state, presence.state);
    }

    public final String getPresenceRef() {
        return this.presenceRef;
    }

    public final kotlinx.serialization.json.c getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.f24558h.hashCode() + (this.presenceRef.hashCode() * 31);
    }

    public final <T> T stateAs(SupabaseSerializer serializer) {
        m.e(serializer, "serializer");
        getState().toString();
        m.j();
        throw null;
    }

    public final <T> T stateAsOrNull(SupabaseSerializer serializer) {
        m.e(serializer, "serializer");
        try {
            getState().toString();
            m.j();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return "Presence(presenceRef=" + this.presenceRef + ", state=" + this.state + ')';
    }
}
