package io.github.jan.supabase.network;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012&\b\u0002\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002H\u0096@¢\u0006\u0004\b\u0015\u0010\u0014J,\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002H\u0096@¢\u0006\u0004\b\u0017\u0010\u0014J$\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R2\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/github/jan/supabase/network/SupabaseApi;", "Lio/github/jan/supabase/network/SupabaseHttpClient;", "Lkotlin/Function1;", "", "resolveUrl", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Ll6/c;", "Lio/github/jan/supabase/exceptions/RestException;", "", "parseErrorResponse", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "<init>", "(Lx6/j;Lx6/m;Lio/github/jan/supabase/SupabaseClient;)V", io.sentry.protocol.Request.JsonKeys.URL, "Lio/ktor/client/request/HttpRequestBuilder;", "Lh6/A;", "builder", io.sentry.SentryBaseEvent.JsonKeys.REQUEST, "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "rawRequest", "Lio/ktor/client/statement/HttpStatement;", "prepareRequest", "(Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lx6/j;", "Lx6/m;", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class SupabaseApi extends io.github.jan.supabase.network.SupabaseHttpClient {
    private final p194x6.m parseErrorResponse;
    private final p194x6.j resolveUrl;
    private final io.github.jan.supabase.SupabaseClient supabaseClient;

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseApi$rawRequest$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.network.SupabaseApi", f = "SupabaseApi.kt", l = {24, 25}, m = "rawRequest$suspendImpl")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.network.SupabaseApi.rawRequest$suspendImpl(io.github.jan.supabase.network.SupabaseApi.this, null, null, this);
        }
    }

    public /* synthetic */ SupabaseApi(p194x6.j jVar, p194x6.m mVar, io.github.jan.supabase.SupabaseClient supabaseClient, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(jVar, (i3 & 2) != 0 ? null : mVar, supabaseClient);
    }

    public static /* synthetic */ java.lang.Object prepareRequest$suspendImpl(io.github.jan.supabase.network.SupabaseApi supabaseApi, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return supabaseApi.supabaseClient.getHttpClient().prepareRequest((java.lang.String) supabaseApi.resolveUrl.invoke(str), jVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r8 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object rawRequest$suspendImpl(io.github.jan.supabase.network.SupabaseApi supabaseApi, java.lang.String str, p194x6.j jVar, p100l6.c cVar) throws java.lang.Throwable {
        io.github.jan.supabase.network.SupabaseApi.AnonymousClass1 anonymousClass1;
        p194x6.m mVar;
        if (cVar instanceof io.github.jan.supabase.network.SupabaseApi.AnonymousClass1) {
            anonymousClass1 = (io.github.jan.supabase.network.SupabaseApi.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = supabaseApi.new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = supabaseApi.new AnonymousClass1(cVar);
        }
        java.lang.Object objRequest = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 != 0) {
            if (i9 == 1) {
                supabaseApi = (io.github.jan.supabase.network.SupabaseApi) anonymousClass1.L$0;
                com.google.common.util.concurrent.P.u0(objRequest);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objRequest);
            }
            throw ((java.lang.Throwable) objRequest);
        }
        com.google.common.util.concurrent.P.u0(objRequest);
        io.github.jan.supabase.network.KtorSupabaseHttpClient httpClient = supabaseApi.supabaseClient.getHttpClient();
        anonymousClass1.L$0 = supabaseApi;
        anonymousClass1.label = 1;
        objRequest = httpClient.request(str, jVar, anonymousClass1);
        if (objRequest != aVar) {
        }
        return aVar;
        io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) objRequest;
        if (io.ktor.http.HttpStatusCodeKt.isSuccess(httpResponse.getStatus()) || (mVar = supabaseApi.parseErrorResponse) == null) {
            return objRequest;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        objRequest = mVar.invoke(httpResponse, anonymousClass1);
    }

    public final io.github.jan.supabase.SupabaseClient getSupabaseClient() {
        return this.supabaseClient;
    }

    @Override // io.github.jan.supabase.network.SupabaseHttpClient
    public java.lang.Object prepareRequest(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return prepareRequest$suspendImpl(this, str, jVar, cVar);
    }

    public java.lang.Object rawRequest(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return rawRequest$suspendImpl(this, str, jVar, cVar);
    }

    @Override // io.github.jan.supabase.network.SupabaseHttpClient
    public final java.lang.Object request(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return rawRequest((java.lang.String) this.resolveUrl.invoke(str), jVar, cVar);
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public SupabaseApi(p194x6.j resolveUrl, p194x6.m mVar, io.github.jan.supabase.SupabaseClient supabaseClient) {
        kotlin.jvm.internal.m.e(resolveUrl, "resolveUrl");
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        this.resolveUrl = resolveUrl;
        this.parseErrorResponse = mVar;
        this.supabaseClient = supabaseClient;
    }

    public final java.lang.Object prepareRequest(p194x6.j jVar, p100l6.c cVar) {
        return prepareRequest("", jVar, cVar);
    }
}
