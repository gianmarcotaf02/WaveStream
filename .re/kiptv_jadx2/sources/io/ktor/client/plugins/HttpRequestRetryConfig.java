package io.ktor.client.plugins;

import J.C0535b;
import O7.x;
import S7.C;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.P;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.utils.io.KtorDsl;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p011b1.y;
import p070h6.A;
import p117n6.i;
import p194x6.m;
import p194x6.n;

@KtorDsl
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001bJ1\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00122\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001f0\u0006¢\u0006\u0004\b \u0010!J+\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J?\u0010*\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u001f2\b\b\u0002\u0010)\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+J1\u0010-\u001a\u00020\u00042\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040,\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b-\u0010\u000bJ\u0017\u0010.\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b.\u0010/R:\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R:\u00106\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R4\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001f0\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u000bR>\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040,\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u00109\u001a\u0004\b=\u0010;\"\u0004\b>\u0010\u000bRH\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00062\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b@\u0010;R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u001bR+\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bE\u00103R+\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bF\u00103¨\u0006G"}, d2 = {"Lio/ktor/client/plugins/HttpRequestRetryConfig;", "", "<init>", "()V", "Lh6/A;", "noRetry", "Lkotlin/Function2;", "Lio/ktor/client/plugins/HttpRetryModifyRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "modifyRequest", "(Lx6/m;)V", "", "maxRetries", "Lkotlin/Function3;", "Lio/ktor/client/plugins/HttpRetryShouldRetryContext;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "", "retryIf", "(ILx6/n;)V", "", "retryOnExceptionIf", "retryOnTimeout", "retryOnException", "(IZ)V", "retryOnServerErrors", "(I)V", "retryOnExceptionOrServerErrors", "respectRetryAfterHeader", "Lio/ktor/client/plugins/HttpRetryDelayContext;", "", "delayMillis", "(ZLx6/m;)V", "millis", "randomizationMs", "constantDelay", "(JJZ)V", "", TtmlNode.RUBY_BASE, "baseDelayMs", "maxDelayMs", "exponentialDelay", "(DJJJZ)V", "Ll6/c;", "delay", "randomMs", "(J)J", "shouldRetry", "Lx6/n;", "getShouldRetry$ktor_client_core", "()Lx6/n;", "setShouldRetry$ktor_client_core", "(Lx6/n;)V", "shouldRetryOnException", "getShouldRetryOnException$ktor_client_core", "setShouldRetryOnException$ktor_client_core", "Lx6/m;", "getDelayMillis$ktor_client_core", "()Lx6/m;", "setDelayMillis$ktor_client_core", "getDelay$ktor_client_core", "setDelay$ktor_client_core", "value", "getModifyRequest", "I", "getMaxRetries", "()I", "setMaxRetries", "getRetryIf", "getRetryOnExceptionIf", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpRequestRetryConfig {
    public m delayMillis;
    private int maxRetries;
    public n shouldRetry;
    public n shouldRetryOnException;
    private m delay = new AnonymousClass1(null);
    private m modifyRequest = new y(11);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lh6/A;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.client.plugins.HttpRequestRetryConfig$delay$1", f = "HttpRequestRetry.kt", l = {AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements m {
        long J$0;
        int label;

        public AnonymousClass1(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override
        public final p100l6.c create(Object obj, p100l6.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.J$0 = ((Number) obj).longValue();
            return anonymousClass1;
        }

        public final Object invoke(long j, p100l6.c cVar) {
            return ((AnonymousClass1) create(Long.valueOf(j), cVar)).invokeSuspend(A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                P.u0(obj);
                long j = this.J$0;
                this.label = 1;
                if (C.n(j, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
            return A.f22523a;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (p100l6.c) obj2);
        }
    }

    public HttpRequestRetryConfig() {
        retryOnExceptionOrServerErrors(3);
        exponentialDelay$default(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    public static void constantDelay$default(HttpRequestRetryConfig httpRequestRetryConfig, long j, long j9, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = 1000;
        }
        if ((i3 & 2) != 0) {
            j9 = 1000;
        }
        if ((i3 & 4) != 0) {
            z6 = true;
        }
        httpRequestRetryConfig.constantDelay(j, j9, z6);
    }

    public static final long constantDelay$lambda$7(long j, HttpRequestRetryConfig httpRequestRetryConfig, long j9, HttpRetryDelayContext delayMillis, int i3) {
        kotlin.jvm.internal.m.e(delayMillis, "$this$delayMillis");
        return j + httpRequestRetryConfig.randomMs(j9);
    }

    public static void delayMillis$default(HttpRequestRetryConfig httpRequestRetryConfig, boolean z6, m mVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        httpRequestRetryConfig.delayMillis(z6, mVar);
    }

    public static final long delayMillis$lambda$6(boolean z6, m mVar, HttpRetryDelayContext httpRetryDelayContext, int i3) {
        Headers headers;
        String str;
        Long lA0;
        kotlin.jvm.internal.m.e(httpRetryDelayContext, "<this>");
        if (!z6) {
            return ((Number) mVar.invoke(httpRetryDelayContext, Integer.valueOf(i3))).longValue();
        }
        HttpResponse response = httpRetryDelayContext.getResponse();
        Long lValueOf = (response == null || (headers = response.getHeaders()) == null || (str = headers.get(HttpHeaders.INSTANCE.getRetryAfter())) == null || (lA0 = x.A0(str)) == null) ? null : Long.valueOf(lA0.longValue() * ((long) 1000));
        return Math.max(((Number) mVar.invoke(httpRetryDelayContext, Integer.valueOf(i3))).longValue(), lValueOf != null ? lValueOf.longValue() : 0L);
    }

    public static void exponentialDelay$default(HttpRequestRetryConfig httpRequestRetryConfig, double d4, long j, long j9, long j10, boolean z6, int i3, Object obj) {
        httpRequestRetryConfig.exponentialDelay((i3 & 1) != 0 ? 2.0d : d4, (i3 & 2) != 0 ? 1000L : j, (i3 & 4) != 0 ? 60000L : j9, (i3 & 8) == 0 ? j10 : 1000L, (i3 & 16) != 0 ? true : z6);
    }

    public static final long exponentialDelay$lambda$8(double d4, long j, long j9, HttpRequestRetryConfig httpRequestRetryConfig, long j10, HttpRetryDelayContext delayMillis, int i3) {
        kotlin.jvm.internal.m.e(delayMillis, "$this$delayMillis");
        return Math.min((long) (Math.pow(d4, i3 - 1) * j), j9) + httpRequestRetryConfig.randomMs(j10);
    }

    public static final A modifyRequest$lambda$0(HttpRetryModifyRequestContext httpRetryModifyRequestContext, HttpRequestBuilder it) {
        kotlin.jvm.internal.m.e(httpRetryModifyRequestContext, "<this>");
        kotlin.jvm.internal.m.e(it, "it");
        return A.f22523a;
    }

    public static final boolean noRetry$lambda$1(HttpRetryShouldRetryContext httpRetryShouldRetryContext, HttpRequest httpRequest, HttpResponse httpResponse) {
        kotlin.jvm.internal.m.e(httpRetryShouldRetryContext, "<this>");
        kotlin.jvm.internal.m.e(httpRequest, "<unused var>");
        kotlin.jvm.internal.m.e(httpResponse, "<unused var>");
        return false;
    }

    public static final boolean noRetry$lambda$2(HttpRetryShouldRetryContext httpRetryShouldRetryContext, HttpRequestBuilder httpRequestBuilder, Throwable th) {
        kotlin.jvm.internal.m.e(httpRetryShouldRetryContext, "<this>");
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<unused var>");
        kotlin.jvm.internal.m.e(th, "<unused var>");
        return false;
    }

    private final long randomMs(long randomizationMs) {
        if (randomizationMs == 0) {
            return 0L;
        }
        return B6.d.f818i.h(randomizationMs);
    }

    public static void retryIf$default(HttpRequestRetryConfig httpRequestRetryConfig, int i3, n nVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = -1;
        }
        httpRequestRetryConfig.retryIf(i3, nVar);
    }

    public static void retryOnException$default(HttpRequestRetryConfig httpRequestRetryConfig, int i3, boolean z6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = -1;
        }
        if ((i9 & 2) != 0) {
            z6 = false;
        }
        httpRequestRetryConfig.retryOnException(i3, z6);
    }

    public static final boolean retryOnException$lambda$3(boolean z6, HttpRetryShouldRetryContext retryOnExceptionIf, HttpRequestBuilder httpRequestBuilder, Throwable cause) {
        kotlin.jvm.internal.m.e(retryOnExceptionIf, "$this$retryOnExceptionIf");
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<unused var>");
        kotlin.jvm.internal.m.e(cause, "cause");
        if (HttpRequestRetryKt.isTimeoutException(cause)) {
            return z6;
        }
        return !(cause instanceof CancellationException);
    }

    public static void retryOnExceptionIf$default(HttpRequestRetryConfig httpRequestRetryConfig, int i3, n nVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = -1;
        }
        httpRequestRetryConfig.retryOnExceptionIf(i3, nVar);
    }

    public static void retryOnExceptionOrServerErrors$default(HttpRequestRetryConfig httpRequestRetryConfig, int i3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = -1;
        }
        httpRequestRetryConfig.retryOnExceptionOrServerErrors(i3);
    }

    public static void retryOnServerErrors$default(HttpRequestRetryConfig httpRequestRetryConfig, int i3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = -1;
        }
        httpRequestRetryConfig.retryOnServerErrors(i3);
    }

    public static final boolean retryOnServerErrors$lambda$5(HttpRetryShouldRetryContext retryIf, HttpRequest httpRequest, HttpResponse response) {
        kotlin.jvm.internal.m.e(retryIf, "$this$retryIf");
        kotlin.jvm.internal.m.e(httpRequest, "<unused var>");
        kotlin.jvm.internal.m.e(response, "response");
        int value = response.getStatus().getValue();
        return 500 <= value && value < 600;
    }

    public final void constantDelay(final long millis, final long randomizationMs, boolean respectRetryAfterHeader) {
        if (millis <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (randomizationMs < 0) {
            throw new IllegalStateException("Check failed.");
        }
        delayMillis(respectRetryAfterHeader, new m() {
            @Override
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                HttpRequestRetryConfig httpRequestRetryConfig = this;
                long j = randomizationMs;
                return Long.valueOf(HttpRequestRetryConfig.constantDelay$lambda$7(millis, httpRequestRetryConfig, j, (HttpRetryDelayContext) obj, iIntValue));
            }
        });
    }

    public final void delay(m block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.delay = block;
    }

    public final void delayMillis(boolean respectRetryAfterHeader, m block) {
        kotlin.jvm.internal.m.e(block, "block");
        setDelayMillis$ktor_client_core(new f(respectRetryAfterHeader, block));
    }

    public final void exponentialDelay(final double base, final long baseDelayMs, final long maxDelayMs, final long randomizationMs, boolean respectRetryAfterHeader) {
        if (base <= 0.0d) {
            throw new IllegalStateException("Check failed.");
        }
        if (baseDelayMs <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (maxDelayMs <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (randomizationMs < 0) {
            throw new IllegalStateException("Check failed.");
        }
        delayMillis(respectRetryAfterHeader, new m() {
            @Override
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                HttpRequestRetryConfig httpRequestRetryConfig = this;
                long j = randomizationMs;
                return Long.valueOf(HttpRequestRetryConfig.exponentialDelay$lambda$8(base, baseDelayMs, maxDelayMs, httpRequestRetryConfig, j, (HttpRetryDelayContext) obj, iIntValue));
            }
        });
    }

    public final m getDelay() {
        return this.delay;
    }

    public final m getDelayMillis$ktor_client_core() {
        m mVar = this.delayMillis;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.m.k("delayMillis");
        throw null;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final m getModifyRequest() {
        return this.modifyRequest;
    }

    public final n getRetryIf() {
        if (this.shouldRetry != null) {
            return getShouldRetry$ktor_client_core();
        }
        return null;
    }

    public final n getRetryOnExceptionIf() {
        if (this.shouldRetryOnException != null) {
            return getShouldRetryOnException$ktor_client_core();
        }
        return null;
    }

    public final n getShouldRetry$ktor_client_core() {
        n nVar = this.shouldRetry;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.m.k("shouldRetry");
        throw null;
    }

    public final n getShouldRetryOnException$ktor_client_core() {
        n nVar = this.shouldRetryOnException;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.m.k("shouldRetryOnException");
        throw null;
    }

    public final void modifyRequest(m block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.modifyRequest = block;
    }

    public final void noRetry() {
        this.maxRetries = 0;
        setShouldRetry$ktor_client_core(new C0535b(2));
        setShouldRetryOnException$ktor_client_core(new C0535b(3));
    }

    public final void retryIf(int maxRetries, n block) {
        kotlin.jvm.internal.m.e(block, "block");
        if (maxRetries != -1) {
            this.maxRetries = maxRetries;
        }
        setShouldRetry$ktor_client_core(block);
    }

    public final void retryOnException(int maxRetries, final boolean retryOnTimeout) {
        retryOnExceptionIf(maxRetries, new n() {
            @Override
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(HttpRequestRetryConfig.retryOnException$lambda$3(retryOnTimeout, (HttpRetryShouldRetryContext) obj, (HttpRequestBuilder) obj2, (Throwable) obj3));
            }
        });
    }

    public final void retryOnExceptionIf(int maxRetries, n block) {
        kotlin.jvm.internal.m.e(block, "block");
        if (maxRetries != -1) {
            this.maxRetries = maxRetries;
        }
        setShouldRetryOnException$ktor_client_core(block);
    }

    public final void retryOnExceptionOrServerErrors(int maxRetries) {
        retryOnServerErrors(maxRetries);
        retryOnException$default(this, maxRetries, false, 2, null);
    }

    public final void retryOnServerErrors(int maxRetries) {
        retryIf(maxRetries, new C0535b(4));
    }

    public final void setDelay$ktor_client_core(m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<set-?>");
        this.delay = mVar;
    }

    public final void setDelayMillis$ktor_client_core(m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<set-?>");
        this.delayMillis = mVar;
    }

    public final void setMaxRetries(int i3) {
        this.maxRetries = i3;
    }

    public final void setShouldRetry$ktor_client_core(n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<set-?>");
        this.shouldRetry = nVar;
    }

    public final void setShouldRetryOnException$ktor_client_core(n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<set-?>");
        this.shouldRetryOnException = nVar;
    }
}
