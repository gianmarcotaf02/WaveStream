package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.K f26915a = new p153r8.K();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f26916b = new p153r8.g0("kotlin.Int", p135p8.e.f26267k);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return java.lang.Integer.valueOf(decoder.j());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26916b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        int iIntValue = ((java.lang.Number) obj).intValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.x(iIntValue);
    }
}
