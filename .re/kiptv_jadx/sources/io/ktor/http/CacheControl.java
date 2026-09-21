package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lio/ktor/http/CacheControl;", "", "Lio/ktor/http/CacheControl$Visibility;", io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY, "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "Lio/ktor/http/CacheControl$Visibility;", "getVisibility", "()Lio/ktor/http/CacheControl$Visibility;", "Visibility", "NoCache", "NoStore", "MaxAge", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class CacheControl {
    private final io.ktor.http.CacheControl.Visibility visibility;

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/ktor/http/CacheControl$MaxAge;", "Lio/ktor/http/CacheControl;", "", "maxAgeSeconds", "proxyMaxAgeSeconds", "", "mustRevalidate", "proxyRevalidate", "Lio/ktor/http/CacheControl$Visibility;", io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY, "<init>", "(ILjava/lang/Integer;ZZLio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getMaxAgeSeconds", "Ljava/lang/Integer;", "getProxyMaxAgeSeconds", "()Ljava/lang/Integer;", "Z", "getMustRevalidate", "()Z", "getProxyRevalidate", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class MaxAge extends io.ktor.http.CacheControl {
        private final int maxAgeSeconds;
        private final boolean mustRevalidate;
        private final java.lang.Integer proxyMaxAgeSeconds;
        private final boolean proxyRevalidate;

        public /* synthetic */ MaxAge(int i3, java.lang.Integer num, boolean z6, boolean z9, io.ktor.http.CacheControl.Visibility visibility, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(i3, (i9 & 2) != 0 ? null : num, (i9 & 4) != 0 ? false : z6, (i9 & 8) != 0 ? false : z9, (i9 & 16) != 0 ? null : visibility);
        }

        public boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof io.ktor.http.CacheControl.MaxAge)) {
                return false;
            }
            io.ktor.http.CacheControl.MaxAge maxAge = (io.ktor.http.CacheControl.MaxAge) other;
            return maxAge.maxAgeSeconds == this.maxAgeSeconds && kotlin.jvm.internal.m.a(maxAge.proxyMaxAgeSeconds, this.proxyMaxAgeSeconds) && maxAge.mustRevalidate == this.mustRevalidate && maxAge.proxyRevalidate == this.proxyRevalidate && maxAge.getVisibility() == getVisibility();
        }

        public final int getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        public final boolean getMustRevalidate() {
            return this.mustRevalidate;
        }

        public final java.lang.Integer getProxyMaxAgeSeconds() {
            return this.proxyMaxAgeSeconds;
        }

        public final boolean getProxyRevalidate() {
            return this.proxyRevalidate;
        }

        public int hashCode() {
            int i3 = this.maxAgeSeconds * 31;
            java.lang.Integer num = this.proxyMaxAgeSeconds;
            int iF = p121o0.p.f(p121o0.p.f((i3 + (num != null ? num.intValue() : 0)) * 31, 31, this.mustRevalidate), 31, this.proxyRevalidate);
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            return iF + (visibility != null ? visibility.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.util.ArrayList arrayList = new java.util.ArrayList(5);
            arrayList.add("max-age=" + this.maxAgeSeconds);
            if (this.proxyMaxAgeSeconds != null) {
                arrayList.add("s-maxage=" + this.proxyMaxAgeSeconds);
            }
            if (this.mustRevalidate) {
                arrayList.add(io.ktor.client.utils.CacheControl.MUST_REVALIDATE);
            }
            if (this.proxyRevalidate) {
                arrayList.add(io.ktor.client.utils.CacheControl.PROXY_REVALIDATE);
            }
            if (getVisibility() != null) {
                arrayList.add(getVisibility().getHeaderValue());
            }
            return p078i6.o.o1(arrayList, ", ", null, null, null, 62);
        }

        public MaxAge(int i3, java.lang.Integer num, boolean z6, boolean z9, io.ktor.http.CacheControl.Visibility visibility) {
            super(visibility);
            this.maxAgeSeconds = i3;
            this.proxyMaxAgeSeconds = num;
            this.mustRevalidate = z6;
            this.proxyRevalidate = z9;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/CacheControl$NoCache;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY, "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NoCache extends io.ktor.http.CacheControl {
        public NoCache(io.ktor.http.CacheControl.Visibility visibility) {
            super(visibility);
        }

        public boolean equals(java.lang.Object other) {
            return (other instanceof io.ktor.http.CacheControl.NoCache) && getVisibility() == ((io.ktor.http.CacheControl.NoCache) other).getVisibility();
        }

        public int hashCode() {
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        public java.lang.String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_CACHE;
            }
            return "no-cache, " + getVisibility().getHeaderValue();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/CacheControl$NoStore;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY, "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NoStore extends io.ktor.http.CacheControl {
        public NoStore(io.ktor.http.CacheControl.Visibility visibility) {
            super(visibility);
        }

        public boolean equals(java.lang.Object other) {
            return (other instanceof io.ktor.http.CacheControl.NoStore) && ((io.ktor.http.CacheControl.NoStore) other).getVisibility() == getVisibility();
        }

        public int hashCode() {
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        public java.lang.String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_STORE;
            }
            return "no-store, " + getVisibility().getHeaderValue();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/CacheControl$Visibility;", "", "", "headerValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getHeaderValue$ktor_http", "()Ljava/lang/String;", "Public", "Private", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Visibility {
        Public(io.ktor.client.utils.CacheControl.PUBLIC),
        Private(io.ktor.client.utils.CacheControl.PRIVATE);

        private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());
        private final java.lang.String headerValue;

        Visibility(java.lang.String str) {
            this.headerValue = str;
        }

        public static p126o6.a getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getHeaderValue$ktor_http, reason: from getter */
        public final java.lang.String getHeaderValue() {
            return this.headerValue;
        }
    }

    public CacheControl(io.ktor.http.CacheControl.Visibility visibility) {
        this.visibility = visibility;
    }

    public final io.ktor.http.CacheControl.Visibility getVisibility() {
        return this.visibility;
    }
}
