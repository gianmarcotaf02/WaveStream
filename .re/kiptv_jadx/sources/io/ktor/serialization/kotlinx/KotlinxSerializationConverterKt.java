package io.ktor.serialization.kotlinx;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/serialization/Configuration;", "Lio/ktor/http/ContentType;", "contentType", "Ln8/a;", "format", "Lh6/A;", "serialization", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;Ln8/a;)V", "Ln8/l;", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;Ln8/l;)V", "ktor-serialization-kotlinx"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KotlinxSerializationConverterKt {
    public static final void serialization(io.ktor.serialization.Configuration configuration, io.ktor.http.ContentType contentType, p119n8.a format) {
        kotlin.jvm.internal.m.e(configuration, "<this>");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        kotlin.jvm.internal.m.e(format, "format");
        io.ktor.serialization.Configuration.DefaultImpls.register$default(configuration, contentType, new io.ktor.serialization.kotlinx.KotlinxSerializationConverter(format), null, 4, null);
    }

    public static final void serialization(io.ktor.serialization.Configuration configuration, io.ktor.http.ContentType contentType, p119n8.l format) {
        kotlin.jvm.internal.m.e(configuration, "<this>");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        kotlin.jvm.internal.m.e(format, "format");
        io.ktor.serialization.Configuration.DefaultImpls.register$default(configuration, contentType, new io.ktor.serialization.kotlinx.KotlinxSerializationConverter(format), null, 4, null);
    }
}
