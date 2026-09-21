package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p162s8.y f27432a = new p162s8.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p135p8.g f27433b = com.google.crypto.tink.shaded.protobuf.q0.l("kotlinx.serialization.json.JsonPrimitive", p135p8.e.f26270n, new kotlinx.serialization.descriptors.SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.json.b bVarI = com.google.common.util.concurrent.U.e0(decoder).i();
        if (bVarI instanceof kotlinx.serialization.json.d) {
            return (kotlinx.serialization.json.d) bVarI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw t8.x.d(com.google.android.gms.internal.play_billing.M0.p(kotlin.jvm.internal.B.f24540a, bVarI.getClass(), sb), bVarI.toString(), -1);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27433b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlinx.serialization.json.d value = (kotlinx.serialization.json.d) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        com.google.common.util.concurrent.U.d0(encoder);
        if (value instanceof kotlinx.serialization.json.JsonNull) {
            encoder.z(p162s8.u.f27424a, kotlinx.serialization.json.JsonNull.INSTANCE);
        } else {
            encoder.z(p162s8.s.f27422a, (p162s8.r) value);
        }
    }
}
