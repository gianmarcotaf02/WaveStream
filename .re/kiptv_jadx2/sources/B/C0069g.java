package B;

public final class C0069g implements InterfaceC0068f, InterfaceC0070h {

    public final float f533a;

    public final p194x6.m f534b;

    public final float f535c;

    public C0069g(float f9, p194x6.m mVar) {
        this.f533a = f9;
        this.f534b = mVar;
        this.f535c = f9;
    }

    @Override
    public final float a() {
        return this.f535c;
    }

    @Override
    public final void b(int i3, O0.U u6, int[] iArr, int[] iArr2) {
        c(u6, i3, iArr, p113n1.n.f25566h, iArr2);
    }

    @Override
    public final void c(p113n1.c cVar, int i3, int[] iArr, p113n1.n nVar, int[] iArr2) {
        int i9;
        int i10;
        if (iArr.length == 0) {
            return;
        }
        int iK0 = cVar.k0(this.f533a);
        boolean z6 = nVar == p113n1.n.f25567i;
        C0064b c0064b = AbstractC0071i.f536a;
        if (z6) {
            int length = iArr.length - 1;
            i9 = 0;
            i10 = 0;
            while (-1 < length) {
                int i11 = iArr[length];
                int iMin = Math.min(i9, i3 - i11);
                iArr2[length] = iMin;
                int iMin2 = Math.min(iK0, (i3 - iMin) - i11);
                int i12 = iArr2[length] + i11 + iMin2;
                length--;
                i10 = iMin2;
                i9 = i12;
            }
        } else {
            int length2 = iArr.length;
            int i13 = 0;
            i9 = 0;
            i10 = 0;
            int i14 = 0;
            while (i13 < length2) {
                int i15 = iArr[i13];
                int iMin3 = Math.min(i9, i3 - i15);
                iArr2[i14] = iMin3;
                int iMin4 = Math.min(iK0, (i3 - iMin3) - i15);
                int i16 = iArr2[i14] + i15 + iMin4;
                i13++;
                i10 = iMin4;
                i9 = i16;
                i14++;
            }
        }
        int i17 = i9 - i10;
        p194x6.m mVar = this.f534b;
        if (i17 < i3) {
            int iIntValue = ((Number) mVar.invoke(Integer.valueOf(i3 - i17), nVar)).intValue();
            int length3 = iArr2.length;
            for (int i18 = 0; i18 < length3; i18++) {
                iArr2[i18] = iArr2[i18] + iIntValue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0069g)) {
            return false;
        }
        C0069g c0069g = (C0069g) obj;
        return p113n1.f.c(this.f533a, c0069g.f533a) && this.f534b.equals(c0069g.f534b);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(Float.hashCode(this.f533a) * 31, 31, true);
        p194x6.m mVar = this.f534b;
        return iF + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) p113n1.f.d(this.f533a)) + ", " + this.f534b + ')';
    }
}
