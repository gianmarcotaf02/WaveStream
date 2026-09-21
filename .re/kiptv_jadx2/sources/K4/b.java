package K4;

public final class b {

    public final a f6845a;

    public final int[] f6846b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f6845a = aVar;
        int length = iArr.length;
        int i3 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f6846b = iArr;
            return;
        }
        while (i3 < length && iArr[i3] == 0) {
            i3++;
        }
        if (i3 == length) {
            this.f6846b = new int[]{0};
            return;
        }
        int i9 = length - i3;
        int[] iArr2 = new int[i9];
        this.f6846b = iArr2;
        System.arraycopy(iArr, i3, iArr2, 0, i9);
    }

    public final b a(b bVar) {
        a aVar = bVar.f6845a;
        a aVar2 = this.f6845a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c()) {
            return bVar;
        }
        if (bVar.c()) {
            return this;
        }
        int[] iArr = this.f6846b;
        int length = iArr.length;
        int[] iArr2 = bVar.f6846b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i3 = length2; i3 < iArr.length; i3++) {
            iArr3[i3] = iArr2[i3 - length2] ^ iArr[i3];
        }
        return new b(aVar2, iArr3);
    }

    public final int b() {
        return this.f6846b.length - 1;
    }

    public final boolean c() {
        return this.f6846b[0] == 0;
    }

    public final String toString() {
        if (c()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int[] iArr = this.f6846b;
            int i3 = iArr[(iArr.length - 1) - iB];
            if (i3 != 0) {
                if (i3 < 0) {
                    if (iB == b()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i3 = -i3;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iB == 0 || i3 != 1) {
                    a aVar = this.f6845a;
                    if (i3 == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i9 = aVar.f6840b[i3];
                    if (i9 == 0) {
                        sb.append('1');
                    } else if (i9 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i9);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iB);
                    }
                }
            }
        }
        return sb.toString();
    }
}
