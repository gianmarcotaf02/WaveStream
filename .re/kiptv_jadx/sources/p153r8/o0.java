package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.o0 f26984a = new p153r8.o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f26985b = new p153r8.g0("kotlin.Short", p135p8.e.f26269m);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return java.lang.Short.valueOf(decoder.A());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26985b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        short sShortValue = ((java.lang.Number) obj).shortValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.g(sShortValue);
    }
}
