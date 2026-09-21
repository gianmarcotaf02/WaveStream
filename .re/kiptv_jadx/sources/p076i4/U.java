package p076i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends p076i4.V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object[] f22834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22836c;

    public U(int i3) {
        p076i4.AbstractC2230y.d(i3, "initialCapacity");
        this.f22834a = new java.lang.Object[i3];
        this.f22835b = 0;
    }

    public final void c(java.lang.Object obj) {
        obj.getClass();
        e(1);
        java.lang.Object[] objArr = this.f22834a;
        int i3 = this.f22835b;
        this.f22835b = i3 + 1;
        objArr[i3] = obj;
    }

    public final void d(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            e(collection.size());
            if (collection instanceof p076i4.W) {
                this.f22835b = ((p076i4.W) collection).e(this.f22834a, this.f22835b);
                return;
            }
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i3) {
        java.lang.Object[] objArr = this.f22834a;
        int iB = p076i4.V.b(objArr.length, this.f22835b + i3);
        if (iB > objArr.length || this.f22836c) {
            this.f22834a = java.util.Arrays.copyOf(this.f22834a, iB);
            this.f22836c = false;
        }
    }
}
