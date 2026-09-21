package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.C f26895a = new p153r8.C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f26896b = new p153r8.g0("kotlin.Float", p135p8.e.j);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return java.lang.Float.valueOf(decoder.B());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26896b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        float fFloatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.o(fFloatValue);
    }
}
