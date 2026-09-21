package p087j8;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p087j8.d f24339a = new p087j8.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f24340b = com.google.crypto.tink.shaded.protobuf.q0.d("kotlinx.datetime.UtcOffset", p135p8.e.f26270n);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p036d8.j jVar = p036d8.k.Companion;
        java.lang.String input = decoder.m();
        p070h6.p pVar = p045e8.n0.f21582a;
        p045e8.m0 format = (p045e8.m0) pVar.getValue();
        jVar.getClass();
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(format, "format");
        if (format == ((p045e8.m0) pVar.getValue())) {
            j$.time.format.DateTimeFormatter dateTimeFormatter = (j$.time.format.DateTimeFormatter) p036d8.n.f21311a.getValue();
            kotlin.jvm.internal.m.d(dateTimeFormatter, "access$getIsoFormat(...)");
            return p036d8.n.a(input, dateTimeFormatter);
        }
        if (format == ((p045e8.m0) p045e8.n0.f21583b.getValue())) {
            j$.time.format.DateTimeFormatter dateTimeFormatter2 = (j$.time.format.DateTimeFormatter) p036d8.n.f21312b.getValue();
            kotlin.jvm.internal.m.d(dateTimeFormatter2, "access$getIsoBasicFormat(...)");
            return p036d8.n.a(input, dateTimeFormatter2);
        }
        if (format != ((p045e8.m0) p045e8.n0.f21584c.getValue())) {
            return (p036d8.k) format.c(input);
        }
        j$.time.format.DateTimeFormatter dateTimeFormatter3 = (j$.time.format.DateTimeFormatter) p036d8.n.f21313c.getValue();
        kotlin.jvm.internal.m.d(dateTimeFormatter3, "access$getFourDigitsFormat(...)");
        return p036d8.n.a(input, dateTimeFormatter3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f24340b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        p036d8.k value = (p036d8.k) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.F(value.toString());
    }
}
