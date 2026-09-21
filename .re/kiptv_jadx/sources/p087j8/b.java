package p087j8;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p087j8.b f24335a = new p087j8.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f24336b = com.google.crypto.tink.shaded.protobuf.q0.d("kotlinx.datetime.LocalDate", p135p8.e.f26270n);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p036d8.e eVar = p036d8.g.Companion;
        java.lang.String input = decoder.m();
        int i3 = p036d8.f.f21304a;
        p070h6.p pVar = p045e8.K.f21509a;
        p045e8.AbstractC2118a format = (p045e8.AbstractC2118a) pVar.getValue();
        eVar.getClass();
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(format, "format");
        if (format != ((p045e8.AbstractC2118a) pVar.getValue())) {
            return (p036d8.g) format.c(input);
        }
        try {
            return new p036d8.g(j$.time.LocalDate.parse(input));
        } catch (j$.time.format.DateTimeParseException e6) {
            throw new p036d8.a(e6);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f24336b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        p036d8.g value = (p036d8.g) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.F(value.toString());
    }
}
