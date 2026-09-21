package p015b5;

import com.kiptv.core.model.EPGTMDBMatchResult;
import kotlin.jvm.internal.m;

public final class l {

    public final EPGTMDBMatchResult f17971a;

    public final long f17972b;

    public l(EPGTMDBMatchResult ePGTMDBMatchResult, long j) {
        this.f17971a = ePGTMDBMatchResult;
        this.f17972b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return m.a(this.f17971a, lVar.f17971a) && this.f17972b == lVar.f17972b;
    }

    public final int hashCode() {
        EPGTMDBMatchResult ePGTMDBMatchResult = this.f17971a;
        return Long.hashCode(this.f17972b) + ((ePGTMDBMatchResult == null ? 0 : ePGTMDBMatchResult.hashCode()) * 31);
    }

    public final String toString() {
        return "CacheEntry(result=" + this.f17971a + ", cachedAtMillis=" + this.f17972b + ")";
    }
}
