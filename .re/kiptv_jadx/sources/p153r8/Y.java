package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.KSerializer f26936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p153r8.j0 f26937b;

    public Y(kotlinx.serialization.KSerializer serializer) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        this.f26936a = serializer;
        this.f26937b = new p153r8.j0(serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        if (decoder.r()) {
            return decoder.p(this.f26936a);
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p153r8.Y.class == obj.getClass() && kotlin.jvm.internal.m.a(this.f26936a, ((p153r8.Y) obj).f26936a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.f26937b;
    }

    public final int hashCode() {
        return this.f26936a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        if (obj != null) {
            encoder.z(this.f26936a, obj);
        } else {
            encoder.e();
        }
    }
}
