package N8;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7502h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f7503i;
    public final /* synthetic */ M8.E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f7504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f7505l;

    public /* synthetic */ h(M8.E e6, kotlin.jvm.internal.A a2, kotlin.jvm.internal.A a9, kotlin.jvm.internal.A a10) {
        this.j = e6;
        this.f7503i = a2;
        this.f7504k = a9;
        this.f7505l = a10;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
        int i3 = this.f7502h;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        java.lang.Long l2 = (java.lang.Long) obj2;
        switch (i3) {
            case 0:
                long jLongValue = l2.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new java.io.IOException("bad zip: extended timestamp extra too short");
                    }
                    M8.E e6 = this.j;
                    byte b9 = e6.readByte();
                    boolean z6 = (b9 & 1) == 1;
                    boolean z9 = (b9 & 2) == 2;
                    boolean z10 = (b9 & 4) == 4;
                    long j = z6 ? 5L : 1L;
                    if (z9) {
                        j += 4;
                    }
                    if (z10) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new java.io.IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z6) {
                        this.f7503i.f24539h = java.lang.Integer.valueOf(e6.e());
                    }
                    if (z9) {
                        this.f7504k.f24539h = java.lang.Integer.valueOf(e6.e());
                    }
                    if (z10) {
                        this.f7505l.f24539h = java.lang.Integer.valueOf(e6.e());
                    }
                }
                return p070h6.A.f22523a;
            default:
                long jLongValue2 = l2.longValue();
                if (iIntValue == 1) {
                    kotlin.jvm.internal.A a2 = this.f7503i;
                    if (a2.f24539h != null) {
                        throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    M8.E e9 = this.j;
                    a2.f24539h = java.lang.Long.valueOf(e9.i());
                    this.f7504k.f24539h = java.lang.Long.valueOf(e9.i());
                    this.f7505l.f24539h = java.lang.Long.valueOf(e9.i());
                }
                return p070h6.A.f22523a;
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.A a2, M8.E e6, kotlin.jvm.internal.A a9, kotlin.jvm.internal.A a10) {
        this.f7503i = a2;
        this.j = e6;
        this.f7504k = a9;
        this.f7505l = a10;
    }
}
