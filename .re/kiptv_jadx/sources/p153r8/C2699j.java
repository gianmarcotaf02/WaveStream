package p153r8;

/* JADX INFO: renamed from: r8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2699j implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.C2699j f26971a = new p153r8.C2699j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f26972b = new p153r8.g0("kotlin.Byte", p135p8.e.g);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return java.lang.Byte.valueOf(decoder.z());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26972b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        byte bByteValue = ((java.lang.Number) obj).byteValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.i(bByteValue);
    }
}
