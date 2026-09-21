package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.t0 f27001a = new p153r8.t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.G f27002b = p153r8.AbstractC2686a0.a("kotlin.UByte", p153r8.C2699j.f26971a);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return new p070h6.r(decoder.v(f27002b).z());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27002b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        byte b9 = ((p070h6.r) obj).f22549h;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.y(f27002b).i(b9);
    }
}
