package io.ktor.http;

import androidx.media3.container.NalUnitUtil;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/http/Url$Companion;", "", "fullUrl", "Lio/ktor/http/Url;", "invoke", "(Lio/ktor/http/Url$Companion;Ljava/lang/String;)Lio/ktor/http/Url;", "Lio/ktor/http/URLBuilder$Companion;", "getOrigin", "(Lio/ktor/http/URLBuilder$Companion;)Ljava/lang/String;", "origin", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class URLBuilderJvmKt {
    public static final String getOrigin(URLBuilder.Companion companion) {
        m.e(companion, "<this>");
        return "http://localhost";
    }

    public static final Url invoke(Url.Companion companion, String fullUrl) {
        m.e(companion, "<this>");
        m.e(fullUrl, "fullUrl");
        URLBuilder uRLBuilder = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        URLUtilsJvmKt.takeFrom(uRLBuilder, new URI(fullUrl));
        return uRLBuilder.build();
    }
}
