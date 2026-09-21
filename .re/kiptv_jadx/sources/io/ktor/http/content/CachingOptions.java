package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/ktor/http/content/CachingOptions;", "", "Lio/ktor/http/CacheControl;", "cacheControl", "Lio/ktor/util/date/GMTDate;", "expires", "<init>", "(Lio/ktor/http/CacheControl;Lio/ktor/util/date/GMTDate;)V", "component1", "()Lio/ktor/http/CacheControl;", "component2", "()Lio/ktor/util/date/GMTDate;", "copy", "(Lio/ktor/http/CacheControl;Lio/ktor/util/date/GMTDate;)Lio/ktor/http/content/CachingOptions;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/http/CacheControl;", "getCacheControl", "Lio/ktor/util/date/GMTDate;", "getExpires", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class CachingOptions {
    private final io.ktor.http.CacheControl cacheControl;
    private final io.ktor.util.date.GMTDate expires;

    /* JADX WARN: Multi-variable type inference failed */
    public CachingOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ io.ktor.http.content.CachingOptions copy$default(io.ktor.http.content.CachingOptions cachingOptions, io.ktor.http.CacheControl cacheControl, io.ktor.util.date.GMTDate gMTDate, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            cacheControl = cachingOptions.cacheControl;
        }
        if ((i3 & 2) != 0) {
            gMTDate = cachingOptions.expires;
        }
        return cachingOptions.copy(cacheControl, gMTDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final io.ktor.http.CacheControl getCacheControl() {
        return this.cacheControl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final io.ktor.util.date.GMTDate getExpires() {
        return this.expires;
    }

    public final io.ktor.http.content.CachingOptions copy(io.ktor.http.CacheControl cacheControl, io.ktor.util.date.GMTDate expires) {
        return new io.ktor.http.content.CachingOptions(cacheControl, expires);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.content.CachingOptions)) {
            return false;
        }
        io.ktor.http.content.CachingOptions cachingOptions = (io.ktor.http.content.CachingOptions) other;
        return kotlin.jvm.internal.m.a(this.cacheControl, cachingOptions.cacheControl) && kotlin.jvm.internal.m.a(this.expires, cachingOptions.expires);
    }

    public final io.ktor.http.CacheControl getCacheControl() {
        return this.cacheControl;
    }

    public final io.ktor.util.date.GMTDate getExpires() {
        return this.expires;
    }

    public int hashCode() {
        io.ktor.http.CacheControl cacheControl = this.cacheControl;
        int iHashCode = (cacheControl == null ? 0 : cacheControl.hashCode()) * 31;
        io.ktor.util.date.GMTDate gMTDate = this.expires;
        return iHashCode + (gMTDate != null ? gMTDate.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CachingOptions(cacheControl=" + this.cacheControl + ", expires=" + this.expires + ')';
    }

    public CachingOptions(io.ktor.http.CacheControl cacheControl, io.ktor.util.date.GMTDate gMTDate) {
        this.cacheControl = cacheControl;
        this.expires = gMTDate;
    }

    public /* synthetic */ CachingOptions(io.ktor.http.CacheControl cacheControl, io.ktor.util.date.GMTDate gMTDate, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : cacheControl, (i3 & 2) != 0 ? null : gMTDate);
    }
}
