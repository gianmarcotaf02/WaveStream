package io.ktor.client.plugins.contentnegotiation;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"$\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "", "Lio/ktor/http/ContentType;", "contentType", "Lh6/A;", "exclude", "(Lio/ktor/client/request/HttpRequestBuilder;[Lio/ktor/http/ContentType;)V", "LP8/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "LP8/b;", "", "LE6/d;", "DefaultCommonIgnoredTypes", "Ljava/util/Set;", "getDefaultCommonIgnoredTypes", "()Ljava/util/Set;", "Lio/ktor/util/AttributeKey;", "", "ExcludedContentTypes", "Lio/ktor/util/AttributeKey;", "getExcludedContentTypes", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig;", "ContentNegotiation", "Lio/ktor/client/plugins/api/ClientPlugin;", "getContentNegotiation", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getContentNegotiation$annotations", "()V", "ktor-client-content-negotiation"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContentNegotiationKt {
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> ContentNegotiation;
    private static final java.util.Set<E6.InterfaceC0331d> DefaultCommonIgnoredTypes;
    private static final io.ktor.util.AttributeKey<java.util.List<io.ktor.http.ContentType>> ExcludedContentTypes;
    private static final P8.b LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");

    static {
        E6.v vVarB;
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        DefaultCommonIgnoredTypes = p078i6.m.F0(new E6.InterfaceC0331d[]{c9.b(byte[].class), c9.b(java.lang.String.class), c9.b(io.ktor.http.HttpStatusCode.class), c9.b(io.ktor.utils.io.ByteReadChannel.class), c9.b(io.ktor.http.content.OutgoingContent.class)});
        E6.InterfaceC0331d interfaceC0331dB = c9.b(java.util.List.class);
        try {
            E6.y yVar = E6.y.f3222c;
            vVarB = kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(io.ktor.http.ContentType.class)));
        } catch (java.lang.Throwable unused) {
            vVarB = null;
        }
        ExcludedContentTypes = new io.ktor.util.AttributeKey<>("ExcludedContentTypesAttr", new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarB));
        ContentNegotiation = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("ContentNegotiation", io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$1.INSTANCE, new io.ktor.client.a(18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A ContentNegotiation$lambda$16(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.m.e(createClientPlugin, "$this$createClientPlugin");
        java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> registrations$ktor_client_content_negotiation = ((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig) createClientPlugin.getPluginConfig()).getRegistrations$ktor_client_content_negotiation();
        java.util.Set<E6.InterfaceC0331d> ignoredTypes$ktor_client_content_negotiation = ((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig) createClientPlugin.getPluginConfig()).getIgnoredTypes$ktor_client_content_negotiation();
        createClientPlugin.transformRequestBody(new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$1(registrations$ktor_client_content_negotiation, ignoredTypes$ktor_client_content_negotiation, createClientPlugin, null));
        createClientPlugin.transformResponseBody(new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$2(ignoredTypes$ktor_client_content_negotiation, registrations$ktor_client_content_negotiation, createClientPlugin, null));
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0278 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x0279  */
    /* JADX WARN: Code duplicated, block: B:106:0x0282  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x023f  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0261  */
    /* JADX WARN: Code duplicated, block: B:99:0x0263  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0279 -> B:104:0x027e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object ContentNegotiation$lambda$16$convertRequest(java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> r15, java.util.Set<? extends E6.InterfaceC0331d> r16, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> r17, io.ktor.client.request.HttpRequestBuilder r18, java.lang.Object r19, p100l6.c r20) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.ContentNegotiation$lambda$16$convertRequest(java.util.List, java.util.Set, io.ktor.client.plugins.api.ClientPluginBuilder, io.ktor.client.request.HttpRequestBuilder, java.lang.Object, l6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence ContentNegotiation$lambda$16$convertRequest$lambda$11(io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration it) {
        kotlin.jvm.internal.m.e(it, "it");
        return it.getConverter().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object ContentNegotiation$lambda$16$convertResponse(java.util.Set<? extends E6.InterfaceC0331d> set, java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> list, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> clientPluginBuilder, io.ktor.http.Url url, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, io.ktor.http.ContentType contentType, java.nio.charset.Charset charset, p100l6.c cVar) {
        io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1 contentNegotiationKt$ContentNegotiation$2$convertResponse$1;
        if (cVar instanceof io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1) {
            contentNegotiationKt$ContentNegotiation$2$convertResponse$1 = (io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1) cVar;
            int i3 = contentNegotiationKt$ContentNegotiation$2$convertResponse$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                contentNegotiationKt$ContentNegotiation$2$convertResponse$1.label = i3 - Integer.MIN_VALUE;
            } else {
                contentNegotiationKt$ContentNegotiation$2$convertResponse$1 = new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1(cVar);
            }
        } else {
            contentNegotiationKt$ContentNegotiation$2$convertResponse$1 = new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1(cVar);
        }
        java.lang.Object objDeserialize = contentNegotiationKt$ContentNegotiation$2$convertResponse$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = contentNegotiationKt$ContentNegotiation$2$convertResponse$1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objDeserialize);
            if (!(obj instanceof io.ktor.utils.io.ByteReadChannel)) {
                LOGGER.i("Response body is already transformed. Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            if (set.contains(typeInfo.getType())) {
                LOGGER.i("Response body type " + typeInfo.getType() + " is in ignored types. Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) obj2).getContentTypeMatcher().contains(contentType)) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) it.next()).getConverter());
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                LOGGER.i("None of the registered converters match response with Content-Type=" + contentType + ". Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            contentNegotiationKt$ContentNegotiation$2$convertResponse$1.L$0 = url;
            contentNegotiationKt$ContentNegotiation$2$convertResponse$1.label = 1;
            objDeserialize = io.ktor.serialization.ContentConverterKt.deserialize(arrayList2, (io.ktor.utils.io.ByteReadChannel) obj, typeInfo, charset, contentNegotiationKt$ContentNegotiation$2$convertResponse$1);
            if (objDeserialize == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (io.ktor.http.Url) contentNegotiationKt$ContentNegotiation$2$convertResponse$1.L$0;
            com.google.common.util.concurrent.P.u0(objDeserialize);
        }
        if (!(objDeserialize instanceof io.ktor.utils.io.ByteReadChannel)) {
            LOGGER.i("Response body was converted to " + kotlin.jvm.internal.B.f24540a.b(objDeserialize.getClass()) + " for " + url + '.');
        }
        return objDeserialize;
    }

    public static final void exclude(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.ContentType... contentType) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        io.ktor.util.Attributes attributes = httpRequestBuilder.getAttributes();
        io.ktor.util.AttributeKey<java.util.List<io.ktor.http.ContentType>> attributeKey = ExcludedContentTypes;
        java.util.Collection collection = (java.util.List) attributes.getOrNull(attributeKey);
        if (collection == null) {
            collection = p078i6.w.f23205h;
        }
        io.ktor.util.Attributes attributes2 = httpRequestBuilder.getAttributes();
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size() + contentType.length);
        arrayList.addAll(collection);
        p078i6.u.N0(arrayList, contentType);
        attributes2.put(attributeKey, arrayList);
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> getContentNegotiation() {
        return ContentNegotiation;
    }

    public static /* synthetic */ void getContentNegotiation$annotations() {
    }

    public static final java.util.Set<E6.InterfaceC0331d> getDefaultCommonIgnoredTypes() {
        return DefaultCommonIgnoredTypes;
    }

    public static final io.ktor.util.AttributeKey<java.util.List<io.ktor.http.ContentType>> getExcludedContentTypes() {
        return ExcludedContentTypes;
    }
}
