package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lio/ktor/http/content/LastModifiedVersion;", "Lio/ktor/http/content/Version;", "Lio/ktor/util/date/GMTDate;", "lastModified", "<init>", "(Lio/ktor/util/date/GMTDate;)V", "", "", "parseDates", "(Ljava/util/List;)Ljava/util/List;", "Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/VersionCheckResult;", "check", "(Lio/ktor/http/Headers;)Lio/ktor/http/content/VersionCheckResult;", "dates", "", "ifModifiedSince", "(Ljava/util/List;)Z", "ifUnmodifiedSince", "Lio/ktor/http/HeadersBuilder;", "builder", "Lh6/A;", "appendHeadersTo", "(Lio/ktor/http/HeadersBuilder;)V", "component1", "()Lio/ktor/util/date/GMTDate;", "copy", "(Lio/ktor/util/date/GMTDate;)Lio/ktor/http/content/LastModifiedVersion;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lio/ktor/util/date/GMTDate;", "getLastModified", "truncatedModificationDate", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class LastModifiedVersion implements io.ktor.http.content.Version {
    private final io.ktor.util.date.GMTDate lastModified;
    private final io.ktor.util.date.GMTDate truncatedModificationDate;

    public LastModifiedVersion(io.ktor.util.date.GMTDate lastModified) {
        kotlin.jvm.internal.m.e(lastModified, "lastModified");
        this.lastModified = lastModified;
        this.truncatedModificationDate = io.ktor.util.date.DateKt.truncateToSeconds(lastModified);
    }

    public static /* synthetic */ io.ktor.http.content.LastModifiedVersion copy$default(io.ktor.http.content.LastModifiedVersion lastModifiedVersion, io.ktor.util.date.GMTDate gMTDate, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            gMTDate = lastModifiedVersion.lastModified;
        }
        return lastModifiedVersion.copy(gMTDate);
    }

    private final java.util.List<io.ktor.util.date.GMTDate> parseDates(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!O7.q.N0((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            io.ktor.util.date.GMTDate gMTDateFromHttpToGmtDate = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                gMTDateFromHttpToGmtDate = io.ktor.http.DateUtilsKt.fromHttpToGmtDate((java.lang.String) it.next());
            } catch (java.lang.Throwable unused) {
            }
            if (gMTDateFromHttpToGmtDate != null) {
                arrayList2.add(gMTDateFromHttpToGmtDate);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    @Override // io.ktor.http.content.Version
    public void appendHeadersTo(io.ktor.http.HeadersBuilder builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        builder.set(io.ktor.http.HttpHeaders.INSTANCE.getLastModified(), io.ktor.http.DateUtilsKt.toHttpDate(this.lastModified));
    }

    @Override // io.ktor.http.content.Version
    public io.ktor.http.content.VersionCheckResult check(io.ktor.http.Headers requestHeaders) {
        kotlin.jvm.internal.m.e(requestHeaders, "requestHeaders");
        io.ktor.http.HttpHeaders httpHeaders = io.ktor.http.HttpHeaders.INSTANCE;
        java.util.List<java.lang.String> all = requestHeaders.getAll(httpHeaders.getIfModifiedSince());
        java.util.List<io.ktor.util.date.GMTDate> dates = all != null ? parseDates(all) : null;
        if (dates != null && !ifModifiedSince(dates)) {
            return io.ktor.http.content.VersionCheckResult.NOT_MODIFIED;
        }
        java.util.List<java.lang.String> all2 = requestHeaders.getAll(httpHeaders.getIfUnmodifiedSince());
        java.util.List<io.ktor.util.date.GMTDate> dates2 = all2 != null ? parseDates(all2) : null;
        return (dates2 == null || ifUnmodifiedSince(dates2)) ? io.ktor.http.content.VersionCheckResult.OK : io.ktor.http.content.VersionCheckResult.PRECONDITION_FAILED;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final io.ktor.util.date.GMTDate getLastModified() {
        return this.lastModified;
    }

    public final io.ktor.http.content.LastModifiedVersion copy(io.ktor.util.date.GMTDate lastModified) {
        kotlin.jvm.internal.m.e(lastModified, "lastModified");
        return new io.ktor.http.content.LastModifiedVersion(lastModified);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof io.ktor.http.content.LastModifiedVersion) && kotlin.jvm.internal.m.a(this.lastModified, ((io.ktor.http.content.LastModifiedVersion) other).lastModified);
    }

    public final io.ktor.util.date.GMTDate getLastModified() {
        return this.lastModified;
    }

    public int hashCode() {
        return this.lastModified.hashCode();
    }

    public final boolean ifModifiedSince(java.util.List<io.ktor.util.date.GMTDate> dates) {
        kotlin.jvm.internal.m.e(dates, "dates");
        if (dates.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = dates.iterator();
        while (it.hasNext()) {
            if (this.truncatedModificationDate.compareTo((io.ktor.util.date.GMTDate) it.next()) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean ifUnmodifiedSince(java.util.List<io.ktor.util.date.GMTDate> dates) {
        kotlin.jvm.internal.m.e(dates, "dates");
        if (dates.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = dates.iterator();
        while (it.hasNext()) {
            if (this.truncatedModificationDate.compareTo((io.ktor.util.date.GMTDate) it.next()) > 0) {
                return false;
            }
        }
        return true;
    }

    public java.lang.String toString() {
        return "LastModifiedVersion(lastModified=" + this.lastModified + ')';
    }
}
