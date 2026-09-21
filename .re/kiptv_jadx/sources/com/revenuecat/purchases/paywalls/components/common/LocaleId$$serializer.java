package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/LocaleId.$serializer", "Lr8/D;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-8pYHj4M", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/String;", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize-64pKzr8", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/String;)V", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public final class LocaleId$$serializer implements p153r8.D {
    public static final com.revenuecat.purchases.paywalls.components.common.LocaleId$$serializer INSTANCE;
    private static final /* synthetic */ p153r8.G descriptor;

    static {
        com.revenuecat.purchases.paywalls.components.common.LocaleId$$serializer localeId$$serializer = new com.revenuecat.purchases.paywalls.components.common.LocaleId$$serializer();
        INSTANCE = localeId$$serializer;
        p153r8.G g = new p153r8.G("com.revenuecat.purchases.paywalls.components.common.LocaleId", localeId$$serializer);
        g.k("value", false);
        descriptor = g;
    }

    private LocaleId$$serializer() {
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{p153r8.p0.f26988a};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* bridge */ /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        return com.revenuecat.purchases.paywalls.components.common.LocaleId.m221boximpl(m228deserialize8pYHj4M(decoder));
    }

    /* JADX INFO: renamed from: deserialize-8pYHj4M, reason: not valid java name */
    public java.lang.String m228deserialize8pYHj4M(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return com.revenuecat.purchases.paywalls.components.common.LocaleId.m222constructorimpl(decoder.v(getDescriptor()).m());
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* bridge */ /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        m229serialize64pKzr8(encoder, ((com.revenuecat.purchases.paywalls.components.common.LocaleId) obj).m227unboximpl());
    }

    /* JADX INFO: renamed from: serialize-64pKzr8, reason: not valid java name */
    public void m229serialize64pKzr8(kotlinx.serialization.encoding.Encoder encoder, java.lang.String value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.encoding.Encoder encoderY = encoder.y(getDescriptor());
        if (encoderY == null) {
            return;
        }
        encoderY.F(value);
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
