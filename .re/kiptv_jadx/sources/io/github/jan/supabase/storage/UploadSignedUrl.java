package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/storage/UploadSignedUrl;", "", io.sentry.protocol.Request.JsonKeys.URL, "", "path", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getPath", "getToken", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class UploadSignedUrl {
    private final java.lang.String path;
    private final java.lang.String token;
    private final java.lang.String url;

    public UploadSignedUrl(java.lang.String url, java.lang.String path, java.lang.String token) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(token, "token");
        this.url = url;
        this.path = path;
        this.token = token;
    }

    public static /* synthetic */ io.github.jan.supabase.storage.UploadSignedUrl copy$default(io.github.jan.supabase.storage.UploadSignedUrl uploadSignedUrl, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = uploadSignedUrl.url;
        }
        if ((i3 & 2) != 0) {
            str2 = uploadSignedUrl.path;
        }
        if ((i3 & 4) != 0) {
            str3 = uploadSignedUrl.token;
        }
        return uploadSignedUrl.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    public final io.github.jan.supabase.storage.UploadSignedUrl copy(java.lang.String url, java.lang.String path, java.lang.String token) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(token, "token");
        return new io.github.jan.supabase.storage.UploadSignedUrl(url, path, token);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.storage.UploadSignedUrl)) {
            return false;
        }
        io.github.jan.supabase.storage.UploadSignedUrl uploadSignedUrl = (io.github.jan.supabase.storage.UploadSignedUrl) other;
        return kotlin.jvm.internal.m.a(this.url, uploadSignedUrl.url) && kotlin.jvm.internal.m.a(this.path, uploadSignedUrl.path) && kotlin.jvm.internal.m.a(this.token, uploadSignedUrl.token);
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.token.hashCode() + B2.a.a(this.url.hashCode() * 31, 31, this.path);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadSignedUrl(url=");
        sb.append(this.url);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", token=");
        return Y6.f.l(sb, this.token, ')');
    }
}
