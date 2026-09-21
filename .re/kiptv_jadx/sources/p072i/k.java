package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class k implements D1.InterfaceC0233s, p095l.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p072i.v f22653h;

    public /* synthetic */ k(p072i.v vVar) {
        this.f22653h = vVar;
    }

    @Override // p095l.w
    public void c(p095l.l lVar, boolean z6) {
        this.f22653h.g(lVar);
    }

    @Override // p095l.w
    public boolean j(p095l.l lVar) {
        android.view.Window.Callback callback = this.f22653h.f22715m.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // D1.InterfaceC0233s
    public D1.E0 z(android.view.View view, D1.E0 e6) {
        int i3;
        boolean z6;
        D1.E0 e0B;
        D1.s0 p0Var;
        boolean z9;
        boolean z10;
        D1.z0 z0Var = e6.f1967a;
        int i9 = z0Var.l().f29761b;
        p072i.v vVar = this.f22653h;
        vVar.getClass();
        int i10 = z0Var.l().f29761b;
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = vVar.f22723u;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            i3 = 0;
            z6 = false;
        } else {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) vVar.f22723u.getLayoutParams();
            if (vVar.f22723u.isShown()) {
                if (vVar.f22708c0 == null) {
                    vVar.f22708c0 = new android.graphics.Rect();
                    vVar.f22709d0 = new android.graphics.Rect();
                }
                android.graphics.Rect rect = vVar.f22708c0;
                android.graphics.Rect rect2 = vVar.f22709d0;
                rect.set(z0Var.l().f29760a, z0Var.l().f29761b, z0Var.l().f29762c, z0Var.l().f29763d);
                android.view.ViewGroup viewGroup = vVar.f22684A;
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    boolean z11 = p103m.g1.f25041a;
                    p103m.f1.a(viewGroup, rect, rect2);
                } else {
                    if (!p103m.g1.f25041a) {
                        p103m.g1.f25041a = true;
                        try {
                            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
                            p103m.g1.f25042b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                p103m.g1.f25042b.setAccessible(true);
                            }
                        } catch (java.lang.NoSuchMethodException unused) {
                            android.util.Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    java.lang.reflect.Method method = p103m.g1.f25042b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (java.lang.Exception e9) {
                            android.util.Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e9);
                        }
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                android.view.ViewGroup viewGroup2 = vVar.f22684A;
                java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                D1.E0 e0A = D1.M.a(viewGroup2);
                int i14 = e0A == null ? 0 : e0A.f1967a.l().f29760a;
                int i15 = e0A == null ? 0 : e0A.f1967a.l().f29762c;
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
                android.content.Context context = vVar.f22714l;
                if (i11 <= 0 || vVar.f22686C != null) {
                    android.view.View view2 = vVar.f22686C;
                    if (view2 != null) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != i14 || marginLayoutParams2.rightMargin != i15) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = i14;
                            marginLayoutParams2.rightMargin = i15;
                            vVar.f22686C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    android.view.View view3 = new android.view.View(context);
                    vVar.f22686C = view3;
                    view3.setVisibility(8);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i14;
                    layoutParams.rightMargin = i15;
                    vVar.f22684A.addView(vVar.f22686C, -1, layoutParams);
                }
                android.view.View view4 = vVar.f22686C;
                boolean z12 = view4 != null;
                if (z12 && view4.getVisibility() != 0) {
                    android.view.View view5 = vVar.f22686C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(com.kiptv.tv.R.color.abc_decor_view_status_guard_light) : context.getColor(com.kiptv.tv.R.color.abc_decor_view_status_guard));
                }
                if (!vVar.H && z12) {
                    i10 = 0;
                }
                z9 = z10;
                z6 = z12;
                i3 = 0;
            } else {
                i3 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z6 = false;
                    z9 = true;
                } else {
                    z6 = false;
                    z9 = false;
                }
            }
            if (z9) {
                vVar.f22723u.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View view6 = vVar.f22686C;
        if (view6 != null) {
            view6.setVisibility(z6 ? i3 : 8);
        }
        if (i9 != i10) {
            int i18 = z0Var.l().f29760a;
            int i19 = z0Var.l().f29762c;
            int i20 = z0Var.l().f29763d;
            int i21 = android.os.Build.VERSION.SDK_INT;
            if (i21 >= 34) {
                p0Var = new D1.r0(e6);
            } else if (i21 >= 30) {
                p0Var = new D1.q0(e6);
            } else {
                p0Var = i21 >= 29 ? new D1.p0(e6) : new D1.n0(e6);
            }
            p0Var.g(p182w1.b.b(i18, i10, i19, i20));
            e0B = p0Var.b();
        } else {
            e0B = e6;
        }
        java.util.WeakHashMap weakHashMap2 = D1.U.f1980a;
        android.view.WindowInsets windowInsetsB = e0B.b();
        if (windowInsetsB == null) {
            return e0B;
        }
        android.view.WindowInsets windowInsetsB2 = D1.J.b(view, windowInsetsB);
        return !windowInsetsB2.equals(windowInsetsB) ? D1.E0.c(view, windowInsetsB2) : e0B;
    }
}
