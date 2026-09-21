package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p162s8.m f27417a = new p162s8.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p135p8.g f27418b = com.google.crypto.tink.shaded.protobuf.q0.k("kotlinx.serialization.json.JsonElement", p135p8.c.g, new kotlinx.serialization.descriptors.SerialDescriptor[0], new q5.i(12));

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return com.google.common.util.concurrent.U.e0(decoder).i();
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27418b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlinx.serialization.json.b value = (kotlinx.serialization.json.b) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        com.google.common.util.concurrent.U.d0(encoder);
        if (value instanceof kotlinx.serialization.json.d) {
            encoder.z(p162s8.y.f27432a, value);
        } else if (value instanceof kotlinx.serialization.json.c) {
            encoder.z(p162s8.x.f27430a, value);
        } else {
            if (!(value instanceof kotlinx.serialization.json.a)) {
                throw new I3.b();
            }
            encoder.z(p162s8.g.f27395a, value);
        }
    }
}
