package p021c1;

import java.text.CharacterIterator;

public final class b implements CharacterIterator {

    public final CharSequence f18452h;

    public final int f18453i;
    public int j = 0;

    public b(CharSequence charSequence, int i3) {
        this.f18452h = charSequence;
        this.f18453i = i3;
    }

    @Override
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override
    public final char current() {
        int i3 = this.j;
        if (i3 == this.f18453i) {
            return (char) 65535;
        }
        return this.f18452h.charAt(i3);
    }

    @Override
    public final char first() {
        this.j = 0;
        return current();
    }

    @Override
    public final int getBeginIndex() {
        return 0;
    }

    @Override
    public final int getEndIndex() {
        return this.f18453i;
    }

    @Override
    public final int getIndex() {
        return this.j;
    }

    @Override
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

    @Override
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

    @Override
    public final char previous() {
        int i3 = this.j;
        if (i3 <= 0) {
            return (char) 65535;
        }
        int i9 = i3 - 1;
        this.j = i9;
        return this.f18452h.charAt(i9);
    }

    @Override
    public final char setIndex(int i3) {
        if (i3 > this.f18453i || i3 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.j = i3;
        return current();
    }
}
