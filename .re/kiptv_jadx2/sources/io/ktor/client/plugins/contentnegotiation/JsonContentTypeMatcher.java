package io.ktor.client.plugins.contentnegotiation;

import O7.x;
import androidx.media3.container.NalUnitUtil;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypeMatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/JsonContentTypeMatcher;", "Lio/ktor/http/ContentTypeMatcher;", "<init>", "()V", "Lio/ktor/http/ContentType;", "contentType", "", "contains", "(Lio/ktor/http/ContentType;)Z", "ktor-client-content-negotiation"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JsonContentTypeMatcher implements ContentTypeMatcher {
    public static final JsonContentTypeMatcher INSTANCE = new JsonContentTypeMatcher();

    private JsonContentTypeMatcher() {
    }

    @Override
    public boolean contains(ContentType contentType) {
        m.e(contentType, "contentType");
        ContentType.Application application = ContentType.Application.INSTANCE;
        if (contentType.match(application.getJson())) {
            return true;
        }
        String string = contentType.withoutParameters().toString();
        return application.contains(string) && x.q0(string, "+json", true);
    }
}
