package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f8045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8046i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8048l;

    public h(java.lang.String string) {
        kotlin.jvm.internal.m.e(string, "string");
        this.f8045h = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        int i9;
        int i10 = this.f8046i;
        if (i10 != 0) {
            return i10 == 1;
        }
        if (this.f8048l < 0) {
            this.f8046i = 2;
            return false;
        }
        java.lang.String str = this.f8045h;
        int length = str.length();
        int length2 = str.length();
        for (int i11 = this.j; i11 < length2; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i3 = (cCharAt == '\r' && (i9 = i11 + 1) < str.length() && str.charAt(i9) == '\n') ? 2 : 1;
                length = i11;
                this.f8046i = 1;
                this.f8048l = i3;
                this.f8047k = length;
                return true;
            }
        }
        i3 = -1;
        this.f8046i = 1;
        this.f8048l = i3;
        this.f8047k = length;
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f8046i = 0;
        int i3 = this.f8047k;
        int i9 = this.j;
        this.j = this.f8048l + i3;
        return this.f8045h.subSequence(i9, i3).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
