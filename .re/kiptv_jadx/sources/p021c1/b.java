package p021c1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements java.text.CharacterIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.CharSequence f18452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18453i;
    public int j = 0;

    public b(java.lang.CharSequence charSequence, int i3) {
        this.f18452h = charSequence;
        this.f18453i = i3;
    }

    @Override // java.text.CharacterIterator
    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i3 = this.j;
        if (i3 == this.f18453i) {
            return (char) 65535;
        }
        return this.f18452h.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.j = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f18453i;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.j;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i3 = this.f18453i;
        if (i3 == 0) {
            this.j = i3;
            return (char) 65535;
        }
        int i9 = i3 - 1;
        this.j = i9;
        return this.f18452h.charAt(i9);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i3 = this.j + 1;
        this.j = i3;
        int i9 = this.f18453i;
        if (i3 < i9) {
            return this.f18452h.charAt(i3);
        }
        this.j = i9;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i3 = this.j;
        if (i3 <= 0) {
            return (char) 65535;
        }
        int i9 = i3 - 1;
        this.j = i9;
        return this.f18452h.charAt(i9);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i3) {
        if (i3 > this.f18453i || i3 < 0) {
            throw new java.lang.IllegalArgumentException("invalid position");
        }
        this.j = i3;
        return current();
    }
}
