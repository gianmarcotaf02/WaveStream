package p153r8;

/* JADX INFO: renamed from: r8.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2711w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f27010e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.SerialDescriptor f27011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D7.t f27012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f27014d;

    public C2711w(kotlinx.serialization.descriptors.SerialDescriptor descriptor, D7.t tVar) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.f27011a = descriptor;
        this.f27012b = tVar;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f27013c = iF != 64 ? (-1) << iF : 0L;
            this.f27014d = f27010e;
            return;
        }
        this.f27013c = 0L;
        int i3 = (iF - 1) >>> 6;
        long[] jArr = new long[i3];
        if ((iF & 63) != 0) {
            jArr[i3 - 1] = (-1) << iF;
        }
        this.f27014d = jArr;
    }
}
