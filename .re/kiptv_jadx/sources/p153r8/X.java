package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class X implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.X f26934a = new p153r8.X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.W f26935b = p153r8.W.f26933a;

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        throw new p119n8.j("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f26935b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        java.lang.Void value = (java.lang.Void) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new p119n8.j("'kotlin.Nothing' cannot be serialized");
    }
}
