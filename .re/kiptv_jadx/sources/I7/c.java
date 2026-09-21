package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends I7.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object[] f5549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5550i;

    @Override // I7.a
    public final int d() {
        return this.f5550i;
    }

    @Override // I7.a
    public final void e(int i3, C7.C0176h c0176h) {
        java.lang.Object[] objArr = this.f5549h;
        if (objArr.length <= i3) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i3);
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f5549h, length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f5549h = objArrCopyOf;
        }
        java.lang.Object[] objArr2 = this.f5549h;
        if (objArr2[i3] == null) {
            this.f5550i++;
        }
        objArr2[i3] = c0176h;
    }

    @Override // I7.a
    public final java.lang.Object get(int i3) {
        return p078i6.m.r0(this.f5549h, i3);
    }

    @Override // I7.a, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new I7.b(this);
    }
}
