package io.ktor.client.plugins;

import E6.InterfaceC0331d;
import E6.v;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.ParametersBuilder;
import io.ktor.http.ParametersKt;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.StringValuesKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import io.sentry.protocol.Request;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p070h6.A;
import p078i6.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest;", "", "Lkotlin/Function1;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lh6/A;", "block", "<init>", "(Lx6/j;)V", "Lx6/j;", "Plugin", "DefaultRequestBuilder", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultRequest {

    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey<DefaultRequest> key;
    private final j block;

    @KtorDsl
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJS\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\u0010J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u0012J!\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\f\u001a\u00020\n2\u0006\u0010!\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0012R$\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/http/URLBuilder;", "Lh6/A;", "block", Request.JsonKeys.URL, "(Lx6/j;)V", "", "scheme", DiagnosticsTracker.HOST_KEY, "", "port", "path", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lx6/j;)V", "urlString", "(Ljava/lang/String;)V", "Lio/ktor/util/Attributes;", "setAttributes", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "Lio/ktor/http/URLBuilder;", "getUrl", "()Lio/ktor/http/URLBuilder;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "value", "getHost", "()Ljava/lang/String;", "setHost", "getPort", "()I", "setPort", "(I)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultRequestBuilder implements HttpMessageBuilder {
        private final HeadersBuilder headers = new HeadersBuilder(0, 1, null);
        private final URLBuilder url = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        private final Attributes attributes = AttributesJvmKt.Attributes(true);

        public static void url$default(DefaultRequestBuilder defaultRequestBuilder, String str, String str2, Integer num, String str3, j jVar, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = null;
            }
            if ((i3 & 2) != 0) {
                str2 = null;
            }
            if ((i3 & 4) != 0) {
                num = null;
            }
            if ((i3 & 8) != 0) {
                str3 = null;
            }
            if ((i3 & 16) != 0) {
                jVar = new io.ktor.client.a(5);
            }
            defaultRequestBuilder.url(str, str2, num, str3, jVar);
        }

        public static final A url$lambda$0(URLBuilder uRLBuilder) {
            m.e(uRLBuilder, "<this>");
            return A.f22523a;
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }

        @Override
        public HeadersBuilder getHeaders() {
            return this.headers;
        }

        public final String getHost() {
            return this.url.getHost();
        }

        public final int getPort() {
            return this.url.getPort();
        }

        public final URLBuilder getUrl() {
            return this.url;
        }

        public final void setAttributes(j block) {
            m.e(block, "block");
            block.invoke(this.attributes);
        }

        public final void setHost(String value) {
            m.e(value, "value");
            this.url.setHost(value);
        }

        public final void setPort(int i3) {
            this.url.setPort(i3);
        }

        public final void url(j block) {
            m.e(block, "block");
            block.invoke(this.url);
        }

        public final void url(String scheme, String host, Integer port, String path, j block) {
            m.e(block, "block");
            URLBuilderKt.set(this.url, scheme, host, port, path, block);
        }

        public final void url(String urlString) {
            m.e(urlString, "urlString");
            URLParserKt.takeFrom(this.url, urlString);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/client/plugins/DefaultRequest;", "<init>", "()V", "Lio/ktor/http/Url;", "baseUrl", "Lio/ktor/http/URLBuilder;", "requestUrl", "Lh6/A;", "mergeUrls", "(Lio/ktor/http/Url;Lio/ktor/http/URLBuilder;)V", "", "", "parent", "child", "concatenatePath", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "block", "prepare", "(Lx6/j;)Lio/ktor/client/plugins/DefaultRequest;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/DefaultRequest;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements HttpClientPlugin<DefaultRequestBuilder, DefaultRequest> {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private final List<String> concatenatePath(List<String> parent, List<String> child) {
            if (child.isEmpty()) {
                return parent;
            }
            if (parent.isEmpty() || ((CharSequence) o.h1(child)).length() == 0) {
                return child;
            }
            p086j6.b bVar = new p086j6.b((child.size() + parent.size()) - 1);
            int size = parent.size() - 1;
            for (int i3 = 0; i3 < size; i3++) {
                bVar.add(parent.get(i3));
            }
            bVar.addAll(child);
            return P.M(bVar);
        }

        public final void mergeUrls(Url baseUrl, URLBuilder requestUrl) {
            if (requestUrl.getProtocolOrNull() == null) {
                requestUrl.setProtocolOrNull(baseUrl.getProtocolOrNull());
            }
            if (requestUrl.getHost().length() > 0) {
                return;
            }
            URLBuilder URLBuilder = URLUtilsKt.URLBuilder(baseUrl);
            URLBuilder.setProtocolOrNull(requestUrl.getProtocolOrNull());
            if (requestUrl.getPort() != 0) {
                URLBuilder.setPort(requestUrl.getPort());
            }
            URLBuilder.setEncodedPathSegments(DefaultRequest.INSTANCE.concatenatePath(URLBuilder.getEncodedPathSegments(), requestUrl.getEncodedPathSegments()));
            if (requestUrl.getEncodedFragment().length() > 0) {
                URLBuilder.setEncodedFragment(requestUrl.getEncodedFragment());
            }
            ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
            StringValuesKt.appendAll(parametersBuilderParametersBuilder$default, URLBuilder.getEncodedParameters());
            URLBuilder.setEncodedParameters(requestUrl.getEncodedParameters());
            Iterator<T> it = parametersBuilderParametersBuilder$default.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!URLBuilder.getEncodedParameters().contains(str)) {
                    URLBuilder.getEncodedParameters().appendAll(str, list);
                }
            }
            URLUtilsKt.takeFrom(requestUrl, URLBuilder);
        }

        @Override
        public AttributeKey<DefaultRequest> getKey() {
            return DefaultRequest.key;
        }

        private Companion() {
        }

        @Override
        public void install(DefaultRequest plugin, HttpClient scope) {
            m.e(plugin, "plugin");
            m.e(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getBefore(), new DefaultRequest$Plugin$install$1(plugin, null));
        }

        @Override
        public DefaultRequest prepare(j block) {
            m.e(block, "block");
            return new DefaultRequest(block, null);
        }
    }

    static {
        v vVarA = null;
        InterfaceC0331d interfaceC0331dB = B.f24540a.b(DefaultRequest.class);
        try {
            vVarA = B.a(DefaultRequest.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("DefaultRequest", new TypeInfo(interfaceC0331dB, vVarA));
    }

    public DefaultRequest(j jVar, AbstractC2541f abstractC2541f) {
        this(jVar);
    }

    private DefaultRequest(j jVar) {
        this.block = jVar;
    }
}
