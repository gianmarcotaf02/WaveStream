package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.w0 f27015a = new p153r8.w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.G f27016b = p153r8.AbstractC2686a0.a("kotlin.UInt", p153r8.K.f26915a);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return new p070h6.t(decoder.v(f27016b).j());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27016b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        int i3 = ((p070h6.t) obj).f22551h;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.y(f27016b).x(i3);
    }
}
