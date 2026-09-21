package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest;", "", "Lkotlin/Function1;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lh6/A;", "block", "<init>", "(Lx6/j;)V", "Lx6/j;", "Plugin", "DefaultRequestBuilder", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultRequest {

    /* JADX INFO: renamed from: Plugin, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.DefaultRequest.Companion INSTANCE = new io.ktor.client.plugins.DefaultRequest.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.DefaultRequest> key;
    private final p194x6.j block;

    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJS\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\u0010J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u0012J!\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\f\u001a\u00020\n2\u0006\u0010!\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0012R$\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/http/URLBuilder;", "Lh6/A;", "block", io.sentry.protocol.Request.JsonKeys.URL, "(Lx6/j;)V", "", "scheme", com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY, "", "port", "path", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lx6/j;)V", "urlString", "(Ljava/lang/String;)V", "Lio/ktor/util/Attributes;", "setAttributes", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "Lio/ktor/http/URLBuilder;", "getUrl", "()Lio/ktor/http/URLBuilder;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "value", "getHost", "()Ljava/lang/String;", "setHost", "getPort", "()I", "setPort", "(I)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultRequestBuilder implements io.ktor.http.HttpMessageBuilder {
        private final io.ktor.http.HeadersBuilder headers = new io.ktor.http.HeadersBuilder(0, 1, null);
        private final io.ktor.http.URLBuilder url = new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        private final io.ktor.util.Attributes attributes = io.ktor.util.AttributesJvmKt.Attributes(true);

        public static /* synthetic */ void url$default(io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder defaultRequestBuilder, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, p194x6.j jVar, int i3, java.lang.Object obj) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final p070h6.A url$lambda$0(io.ktor.http.URLBuilder uRLBuilder) {
            kotlin.jvm.internal.m.e(uRLBuilder, "<this>");
            return p070h6.A.f22523a;
        }

        public final io.ktor.util.Attributes getAttributes() {
            return this.attributes;
        }

        @Override // io.ktor.http.HttpMessageBuilder
        public io.ktor.http.HeadersBuilder getHeaders() {
            return this.headers;
        }

        public final java.lang.String getHost() {
            return this.url.getHost();
        }

        public final int getPort() {
            return this.url.getPort();
        }

        public final io.ktor.http.URLBuilder getUrl() {
            return this.url;
        }

        public final void setAttributes(p194x6.j block) {
            kotlin.jvm.internal.m.e(block, "block");
            block.invoke(this.attributes);
        }

        public final void setHost(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            this.url.setHost(value);
        }

        public final void setPort(int i3) {
            this.url.setPort(i3);
        }

        public final void url(p194x6.j block) {
            kotlin.jvm.internal.m.e(block, "block");
            block.invoke(this.url);
        }

        public final void url(java.lang.String scheme, java.lang.String host, java.lang.Integer port, java.lang.String path, p194x6.j block) {
            kotlin.jvm.internal.m.e(block, "block");
            io.ktor.http.URLBuilderKt.set(this.url, scheme, host, port, path, block);
        }

        public final void url(java.lang.String urlString) {
            kotlin.jvm.internal.m.e(urlString, "urlString");
            io.ktor.http.URLParserKt.takeFrom(this.url, urlString);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.DefaultRequest$Plugin, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/client/plugins/DefaultRequest;", "<init>", "()V", "Lio/ktor/http/Url;", "baseUrl", "Lio/ktor/http/URLBuilder;", "requestUrl", "Lh6/A;", "mergeUrls", "(Lio/ktor/http/Url;Lio/ktor/http/URLBuilder;)V", "", "", "parent", "child", "concatenatePath", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "block", "prepare", "(Lx6/j;)Lio/ktor/client/plugins/DefaultRequest;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/DefaultRequest;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, io.ktor.client.plugins.DefaultRequest> {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private final java.util.List<java.lang.String> concatenatePath(java.util.List<java.lang.String> parent, java.util.List<java.lang.String> child) {
            if (child.isEmpty()) {
                return parent;
            }
            if (parent.isEmpty() || ((java.lang.CharSequence) p078i6.o.h1(child)).length() == 0) {
                return child;
            }
            p086j6.b bVar = new p086j6.b((child.size() + parent.size()) - 1);
            int size = parent.size() - 1;
            for (int i3 = 0; i3 < size; i3++) {
                bVar.add(parent.get(i3));
            }
            bVar.addAll(child);
            return com.google.common.util.concurrent.P.M(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void mergeUrls(io.ktor.http.Url baseUrl, io.ktor.http.URLBuilder requestUrl) {
            if (requestUrl.getProtocolOrNull() == null) {
                requestUrl.setProtocolOrNull(baseUrl.getProtocolOrNull());
            }
            if (requestUrl.getHost().length() > 0) {
                return;
            }
            io.ktor.http.URLBuilder URLBuilder = io.ktor.http.URLUtilsKt.URLBuilder(baseUrl);
            URLBuilder.setProtocolOrNull(requestUrl.getProtocolOrNull());
            if (requestUrl.getPort() != 0) {
                URLBuilder.setPort(requestUrl.getPort());
            }
            URLBuilder.setEncodedPathSegments(io.ktor.client.plugins.DefaultRequest.INSTANCE.concatenatePath(URLBuilder.getEncodedPathSegments(), requestUrl.getEncodedPathSegments()));
            if (requestUrl.getEncodedFragment().length() > 0) {
                URLBuilder.setEncodedFragment(requestUrl.getEncodedFragment());
            }
            io.ktor.http.ParametersBuilder parametersBuilderParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
            io.ktor.util.StringValuesKt.appendAll(parametersBuilderParametersBuilder$default, URLBuilder.getEncodedParameters());
            URLBuilder.setEncodedParameters(requestUrl.getEncodedParameters());
            java.util.Iterator<T> it = parametersBuilderParametersBuilder$default.entries().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str = (java.lang.String) entry.getKey();
                java.util.List list = (java.util.List) entry.getValue();
                if (!URLBuilder.getEncodedParameters().contains(str)) {
                    URLBuilder.getEncodedParameters().appendAll(str, list);
                }
            }
            io.ktor.http.URLUtilsKt.takeFrom(requestUrl, URLBuilder);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.util.AttributeKey<io.ktor.client.plugins.DefaultRequest> getKey() {
            return io.ktor.client.plugins.DefaultRequest.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(io.ktor.client.plugins.DefaultRequest plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.m.e(plugin, "plugin");
            kotlin.jvm.internal.m.e(scope, "scope");
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getBefore(), new io.ktor.client.plugins.DefaultRequest$Plugin$install$1(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.client.plugins.DefaultRequest prepare(p194x6.j block) {
            kotlin.jvm.internal.m.e(block, "block");
            return new io.ktor.client.plugins.DefaultRequest(block, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        E6.v vVarA = null;
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(io.ktor.client.plugins.DefaultRequest.class);
        try {
            vVarA = kotlin.jvm.internal.B.a(io.ktor.client.plugins.DefaultRequest.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("DefaultRequest", new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA));
    }

    public /* synthetic */ DefaultRequest(p194x6.j jVar, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(jVar);
    }

    private DefaultRequest(p194x6.j jVar) {
        this.block = jVar;
    }
}
