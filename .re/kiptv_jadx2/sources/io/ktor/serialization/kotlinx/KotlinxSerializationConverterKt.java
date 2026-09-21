package io.ktor.serialization.kotlinx;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.ContentType;
import io.ktor.serialization.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p119n8.a;
import p119n8.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/serialization/Configuration;", "Lio/ktor/http/ContentType;", "contentType", "Ln8/a;", "format", "Lh6/A;", "serialization", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;Ln8/a;)V", "Ln8/l;", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;Ln8/l;)V", "ktor-serialization-kotlinx"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KotlinxSerializationConverterKt {
    public static final void serialization(Configuration configuration, ContentType contentType, a format) {
        m.e(configuration, "<this>");
        m.e(contentType, "contentType");
        m.e(format, "format");
        Configuration.DefaultImpls.register$default(configuration, contentType, new KotlinxSerializationConverter(format), null, 4, null);
    }

    public static final void serialization(Configuration configuration, ContentType contentType, l format) {
        m.e(configuration, "<this>");
        m.e(contentType, "contentType");
        m.e(format, "format");
        Configuration.DefaultImpls.register$default(configuration, contentType, new KotlinxSerializationConverter(format), null, 4, null);
    }
}
