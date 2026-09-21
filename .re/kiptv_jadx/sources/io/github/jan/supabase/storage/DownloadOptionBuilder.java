package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B=\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0005\u0010\fJ%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\b¢\u0006\u0004\b\u000e\u0010\fR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\fR0\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/storage/DownloadOptionBuilder;", "", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/ImageTransformation;", "Lh6/A;", "transform", "", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/github/jan/supabase/network/HttpRequestOverride;", "httpRequestOverrides", "<init>", "(Lx6/j;Ljava/util/List;)V", "(Lx6/j;)V", "override", "httpOverride", "Lx6/j;", "getTransform$storage_kt_release", "()Lx6/j;", "setTransform$storage_kt_release", "Ljava/util/List;", "getHttpRequestOverrides$storage_kt_release", "()Ljava/util/List;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DownloadOptionBuilder {
    private final java.util.List<p194x6.j> httpRequestOverrides;
    private p194x6.j transform;

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadOptionBuilder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A _init_$lambda$0(io.github.jan.supabase.storage.ImageTransformation imageTransformation) {
        kotlin.jvm.internal.m.e(imageTransformation, "<this>");
        return p070h6.A.f22523a;
    }

    public final java.util.List<p194x6.j> getHttpRequestOverrides$storage_kt_release() {
        return this.httpRequestOverrides;
    }

    /* JADX INFO: renamed from: getTransform$storage_kt_release, reason: from getter */
    public final p194x6.j getTransform() {
        return this.transform;
    }

    public final void httpOverride(p194x6.j override) {
        kotlin.jvm.internal.m.e(override, "override");
        this.httpRequestOverrides.add(override);
    }

    public final void setTransform$storage_kt_release(p194x6.j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<set-?>");
        this.transform = jVar;
    }

    public final void transform(p194x6.j transform) {
        kotlin.jvm.internal.m.e(transform, "transform");
        this.transform = transform;
    }

    public DownloadOptionBuilder(p194x6.j transform, java.util.List<p194x6.j> httpRequestOverrides) {
        kotlin.jvm.internal.m.e(transform, "transform");
        kotlin.jvm.internal.m.e(httpRequestOverrides, "httpRequestOverrides");
        this.transform = transform;
        this.httpRequestOverrides = httpRequestOverrides;
    }

    public /* synthetic */ DownloadOptionBuilder(p194x6.j jVar, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? new io.github.jan.supabase.storage.a(17) : jVar, (i3 & 2) != 0 ? new java.util.ArrayList() : list);
    }
}
