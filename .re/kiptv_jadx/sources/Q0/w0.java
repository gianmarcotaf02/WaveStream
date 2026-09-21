package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f8483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f8484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f8485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f8486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f8487f;

    public w0(android.view.View view) {
        this.f8482a = -1;
        this.f8483b = view;
        this.f8484c = p103m.r.a();
    }

    public void a() {
        android.view.View view = (android.view.View) this.f8483b;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            if (((p103m.P0) this.f8485d) != null) {
                if (((p103m.P0) this.f8487f) == null) {
                    this.f8487f = new p103m.P0();
                }
                p103m.P0 p2 = (p103m.P0) this.f8487f;
                p2.f24960c = null;
                p2.f24959b = false;
                p2.f24961d = null;
                p2.f24958a = false;
                java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                android.content.res.ColorStateList colorStateListC = D1.L.c(view);
                if (colorStateListC != null) {
                    p2.f24959b = true;
                    p2.f24960c = colorStateListC;
                }
                android.graphics.PorterDuff.Mode modeD = D1.L.d(view);
                if (modeD != null) {
                    p2.f24958a = true;
                    p2.f24961d = modeD;
                }
                if (p2.f24959b || p2.f24958a) {
                    p103m.r.d(background, p2, view.getDrawableState());
                    return;
                }
            }
            p103m.P0 p9 = (p103m.P0) this.f8486e;
            if (p9 != null) {
                p103m.r.d(background, p9, view.getDrawableState());
                return;
            }
            p103m.P0 p10 = (p103m.P0) this.f8485d;
            if (p10 != null) {
                p103m.r.d(background, p10, view.getDrawableState());
            }
        }
    }

    public boolean b(int i3) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f8485d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            androidx.recyclerview.widget.C1619a c1619a = (androidx.recyclerview.widget.C1619a) arrayList.get(i9);
            int i10 = c1619a.f17366a;
            if (i10 != 8) {
                if (i10 == 1) {
                    int i11 = c1619a.f17367b;
                    int i12 = c1619a.f17369d + i11;
                    while (i11 < i12) {
                        if (g(i11, i9 + 1) == i3) {
                            return true;
                        }
                        i11++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(c1619a.f17369d, i9 + 1) == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f8485d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((androidx.recyclerview.widget.C1642y) this.f8486e).a((androidx.recyclerview.widget.C1619a) arrayList.get(i3));
        }
        r(arrayList);
        this.f8482a = 0;
    }

    public void d() {
        c();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f8484c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.recyclerview.widget.C1619a c1619a = (androidx.recyclerview.widget.C1619a) arrayList.get(i3);
            int i9 = c1619a.f17366a;
            androidx.recyclerview.widget.C1642y c1642y = (androidx.recyclerview.widget.C1642y) this.f8486e;
            if (i9 == 1) {
                c1642y.a(c1619a);
                c1642y.d(c1619a.f17367b, c1619a.f17369d);
            } else if (i9 == 2) {
                c1642y.a(c1619a);
                int i10 = c1619a.f17367b;
                int i11 = c1619a.f17369d;
                androidx.recyclerview.widget.RecyclerView recyclerView = c1642y.f17522a;
                recyclerView.L(i10, i11, true);
                recyclerView.f17305p0 = true;
                recyclerView.f17299m0.f17346b += i11;
            } else if (i9 == 4) {
                c1642y.a(c1619a);
                c1642y.c(c1619a.f17367b, c1619a.f17369d, c1619a.f17368c);
            } else if (i9 == 8) {
                c1642y.a(c1619a);
                c1642y.e(c1619a.f17367b, c1619a.f17369d);
            }
        }
        r(arrayList);
        this.f8482a = 0;
    }

    public void e(androidx.recyclerview.widget.C1619a c1619a) {
        int i3;
        Y2.L l2;
        int i9 = c1619a.f17366a;
        if (i9 == 1 || i9 == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(c1619a.f17367b, i9);
        int i10 = c1619a.f17367b;
        int i11 = c1619a.f17366a;
        if (i11 == 2) {
            i3 = 0;
        } else {
            if (i11 != 4) {
                throw new java.lang.IllegalArgumentException("op should be remove or update." + c1619a);
            }
            i3 = 1;
        }
        int i12 = 1;
        int i13 = 1;
        while (true) {
            int i14 = c1619a.f17369d;
            l2 = (Y2.L) this.f8483b;
            if (i12 >= i14) {
                break;
            }
            int iV2 = v((i3 * i12) + c1619a.f17367b, c1619a.f17366a);
            int i15 = c1619a.f17366a;
            if (i15 == 2 ? iV2 != iV : !(i15 == 4 && iV2 == iV + 1)) {
                androidx.recyclerview.widget.C1619a c1619aM = m(i15, iV, i13, c1619a.f17368c);
                f(c1619aM, i10);
                c1619aM.f17368c = null;
                l2.i(c1619aM);
                if (c1619a.f17366a == 4) {
                    i10 += i13;
                }
                i13 = 1;
                iV = iV2;
            } else {
                i13++;
            }
            i12++;
        }
        java.lang.Object obj = c1619a.f17368c;
        c1619a.f17368c = null;
        l2.i(c1619a);
        if (i13 > 0) {
            androidx.recyclerview.widget.C1619a c1619aM2 = m(c1619a.f17366a, iV, i13, obj);
            f(c1619aM2, i10);
            c1619aM2.f17368c = null;
            l2.i(c1619aM2);
        }
    }

    public void f(androidx.recyclerview.widget.C1619a c1619a, int i3) {
        androidx.recyclerview.widget.C1642y c1642y = (androidx.recyclerview.widget.C1642y) this.f8486e;
        c1642y.a(c1619a);
        int i9 = c1619a.f17366a;
        if (i9 != 2) {
            if (i9 != 4) {
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c1642y.c(i3, c1619a.f17369d, c1619a.f17368c);
        } else {
            int i10 = c1619a.f17369d;
            androidx.recyclerview.widget.RecyclerView recyclerView = c1642y.f17522a;
            recyclerView.L(i3, i10, true);
            recyclerView.f17305p0 = true;
            recyclerView.f17299m0.f17346b += i10;
        }
    }

    public int g(int i3, int i9) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f8485d;
        int size = arrayList.size();
        while (i9 < size) {
            androidx.recyclerview.widget.C1619a c1619a = (androidx.recyclerview.widget.C1619a) arrayList.get(i9);
            int i10 = c1619a.f17366a;
            if (i10 == 8) {
                int i11 = c1619a.f17367b;
                if (i11 == i3) {
                    i3 = c1619a.f17369d;
                } else {
                    if (i11 < i3) {
                        i3--;
                    }
                    if (c1619a.f17369d <= i3) {
                        i3++;
                    }
                }
            } else {
                int i12 = c1619a.f17367b;
                if (i12 > i3) {
                    continue;
                } else if (i10 == 2) {
                    int i13 = c1619a.f17369d;
                    if (i3 < i12 + i13) {
                        return -1;
                    }
                    i3 -= i13;
                } else if (i10 == 1) {
                    i3 += c1619a.f17369d;
                }
            }
            i9++;
        }
        return i3;
    }

    public android.content.res.ColorStateList h() {
        p103m.P0 p2 = (p103m.P0) this.f8486e;
        if (p2 != null) {
            return (android.content.res.ColorStateList) p2.f24960c;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode i() {
        p103m.P0 p2 = (p103m.P0) this.f8486e;
        if (p2 != null) {
            return (android.graphics.PorterDuff.Mode) p2.f24961d;
        }
        return null;
    }

    public boolean j() {
        return ((java.util.ArrayList) this.f8484c).size() > 0;
    }

    public void k(android.util.AttributeSet attributeSet, int i3) {
        android.content.res.ColorStateList colorStateListF;
        android.view.View view = (android.view.View) this.f8483b;
        android.content.Context context = view.getContext();
        int[] iArr = h.a.y;
        j1.l lVarS = j1.l.s(context, attributeSet, iArr, i3);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) lVarS.j;
        android.view.View view2 = (android.view.View) this.f8483b;
        D1.U.i(view2, view2.getContext(), iArr, attributeSet, (android.content.res.TypedArray) lVarS.j, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f8482a = typedArray.getResourceId(0, -1);
                p103m.r rVar = (p103m.r) this.f8484c;
                android.content.Context context2 = view.getContext();
                int i9 = this.f8482a;
                synchronized (rVar) {
                    colorStateListF = rVar.f25109a.f(context2, i9);
                }
                if (colorStateListF != null) {
                    s(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                D1.L.e(view, lVarS.k(1));
            }
            if (typedArray.hasValue(2)) {
                D1.L.f(view, p103m.AbstractC2569i0.b(typedArray.getInt(2, -1), null));
            }
            lVarS.u();
        } catch (java.lang.Throwable th) {
            lVarS.u();
            throw th;
        }
    }

    public p114n2.s l(java.lang.String route) {
        p114n2.r rVar;
        kotlin.jvm.internal.m.e(route, "route");
        p070h6.p pVar = (p070h6.p) this.f8487f;
        if (pVar == null || (rVar = (p114n2.r) pVar.getValue()) == null) {
            return null;
        }
        int i3 = p114n2.t.f25669l;
        java.lang.String uriString = "android-app://androidx.navigation/".concat(route);
        kotlin.jvm.internal.m.e(uriString, "uriString");
        android.net.Uri uri = android.net.Uri.parse(uriString);
        kotlin.jvm.internal.m.d(uri, "parse(...)");
        android.os.Bundle bundleD = rVar.d(uri, (java.util.LinkedHashMap) this.f8485d);
        if (bundleD == null) {
            return null;
        }
        return new p114n2.s((p114n2.t) this.f8483b, bundleD, rVar.f25664l, rVar.b(uri), false);
    }

    public androidx.recyclerview.widget.C1619a m(int i3, int i9, int i10, java.lang.Object obj) {
        androidx.recyclerview.widget.C1619a c1619a = (androidx.recyclerview.widget.C1619a) ((Y2.L) this.f8483b).a();
        if (c1619a != null) {
            c1619a.f17366a = i3;
            c1619a.f17367b = i9;
            c1619a.f17369d = i10;
            c1619a.f17368c = obj;
            return c1619a;
        }
        androidx.recyclerview.widget.C1619a c1619a2 = new androidx.recyclerview.widget.C1619a();
        c1619a2.f17366a = i3;
        c1619a2.f17367b = i9;
        c1619a2.f17369d = i10;
        c1619a2.f17368c = obj;
        return c1619a2;
    }

    public void n() {
        this.f8482a = -1;
        s(null);
        a();
    }

    public void o(int i3) {
        android.content.res.ColorStateList colorStateListF;
        this.f8482a = i3;
        p103m.r rVar = (p103m.r) this.f8484c;
        if (rVar != null) {
            android.content.Context context = ((android.view.View) this.f8483b).getContext();
            synchronized (rVar) {
                colorStateListF = rVar.f25109a.f(context, i3);
            }
        } else {
            colorStateListF = null;
        }
        s(colorStateListF);
        a();
    }

    public void p(androidx.recyclerview.widget.C1619a c1619a) {
        ((java.util.ArrayList) this.f8485d).add(c1619a);
        int i3 = c1619a.f17366a;
        androidx.recyclerview.widget.C1642y c1642y = (androidx.recyclerview.widget.C1642y) this.f8486e;
        if (i3 == 1) {
            c1642y.d(c1619a.f17367b, c1619a.f17369d);
            return;
        }
        if (i3 == 2) {
            int i9 = c1619a.f17367b;
            int i10 = c1619a.f17369d;
            androidx.recyclerview.widget.RecyclerView recyclerView = c1642y.f17522a;
            recyclerView.L(i9, i10, false);
            recyclerView.f17305p0 = true;
            return;
        }
        if (i3 == 4) {
            c1642y.c(c1619a.f17367b, c1619a.f17369d, c1619a.f17368c);
        } else if (i3 == 8) {
            c1642y.e(c1619a.f17367b, c1619a.f17369d);
        } else {
            throw new java.lang.IllegalArgumentException("Unknown update op type for " + c1619a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018f  */
    /* JADX WARN: Code duplicated, block: B:104:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:184:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x0139  */
    /* JADX WARN: Code duplicated, block: B:79:0x013f  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0155  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x0166  */
    /* JADX WARN: Code duplicated, block: B:90:0x0168  */
    /* JADX WARN: Code duplicated, block: B:92:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0179  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184  */
    public void q() {
        byte b9;
        int i3;
        boolean z6;
        byte b10;
        androidx.recyclerview.widget.C1619a c1619aM;
        int i9;
        int i10;
        int i11;
        androidx.recyclerview.widget.C1619a c1619aM2;
        boolean z9;
        boolean z10;
        androidx.recyclerview.widget.C1619a c1619aM3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f8484c;
        androidx.recyclerview.widget.G g = (androidx.recyclerview.widget.G) this.f8487f;
        g.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z11 = false;
            while (true) {
                b9 = -1;
                i3 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((androidx.recyclerview.widget.C1619a) arrayList.get(size)).f17366a != 8) {
                    z11 = true;
                } else if (z11) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i20 = size + 1;
            androidx.recyclerview.widget.C1619a c1619a = (androidx.recyclerview.widget.C1619a) arrayList.get(size);
            androidx.recyclerview.widget.C1619a c1619a2 = (androidx.recyclerview.widget.C1619a) arrayList.get(i20);
            int i21 = c1619a2.f17366a;
            if (i21 != 1) {
                Q0.w0 w0Var = (Q0.w0) g.f17193b;
                if (i21 == 2) {
                    int i22 = c1619a.f17367b;
                    int i23 = c1619a.f17369d;
                    if (i22 < i23) {
                        z10 = c1619a2.f17367b == i22 && c1619a2.f17369d == i23 - i22;
                        z9 = false;
                    } else if (c1619a2.f17367b == i23 + 1 && c1619a2.f17369d == i22 - i23) {
                        z10 = true;
                        z9 = true;
                    } else {
                        z9 = true;
                        z10 = false;
                    }
                    int i24 = c1619a2.f17367b;
                    if (i23 < i24) {
                        c1619a2.f17367b = i24 - 1;
                    } else {
                        int i25 = c1619a2.f17369d;
                        if (i23 < i24 + i25) {
                            c1619a2.f17369d = i25 - 1;
                            c1619a.f17366a = 2;
                            c1619a.f17369d = 1;
                            if (c1619a2.f17369d == 0) {
                                arrayList.remove(i20);
                                w0Var.getClass();
                                c1619a2.f17368c = null;
                                ((Y2.L) w0Var.f8483b).i(c1619a2);
                            }
                        }
                    }
                    int i26 = c1619a.f17367b;
                    int i27 = c1619a2.f17367b;
                    if (i26 <= i27) {
                        c1619a2.f17367b = i27 + 1;
                    } else {
                        int i28 = i27 + c1619a2.f17369d;
                        if (i26 < i28) {
                            c1619aM3 = w0Var.m(2, i26 + 1, i28 - i26, null);
                            c1619a2.f17369d = c1619a.f17367b - c1619a2.f17367b;
                        }
                        if (z10) {
                            arrayList.set(size, c1619a2);
                            arrayList.remove(i20);
                            w0Var.getClass();
                            c1619a.f17368c = null;
                            ((Y2.L) w0Var.f8483b).i(c1619a);
                        } else {
                            if (z9) {
                                if (c1619aM3 != null) {
                                    i18 = c1619a.f17367b;
                                    if (i18 > c1619aM3.f17367b) {
                                        c1619a.f17367b = i18 - c1619aM3.f17369d;
                                    }
                                    i19 = c1619a.f17369d;
                                    if (i19 > c1619aM3.f17367b) {
                                        c1619a.f17369d = i19 - c1619aM3.f17369d;
                                    }
                                }
                                i16 = c1619a.f17367b;
                                if (i16 > c1619a2.f17367b) {
                                    c1619a.f17367b = i16 - c1619a2.f17369d;
                                }
                                i17 = c1619a.f17369d;
                                if (i17 > c1619a2.f17367b) {
                                    c1619a.f17369d = i17 - c1619a2.f17369d;
                                }
                            } else {
                                if (c1619aM3 != null) {
                                    i14 = c1619a.f17367b;
                                    if (i14 >= c1619aM3.f17367b) {
                                        c1619a.f17367b = i14 - c1619aM3.f17369d;
                                    }
                                    i15 = c1619a.f17369d;
                                    if (i15 >= c1619aM3.f17367b) {
                                        c1619a.f17369d = i15 - c1619aM3.f17369d;
                                    }
                                }
                                i12 = c1619a.f17367b;
                                if (i12 >= c1619a2.f17367b) {
                                    c1619a.f17367b = i12 - c1619a2.f17369d;
                                }
                                i13 = c1619a.f17369d;
                                if (i13 >= c1619a2.f17367b) {
                                    c1619a.f17369d = i13 - c1619a2.f17369d;
                                }
                            }
                            arrayList.set(size, c1619a2);
                            if (c1619a.f17367b != c1619a.f17369d) {
                                arrayList.set(i20, c1619a);
                            } else {
                                arrayList.remove(i20);
                            }
                            if (c1619aM3 != null) {
                                arrayList.add(size, c1619aM3);
                            }
                        }
                    }
                    c1619aM3 = null;
                    if (z10) {
                        arrayList.set(size, c1619a2);
                        arrayList.remove(i20);
                        w0Var.getClass();
                        c1619a.f17368c = null;
                        ((Y2.L) w0Var.f8483b).i(c1619a);
                    } else {
                        if (z9) {
                            if (c1619aM3 != null) {
                                i18 = c1619a.f17367b;
                                if (i18 > c1619aM3.f17367b) {
                                    c1619a.f17367b = i18 - c1619aM3.f17369d;
                                }
                                i19 = c1619a.f17369d;
                                if (i19 > c1619aM3.f17367b) {
                                    c1619a.f17369d = i19 - c1619aM3.f17369d;
                                }
                            }
                            i16 = c1619a.f17367b;
                            if (i16 > c1619a2.f17367b) {
                                c1619a.f17367b = i16 - c1619a2.f17369d;
                            }
                            i17 = c1619a.f17369d;
                            if (i17 > c1619a2.f17367b) {
                                c1619a.f17369d = i17 - c1619a2.f17369d;
                            }
                        } else {
                            if (c1619aM3 != null) {
                                i14 = c1619a.f17367b;
                                if (i14 >= c1619aM3.f17367b) {
                                    c1619a.f17367b = i14 - c1619aM3.f17369d;
                                }
                                i15 = c1619a.f17369d;
                                if (i15 >= c1619aM3.f17367b) {
                                    c1619a.f17369d = i15 - c1619aM3.f17369d;
                                }
                            }
                            i12 = c1619a.f17367b;
                            if (i12 >= c1619a2.f17367b) {
                                c1619a.f17367b = i12 - c1619a2.f17369d;
                            }
                            i13 = c1619a.f17369d;
                            if (i13 >= c1619a2.f17367b) {
                                c1619a.f17369d = i13 - c1619a2.f17369d;
                            }
                        }
                        arrayList.set(size, c1619a2);
                        if (c1619a.f17367b != c1619a.f17369d) {
                            arrayList.set(i20, c1619a);
                        } else {
                            arrayList.remove(i20);
                        }
                        if (c1619aM3 != null) {
                            arrayList.add(size, c1619aM3);
                        }
                    }
                } else if (i21 == 4) {
                    int i29 = c1619a.f17369d;
                    int i30 = c1619a2.f17367b;
                    if (i29 < i30) {
                        c1619a2.f17367b = i30 - 1;
                    } else {
                        int i31 = c1619a2.f17369d;
                        if (i29 < i30 + i31) {
                            c1619a2.f17369d = i31 - 1;
                            c1619aM = w0Var.m(4, c1619a.f17367b, 1, c1619a2.f17368c);
                        }
                        i9 = c1619a.f17367b;
                        i10 = c1619a2.f17367b;
                        if (i9 <= i10) {
                            c1619a2.f17367b = i10 + 1;
                        } else {
                            i11 = i10 + c1619a2.f17369d;
                            if (i9 < i11) {
                                int i32 = i11 - i9;
                                c1619aM2 = w0Var.m(4, i9 + 1, i32, c1619a2.f17368c);
                                c1619a2.f17369d -= i32;
                            }
                            arrayList.set(i20, c1619a);
                            if (c1619a2.f17369d > 0) {
                                arrayList.set(size, c1619a2);
                            } else {
                                arrayList.remove(size);
                                w0Var.getClass();
                                c1619a2.f17368c = null;
                                ((Y2.L) w0Var.f8483b).i(c1619a2);
                            }
                            if (c1619aM != null) {
                                arrayList.add(size, c1619aM);
                            }
                            if (c1619aM2 != null) {
                                arrayList.add(size, c1619aM2);
                            }
                        }
                        c1619aM2 = null;
                        arrayList.set(i20, c1619a);
                        if (c1619a2.f17369d > 0) {
                            arrayList.set(size, c1619a2);
                        } else {
                            arrayList.remove(size);
                            w0Var.getClass();
                            c1619a2.f17368c = null;
                            ((Y2.L) w0Var.f8483b).i(c1619a2);
                        }
                        if (c1619aM != null) {
                            arrayList.add(size, c1619aM);
                        }
                        if (c1619aM2 != null) {
                            arrayList.add(size, c1619aM2);
                        }
                    }
                    c1619aM = null;
                    i9 = c1619a.f17367b;
                    i10 = c1619a2.f17367b;
                    if (i9 <= i10) {
                        c1619a2.f17367b = i10 + 1;
                    } else {
                        i11 = i10 + c1619a2.f17369d;
                        if (i9 < i11) {
                            int i33 = i11 - i9;
                            c1619aM2 = w0Var.m(4, i9 + 1, i33, c1619a2.f17368c);
                            c1619a2.f17369d -= i33;
                        }
                        arrayList.set(i20, c1619a);
                        if (c1619a2.f17369d > 0) {
                            arrayList.set(size, c1619a2);
                        } else {
                            arrayList.remove(size);
                            w0Var.getClass();
                            c1619a2.f17368c = null;
                            ((Y2.L) w0Var.f8483b).i(c1619a2);
                        }
                        if (c1619aM != null) {
                            arrayList.add(size, c1619aM);
                        }
                        if (c1619aM2 != null) {
                            arrayList.add(size, c1619aM2);
                        }
                    }
                    c1619aM2 = null;
                    arrayList.set(i20, c1619a);
                    if (c1619a2.f17369d > 0) {
                        arrayList.set(size, c1619a2);
                    } else {
                        arrayList.remove(size);
                        w0Var.getClass();
                        c1619a2.f17368c = null;
                        ((Y2.L) w0Var.f8483b).i(c1619a2);
                    }
                    if (c1619aM != null) {
                        arrayList.add(size, c1619aM);
                    }
                    if (c1619aM2 != null) {
                        arrayList.add(size, c1619aM2);
                    }
                }
            } else {
                int i34 = c1619a.f17369d;
                int i35 = c1619a2.f17367b;
                int i36 = i34 < i35 ? -1 : 0;
                int i37 = c1619a.f17367b;
                if (i37 < i35) {
                    i36++;
                }
                if (i35 <= i37) {
                    c1619a.f17367b = i37 + c1619a2.f17369d;
                }
                int i38 = c1619a2.f17367b;
                if (i38 <= i34) {
                    c1619a.f17369d = i34 + c1619a2.f17369d;
                }
                c1619a2.f17367b = i38 + i36;
                arrayList.set(size, c1619a2);
                arrayList.set(i20, c1619a);
            }
        }
        int size2 = arrayList.size();
        int i39 = 0;
        while (i39 < size2) {
            androidx.recyclerview.widget.C1619a c1619aM4 = (androidx.recyclerview.widget.C1619a) arrayList.get(i39);
            int i40 = c1619aM4.f17366a;
            if (i40 != 1) {
                Y2.L l2 = (Y2.L) this.f8483b;
                androidx.recyclerview.widget.C1642y c1642y = (androidx.recyclerview.widget.C1642y) this.f8486e;
                if (i40 == 2) {
                    int i41 = c1619aM4.f17367b;
                    int i42 = c1619aM4.f17369d + i41;
                    int i43 = i41;
                    int i44 = 0;
                    byte b11 = -1;
                    while (i43 < i42) {
                        if (c1642y.b(i43) != null || b(i43)) {
                            if (b11 == 0) {
                                e(m(2, i41, i44, null));
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            b10 = 1;
                        } else {
                            if (b11 == 1) {
                                p(m(2, i41, i44, null));
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            b10 = 0;
                        }
                        if (z6) {
                            i43 -= i44;
                            i42 -= i44;
                            i44 = 1;
                        } else {
                            i44++;
                        }
                        i43++;
                        b11 = b10;
                    }
                    if (i44 != c1619aM4.f17369d) {
                        c1619aM4.f17368c = null;
                        l2.i(c1619aM4);
                        c1619aM4 = m(2, i41, i44, null);
                    }
                    if (b11 == 0) {
                        e(c1619aM4);
                    } else {
                        p(c1619aM4);
                    }
                } else if (i40 == 4) {
                    int i45 = c1619aM4.f17367b;
                    int i46 = c1619aM4.f17369d + i45;
                    byte b12 = b9;
                    int i47 = i45;
                    int i48 = 0;
                    while (i45 < i46) {
                        if (c1642y.b(i45) != null || b(i45)) {
                            if (b12 == 0) {
                                e(m(4, i47, i48, c1619aM4.f17368c));
                                i47 = i45;
                                i48 = 0;
                            }
                            b12 = 1;
                        } else {
                            if (b12 == 1) {
                                p(m(4, i47, i48, c1619aM4.f17368c));
                                i47 = i45;
                                i48 = 0;
                            }
                            b12 = 0;
                        }
                        i48++;
                        i45++;
                    }
                    if (i48 != c1619aM4.f17369d) {
                        java.lang.Object obj = c1619aM4.f17368c;
                        c1619aM4.f17368c = null;
                        l2.i(c1619aM4);
                        c1619aM4 = m(4, i47, i48, obj);
                    }
                    if (b12 == 0) {
                        e(c1619aM4);
                    } else {
                        p(c1619aM4);
                    }
                } else if (i40 == i3) {
                    p(c1619aM4);
                }
            } else {
                p(c1619aM4);
            }
            i39++;
            b9 = -1;
            i3 = 8;
        }
        arrayList.clear();
    }

    public void r(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.recyclerview.widget.C1619a c1619a = (androidx.recyclerview.widget.C1619a) arrayList.get(i3);
            c1619a.f17368c = null;
            ((Y2.L) this.f8483b).i(c1619a);
        }
        arrayList.clear();
    }

    public void s(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((p103m.P0) this.f8485d) == null) {
                this.f8485d = new p103m.P0();
            }
            p103m.P0 p2 = (p103m.P0) this.f8485d;
            p2.f24960c = colorStateList;
            p2.f24959b = true;
        } else {
            this.f8485d = null;
        }
        a();
    }

    public void t(android.content.res.ColorStateList colorStateList) {
        if (((p103m.P0) this.f8486e) == null) {
            this.f8486e = new p103m.P0();
        }
        p103m.P0 p2 = (p103m.P0) this.f8486e;
        p2.f24960c = colorStateList;
        p2.f24959b = true;
        a();
    }

    public void u(android.graphics.PorterDuff.Mode mode) {
        if (((p103m.P0) this.f8486e) == null) {
            this.f8486e = new p103m.P0();
        }
        p103m.P0 p2 = (p103m.P0) this.f8486e;
        p2.f24961d = mode;
        p2.f24958a = true;
        a();
    }

    public int v(int i3, int i9) {
        int i10;
        int i11;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f8485d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.C1619a c1619a = (androidx.recyclerview.widget.C1619a) arrayList.get(size);
            int i12 = c1619a.f17366a;
            if (i12 == 8) {
                int i13 = c1619a.f17367b;
                int i14 = c1619a.f17369d;
                if (i13 < i14) {
                    i11 = i13;
                    i10 = i14;
                } else {
                    i10 = i13;
                    i11 = i14;
                }
                if (i3 < i11 || i3 > i10) {
                    if (i3 < i13) {
                        if (i9 == 1) {
                            c1619a.f17367b = i13 + 1;
                            c1619a.f17369d = i14 + 1;
                        } else if (i9 == 2) {
                            c1619a.f17367b = i13 - 1;
                            c1619a.f17369d = i14 - 1;
                        }
                    }
                } else if (i11 == i13) {
                    if (i9 == 1) {
                        c1619a.f17369d = i14 + 1;
                    } else if (i9 == 2) {
                        c1619a.f17369d = i14 - 1;
                    }
                    i3++;
                } else {
                    if (i9 == 1) {
                        c1619a.f17367b = i13 + 1;
                    } else if (i9 == 2) {
                        c1619a.f17367b = i13 - 1;
                    }
                    i3--;
                }
            } else {
                int i15 = c1619a.f17367b;
                if (i15 <= i3) {
                    if (i12 == 1) {
                        i3 -= c1619a.f17369d;
                    } else if (i12 == 2) {
                        i3 += c1619a.f17369d;
                    }
                } else if (i9 == 1) {
                    c1619a.f17367b = i15 + 1;
                } else if (i9 == 2) {
                    c1619a.f17367b = i15 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            androidx.recyclerview.widget.C1619a c1619a2 = (androidx.recyclerview.widget.C1619a) arrayList.get(size2);
            int i16 = c1619a2.f17366a;
            Y2.L l2 = (Y2.L) this.f8483b;
            if (i16 == 8) {
                int i17 = c1619a2.f17369d;
                if (i17 == c1619a2.f17367b || i17 < 0) {
                    arrayList.remove(size2);
                    c1619a2.f17368c = null;
                    l2.i(c1619a2);
                }
            } else if (c1619a2.f17369d <= 0) {
                arrayList.remove(size2);
                c1619a2.f17368c = null;
                l2.i(c1619a2);
            }
        }
        return i3;
    }

    public w0() {
        this.f8483b = new O0.C0725n[32];
        this.f8484c = new float[32];
        this.f8485d = new byte[32];
        p136q.I i3 = p136q.Q.f26352a;
        this.f8486e = new p136q.I();
        this.f8487f = new p136q.I();
    }
}
