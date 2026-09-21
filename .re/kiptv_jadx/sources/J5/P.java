package J5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class P implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6226h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6227i;
    public final /* synthetic */ kotlin.jvm.internal.z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6228k;

    public /* synthetic */ P(long j, kotlin.jvm.internal.z zVar, java.nio.channels.WritableByteChannel writableByteChannel) {
        this.f6227i = j;
        this.j = zVar;
        this.f6228k = writableByteChannel;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f6226h) {
            case 0:
                long jLongValue = ((java.lang.Long) obj).longValue();
                kotlin.jvm.internal.z zVar = this.j;
                if (jLongValue - zVar.f24556h >= 30000000) {
                    zVar.f24556h = jLongValue;
                    ((p020c0.C1673c0) this.f6228k).h((jLongValue - this.f6227i) / 1.0E9f);
                }
                return p070h6.A.f22523a;
            default:
                return io.ktor.utils.io.ByteReadChannelOperations_jvmKt.copyTo$lambda$3(this.f6227i, this.j, (java.nio.channels.WritableByteChannel) this.f6228k, (java.nio.ByteBuffer) obj);
        }
    }

    public /* synthetic */ P(kotlin.jvm.internal.z zVar, long j, p020c0.C1673c0 c1673c0) {
        this.j = zVar;
        this.f6227i = j;
        this.f6228k = c1673c0;
    }
}
