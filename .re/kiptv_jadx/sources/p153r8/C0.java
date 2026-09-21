package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.C0 f26897a = new p153r8.C0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.G f26898b = p153r8.AbstractC2686a0.a("kotlin.UShort", p153r8.o0.f26984a);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return new p070h6.y(decoder.v(f26898b).A());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26898b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        short s9 = ((p070h6.y) obj).f22556h;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.y(f26898b).g(s9);
    }
}
