package p153r8;

/* JADX INFO: renamed from: r8.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2709u implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.C2709u f27003a = new p153r8.C2709u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f27004b = new p153r8.g0("kotlin.Double", p135p8.e.f26266i);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return java.lang.Double.valueOf(decoder.E());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27004b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Number) obj).doubleValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.f(dDoubleValue);
    }
}
