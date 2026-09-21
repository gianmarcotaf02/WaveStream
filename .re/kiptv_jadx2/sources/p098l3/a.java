package p098l3;

import Y6.f;
import io.sentry.SentryReplayEvent;

public final class a {

    public static final a f24717f = new a(SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE, 200, 10000, 604800000, 81920);

    public final long f24718a;

    public final int f24719b;

    public final int f24720c;

    public final long f24721d;

    public final int f24722e;

    public a(long j, int i3, int i9, long j9, int i10) {
        this.f24718a = j;
        this.f24719b = i3;
        this.f24720c = i9;
        this.f24721d = j9;
        this.f24722e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f24718a == aVar.f24718a && this.f24719b == aVar.f24719b && this.f24720c == aVar.f24720c && this.f24721d == aVar.f24721d && this.f24722e == aVar.f24722e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24718a;
        int i3 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f24719b) * 1000003) ^ this.f24720c) * 1000003;
        long j9 = this.f24721d;
        return ((i3 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f24722e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f24718a);
        sb.append(", loadBatchSize=");
        sb.append(this.f24719b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f24720c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f24721d);
        sb.append(", maxBlobByteSizePerRow=");
        return f.k(sb, this.f24722e, "}");
    }
}
