package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p162s8.u f27424a = new p162s8.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p135p8.g f27425b = com.google.crypto.tink.shaded.protobuf.q0.l("kotlinx.serialization.json.JsonNull", p135p8.i.f26282f, new kotlinx.serialization.descriptors.SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        com.google.common.util.concurrent.U.e0(decoder);
        if (decoder.r()) {
            throw new t8.s("Expected 'null' literal");
        }
        return kotlinx.serialization.json.JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27425b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlinx.serialization.json.JsonNull value = (kotlinx.serialization.json.JsonNull) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        com.google.common.util.concurrent.U.d0(encoder);
        encoder.e();
    }
}
