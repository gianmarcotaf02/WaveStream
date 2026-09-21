package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/ktor/http/ContentRange;", "", "<init>", "()V", "Bounded", "TailFrom", "Suffix", "Lio/ktor/http/ContentRange$Bounded;", "Lio/ktor/http/ContentRange$Suffix;", "Lio/ktor/http/ContentRange$TailFrom;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class ContentRange {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/ktor/http/ContentRange$Bounded;", "Lio/ktor/http/ContentRange;", "", "from", "to", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "component1", "()J", "component2", "copy", "(JJ)Lio/ktor/http/ContentRange$Bounded;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getFrom", "getTo", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Bounded extends io.ktor.http.ContentRange {
        private final long from;
        private final long to;

        public Bounded(long j, long j9) {
            super(null);
            this.from = j;
            this.to = j9;
        }

        public static /* synthetic */ io.ktor.http.ContentRange.Bounded copy$default(io.ktor.http.ContentRange.Bounded bounded, long j, long j9, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                j = bounded.from;
            }
            if ((i3 & 2) != 0) {
                j9 = bounded.to;
            }
            return bounded.copy(j, j9);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTo() {
            return this.to;
        }

        public final io.ktor.http.ContentRange.Bounded copy(long from, long to) {
            return new io.ktor.http.ContentRange.Bounded(from, to);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.ktor.http.ContentRange.Bounded)) {
                return false;
            }
            io.ktor.http.ContentRange.Bounded bounded = (io.ktor.http.ContentRange.Bounded) other;
            return this.from == bounded.from && this.to == bounded.to;
        }

        public final long getFrom() {
            return this.from;
        }

        public final long getTo() {
            return this.to;
        }

        public int hashCode() {
            return java.lang.Long.hashCode(this.to) + (java.lang.Long.hashCode(this.from) * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.from);
            sb.append('-');
            sb.append(this.to);
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lio/ktor/http/ContentRange$Suffix;", "Lio/ktor/http/ContentRange;", "", "lastCount", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "component1", "()J", "copy", "(J)Lio/ktor/http/ContentRange$Suffix;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getLastCount", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Suffix extends io.ktor.http.ContentRange {
        private final long lastCount;

        public Suffix(long j) {
            super(null);
            this.lastCount = j;
        }

        public static /* synthetic */ io.ktor.http.ContentRange.Suffix copy$default(io.ktor.http.ContentRange.Suffix suffix, long j, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                j = suffix.lastCount;
            }
            return suffix.copy(j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getLastCount() {
            return this.lastCount;
        }

        public final io.ktor.http.ContentRange.Suffix copy(long lastCount) {
            return new io.ktor.http.ContentRange.Suffix(lastCount);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.ktor.http.ContentRange.Suffix) && this.lastCount == ((io.ktor.http.ContentRange.Suffix) other).lastCount;
        }

        public final long getLastCount() {
            return this.lastCount;
        }

        public int hashCode() {
            return java.lang.Long.hashCode(this.lastCount);
        }

        public java.lang.String toString() {
            return "-" + this.lastCount;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lio/ktor/http/ContentRange$TailFrom;", "Lio/ktor/http/ContentRange;", "", "from", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "component1", "()J", "copy", "(J)Lio/ktor/http/ContentRange$TailFrom;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getFrom", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class TailFrom extends io.ktor.http.ContentRange {
        private final long from;

        public TailFrom(long j) {
            super(null);
            this.from = j;
        }

        public static /* synthetic */ io.ktor.http.ContentRange.TailFrom copy$default(io.ktor.http.ContentRange.TailFrom tailFrom, long j, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                j = tailFrom.from;
            }
            return tailFrom.copy(j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getFrom() {
            return this.from;
        }

        public final io.ktor.http.ContentRange.TailFrom copy(long from) {
            return new io.ktor.http.ContentRange.TailFrom(from);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.ktor.http.ContentRange.TailFrom) && this.from == ((io.ktor.http.ContentRange.TailFrom) other).from;
        }

        public final long getFrom() {
            return this.from;
        }

        public int hashCode() {
            return java.lang.Long.hashCode(this.from);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.from);
            sb.append('-');
            return sb.toString();
        }
    }

    public /* synthetic */ ContentRange(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    private ContentRange() {
    }
}
