package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.z0 f27029a = new p153r8.z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.G f27030b = p153r8.AbstractC2686a0.a("kotlin.ULong", p153r8.P.f26922a);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return new p070h6.v(decoder.v(f27030b).n());
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27030b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        long j = ((p070h6.v) obj).f22553h;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.y(f27030b).C(j);
    }
}
