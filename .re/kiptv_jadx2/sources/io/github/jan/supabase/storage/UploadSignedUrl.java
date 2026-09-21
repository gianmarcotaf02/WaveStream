package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/storage/UploadSignedUrl;", "", Request.JsonKeys.URL, "", "path", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getPath", "getToken", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UploadSignedUrl {
    private final String path;
    private final String token;
    private final String url;

    public UploadSignedUrl(String url, String path, String token) {
        m.e(url, "url");
        m.e(path, "path");
        m.e(token, "token");
        this.url = url;
        this.path = path;
        this.token = token;
    }

    public static UploadSignedUrl copy$default(UploadSignedUrl uploadSignedUrl, String str, String str2, String str3, int i3, Object obj) {
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

    public final String getUrl() {
        return this.url;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getToken() {
        return this.token;
    }

    public final UploadSignedUrl copy(String url, String path, String token) {
        m.e(url, "url");
        m.e(path, "path");
        m.e(token, "token");
        return new UploadSignedUrl(url, path, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadSignedUrl)) {
            return false;
        }
        UploadSignedUrl uploadSignedUrl = (UploadSignedUrl) other;
        return m.a(this.url, uploadSignedUrl.url) && m.a(this.path, uploadSignedUrl.path) && m.a(this.token, uploadSignedUrl.token);
    }

    public final String getPath() {
        return this.path;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.token.hashCode() + B2.a.a(this.url.hashCode() * 31, 31, this.path);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UploadSignedUrl(url=");
        sb.append(this.url);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", token=");
        return Y6.f.l(sb, this.token, ')');
    }
}
