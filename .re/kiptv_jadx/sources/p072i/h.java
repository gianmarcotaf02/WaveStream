package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p019c.l implements android.content.DialogInterface {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p072i.v f22646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p072i.w f22647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p072i.f f22648m;

    /* JADX WARN: Type inference failed for: r2v2, types: [i.w] */
    public h(android.view.ContextThemeWrapper contextThemeWrapper, int i3) {
        int i9;
        int iH = h(contextThemeWrapper, i3);
        if (iH == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(com.kiptv.tv.R.attr.dialogTheme, typedValue, true);
            i9 = typedValue.resourceId;
        } else {
            i9 = iH;
        }
        super(contextThemeWrapper, i9);
        this.f22647l = new D1.InterfaceC0228m() { // from class: i.w
            @Override // D1.InterfaceC0228m
            public final boolean f(android.view.KeyEvent keyEvent) {
                return this.f22728h.j(keyEvent);
            }
        };
        p072i.i iVarD = d();
        if (iH == 0) {
            android.util.TypedValue typedValue2 = new android.util.TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(com.kiptv.tv.R.attr.dialogTheme, typedValue2, true);
            iH = typedValue2.resourceId;
        }
        ((p072i.v) iVarD).f22702T = iH;
        iVarD.a();
        this.f22648m = new p072i.f(getContext(), this, getWindow());
    }

    public static int h(android.content.Context context, int i3) {
        if (((i3 >>> 24) & 255) >= 1) {
            return i3;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.kiptv.tv.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p019c.l, android.app.Dialog
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        p072i.v vVar = (p072i.v) d();
        vVar.k();
        ((android.view.ViewGroup) vVar.f22684A.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f22716n.a(vVar.f22715m.getCallback());
    }

    public final p072i.i d() {
        if (this.f22646k == null) {
            int i3 = p072i.i.f22649h;
            this.f22646k = new p072i.v(this, this);
        }
        return this.f22646k;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        p072i.v vVar = (p072i.v) d();
        android.app.Dialog dialog = vVar.f22713k;
        if (vVar.f22704Y) {
            vVar.f22715m.getDecorView().removeCallbacks(vVar.f22706a0);
        }
        vVar.f22699Q = true;
        if (vVar.f22701S != -100) {
            android.app.Dialog dialog2 = vVar.f22713k;
        }
        p072i.v.f22681h0.remove(vVar.f22713k.getClass().getName());
        p072i.r rVar = vVar.W;
        if (rVar != null) {
            rVar.c();
        }
        p072i.r rVar2 = vVar.X;
        if (rVar2 != null) {
            rVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return E6.G.q(this.f22647l, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        androidx.lifecycle.X.i(getWindow().getDecorView(), this);
        com.google.common.util.concurrent.AbstractC1903s.H(getWindow().getDecorView(), this);
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, "<this>");
        decorView.setTag(com.kiptv.tv.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void f(android.os.Bundle bundle) {
        p072i.v vVar = (p072i.v) d();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(vVar.f22714l);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(vVar);
        } else if (!(layoutInflaterFrom.getFactory2() instanceof p072i.v)) {
            android.util.Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        d().a();
    }

    @Override // android.app.Dialog
    public final android.view.View findViewById(int i3) {
        p072i.v vVar = (p072i.v) d();
        vVar.k();
        return vVar.f22715m.findViewById(i3);
    }

    public final void i(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        p072i.v vVar = (p072i.v) d();
        vVar.f22718p = charSequence;
        p103m.InterfaceC2565g0 interfaceC2565g0 = vVar.f22719q;
        if (interfaceC2565g0 != null) {
            interfaceC2565g0.setWindowTitle(charSequence);
            return;
        }
        p072i.B b9 = vVar.f22717o;
        if (b9 == null) {
            android.widget.TextView textView = vVar.f22685B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        p103m.Y0 y9 = (p103m.Y0) b9.f22587p;
        if (y9.g) {
            return;
        }
        y9.f24995h = charSequence;
        if ((y9.f24990b & 8) != 0) {
            androidx.appcompat.widget.Toolbar toolbar = y9.f24989a;
            toolbar.setTitle(charSequence);
            if (y9.g) {
                D1.U.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        p072i.v vVar = (p072i.v) d();
        if (vVar.f22717o != null) {
            vVar.q().getClass();
            vVar.r(0);
        }
    }

    public final boolean j(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p019c.l, android.app.Dialog
    public final void onCreate(android.os.Bundle bundle) {
        int i3;
        int i9;
        int i10;
        android.widget.ListAdapter listAdapter;
        android.view.View viewFindViewById;
        f(bundle);
        p072i.f fVar = this.f22648m;
        fVar.f22622b.setContentView(fVar.y);
        android.view.Window window = fVar.f22623c;
        android.view.View viewFindViewById2 = window.findViewById(com.kiptv.tv.R.id.parentPanel);
        android.view.View viewFindViewById3 = viewFindViewById2.findViewById(com.kiptv.tv.R.id.topPanel);
        android.view.View viewFindViewById4 = viewFindViewById2.findViewById(com.kiptv.tv.R.id.contentPanel);
        android.view.View viewFindViewById5 = viewFindViewById2.findViewById(com.kiptv.tv.R.id.buttonPanel);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById2.findViewById(com.kiptv.tv.R.id.customPanel);
        android.view.View view = fVar.f22626f;
        if (view == null) {
            view = null;
        }
        boolean z6 = view != null;
        if (!z6 || !p072i.f.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z6) {
            i3 = 2;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) window.findViewById(com.kiptv.tv.R.id.custom);
            frameLayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (fVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fVar.f22625e != null) {
                ((android.widget.LinearLayout.LayoutParams) ((p103m.C2588s0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            i3 = 2;
            viewGroup.setVisibility(8);
        }
        android.view.View viewFindViewById6 = viewGroup.findViewById(com.kiptv.tv.R.id.topPanel);
        android.view.View viewFindViewById7 = viewGroup.findViewById(com.kiptv.tv.R.id.contentPanel);
        android.view.View viewFindViewById8 = viewGroup.findViewById(com.kiptv.tv.R.id.buttonPanel);
        android.view.ViewGroup viewGroupB = p072i.f.b(viewFindViewById6, viewFindViewById3);
        android.view.ViewGroup viewGroupB2 = p072i.f.b(viewFindViewById7, viewFindViewById4);
        android.view.ViewGroup viewGroupB3 = p072i.f.b(viewFindViewById8, viewFindViewById5);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) window.findViewById(com.kiptv.tv.R.id.scrollView);
        fVar.f22635q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.f22635q.setNestedScrollingEnabled(false);
        android.widget.TextView textView = (android.widget.TextView) viewGroupB2.findViewById(android.R.id.message);
        fVar.f22639u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            fVar.f22635q.removeView(fVar.f22639u);
            if (fVar.f22625e != null) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) fVar.f22635q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(fVar.f22635q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(fVar.f22625e, iIndexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        android.widget.Button button = (android.widget.Button) viewGroupB3.findViewById(android.R.id.button1);
        fVar.f22627h = button;
        p072i.ViewOnClickListenerC2181a viewOnClickListenerC2181a = fVar.f22620E;
        button.setOnClickListener(viewOnClickListenerC2181a);
        if (android.text.TextUtils.isEmpty(fVar.f22628i)) {
            fVar.f22627h.setVisibility(8);
            i9 = 0;
        } else {
            fVar.f22627h.setText(fVar.f22628i);
            fVar.f22627h.setVisibility(0);
            i9 = 1;
        }
        android.widget.Button button2 = (android.widget.Button) viewGroupB3.findViewById(android.R.id.button2);
        fVar.f22629k = button2;
        button2.setOnClickListener(viewOnClickListenerC2181a);
        if (android.text.TextUtils.isEmpty(fVar.f22630l)) {
            fVar.f22629k.setVisibility(8);
        } else {
            fVar.f22629k.setText(fVar.f22630l);
            fVar.f22629k.setVisibility(0);
            i9 |= 2;
        }
        android.widget.Button button3 = (android.widget.Button) viewGroupB3.findViewById(android.R.id.button3);
        fVar.f22632n = button3;
        button3.setOnClickListener(viewOnClickListenerC2181a);
        if (android.text.TextUtils.isEmpty(fVar.f22633o)) {
            fVar.f22632n.setVisibility(8);
        } else {
            fVar.f22632n.setText(fVar.f22633o);
            fVar.f22632n.setVisibility(0);
            i9 |= 4;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        fVar.f22621a.getTheme().resolveAttribute(com.kiptv.tv.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i10 = i3;
        } else if (i9 == 1) {
            android.widget.Button button4 = fVar.f22627h;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i10 = i3;
        } else {
            i10 = i3;
            if (i9 == i10) {
                android.widget.Button button5 = fVar.f22629k;
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i9 == 4) {
                android.widget.Button button6 = fVar.f22632n;
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i9 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (fVar.f22640v != null) {
            viewGroupB.addView(fVar.f22640v, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.kiptv.tv.R.id.title_template).setVisibility(8);
        } else {
            fVar.f22637s = (android.widget.ImageView) window.findViewById(android.R.id.icon);
            if (android.text.TextUtils.isEmpty(fVar.f22624d) || !fVar.f22618C) {
                window.findViewById(com.kiptv.tv.R.id.title_template).setVisibility(8);
                fVar.f22637s.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                android.widget.TextView textView2 = (android.widget.TextView) window.findViewById(com.kiptv.tv.R.id.alertTitle);
                fVar.f22638t = textView2;
                textView2.setText(fVar.f22624d);
                android.graphics.drawable.Drawable drawable = fVar.f22636r;
                if (drawable != null) {
                    fVar.f22637s.setImageDrawable(drawable);
                } else {
                    fVar.f22638t.setPadding(fVar.f22637s.getPaddingLeft(), fVar.f22637s.getPaddingTop(), fVar.f22637s.getPaddingRight(), fVar.f22637s.getPaddingBottom());
                    fVar.f22637s.setVisibility(8);
                }
            }
        }
        boolean z9 = viewGroup.getVisibility() != 8;
        int i11 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z10 = viewGroupB3.getVisibility() != 8;
        if (!z10 && (viewFindViewById = viewGroupB2.findViewById(com.kiptv.tv.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i11 != 0) {
            androidx.core.widget.NestedScrollView nestedScrollView2 = fVar.f22635q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            android.view.View viewFindViewById9 = fVar.f22625e != null ? viewGroupB.findViewById(com.kiptv.tv.R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            android.view.View viewFindViewById10 = viewGroupB2.findViewById(com.kiptv.tv.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView = fVar.f22625e;
        if (alertController$RecycleListView != null && (!z10 || i11 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f15632h, alertController$RecycleListView.getPaddingRight(), z10 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f15633i);
        }
        if (!z9) {
            android.view.View view2 = fVar.f22625e;
            if (view2 == null) {
                view2 = fVar.f22635q;
            }
            if (view2 != null) {
                int i12 = i11 | (z10 ? i10 : 0);
                android.view.View viewFindViewById11 = window.findViewById(com.kiptv.tv.R.id.scrollIndicatorUp);
                android.view.View viewFindViewById12 = window.findViewById(com.kiptv.tv.R.id.scrollIndicatorDown);
                java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                D1.M.b(view2, i12, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView2 = fVar.f22625e;
        if (alertController$RecycleListView2 == null || (listAdapter = fVar.f22641w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i13 = fVar.f22642x;
        if (i13 > -1) {
            alertController$RecycleListView2.setItemChecked(i13, true);
            alertController$RecycleListView2.setSelection(i13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f22648m.f22635q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i3, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f22648m.f22635q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i3, keyEvent);
        }
        return true;
    }

    @Override // p019c.l, android.app.Dialog
    public final void onStop() {
        p088k.i iVar;
        super.onStop();
        p072i.B bQ = ((p072i.v) d()).q();
        if (bQ == null || (iVar = bQ.f22579D) == null) {
            return;
        }
        iVar.a();
    }

    @Override // p019c.l, android.app.Dialog
    public final void setContentView(int i3) {
        e();
        p072i.v vVar = (p072i.v) d();
        vVar.k();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) vVar.f22684A.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        android.view.LayoutInflater.from(vVar.f22714l).inflate(i3, viewGroup);
        vVar.f22716n.a(vVar.f22715m.getCallback());
    }

    @Override // android.app.Dialog
    public final void setTitle(int i3) {
        super.setTitle(i3);
        p072i.i iVarD = d();
        java.lang.String string = getContext().getString(i3);
        p072i.v vVar = (p072i.v) iVarD;
        vVar.f22718p = string;
        p103m.InterfaceC2565g0 interfaceC2565g0 = vVar.f22719q;
        if (interfaceC2565g0 != null) {
            interfaceC2565g0.setWindowTitle(string);
            return;
        }
        p072i.B b9 = vVar.f22717o;
        if (b9 == null) {
            android.widget.TextView textView = vVar.f22685B;
            if (textView != null) {
                textView.setText(string);
                return;
            }
            return;
        }
        p103m.Y0 y9 = (p103m.Y0) b9.f22587p;
        if (y9.g) {
            return;
        }
        y9.f24995h = string;
        if ((y9.f24990b & 8) != 0) {
            androidx.appcompat.widget.Toolbar toolbar = y9.f24989a;
            toolbar.setTitle(string);
            if (y9.g) {
                D1.U.k(toolbar.getRootView(), string);
            }
        }
    }

    @Override // p019c.l, android.app.Dialog
    public final void setContentView(android.view.View view) {
        e();
        p072i.v vVar = (p072i.v) d();
        vVar.k();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) vVar.f22684A.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        vVar.f22716n.a(vVar.f22715m.getCallback());
    }

    @Override // p019c.l, android.app.Dialog
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        e();
        p072i.v vVar = (p072i.v) d();
        vVar.k();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) vVar.f22684A.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        vVar.f22716n.a(vVar.f22715m.getCallback());
    }

    @Override // android.app.Dialog
    public final void setTitle(java.lang.CharSequence charSequence) {
        i(charSequence);
        p072i.f fVar = this.f22648m;
        fVar.f22624d = charSequence;
        android.widget.TextView textView = fVar.f22638t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
