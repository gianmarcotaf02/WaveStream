package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/UserSettingsUpsert.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/UserSettingsUpsert;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/UserSettingsUpsert;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/UserSettingsUpsert;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class UserSettingsUpsert$$serializer implements p153r8.D {
    public static final com.kiptv.core.model.UserSettingsUpsert$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.model.UserSettingsUpsert$$serializer userSettingsUpsert$$serializer = new com.kiptv.core.model.UserSettingsUpsert$$serializer();
        INSTANCE = userSettingsUpsert$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.model.UserSettingsUpsert", userSettingsUpsert$$serializer, 15);
        c2690c0.k(io.sentry.TraceContext.JsonKeys.USER_ID, false);
        c2690c0.k("app_language", false);
        c2690c0.k("default_subtitle_language", false);
        c2690c0.k("default_audio_language", false);
        c2690c0.k("autoplay_next_episode", false);
        c2690c0.k("default_start_screen", false);
        c2690c0.k("recently_watched_live", false);
        c2690c0.k("show_recently_added", false);
        c2690c0.k("continue_watching_tap_plays", false);
        c2690c0.k("subtitle_font_size", false);
        c2690c0.k("subtitle_color", false);
        c2690c0.k("subtitle_background", false);
        c2690c0.k("subtitle_position", false);
        c2690c0.k("theme_primary_color", false);
        c2690c0.k("background_style", false);
        descriptor = c2690c0;
    }

    private UserSettingsUpsert$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        p153r8.C2696g c2696g = p153r8.C2696g.f26961a;
        return new kotlinx.serialization.KSerializer[]{p0Var, p0Var, p0Var, p0Var, c2696g, p0Var, c2696g, c2696g, c2696g, p0Var, p0Var, p0Var, p0Var, p0Var, p0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.model.UserSettingsUpsert deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        int i3 = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        java.lang.String strQ = null;
        java.lang.String strQ2 = null;
        java.lang.String strQ3 = null;
        java.lang.String strQ4 = null;
        java.lang.String strQ5 = null;
        java.lang.String strQ6 = null;
        java.lang.String strQ7 = null;
        java.lang.String strQ8 = null;
        java.lang.String strQ9 = null;
        java.lang.String strQ10 = null;
        java.lang.String strQ11 = null;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strQ = aVarC.q(serialDescriptor, 0);
                    i3 |= 1;
                    break;
                case 1:
                    strQ2 = aVarC.q(serialDescriptor, 1);
                    i3 |= 2;
                    break;
                case 2:
                    strQ3 = aVarC.q(serialDescriptor, 2);
                    i3 |= 4;
                    break;
                case 3:
                    strQ4 = aVarC.q(serialDescriptor, 3);
                    i3 |= 8;
                    break;
                case 4:
                    zO = aVarC.o(serialDescriptor, 4);
                    i3 |= 16;
                    break;
                case 5:
                    strQ5 = aVarC.q(serialDescriptor, 5);
                    i3 |= 32;
                    break;
                case 6:
                    zO2 = aVarC.o(serialDescriptor, 6);
                    i3 |= 64;
                    break;
                case 7:
                    zO3 = aVarC.o(serialDescriptor, 7);
                    i3 |= 128;
                    break;
                case 8:
                    zO4 = aVarC.o(serialDescriptor, 8);
                    i3 |= 256;
                    break;
                case 9:
                    strQ6 = aVarC.q(serialDescriptor, 9);
                    i3 |= 512;
                    break;
                case 10:
                    strQ7 = aVarC.q(serialDescriptor, 10);
                    i3 |= 1024;
                    break;
                case 11:
                    strQ8 = aVarC.q(serialDescriptor, 11);
                    i3 |= 2048;
                    break;
                case 12:
                    strQ9 = aVarC.q(serialDescriptor, 12);
                    i3 |= 4096;
                    break;
                case 13:
                    strQ10 = aVarC.q(serialDescriptor, 13);
                    i3 |= 8192;
                    break;
                case 14:
                    strQ11 = aVarC.q(serialDescriptor, 14);
                    i3 |= 16384;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.model.UserSettingsUpsert(i3, strQ, strQ2, strQ3, strQ4, zO, strQ5, zO2, zO3, zO4, strQ6, strQ7, strQ8, strQ9, strQ10, strQ11);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.model.UserSettingsUpsert value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.s(serialDescriptor, 0, value.f20594a);
        bVarC.s(serialDescriptor, 1, value.f20595b);
        bVarC.s(serialDescriptor, 2, value.f20596c);
        bVarC.s(serialDescriptor, 3, value.f20597d);
        bVarC.q(serialDescriptor, 4, value.f20598e);
        bVarC.s(serialDescriptor, 5, value.f20599f);
        bVarC.q(serialDescriptor, 6, value.g);
        bVarC.q(serialDescriptor, 7, value.f20600h);
        bVarC.q(serialDescriptor, 8, value.f20601i);
        bVarC.s(serialDescriptor, 9, value.j);
        bVarC.s(serialDescriptor, 10, value.f20602k);
        bVarC.s(serialDescriptor, 11, value.f20603l);
        bVarC.s(serialDescriptor, 12, value.f20604m);
        bVarC.s(serialDescriptor, 13, value.f20605n);
        bVarC.s(serialDescriptor, 14, value.f20606o);
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
