package J4;

import java.util.Arrays;

public final class b implements Cloneable {

    public int f6016h;

    public int f6017i;
    public int j;

    public int[] f6018k;

    public final boolean a(int i3, int i9) {
        return ((this.f6018k[(i3 / 32) + (i9 * this.j)] >>> (i3 & 31)) & 1) != 0;
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f6018k.clone();
        b bVar = new b();
        bVar.f6016h = this.f6016h;
        bVar.f6017i = this.f6017i;
        bVar.j = this.j;
        bVar.f6018k = iArr;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6016h == bVar.f6016h && this.f6017i == bVar.f6017i && this.j == bVar.j && Arrays.equals(this.f6018k, bVar.f6018k);
    }

    public final int hashCode() {
        int i3 = this.f6016h;
        return Arrays.hashCode(this.f6018k) + (((((((i3 * 31) + i3) * 31) + this.f6017i) * 31) + this.j) * 31);
    }

    public final String toString() {
        int i3 = this.f6016h;
        int i9 = this.f6017i;
        StringBuilder sb = new StringBuilder((i3 + 1) * i9);
        for (int i10 = 0; i10 < i9; i10++) {
            for (int i11 = 0; i11 < i3; i11++) {
                sb.append(a(i11, i10) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
