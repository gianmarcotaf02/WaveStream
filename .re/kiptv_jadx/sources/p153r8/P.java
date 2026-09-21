package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.P f26922a = new p153r8.P();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f26923b = new p153r8.g0("kotlin.Long", p135p8.e.f26268l);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return java.lang.Long.valueOf(decoder.n());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26923b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        long jLongValue = ((java.lang.Number) obj).longValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.C(jLongValue);
    }
}
