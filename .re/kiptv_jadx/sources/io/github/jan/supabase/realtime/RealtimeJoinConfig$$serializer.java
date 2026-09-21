package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/github/jan/supabase/realtime/RealtimeJoinConfig.$serializer", "Lr8/D;", "Lio/github/jan/supabase/realtime/RealtimeJoinConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/github/jan/supabase/realtime/RealtimeJoinConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/github/jan/supabase/realtime/RealtimeJoinConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class RealtimeJoinConfig$$serializer implements p153r8.D {
    public static final io.github.jan.supabase.realtime.RealtimeJoinConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        io.github.jan.supabase.realtime.RealtimeJoinConfig$$serializer realtimeJoinConfig$$serializer = new io.github.jan.supabase.realtime.RealtimeJoinConfig$$serializer();
        INSTANCE = realtimeJoinConfig$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("io.github.jan.supabase.realtime.RealtimeJoinConfig", realtimeJoinConfig$$serializer, 4);
        c2690c0.k("broadcast", false);
        c2690c0.k("presence", false);
        c2690c0.k("postgres_changes", false);
        c2690c0.k(io.ktor.client.utils.CacheControl.PRIVATE, false);
        descriptor = c2690c0;
    }

    private RealtimeJoinConfig$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{io.github.jan.supabase.realtime.BroadcastJoinConfig$$serializer.INSTANCE, io.github.jan.supabase.realtime.PresenceJoinConfig$$serializer.INSTANCE, io.github.jan.supabase.realtime.RealtimeJoinConfig.$childSerializers[2], p153r8.C2696g.f26961a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final io.github.jan.supabase.realtime.RealtimeJoinConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr = io.github.jan.supabase.realtime.RealtimeJoinConfig.$childSerializers;
        int i3 = 0;
        boolean zO = false;
        io.github.jan.supabase.realtime.BroadcastJoinConfig broadcastJoinConfig = null;
        io.github.jan.supabase.realtime.PresenceJoinConfig presenceJoinConfig = null;
        java.util.List list = null;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                broadcastJoinConfig = (io.github.jan.supabase.realtime.BroadcastJoinConfig) aVarC.x(serialDescriptor, 0, io.github.jan.supabase.realtime.BroadcastJoinConfig$$serializer.INSTANCE, broadcastJoinConfig);
                i3 |= 1;
            } else if (iS == 1) {
                presenceJoinConfig = (io.github.jan.supabase.realtime.PresenceJoinConfig) aVarC.x(serialDescriptor, 1, io.github.jan.supabase.realtime.PresenceJoinConfig$$serializer.INSTANCE, presenceJoinConfig);
                i3 |= 2;
            } else if (iS == 2) {
                list = (java.util.List) aVarC.x(serialDescriptor, 2, kSerializerArr[2], list);
                i3 |= 4;
            } else {
                if (iS != 3) {
                    throw new p119n8.m(iS);
                }
                zO = aVarC.o(serialDescriptor, 3);
                i3 |= 8;
            }
        }
        aVarC.a(serialDescriptor);
        return new io.github.jan.supabase.realtime.RealtimeJoinConfig(i3, broadcastJoinConfig, presenceJoinConfig, list, zO, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, io.github.jan.supabase.realtime.RealtimeJoinConfig value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        io.github.jan.supabase.realtime.RealtimeJoinConfig.write$Self$realtime_kt_release(value, bVarC, serialDescriptor);
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
