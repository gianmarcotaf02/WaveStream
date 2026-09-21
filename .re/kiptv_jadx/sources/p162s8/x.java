package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p162s8.x f27430a = new p162s8.x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p162s8.w f27431b = p162s8.w.f27427b;

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        com.google.common.util.concurrent.U.e0(decoder);
        return new kotlinx.serialization.json.c((java.util.Map) com.google.android.gms.internal.play_billing.V0.b(p153r8.p0.f26988a, p162s8.m.f27417a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f27431b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlinx.serialization.json.c value = (kotlinx.serialization.json.c) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        com.google.common.util.concurrent.U.d0(encoder);
        com.google.android.gms.internal.play_billing.V0.b(p153r8.p0.f26988a, p162s8.m.f27417a).serialize(encoder, value);
    }
}
