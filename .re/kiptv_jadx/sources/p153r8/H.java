package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements p153r8.D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.serialization.KSerializer f26911a;

    public H(kotlinx.serialization.KSerializer kSerializer) {
        this.f26911a = kSerializer;
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{this.f26911a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        throw new java.lang.IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        throw new java.lang.IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        throw new java.lang.IllegalStateException("unsupported");
    }
}
