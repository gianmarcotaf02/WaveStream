package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.D0 f26899b = new p153r8.D0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p153r8.C2714z f26900a = new p153r8.C2714z("kotlin.Unit", p070h6.A.f22523a);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        this.f26900a.deserialize(decoder);
        return p070h6.A.f22523a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.f26900a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        p070h6.A value = (p070h6.A) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        this.f26900a.serialize(encoder, value);
    }
}
