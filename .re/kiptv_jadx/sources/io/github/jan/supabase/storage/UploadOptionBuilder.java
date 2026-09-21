package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e0\n¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\r2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0007\u001a\u00020\r\"\n\b\u0000\u0010\u0015\u0018\u0001*\u00020\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0017J'\u0010\u0007\u001a\u00020\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R0\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, d2 = {"Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "", "upsert", "Lkotlinx/serialization/json/c;", "userMetadata", "Lio/ktor/http/ContentType;", "contentType", "", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lh6/A;", "Lio/github/jan/supabase/network/HttpRequestOverride;", "httpRequestOverrides", "<init>", "(Lio/github/jan/supabase/SupabaseSerializer;ZLkotlinx/serialization/json/c;Lio/ktor/http/ContentType;Ljava/util/List;)V", "override", "httpOverride", "(Lx6/j;)V", "T", "data", "(Ljava/lang/Object;)V", "Ls8/v;", "builder", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer$annotations", "()V", "Z", "getUpsert", "()Z", "setUpsert", "(Z)V", "Lkotlinx/serialization/json/c;", "getUserMetadata", "()Lkotlinx/serialization/json/c;", "setUserMetadata", "(Lkotlinx/serialization/json/c;)V", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "setContentType", "(Lio/ktor/http/ContentType;)V", "Ljava/util/List;", "getHttpRequestOverrides$storage_kt_release", "()Ljava/util/List;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UploadOptionBuilder {
    private io.ktor.http.ContentType contentType;
    private final java.util.List<p194x6.j> httpRequestOverrides;
    private final io.github.jan.supabase.SupabaseSerializer serializer;
    private boolean upsert;
    private kotlinx.serialization.json.c userMetadata;

    public UploadOptionBuilder(io.github.jan.supabase.SupabaseSerializer serializer, boolean z6, kotlinx.serialization.json.c cVar, io.ktor.http.ContentType contentType, java.util.List<p194x6.j> httpRequestOverrides) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.m.e(httpRequestOverrides, "httpRequestOverrides");
        this.serializer = serializer;
        this.upsert = z6;
        this.userMetadata = cVar;
        this.contentType = contentType;
        this.httpRequestOverrides = httpRequestOverrides;
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    public final io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    public final java.util.List<p194x6.j> getHttpRequestOverrides$storage_kt_release() {
        return this.httpRequestOverrides;
    }

    public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final boolean getUpsert() {
        return this.upsert;
    }

    public final kotlinx.serialization.json.c getUserMetadata() {
        return this.userMetadata;
    }

    public final void httpOverride(p194x6.j override) {
        kotlin.jvm.internal.m.e(override, "override");
        this.httpRequestOverrides.add(override);
    }

    public final void setContentType(io.ktor.http.ContentType contentType) {
        this.contentType = contentType;
    }

    public final void setUpsert(boolean z6) {
        this.upsert = z6;
    }

    public final void setUserMetadata(kotlinx.serialization.json.c cVar) {
        this.userMetadata = cVar;
    }

    public final <T> void userMetadata(T data) {
        kotlin.jvm.internal.m.e(data, "data");
        getSerializer();
        p162s8.c cVar = p162s8.d.f27387d;
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final void userMetadata(p194x6.j builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        p162s8.v vVar = new p162s8.v();
        builder.invoke(vVar);
        setUserMetadata(vVar.a());
    }

    public /* synthetic */ UploadOptionBuilder(io.github.jan.supabase.SupabaseSerializer supabaseSerializer, boolean z6, kotlinx.serialization.json.c cVar, io.ktor.http.ContentType contentType, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(supabaseSerializer, (i3 & 2) != 0 ? false : z6, (i3 & 4) != 0 ? null : cVar, (i3 & 8) != 0 ? null : contentType, (i3 & 16) != 0 ? new java.util.ArrayList() : list);
    }
}
