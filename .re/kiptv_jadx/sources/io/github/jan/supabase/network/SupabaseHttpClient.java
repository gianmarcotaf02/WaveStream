package io.github.jan.supabase.network;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦@¢\u0006\u0004\b\u000e\u0010\fJ.\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u000f\u0010\fJ.\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u0010\u0010\fJH\u0010\u0010\u001a\u00020\n\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u0010\u0010\u0015J>\u0010\u0016\u001a\u00020\n\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u00002\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u0018\u0010\fJH\u0010\u0018\u001a\u00020\n\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u0018\u0010\u0015J>\u0010\u0019\u001a\u00020\n\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u00002\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u001a\u0010\fJH\u0010\u001a\u001a\u00020\n\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u001a\u0010\u0015J>\u0010\u001b\u001a\u00020\n\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u00002\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u001b\u0010\u0017J.\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u001c\u0010\fJH\u0010\u001c\u001a\u00020\n\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u001c\u0010\u0015J>\u0010\u001d\u001a\u00020\n\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u00002\u0014\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086H¢\u0006\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lio/github/jan/supabase/network/SupabaseHttpClient;", "", "<init>", "()V", "", io.sentry.protocol.Request.JsonKeys.URL, "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lh6/A;", "builder", "Lio/ktor/client/statement/HttpResponse;", io.sentry.SentryBaseEvent.JsonKeys.REQUEST, "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpStatement;", "prepareRequest", "get", "post", "T", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lio/ktor/http/ContentType;", "contentType", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/ContentType;Lx6/j;Ll6/c;)Ljava/lang/Object;", "postJson", "(Ljava/lang/String;Ljava/lang/Object;Lx6/j;Ll6/c;)Ljava/lang/Object;", "delete", "deleteJson", "patch", "patchJson", "put", "putJson", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SupabaseHttpClient {

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$delete$3, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass3 implements p194x6.j {
        final /* synthetic */ p194x6.j $builder;

        public AnonymousClass3(p194x6.j jVar) {
            this.$builder = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
            this.$builder.invoke(request);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$delete$6, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass6 implements p194x6.j {
        final /* synthetic */ T $body;
        final /* synthetic */ p194x6.j $builder;
        final /* synthetic */ io.ktor.http.ContentType $contentType;

        public AnonymousClass6(p194x6.j jVar, io.ktor.http.ContentType contentType, T t9) {
            this.$builder = jVar;
            this.$contentType = contentType;
            this.$body = t9;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
            this.$builder.invoke(request);
            io.ktor.http.HttpMessagePropertiesKt.contentType(request, this.$contentType);
            java.lang.Object obj = this.$body;
            if (obj == null) {
                request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                kotlin.jvm.internal.m.j();
                throw null;
            }
            if (obj instanceof io.ktor.http.content.OutgoingContent) {
                request.setBody(obj);
                request.setBodyType(null);
            } else {
                request.setBody(obj);
                kotlin.jvm.internal.m.j();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$get$3, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C22973 implements p194x6.j {
        final /* synthetic */ p194x6.j $builder;

        public C22973(p194x6.j jVar) {
            this.$builder = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            this.$builder.invoke(request);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$patch$3, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C22993 implements p194x6.j {
        final /* synthetic */ p194x6.j $builder;

        public C22993(p194x6.j jVar) {
            this.$builder = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
            this.$builder.invoke(request);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$patch$6, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C23016 implements p194x6.j {
        final /* synthetic */ T $body;
        final /* synthetic */ p194x6.j $builder;
        final /* synthetic */ io.ktor.http.ContentType $contentType;

        public C23016(p194x6.j jVar, io.ktor.http.ContentType contentType, T t9) {
            this.$builder = jVar;
            this.$contentType = contentType;
            this.$body = t9;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
            this.$builder.invoke(request);
            io.ktor.http.HttpMessagePropertiesKt.contentType(request, this.$contentType);
            java.lang.Object obj = this.$body;
            if (obj == null) {
                request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                kotlin.jvm.internal.m.j();
                throw null;
            }
            if (obj instanceof io.ktor.http.content.OutgoingContent) {
                request.setBody(obj);
                request.setBodyType(null);
            } else {
                request.setBody(obj);
                kotlin.jvm.internal.m.j();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$post$3, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C23043 implements p194x6.j {
        final /* synthetic */ p194x6.j $builder;

        public C23043(p194x6.j jVar) {
            this.$builder = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            this.$builder.invoke(request);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$post$6, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C23066 implements p194x6.j {
        final /* synthetic */ T $body;
        final /* synthetic */ p194x6.j $builder;
        final /* synthetic */ io.ktor.http.ContentType $contentType;

        public C23066(p194x6.j jVar, io.ktor.http.ContentType contentType, T t9) {
            this.$builder = jVar;
            this.$contentType = contentType;
            this.$body = t9;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            this.$builder.invoke(request);
            io.ktor.http.HttpMessagePropertiesKt.contentType(request, this.$contentType);
            java.lang.Object obj = this.$body;
            if (obj == null) {
                request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                kotlin.jvm.internal.m.j();
                throw null;
            }
            if (obj instanceof io.ktor.http.content.OutgoingContent) {
                request.setBody(obj);
                request.setBodyType(null);
            } else {
                request.setBody(obj);
                kotlin.jvm.internal.m.j();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$put$3, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C23093 implements p194x6.j {
        final /* synthetic */ p194x6.j $builder;

        public C23093(p194x6.j jVar) {
            this.$builder = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
            this.$builder.invoke(request);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseHttpClient$put$6, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C23116 implements p194x6.j {
        final /* synthetic */ T $body;
        final /* synthetic */ p194x6.j $builder;
        final /* synthetic */ io.ktor.http.ContentType $contentType;

        public C23116(p194x6.j jVar, io.ktor.http.ContentType contentType, T t9) {
            this.$builder = jVar;
            this.$contentType = contentType;
            this.$body = t9;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((io.ktor.client.request.HttpRequestBuilder) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
            kotlin.jvm.internal.m.e(request, "$this$request");
            request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
            this.$builder.invoke(request);
            io.ktor.http.HttpMessagePropertiesKt.contentType(request, this.$contentType);
            java.lang.Object obj = this.$body;
            if (obj == null) {
                request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                kotlin.jvm.internal.m.j();
                throw null;
            }
            if (obj instanceof io.ktor.http.content.OutgoingContent) {
                request.setBody(obj);
                request.setBodyType(null);
            } else {
                request.setBody(obj);
                kotlin.jvm.internal.m.j();
                throw null;
            }
        }
    }

    private final java.lang.Object delete$$forInline(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.AnonymousClass3(jVar), cVar);
    }

    public static /* synthetic */ java.lang.Object delete$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i3 & 2) != 0) {
            jVar = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.delete.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return p070h6.A.f22523a;
                }
            };
        }
        return supabaseHttpClient.request(str, new io.github.jan.supabase.network.SupabaseHttpClient.AnonymousClass3(jVar), cVar);
    }

    public static java.lang.Object deleteJson$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, java.lang.Object obj, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteJson");
        }
        if ((i3 & 4) != 0) {
            io.github.jan.supabase.network.SupabaseHttpClient.C22952 c22952 = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.deleteJson.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj3);
                    return p070h6.A.f22523a;
                }
            };
        }
        io.ktor.http.ContentType.Application.INSTANCE.getJson();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    private final java.lang.Object get$$forInline(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C22973(jVar), cVar);
    }

    public static /* synthetic */ java.lang.Object get$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i3 & 2) != 0) {
            jVar = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.get.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return p070h6.A.f22523a;
                }
            };
        }
        return supabaseHttpClient.request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C22973(jVar), cVar);
    }

    private final java.lang.Object patch$$forInline(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C22993(jVar), cVar);
    }

    public static /* synthetic */ java.lang.Object patch$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i3 & 2) != 0) {
            jVar = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.patch.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return p070h6.A.f22523a;
                }
            };
        }
        return supabaseHttpClient.request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C22993(jVar), cVar);
    }

    public static java.lang.Object patchJson$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, java.lang.Object obj, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patchJson");
        }
        if ((i3 & 4) != 0) {
            io.github.jan.supabase.network.SupabaseHttpClient.C23022 c23022 = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.patchJson.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj3);
                    return p070h6.A.f22523a;
                }
            };
        }
        io.ktor.http.ContentType.Application.INSTANCE.getJson();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    private final java.lang.Object post$$forInline(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C23043(jVar), cVar);
    }

    public static /* synthetic */ java.lang.Object post$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i3 & 2) != 0) {
            jVar = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.post.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return p070h6.A.f22523a;
                }
            };
        }
        return supabaseHttpClient.request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C23043(jVar), cVar);
    }

    public static java.lang.Object postJson$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, java.lang.Object obj, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postJson");
        }
        if ((i3 & 4) != 0) {
            io.github.jan.supabase.network.SupabaseHttpClient.C23072 c23072 = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.postJson.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj3);
                    return p070h6.A.f22523a;
                }
            };
        }
        io.ktor.http.ContentType.Application.INSTANCE.getJson();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    private final java.lang.Object put$$forInline(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C23093(jVar), cVar);
    }

    public static /* synthetic */ java.lang.Object put$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i3 & 2) != 0) {
            jVar = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.put.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return p070h6.A.f22523a;
                }
            };
        }
        return supabaseHttpClient.request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C23093(jVar), cVar);
    }

    public static java.lang.Object putJson$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, java.lang.Object obj, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putJson");
        }
        if ((i3 & 4) != 0) {
            io.github.jan.supabase.network.SupabaseHttpClient.C23122 c23122 = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.putJson.2
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj3);
                    return p070h6.A.f22523a;
                }
            };
        }
        io.ktor.http.ContentType.Application.INSTANCE.getJson();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final java.lang.Object delete(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.AnonymousClass3(jVar), cVar);
    }

    public final <T> java.lang.Object deleteJson(java.lang.String str, T t9, p194x6.j jVar, p100l6.c cVar) {
        io.ktor.http.ContentType.Application.INSTANCE.getJson();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final java.lang.Object get(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C22973(jVar), cVar);
    }

    public final java.lang.Object patch(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C22993(jVar), cVar);
    }

    public final <T> java.lang.Object patchJson(java.lang.String str, T t9, p194x6.j jVar, p100l6.c cVar) {
        io.ktor.http.ContentType.Application.INSTANCE.getJson();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final java.lang.Object post(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C23043(jVar), cVar);
    }

    public final <T> java.lang.Object postJson(java.lang.String str, T t9, p194x6.j jVar, p100l6.c cVar) {
        io.ktor.http.ContentType.Application.INSTANCE.getJson();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public abstract java.lang.Object prepareRequest(java.lang.String str, p194x6.j jVar, p100l6.c cVar);

    public final java.lang.Object put(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return request(str, new io.github.jan.supabase.network.SupabaseHttpClient.C23093(jVar), cVar);
    }

    public final <T> java.lang.Object putJson(java.lang.String str, T t9, p194x6.j jVar, p100l6.c cVar) {
        io.ktor.http.ContentType.Application.INSTANCE.getJson();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public abstract java.lang.Object request(java.lang.String str, p194x6.j jVar, p100l6.c cVar);

    public static java.lang.Object delete$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, java.lang.Object obj, io.ktor.http.ContentType contentType, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i3 & 4) != 0) {
            io.ktor.http.ContentType.INSTANCE.getAny();
        }
        if ((i3 & 8) != 0) {
            io.github.jan.supabase.network.SupabaseHttpClient.AnonymousClass5 anonymousClass5 = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.delete.5
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj3);
                    return p070h6.A.f22523a;
                }
            };
        }
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static java.lang.Object patch$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, java.lang.Object obj, io.ktor.http.ContentType contentType, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i3 & 4) != 0) {
            io.ktor.http.ContentType.INSTANCE.getAny();
        }
        if ((i3 & 8) != 0) {
            io.github.jan.supabase.network.SupabaseHttpClient.C23005 c23005 = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.patch.5
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj3);
                    return p070h6.A.f22523a;
                }
            };
        }
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static java.lang.Object post$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, java.lang.Object obj, io.ktor.http.ContentType contentType, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i3 & 4) != 0) {
            io.ktor.http.ContentType.INSTANCE.getAny();
        }
        if ((i3 & 8) != 0) {
            io.github.jan.supabase.network.SupabaseHttpClient.C23055 c23055 = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.post.5
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj3);
                    return p070h6.A.f22523a;
                }
            };
        }
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static java.lang.Object put$default(io.github.jan.supabase.network.SupabaseHttpClient supabaseHttpClient, java.lang.String str, java.lang.Object obj, io.ktor.http.ContentType contentType, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i3 & 4) != 0) {
            io.ktor.http.ContentType.INSTANCE.getAny();
        }
        if ((i3 & 8) != 0) {
            io.github.jan.supabase.network.SupabaseHttpClient.C23105 c23105 = new p194x6.j() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.put.5
                public final void invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
                }

                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj3);
                    return p070h6.A.f22523a;
                }
            };
        }
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> java.lang.Object delete(java.lang.String str, T t9, io.ktor.http.ContentType contentType, p194x6.j jVar, p100l6.c cVar) {
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> java.lang.Object patch(java.lang.String str, T t9, io.ktor.http.ContentType contentType, p194x6.j jVar, p100l6.c cVar) {
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> java.lang.Object post(java.lang.String str, T t9, io.ktor.http.ContentType contentType, p194x6.j jVar, p100l6.c cVar) {
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> java.lang.Object put(java.lang.String str, T t9, io.ktor.http.ContentType contentType, p194x6.j jVar, p100l6.c cVar) {
        kotlin.jvm.internal.m.j();
        throw null;
    }
}
