package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.p0 f26988a = new p153r8.p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f26989b = new p153r8.g0("kotlin.String", p135p8.e.f26270n);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return decoder.m();
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26989b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.F(value);
    }
}
