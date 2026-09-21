package io.ktor.client.plugins;

import E6.InterfaceC0331d;
import E6.v;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.plugins.api.SetupRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p070h6.A;
import p078i6.o;
import p100l6.h;
import p194x6.j;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"(\u0010 \u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*B\u0010%\"\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0!2\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0!*B\u0010'\"\u001e\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0!2\u001e\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0!*N\u0010)\"$\b\u0001\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0(2$\b\u0001\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0(¨\u0006*"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/request/HttpRequest;", "HttpRequest", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpCallValidatorConfig;", "Lh6/A;", "block", "HttpResponseValidator", "(Lio/ktor/client/HttpClientConfig;Lx6/j;)V", "LP8/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "LP8/b;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpCallValidator", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpCallValidator", "()Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/util/AttributeKey;", "", "ExpectSuccessAttributeKey", "Lio/ktor/util/AttributeKey;", "getExpectSuccessAttributeKey", "()Lio/ktor/util/AttributeKey;", "value", "getExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;)Z", "setExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;Z)V", "expectSuccess", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Ll6/c;", "", "ResponseValidator", "", "CallExceptionHandler", "Lkotlin/Function3;", "CallRequestExceptionHandler", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpCallValidatorKt {
    private static final AttributeKey<Boolean> ExpectSuccessAttributeKey;
    private static final P8.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");
    private static final ClientPlugin<HttpCallValidatorConfig> HttpCallValidator = CreatePluginUtilsKt.createClientPlugin("HttpResponseValidator", HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new io.ktor.client.a(7));

    static {
        v vVarA;
        InterfaceC0331d interfaceC0331dB = B.f24540a.b(Boolean.class);
        try {
            vVarA = B.a(Boolean.TYPE);
        } catch (Throwable unused) {
            vVarA = null;
        }
        ExpectSuccessAttributeKey = new AttributeKey<>("ExpectSuccessAttributeKey", new TypeInfo(interfaceC0331dB, vVarA));
    }

    public static final A HttpCallValidator$lambda$2(ClientPluginBuilder createClientPlugin) {
        m.e(createClientPlugin, "$this$createClientPlugin");
        List listB1 = o.B1(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getResponseValidators$ktor_client_core());
        List listB2 = o.B1(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getResponseExceptionHandlers$ktor_client_core());
        createClientPlugin.on(SetupRequest.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$1(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getExpectSuccess(), null));
        createClientPlugin.on(Send.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$2(listB1, null));
        createClientPlugin.on(RequestError.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$3(listB2, null));
        createClientPlugin.on(ReceiveError.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$4(listB2, null));
        return A.f22523a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object HttpCallValidator$lambda$2$processException(java.util.List<? extends io.ktor.client.plugins.HandlerWrapper> r7, java.lang.Throwable r8, io.ktor.client.request.HttpRequest r9, p100l6.c r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$1
            io.ktor.client.request.HttpRequest r8 = (io.ktor.client.request.HttpRequest) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            com.google.common.util.concurrent.P.u0(r10)
            goto L8d
        L3f:
            com.google.common.util.concurrent.P.u0(r10)
            P8.b r10 = io.ktor.client.plugins.HttpCallValidatorKt.LOGGER
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Processing exception "
            r2.<init>(r5)
            r2.append(r8)
            java.lang.String r5 = " for request "
            r2.append(r5)
            io.ktor.http.Url r5 = r9.getUrl()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r10.i(r2)
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lb0
            java.lang.Object r10 = r7.next()
            io.ktor.client.plugins.HandlerWrapper r10 = (io.ktor.client.plugins.HandlerWrapper) r10
            boolean r2 = r10 instanceof io.ktor.client.plugins.ExceptionHandlerWrapper
            if (r2 == 0) goto L91
            io.ktor.client.plugins.ExceptionHandlerWrapper r10 = (io.ktor.client.plugins.ExceptionHandlerWrapper) r10
            x6.m r10 = r10.getHandler()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r10 = r10.invoke(r8, r0)
            if (r10 != r1) goto L8a
            goto La9
        L8a:
            r6 = r9
            r9 = r8
            r8 = r6
        L8d:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L65
        L91:
            boolean r2 = r10 instanceof io.ktor.client.plugins.RequestExceptionHandlerWrapper
            if (r2 == 0) goto Laa
            io.ktor.client.plugins.RequestExceptionHandlerWrapper r10 = (io.ktor.client.plugins.RequestExceptionHandlerWrapper) r10
            x6.n r10 = r10.getHandler()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r10 = r10.invoke(r8, r9, r0)
            if (r10 != r1) goto L8a
        La9:
            return r1
        Laa:
            I3.b r7 = new I3.b
            r7.<init>()
            throw r7
        Lb0:
            h6.A r7 = p070h6.A.f22523a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidatorKt.HttpCallValidator$lambda$2$processException(java.util.List, java.lang.Throwable, io.ktor.client.request.HttpRequest, l6.c):java.lang.Object");
    }

    public static final Object HttpCallValidator$lambda$2$validateResponse(List<? extends p194x6.m> list, HttpResponse httpResponse, p100l6.c cVar) {
        HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 httpCallValidatorKt$HttpCallValidator$2$validateResponse$1;
        Iterator it;
        if (cVar instanceof HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) {
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = (HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) cVar;
            int i3 = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label = i3 - Integer.MIN_VALUE;
            } else {
                httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = new HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(cVar);
            }
        } else {
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = new HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(cVar);
        }
        Object obj = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
        if (i9 == 0) {
            P.u0(obj);
            LOGGER.i("Validating response for request " + httpResponse.getCall().getRequest().getUrl());
            it = list.iterator();
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1;
            httpResponse = (HttpResponse) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0;
            P.u0(obj);
        }
        while (it.hasNext()) {
            p194x6.m mVar = (p194x6.m) it.next();
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0 = httpResponse;
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1 = it;
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label = 1;
            if (mVar.invoke(httpResponse, httpCallValidatorKt$HttpCallValidator$2$validateResponse$1) == aVar) {
                return aVar;
            }
        }
        return A.f22523a;
    }

    public static final HttpRequest HttpRequest(HttpRequestBuilder httpRequestBuilder) {
        return new HttpRequest() {
            private final Attributes attributes;
            private final Headers headers;
            private final HttpMethod method;
            private final Url url;

            {
                this.method = this.$builder.getMethod();
                this.url = this.$builder.getUrl().build();
                this.attributes = this.$builder.getAttributes();
                this.headers = this.$builder.getHeaders().build();
            }

            @Override
            public Attributes getAttributes() {
                return this.attributes;
            }

            @Override
            public HttpClientCall getCall() {
                throw new IllegalStateException("Call is not initialized");
            }

            @Override
            public OutgoingContent getContent() {
                Object body = this.$builder.getBody();
                OutgoingContent outgoingContent = body instanceof OutgoingContent ? (OutgoingContent) body : null;
                if (outgoingContent != null) {
                    return outgoingContent;
                }
                throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + this.$builder.getBody()).toString());
            }

            @Override
            public h getCoroutineContext() {
                return HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override
            public Headers getHeaders() {
                return this.headers;
            }

            @Override
            public HttpMethod getMethod() {
                return this.method;
            }

            @Override
            public Url getUrl() {
                return this.url;
            }
        };
    }

    public static final void HttpResponseValidator(HttpClientConfig<?> httpClientConfig, j block) {
        m.e(httpClientConfig, "<this>");
        m.e(block, "block");
        httpClientConfig.install(HttpCallValidator, block);
    }

    public static final boolean getExpectSuccess(HttpRequestBuilder httpRequestBuilder) {
        m.e(httpRequestBuilder, "<this>");
        Boolean bool = (Boolean) httpRequestBuilder.getAttributes().getOrNull(ExpectSuccessAttributeKey);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final AttributeKey<Boolean> getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }

    public static final ClientPlugin<HttpCallValidatorConfig> getHttpCallValidator() {
        return HttpCallValidator;
    }

    public static final void setExpectSuccess(HttpRequestBuilder httpRequestBuilder, boolean z6) {
        m.e(httpRequestBuilder, "<this>");
        httpRequestBuilder.getAttributes().put(ExpectSuccessAttributeKey, Boolean.valueOf(z6));
    }
}
