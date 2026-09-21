package io.ktor.client.plugins;

import E6.InterfaceC0331d;
import E6.v;
import S7.C;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p121o0.p;
import p194x6.j;
import p194x6.n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0004\u0015\u0014\u0016\u0017B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000e\u001a\u00020\r2,\u0010\f\u001a(\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R@\u0010\u0012\u001a.\u0012*\u0012(\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lio/ktor/client/plugins/HttpSend;", "", "", "maxSendCount", "<init>", "(I)V", "Lkotlin/Function3;", "Lio/ktor/client/plugins/Sender;", "Lio/ktor/client/request/HttpRequestBuilder;", "Ll6/c;", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/HttpSendInterceptor;", "block", "Lh6/A;", "intercept", "(Lx6/n;)V", "I", "", "interceptors", "Ljava/util/List;", "Plugin", "Config", "InterceptedSender", "DefaultSender", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpSend {

    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey<HttpSend> key;
    private final List<n> interceptors;
    private final int maxSendCount;

    @KtorDsl
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/HttpSend$Config;", "", "<init>", "()V", "", "maxSendCount", "I", "getMaxSendCount", "()I", "setMaxSendCount", "(I)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Config {
        private int maxSendCount = 20;

        public final int getMaxSendCount() {
            return this.maxSendCount;
        }

        public final void setMaxSendCount(int i3) {
            this.maxSendCount = i3;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/client/plugins/HttpSend$DefaultSender;", "Lio/ktor/client/plugins/Sender;", "", "maxSendCount", "Lio/ktor/client/HttpClient;", "client", "<init>", "(ILio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "requestBuilder", "Lio/ktor/client/call/HttpClientCall;", "execute", "(Lio/ktor/client/request/HttpRequestBuilder;Ll6/c;)Ljava/lang/Object;", "I", "Lio/ktor/client/HttpClient;", "sentCount", "currentCall", "Lio/ktor/client/call/HttpClientCall;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultSender implements Sender {
        private final HttpClient client;
        private HttpClientCall currentCall;
        private final int maxSendCount;
        private int sentCount;

        public DefaultSender(int i3, HttpClient client) {
            m.e(client, "client");
            this.maxSendCount = i3;
            this.client = client;
        }

        @Override
        public Object execute(HttpRequestBuilder httpRequestBuilder, p100l6.c cVar) {
            HttpSend$DefaultSender$execute$1 httpSend$DefaultSender$execute$1;
            DefaultSender defaultSender;
            if (cVar instanceof HttpSend$DefaultSender$execute$1) {
                httpSend$DefaultSender$execute$1 = (HttpSend$DefaultSender$execute$1) cVar;
                int i3 = httpSend$DefaultSender$execute$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    httpSend$DefaultSender$execute$1.label = i3 - Integer.MIN_VALUE;
                } else {
                    httpSend$DefaultSender$execute$1 = new HttpSend$DefaultSender$execute$1(this, cVar);
                }
            } else {
                httpSend$DefaultSender$execute$1 = new HttpSend$DefaultSender$execute$1(this, cVar);
            }
            Object objExecute = httpSend$DefaultSender$execute$1.result;
            p109m6.a aVar = p109m6.a.f25430h;
            int i9 = httpSend$DefaultSender$execute$1.label;
            if (i9 == 0) {
                P.u0(objExecute);
                HttpClientCall httpClientCall = this.currentCall;
                if (httpClientCall != null) {
                    C.i(httpClientCall, null);
                }
                int i10 = this.sentCount;
                if (i10 >= this.maxSendCount) {
                    throw new SendCountExceedException(Y6.f.k(new StringBuilder("Max send count "), this.maxSendCount, " exceeded. Consider increasing the property maxSendCount if more is required."));
                }
                this.sentCount = i10 + 1;
                HttpSendPipeline sendPipeline = this.client.getSendPipeline();
                Object body = httpRequestBuilder.getBody();
                httpSend$DefaultSender$execute$1.L$0 = this;
                httpSend$DefaultSender$execute$1.label = 1;
                objExecute = sendPipeline.execute(httpRequestBuilder, body, httpSend$DefaultSender$execute$1);
                if (objExecute == aVar) {
                    return aVar;
                }
                defaultSender = this;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defaultSender = (DefaultSender) httpSend$DefaultSender$execute$1.L$0;
                P.u0(objExecute);
            }
            HttpClientCall httpClientCall2 = objExecute instanceof HttpClientCall ? (HttpClientCall) objExecute : null;
            if (httpClientCall2 == null) {
                throw new IllegalStateException(p.n(objExecute, "Failed to execute send pipeline. Expected [HttpClientCall], but received "));
            }
            defaultSender.currentCall = httpClientCall2;
            return httpClientCall2;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B=\u0012,\u0010\b\u001a(\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0002`\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\r\u0010\u000eR:\u0010\b\u001a(\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/HttpSend$InterceptedSender;", "Lio/ktor/client/plugins/Sender;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "Ll6/c;", "Lio/ktor/client/call/HttpClientCall;", "", "Lio/ktor/client/plugins/HttpSendInterceptor;", "interceptor", "nextSender", "<init>", "(Lx6/n;Lio/ktor/client/plugins/Sender;)V", "requestBuilder", "execute", "(Lio/ktor/client/request/HttpRequestBuilder;Ll6/c;)Ljava/lang/Object;", "Lx6/n;", "Lio/ktor/client/plugins/Sender;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class InterceptedSender implements Sender {
        private final n interceptor;
        private final Sender nextSender;

        public InterceptedSender(n interceptor, Sender nextSender) {
            m.e(interceptor, "interceptor");
            m.e(nextSender, "nextSender");
            this.interceptor = interceptor;
            this.nextSender = nextSender;
        }

        @Override
        public Object execute(HttpRequestBuilder httpRequestBuilder, p100l6.c cVar) {
            return this.interceptor.invoke(this.nextSender, httpRequestBuilder, cVar);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpSend$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpSend$Config;", "Lio/ktor/client/plugins/HttpSend;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "block", "prepare", "(Lx6/j;)Lio/ktor/client/plugins/HttpSend;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/HttpSend;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements HttpClientPlugin<Config, HttpSend> {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        @Override
        public AttributeKey<HttpSend> getKey() {
            return HttpSend.key;
        }

        private Companion() {
        }

        @Override
        public void install(HttpSend plugin, HttpClient scope) {
            m.e(plugin, "plugin");
            m.e(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getSend(), new HttpSend$Plugin$install$1(plugin, scope, null));
        }

        @Override
        public HttpSend prepare(j block) {
            m.e(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpSend(config.getMaxSendCount(), null);
        }
    }

    static {
        v vVarA = null;
        InterfaceC0331d interfaceC0331dB = B.f24540a.b(HttpSend.class);
        try {
            vVarA = B.a(HttpSend.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("HttpSend", new TypeInfo(interfaceC0331dB, vVarA));
    }

    public HttpSend(int i3, AbstractC2541f abstractC2541f) {
        this(i3);
    }

    public final void intercept(n block) {
        m.e(block, "block");
        this.interceptors.add(block);
    }

    private HttpSend(int i3) {
        this.maxSendCount = i3;
        this.interceptors = new ArrayList();
    }

    public HttpSend(int i3, int i9, AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? 20 : i3);
    }
}
