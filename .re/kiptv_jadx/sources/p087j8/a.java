package p087j8;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p087j8.a f24333a = new p087j8.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f24334b = com.google.crypto.tink.shaded.protobuf.q0.d("kotlinx.datetime.Instant", p135p8.e.f26270n);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p036d8.c cVar = p036d8.d.Companion;
        java.lang.String input = decoder.m();
        p045e8.r format = p045e8.AbstractC2130m.f21579a;
        cVar.getClass();
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(format, "format");
        try {
            return ((p045e8.C2132o) format.c(input)).a();
        } catch (java.lang.IllegalArgumentException e6) {
            throw new p036d8.a("Failed to parse an instant from '" + ((java.lang.Object) input) + '\'', e6);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f24334b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        p036d8.d value = (p036d8.d) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.F(value.toString());
    }
}
