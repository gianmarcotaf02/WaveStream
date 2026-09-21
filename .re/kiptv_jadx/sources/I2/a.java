package I2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f4574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f4575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f4576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4578f;
    public F.i0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I2.e f4580i;

    public a(I2.e eVar, java.lang.String str) {
        this.f4580i = eVar;
        this.f4573a = str;
        eVar.getClass();
        this.f4574b = new long[2];
        eVar.getClass();
        this.f4575c = new java.util.ArrayList(2);
        eVar.getClass();
        this.f4576d = new java.util.ArrayList(2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        eVar.getClass();
        for (int i3 = 0; i3 < 2; i3++) {
            sb.append(i3);
            this.f4575c.add(this.f4580i.f4584h.e(sb.toString()));
            sb.append(com.revenuecat.purchases.common.networking.ETagPayloadStore.TEMP_SUFFIX);
            this.f4576d.add(this.f4580i.f4584h.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final I2.b a() {
        if (this.f4577e && this.g == null && !this.f4578f) {
            java.util.ArrayList arrayList = this.f4575c;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                I2.e eVar = this.f4580i;
                if (i3 >= size) {
                    this.f4579h++;
                    return new I2.b(eVar, this);
                }
                if (eVar.f4599x.t((M8.A) arrayList.get(i3))) {
                    i3++;
                } else {
                    try {
                        eVar.G(this);
                        return null;
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        }
        return null;
    }
}
