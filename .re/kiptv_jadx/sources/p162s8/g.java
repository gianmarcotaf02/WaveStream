package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p162s8.g f27395a = new p162s8.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p162s8.f f27396b = p162s8.f.f27392b;

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        com.google.common.util.concurrent.U.e0(decoder);
        return new kotlinx.serialization.json.a((java.util.List) com.google.android.gms.internal.play_billing.V0.a(p162s8.m.f27417a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27396b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlinx.serialization.json.a value = (kotlinx.serialization.json.a) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        com.google.common.util.concurrent.U.d0(encoder);
        com.google.android.gms.internal.play_billing.V0.a(p162s8.m.f27417a).serialize(encoder, value);
    }
}
