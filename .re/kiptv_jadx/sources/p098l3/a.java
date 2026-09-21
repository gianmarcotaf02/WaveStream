package p098l3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p098l3.a f24717f = new p098l3.a(io.sentry.SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24722e;

    public a(long j, int i3, int i9, long j9, int i10) {
        this.f24718a = j;
        this.f24719b = i3;
        this.f24720c = i9;
        this.f24721d = j9;
        this.f24722e = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p098l3.a) {
            p098l3.a aVar = (p098l3.a) obj;
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

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f24718a);
        sb.append(", loadBatchSize=");
        sb.append(this.f24719b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f24720c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f24721d);
        sb.append(", maxBlobByteSizePerRow=");
        return Y6.f.k(sb, this.f24722e, "}");
    }
}
