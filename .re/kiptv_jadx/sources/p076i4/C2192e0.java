package p076i4;

/* JADX INFO: renamed from: i4.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2192e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object[] f22888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22889b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p076i4.C2190d0 f22890c;

    public C2192e0(int i3) {
        this.f22888a = new java.lang.Object[i3 * 2];
    }

    public final p076i4.X0 a(boolean z6) {
        p076i4.C2190d0 c2190d0;
        p076i4.C2190d0 c2190d1;
        if (z6 && (c2190d1 = this.f22890c) != null) {
            throw c2190d1.a();
        }
        p076i4.X0 x0I = p076i4.X0.i(this.f22889b, this.f22888a, this);
        if (!z6 || (c2190d0 = this.f22890c) == null) {
            return x0I;
        }
        throw c2190d0.a();
    }

    public p076i4.AbstractC2194f0 b() {
        return a(false);
    }

    public p076i4.C2192e0 c(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = (this.f22889b + 1) * 2;
        java.lang.Object[] objArr = this.f22888a;
        if (i3 > objArr.length) {
            this.f22888a = java.util.Arrays.copyOf(objArr, p076i4.V.b(objArr.length, i3));
        }
        p076i4.AbstractC2230y.c(obj, obj2);
        java.lang.Object[] objArr2 = this.f22888a;
        int i9 = this.f22889b;
        int i10 = i9 * 2;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.f22889b = i9 + 1;
        return this;
    }

    public void d(java.util.Map.Entry entry) {
        c(entry.getKey(), entry.getValue());
    }

    public p076i4.C2192e0 e(java.util.Set set) {
        if (set instanceof java.util.Collection) {
            int size = (set.size() + this.f22889b) * 2;
            java.lang.Object[] objArr = this.f22888a;
            if (size > objArr.length) {
                this.f22888a = java.util.Arrays.copyOf(objArr, p076i4.V.b(objArr.length, size));
            }
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            d((java.util.Map.Entry) it.next());
        }
        return this;
    }
}
