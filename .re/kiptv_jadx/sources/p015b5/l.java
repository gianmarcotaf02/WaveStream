package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.EPGTMDBMatchResult f17971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17972b;

    public l(com.kiptv.core.model.EPGTMDBMatchResult ePGTMDBMatchResult, long j) {
        this.f17971a = ePGTMDBMatchResult;
        this.f17972b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p015b5.l)) {
            return false;
        }
        p015b5.l lVar = (p015b5.l) obj;
        return kotlin.jvm.internal.m.a(this.f17971a, lVar.f17971a) && this.f17972b == lVar.f17972b;
    }

    public final int hashCode() {
        com.kiptv.core.model.EPGTMDBMatchResult ePGTMDBMatchResult = this.f17971a;
        return java.lang.Long.hashCode(this.f17972b) + ((ePGTMDBMatchResult == null ? 0 : ePGTMDBMatchResult.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "CacheEntry(result=" + this.f17971a + ", cachedAtMillis=" + this.f17972b + ")";
    }
}
