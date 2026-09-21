package p153r8;

/* JADX INFO: renamed from: r8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2696g implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.C2696g f26961a = new p153r8.C2696g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f26962b = new p153r8.g0("kotlin.Boolean", p135p8.e.f26264f);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return java.lang.Boolean.valueOf(decoder.e());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26962b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.j(zBooleanValue);
    }
}
