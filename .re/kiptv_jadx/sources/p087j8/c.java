package p087j8;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p087j8.c f24337a = new p087j8.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p153r8.g0 f24338b = com.google.crypto.tink.shaded.protobuf.q0.d("kotlinx.datetime.LocalTime", p135p8.e.f26270n);

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p036d8.h hVar = p036d8.i.Companion;
        java.lang.String input = decoder.m();
        p070h6.p pVar = p045e8.N.f21514a;
        p045e8.M format = (p045e8.M) pVar.getValue();
        hVar.getClass();
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(format, "format");
        if (format != ((p045e8.M) pVar.getValue())) {
            return (p036d8.i) format.c(input);
        }
        try {
            return new p036d8.i(j$.time.LocalTime.parse(input));
        } catch (j$.time.format.DateTimeParseException e6) {
            throw new p036d8.a(e6);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f24338b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        p036d8.i value = (p036d8.i) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.F(value.toString());
    }
}
