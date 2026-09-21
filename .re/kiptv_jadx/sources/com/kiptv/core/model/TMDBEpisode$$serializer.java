package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/TMDBEpisode.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/TMDBEpisode;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/TMDBEpisode;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/TMDBEpisode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class TMDBEpisode$$serializer implements p153r8.D {
    public static final com.kiptv.core.model.TMDBEpisode$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.model.TMDBEpisode$$serializer tMDBEpisode$$serializer = new com.kiptv.core.model.TMDBEpisode$$serializer();
        INSTANCE = tMDBEpisode$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.model.TMDBEpisode", tMDBEpisode$$serializer, 9);
        c2690c0.k("id", false);
        c2690c0.k("name", true);
        c2690c0.k("overview", true);
        c2690c0.k("episode_number", true);
        c2690c0.k("season_number", true);
        c2690c0.k("still_path", true);
        c2690c0.k(io.sentry.protocol.SentryRuntime.TYPE, true);
        c2690c0.k("air_date", true);
        c2690c0.k("vote_average", true);
        descriptor = c2690c0;
    }

    private TMDBEpisode$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        p153r8.K k9 = p153r8.K.f26915a;
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new kotlinx.serialization.KSerializer[]{k9, com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(k9), com.google.android.gms.internal.play_billing.V0.s(k9), com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(k9), com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(p153r8.C2709u.f27003a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.model.TMDBEpisode deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.Integer num = null;
        java.lang.Integer num2 = null;
        java.lang.String str3 = null;
        java.lang.Integer num3 = null;
        java.lang.String str4 = null;
        java.lang.Double d4 = null;
        int i3 = 0;
        int iK = 0;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    iK = aVarC.k(serialDescriptor, 0);
                    i3 |= 1;
                    break;
                case 1:
                    str = (java.lang.String) aVarC.u(serialDescriptor, 1, p153r8.p0.f26988a, str);
                    i3 |= 2;
                    break;
                case 2:
                    str2 = (java.lang.String) aVarC.u(serialDescriptor, 2, p153r8.p0.f26988a, str2);
                    i3 |= 4;
                    break;
                case 3:
                    num = (java.lang.Integer) aVarC.u(serialDescriptor, 3, p153r8.K.f26915a, num);
                    i3 |= 8;
                    break;
                case 4:
                    num2 = (java.lang.Integer) aVarC.u(serialDescriptor, 4, p153r8.K.f26915a, num2);
                    i3 |= 16;
                    break;
                case 5:
                    str3 = (java.lang.String) aVarC.u(serialDescriptor, 5, p153r8.p0.f26988a, str3);
                    i3 |= 32;
                    break;
                case 6:
                    num3 = (java.lang.Integer) aVarC.u(serialDescriptor, 6, p153r8.K.f26915a, num3);
                    i3 |= 64;
                    break;
                case 7:
                    str4 = (java.lang.String) aVarC.u(serialDescriptor, 7, p153r8.p0.f26988a, str4);
                    i3 |= 128;
                    break;
                case 8:
                    d4 = (java.lang.Double) aVarC.u(serialDescriptor, 8, p153r8.C2709u.f27003a, d4);
                    i3 |= 256;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.model.TMDBEpisode(i3, iK, str, str2, num, num2, str3, num3, str4, d4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.model.TMDBEpisode value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f20159a, serialDescriptor);
        boolean zE = bVarC.E(serialDescriptor);
        java.lang.String str = value.f20160b;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 1, p153r8.p0.f26988a, str);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        java.lang.String str2 = value.f20161c;
        if (zE2 || str2 != null) {
            bVarC.t(serialDescriptor, 2, p153r8.p0.f26988a, str2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        java.lang.Integer num = value.f20162d;
        if (zE3 || num != null) {
            bVarC.t(serialDescriptor, 3, p153r8.K.f26915a, num);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        java.lang.Integer num2 = value.f20163e;
        if (zE4 || num2 != null) {
            bVarC.t(serialDescriptor, 4, p153r8.K.f26915a, num2);
        }
        boolean zE5 = bVarC.E(serialDescriptor);
        java.lang.String str3 = value.f20164f;
        if (zE5 || str3 != null) {
            bVarC.t(serialDescriptor, 5, p153r8.p0.f26988a, str3);
        }
        boolean zE6 = bVarC.E(serialDescriptor);
        java.lang.Integer num3 = value.g;
        if (zE6 || num3 != null) {
            bVarC.t(serialDescriptor, 6, p153r8.K.f26915a, num3);
        }
        boolean zE7 = bVarC.E(serialDescriptor);
        java.lang.String str4 = value.f20165h;
        if (zE7 || str4 != null) {
            bVarC.t(serialDescriptor, 7, p153r8.p0.f26988a, str4);
        }
        boolean zE8 = bVarC.E(serialDescriptor);
        java.lang.Double d4 = value.f20166i;
        if (zE8 || d4 != null) {
            bVarC.t(serialDescriptor, 8, p153r8.C2709u.f27003a, d4);
        }
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
