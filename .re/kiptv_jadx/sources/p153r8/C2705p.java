package p153r8;

/* JADX INFO: renamed from: r8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2705p implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.C2705p f26986a = new p153r8.C2705p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f26987b = new p153r8.g0("kotlin.Char", p135p8.e.f26265h);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return java.lang.Character.valueOf(decoder.f());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26987b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        char cCharValue = ((java.lang.Character) obj).charValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.p(cCharValue);
    }
}
