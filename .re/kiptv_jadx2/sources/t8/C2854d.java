package t8;

public final class C2854d implements CharSequence {

    public final char[] f28616h;

    public int f28617i;

    public C2854d(char[] cArr) {
        this.f28616h = cArr;
        this.f28617i = cArr.length;
    }

    @Override
    public final char charAt(int i3) {
        return this.f28616h[i3];
    }

    @Override
    public final int length() {
        return this.f28617i;
    }

    @Override
    public final CharSequence subSequence(int i3, int i9) {
        return O7.x.m0(this.f28616h, i3, Math.min(i9, this.f28617i));
    }

    @Override
    public final String toString() {
        int i3 = this.f28617i;
        return O7.x.m0(this.f28616h, 0, Math.min(i3, i3));
    }
}
