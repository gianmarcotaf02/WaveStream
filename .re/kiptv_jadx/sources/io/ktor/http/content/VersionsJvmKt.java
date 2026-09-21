package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/util/Date;", "lastModified", "Lio/ktor/http/content/LastModifiedVersion;", "LastModifiedVersion", "(Ljava/util/Date;)Lio/ktor/http/content/LastModifiedVersion;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class VersionsJvmKt {
    public static final io.ktor.http.content.LastModifiedVersion LastModifiedVersion(java.util.Date lastModified) {
        kotlin.jvm.internal.m.e(lastModified, "lastModified");
        return new io.ktor.http.content.LastModifiedVersion(io.ktor.util.date.DateJvmKt.GMTDate(java.lang.Long.valueOf(lastModified.getTime())));
    }
}
