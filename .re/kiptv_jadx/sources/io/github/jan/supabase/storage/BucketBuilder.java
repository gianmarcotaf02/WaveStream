package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\r\u0010\u000bJ!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\"\u00020\f¢\u0006\u0004\b\b\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000bR\u0015\u0010$\u001a\u00020\u0016*\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010&\u001a\u00020\u0016*\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0015\u0010(\u001a\u00020\u0016*\u00020!8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0015\u0010*\u001a\u00020\u0016*\u00020!8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0015\u0010$\u001a\u00020\u0016*\u00020+8F¢\u0006\u0006\u001a\u0004\b\"\u0010,R\u0015\u0010&\u001a\u00020\u0016*\u00020+8F¢\u0006\u0006\u001a\u0004\b%\u0010,R\u0015\u0010(\u001a\u00020\u0016*\u00020+8F¢\u0006\u0006\u001a\u0004\b'\u0010,R\u0015\u0010*\u001a\u00020\u0016*\u00020+8F¢\u0006\u0006\u001a\u0004\b)\u0010,¨\u0006-"}, d2 = {"Lio/github/jan/supabase/storage/BucketBuilder;", "", "<init>", "()V", "", "", "mimeTypes", "Lh6/A;", "allowedMimeTypes", "([Ljava/lang/String;)V", "", "(Ljava/util/List;)V", "Lio/ktor/http/ContentType;", "allowedMimeTypesContentType", "([Lio/ktor/http/ContentType;)V", "", io.ktor.client.utils.CacheControl.PUBLIC, "Ljava/lang/Boolean;", "getPublic", "()Ljava/lang/Boolean;", "setPublic", "(Ljava/lang/Boolean;)V", "Lio/github/jan/supabase/storage/FileSizeLimit;", "fileSizeLimit", "Ljava/lang/String;", "getFileSizeLimit-cccgrl4", "()Ljava/lang/String;", "setFileSizeLimit-saRlmmQ", "(Ljava/lang/String;)V", "Ljava/util/List;", "getAllowedMimeTypes$storage_kt_release", "()Ljava/util/List;", "setAllowedMimeTypes$storage_kt_release", "", "getBytes-ueSVNNQ", "(J)Ljava/lang/String;", "bytes", "getKilobytes-ueSVNNQ", "kilobytes", "getMegabytes-ueSVNNQ", "megabytes", "getGigabytes-ueSVNNQ", "gigabytes", "", "(I)Ljava/lang/String;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BucketBuilder {
    private java.util.List<java.lang.String> allowedMimeTypes;
    private java.lang.String fileSizeLimit;
    private java.lang.Boolean public;

    public final void allowedMimeTypes(java.lang.String... mimeTypes) {
        kotlin.jvm.internal.m.e(mimeTypes, "mimeTypes");
        this.allowedMimeTypes = p078i6.m.E0(mimeTypes);
    }

    public final void allowedMimeTypesContentType(java.util.List<io.ktor.http.ContentType> mimeTypes) {
        kotlin.jvm.internal.m.e(mimeTypes, "mimeTypes");
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(mimeTypes, 10));
        java.util.Iterator<T> it = mimeTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.ktor.http.ContentType) it.next()).toString());
        }
        this.allowedMimeTypes = arrayList;
    }

    public final java.util.List<java.lang.String> getAllowedMimeTypes$storage_kt_release() {
        return this.allowedMimeTypes;
    }

    /* JADX INFO: renamed from: getBytes-ueSVNNQ, reason: not valid java name */
    public final java.lang.String m327getBytesueSVNNQ(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j);
        sb.append('b');
        return io.github.jan.supabase.storage.FileSizeLimit.m344constructorimpl(sb.toString());
    }

    /* JADX INFO: renamed from: getFileSizeLimit-cccgrl4, reason: not valid java name and from getter */
    public final java.lang.String getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    /* JADX INFO: renamed from: getGigabytes-ueSVNNQ, reason: not valid java name */
    public final java.lang.String m330getGigabytesueSVNNQ(long j) {
        return io.github.jan.supabase.storage.FileSizeLimit.m344constructorimpl(j + "gb");
    }

    /* JADX INFO: renamed from: getKilobytes-ueSVNNQ, reason: not valid java name */
    public final java.lang.String m332getKilobytesueSVNNQ(long j) {
        return io.github.jan.supabase.storage.FileSizeLimit.m344constructorimpl(j + "kb");
    }

    /* JADX INFO: renamed from: getMegabytes-ueSVNNQ, reason: not valid java name */
    public final java.lang.String m334getMegabytesueSVNNQ(long j) {
        return io.github.jan.supabase.storage.FileSizeLimit.m344constructorimpl(j + "mb");
    }

    public final java.lang.Boolean getPublic() {
        return this.public;
    }

    public final void setAllowedMimeTypes$storage_kt_release(java.util.List<java.lang.String> list) {
        this.allowedMimeTypes = list;
    }

    /* JADX INFO: renamed from: setFileSizeLimit-saRlmmQ, reason: not valid java name */
    public final void m335setFileSizeLimitsaRlmmQ(java.lang.String str) {
        this.fileSizeLimit = str;
    }

    public final void setPublic(java.lang.Boolean bool) {
        this.public = bool;
    }

    public final void allowedMimeTypes(java.util.List<java.lang.String> mimeTypes) {
        kotlin.jvm.internal.m.e(mimeTypes, "mimeTypes");
        this.allowedMimeTypes = mimeTypes;
    }

    /* JADX INFO: renamed from: getBytes-ueSVNNQ, reason: not valid java name */
    public final java.lang.String m326getBytesueSVNNQ(int i3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i3);
        sb.append('b');
        return io.github.jan.supabase.storage.FileSizeLimit.m344constructorimpl(sb.toString());
    }

    /* JADX INFO: renamed from: getGigabytes-ueSVNNQ, reason: not valid java name */
    public final java.lang.String m329getGigabytesueSVNNQ(int i3) {
        return io.github.jan.supabase.storage.FileSizeLimit.m344constructorimpl(i3 + "gb");
    }

    /* JADX INFO: renamed from: getKilobytes-ueSVNNQ, reason: not valid java name */
    public final java.lang.String m331getKilobytesueSVNNQ(int i3) {
        return io.github.jan.supabase.storage.FileSizeLimit.m344constructorimpl(i3 + "kb");
    }

    /* JADX INFO: renamed from: getMegabytes-ueSVNNQ, reason: not valid java name */
    public final java.lang.String m333getMegabytesueSVNNQ(int i3) {
        return io.github.jan.supabase.storage.FileSizeLimit.m344constructorimpl(i3 + "mb");
    }

    public final void allowedMimeTypes(io.ktor.http.ContentType... mimeTypes) {
        kotlin.jvm.internal.m.e(mimeTypes, "mimeTypes");
        java.util.ArrayList arrayList = new java.util.ArrayList(mimeTypes.length);
        for (io.ktor.http.ContentType contentType : mimeTypes) {
            arrayList.add(contentType.toString());
        }
        this.allowedMimeTypes = arrayList;
    }
}
