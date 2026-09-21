package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\n\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\n\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006!"}, d2 = {"Lio/github/jan/supabase/realtime/Presence;", "", "", "presenceRef", "Lkotlinx/serialization/json/c;", io.sentry.protocol.SentryThread.JsonKeys.STATE, "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)V", "T", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "stateAs", "(Lio/github/jan/supabase/SupabaseSerializer;)Ljava/lang/Object;", "stateAsOrNull", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/c;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)Lio/github/jan/supabase/realtime/Presence;", "toString", "", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPresenceRef", "Lkotlinx/serialization/json/c;", "getState", "Companion", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = io.github.jan.supabase.realtime.Presence.Companion.class)
public final /* data */ class Presence {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.Presence.Companion INSTANCE = new io.github.jan.supabase.realtime.Presence.Companion(null);
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.google.crypto.tink.shaded.protobuf.q0.j("io.github.jan.supabase.realtime.Presence", new kotlinx.serialization.descriptors.SerialDescriptor[0], new com.kiptv.core.model.C1933b(23));
    private final java.lang.String presenceRef;
    private final kotlinx.serialization.json.c state;

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/realtime/Presence$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/realtime/Presence;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/github/jan/supabase/realtime/Presence;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/github/jan/supabase/realtime/Presence;)V", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements kotlinx.serialization.KSerializer {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        @Override // kotlinx.serialization.KSerializer
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return io.github.jan.supabase.realtime.Presence.descriptor;
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.realtime.Presence.INSTANCE;
        }

        private Companion() {
        }

        @Override // kotlinx.serialization.KSerializer
        public io.github.jan.supabase.realtime.Presence deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            kotlinx.serialization.json.b bVar;
            kotlin.jvm.internal.m.e(decoder, "decoder");
            kotlinx.serialization.json.c cVarI = p162s8.l.i(((p162s8.k) decoder).i());
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVarI.get("metas");
            if (bVar2 == null || (bVar = (kotlinx.serialization.json.b) p162s8.l.h(bVar2).f24557h.get(0)) == null) {
                throw new java.lang.IllegalStateException(("A presence should at least have metas. Full json: " + cVarI).toString());
            }
            kotlinx.serialization.json.c cVarI2 = p162s8.l.i(bVar);
            kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) cVarI2.get("phx_ref");
            if (bVar3 != null) {
                kotlinx.serialization.json.d dVarJ = p162s8.l.j(bVar3);
                java.lang.String strD = dVarJ instanceof kotlinx.serialization.json.JsonNull ? null : dVarJ.d();
                if (strD != null) {
                    java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(cVarI2);
                    linkedHashMapZ0.remove("phx_ref");
                    return new io.github.jan.supabase.realtime.Presence(strD, new kotlinx.serialization.json.c(linkedHashMapZ0));
                }
            }
            throw new java.lang.IllegalStateException(("A presence should at least have a phx_ref. Full json: " + cVarI).toString());
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(kotlinx.serialization.encoding.Encoder encoder, io.github.jan.supabase.realtime.Presence value) {
            kotlin.jvm.internal.m.e(encoder, "encoder");
            kotlin.jvm.internal.m.e(value, "value");
            p162s8.v vVar = new p162s8.v();
            com.google.common.util.concurrent.P.m0("phx_ref", value.getPresenceRef(), vVar);
            vVar.b(io.sentry.protocol.SentryThread.JsonKeys.STATE, value.getState());
            ((p162s8.o) encoder).w(vVar.a());
        }
    }

    public Presence(java.lang.String presenceRef, kotlinx.serialization.json.c state) {
        kotlin.jvm.internal.m.e(presenceRef, "presenceRef");
        kotlin.jvm.internal.m.e(state, "state");
        this.presenceRef = presenceRef;
        this.state = state;
    }

    public static /* synthetic */ io.github.jan.supabase.realtime.Presence copy$default(io.github.jan.supabase.realtime.Presence presence, java.lang.String str, kotlinx.serialization.json.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = presence.presenceRef;
        }
        if ((i3 & 2) != 0) {
            cVar = presence.state;
        }
        return presence.copy(str, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A descriptor$lambda$0(p135p8.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("phx_ref", p153r8.p0.f26989b, (12 & 8) == 0);
        buildClassSerialDescriptor.a(io.sentry.protocol.SentryThread.JsonKeys.STATE, kotlinx.serialization.json.c.Companion.serializer().getDescriptor(), (12 & 8) == 0);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getPresenceRef() {
        return this.presenceRef;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final kotlinx.serialization.json.c getState() {
        return this.state;
    }

    public final io.github.jan.supabase.realtime.Presence copy(java.lang.String presenceRef, kotlinx.serialization.json.c state) {
        kotlin.jvm.internal.m.e(presenceRef, "presenceRef");
        kotlin.jvm.internal.m.e(state, "state");
        return new io.github.jan.supabase.realtime.Presence(presenceRef, state);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.realtime.Presence)) {
            return false;
        }
        io.github.jan.supabase.realtime.Presence presence = (io.github.jan.supabase.realtime.Presence) other;
        return kotlin.jvm.internal.m.a(this.presenceRef, presence.presenceRef) && kotlin.jvm.internal.m.a(this.state, presence.state);
    }

    public final java.lang.String getPresenceRef() {
        return this.presenceRef;
    }

    public final kotlinx.serialization.json.c getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.f24558h.hashCode() + (this.presenceRef.hashCode() * 31);
    }

    public final <T> T stateAs(io.github.jan.supabase.SupabaseSerializer serializer) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        getState().toString();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> T stateAsOrNull(io.github.jan.supabase.SupabaseSerializer serializer) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        try {
            getState().toString();
            kotlin.jvm.internal.m.j();
            throw null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String toString() {
        return "Presence(presenceRef=" + this.presenceRef + ", state=" + this.state + ')';
    }
}
