package io.ktor.client.plugins.contentnegotiation;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/JsonContentTypeMatcher;", "Lio/ktor/http/ContentTypeMatcher;", "<init>", "()V", "Lio/ktor/http/ContentType;", "contentType", "", "contains", "(Lio/ktor/http/ContentType;)Z", "ktor-client-content-negotiation"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JsonContentTypeMatcher implements io.ktor.http.ContentTypeMatcher {
    public static final io.ktor.client.plugins.contentnegotiation.JsonContentTypeMatcher INSTANCE = new io.ktor.client.plugins.contentnegotiation.JsonContentTypeMatcher();

    private JsonContentTypeMatcher() {
    }

    @Override // io.ktor.http.ContentTypeMatcher
    public boolean contains(io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.m.e(contentType, "contentType");
        io.ktor.http.ContentType.Application application = io.ktor.http.ContentType.Application.INSTANCE;
        if (contentType.match(application.getJson())) {
            return true;
        }
        java.lang.String string = contentType.withoutParameters().toString();
        return application.contains(string) && O7.x.q0(string, "+json", true);
    }
}
