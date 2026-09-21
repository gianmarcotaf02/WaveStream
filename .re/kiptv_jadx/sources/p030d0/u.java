package p030d0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p030d0.J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p030d0.u f21151d = new p030d0.u(1, 0, 2);

    @Override // p030d0.J
    public final void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9) {
        p020c0.C1668a c1668a;
        int iC;
        int iF = c0948v.f(0);
        if (n3.f18164n != 0) {
            p020c0.AbstractC1705t.a("Cannot move a group while inserting");
        }
        boolean z6 = true;
        if (!(iF >= 0)) {
            p020c0.AbstractC1705t.a("Parameter offset is out of bounds");
        }
        if (iF == 0) {
            return;
        }
        int i3 = n3.f18170t;
        int i9 = n3.f18172v;
        int i10 = n3.f18171u;
        int i11 = i3;
        while (iF > 0) {
            i11 += n3.f18154b[(n3.r(i11) * 5) + 3];
            if (i11 > i10) {
                p020c0.AbstractC1705t.a("Parameter offset is out of bounds");
            }
            iF--;
        }
        int i12 = n3.f18154b[(n3.r(i11) * 5) + 3];
        int iG = n3.g(n3.f18154b, n3.r(n3.f18170t));
        int iG2 = n3.g(n3.f18154b, n3.r(i11));
        int i13 = i11 + i12;
        int iG3 = n3.g(n3.f18154b, n3.r(i13));
        int i14 = iG3 - iG2;
        n3.x(i14, java.lang.Math.max(n3.f18170t - 1, 0));
        n3.w(i12);
        int[] iArr = n3.f18154b;
        int iR = n3.r(i13) * 5;
        p078i6.m.Y(n3.r(i3) * 5, iR, (i12 * 5) + iR, iArr, iArr);
        if (i14 > 0) {
            java.lang.Object[] objArr = n3.f18155c;
            int iH = n3.h(iG2 + i14);
            java.lang.System.arraycopy(objArr, iH, objArr, iG, n3.h(iG3 + i14) - iH);
        }
        int i15 = iG2 + i14;
        int i16 = i15 - iG;
        int i17 = n3.f18161k;
        int i18 = n3.f18162l;
        int length = n3.f18155c.length;
        int i19 = n3.f18163m;
        int i20 = i3 + i12;
        int i21 = i3;
        while (i21 < i20) {
            boolean z9 = z6;
            int iR2 = n3.r(i21);
            int i22 = i21;
            iArr[(iR2 * 5) + 4] = p020c0.N0.i(p020c0.N0.i(n3.g(iArr, iR2) - i16, i19 < iR2 ? 0 : i17, i18, length), n3.f18161k, n3.f18162l, n3.f18155c.length);
            i21 = i22 + 1;
            z6 = z9;
            i16 = i16;
            i17 = i17;
        }
        int i23 = i13 + i12;
        int iP = n3.p();
        int iB = p020c0.M0.b(n3.f18156d, i13, iP);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (iB >= 0) {
            while (iB < n3.f18156d.size() && (iC = n3.c((c1668a = (p020c0.C1668a) n3.f18156d.get(iB)))) >= i13 && iC < i23) {
                arrayList.add(c1668a);
            }
        }
        int i24 = i3 - i13;
        int size = arrayList.size();
        for (int i25 = 0; i25 < size; i25++) {
            p020c0.C1668a c1668a2 = (p020c0.C1668a) arrayList.get(i25);
            int iC2 = n3.c(c1668a2) + i24;
            if (iC2 >= n3.g) {
                c1668a2.f18215a = -(iP - iC2);
            } else {
                c1668a2.f18215a = iC2;
            }
            n3.f18156d.add(p020c0.M0.b(n3.f18156d, iC2, iP), c1668a2);
        }
        if (n3.I(i13, i12)) {
            p020c0.AbstractC1705t.a("Unexpectedly removed anchors");
        }
        n3.m(i9, n3.f18171u, i3);
        if (i14 > 0) {
            n3.J(i15, i14, i13 - 1);
        }
    }
}
