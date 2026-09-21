package J4;

import java.util.Arrays;

public final class a implements Cloneable {
    public static final int[] j = new int[0];

    public int f6015i = 0;

    public int[] f6014h = j;

    public final void a(boolean z6) {
        c(this.f6015i + 1);
        if (z6) {
            int[] iArr = this.f6014h;
            int i3 = this.f6015i;
            int i9 = i3 / 32;
            iArr[i9] = (1 << (i3 & 31)) | iArr[i9];
        }
        this.f6015i++;
    }

    public final void b(int i3, int i9) {
        if (i9 < 0 || i9 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i10 = this.f6015i;
        c(i10 + i9);
        for (int i11 = i9 - 1; i11 >= 0; i11--) {
            if (((1 << i11) & i3) != 0) {
                int[] iArr = this.f6014h;
                int i12 = i10 / 32;
                iArr[i12] = iArr[i12] | (1 << (i10 & 31));
            }
            i10++;
        }
        this.f6015i = i10;
    }

    public final void c(int i3) {
        if (i3 > this.f6014h.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i3 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f6014h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f6014h = iArr;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f6014h.clone();
        int i3 = this.f6015i;
        a aVar = new a();
        aVar.f6014h = iArr;
        aVar.f6015i = i3;
        return aVar;
    }

    public final boolean d(int i3) {
        return ((1 << (i3 & 31)) & this.f6014h[i3 / 32]) != 0;
    }

    public final int e() {
        return (this.f6015i + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6015i == aVar.f6015i && Arrays.equals(this.f6014h, aVar.f6014h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6014h) + (this.f6015i * 31);
    }

    public final String toString() {
        int i3 = this.f6015i;
        StringBuilder sb = new StringBuilder((i3 / 8) + i3 + 1);
        for (int i9 = 0; i9 < this.f6015i; i9++) {
            if ((i9 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(d(i9) ? 'X' : '.');
        }
        return sb.toString();
    }
}
