package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p072i.i implements p095l.j, android.view.LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final p136q.S f22681h0 = new p136q.S(0);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int[] f22682i0 = {android.R.attr.windowBackground};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final boolean f22683j0 = !"robolectric".equals(android.os.Build.FINGERPRINT);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public android.view.ViewGroup f22684A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public android.widget.TextView f22685B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public android.view.View f22686C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f22687D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f22688E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f22689F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f22690G;
    public boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f22691I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f22692J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f22693K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public p072i.u[] f22694L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public p072i.u f22695M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f22696N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f22697O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f22698P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f22699Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public android.content.res.Configuration f22700R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f22701S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f22702T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f22703U;
    public boolean V;
    public p072i.r W;
    public p072i.r X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f22704Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f22705Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final p072i.j f22706a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f22707b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public android.graphics.Rect f22708c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public android.graphics.Rect f22709d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public p072i.y f22710e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public android.window.OnBackInvokedDispatcher f22711f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public android.window.OnBackInvokedCallback f22712g0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.app.Dialog f22713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.content.Context f22714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public android.view.Window f22715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p072i.q f22716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p072i.B f22717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f22718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p103m.InterfaceC2565g0 f22719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p072i.k f22720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p072i.l f22721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public N6.i0 f22722t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContextView f22723u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public android.widget.PopupWindow f22724v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p072i.j f22725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public D1.C0216c0 f22726x;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22727z;

    public v(p072i.h hVar, p072i.h hVar2) {
        android.content.Context context = hVar.getContext();
        android.view.Window window = hVar.getWindow();
        this.f22726x = null;
        this.y = true;
        this.f22701S = -100;
        this.f22706a0 = new p072i.j(this, 0);
        this.f22714l = context;
        this.f22713k = hVar;
        while (context != null && (context instanceof android.content.ContextWrapper)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (this.f22701S == -100) {
            p136q.S s9 = f22681h0;
            java.lang.Integer num = (java.lang.Integer) s9.get(this.f22713k.getClass().getName());
            if (num != null) {
                this.f22701S = num.intValue();
                s9.remove(this.f22713k.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        p103m.r.c();
    }

    @Override // p072i.i
    public final void a() {
        this.f22697O = true;
        d(false);
        l();
        this.f22700R = new android.content.res.Configuration(this.f22714l.getResources().getConfiguration());
        this.f22698P = true;
    }

    @Override // p072i.i
    public final boolean c(int i3) {
        if (i3 == 8) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i3 = 108;
        } else if (i3 == 9) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i3 = 109;
        }
        if (this.f22692J && i3 == 108) {
            return false;
        }
        if (this.f22689F && i3 == 1) {
            this.f22689F = false;
        }
        if (i3 == 1) {
            x();
            this.f22692J = true;
            return true;
        }
        if (i3 == 2) {
            x();
            this.f22687D = true;
            return true;
        }
        if (i3 == 5) {
            x();
            this.f22688E = true;
            return true;
        }
        if (i3 == 10) {
            x();
            this.H = true;
            return true;
        }
        if (i3 == 108) {
            x();
            this.f22689F = true;
            return true;
        }
        if (i3 != 109) {
            return this.f22715m.requestFeature(i3);
        }
        x();
        this.f22690G = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    public final boolean d(boolean z6) {
        int i3;
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z9 = false;
        if (this.f22699Q) {
            return false;
        }
        int i9 = this.f22701S;
        if (i9 == -100) {
            i9 = p072i.i.f22649h;
        }
        android.content.Context context = this.f22714l;
        int iH = -1;
        if (i9 != -100) {
            if (i9 == -1) {
                iH = i9;
            } else if (i9 != 0) {
                if (i9 == 1 || i9 == 2) {
                    iH = i9;
                } else {
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.X == null) {
                        this.X = new p072i.r(this, context);
                    }
                    iH = this.X.h();
                }
            } else if (((android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                iH = o(context).h();
            }
        }
        if (iH != 1) {
            i3 = iH != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        android.content.res.Configuration configuration = new android.content.res.Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i3 | (configuration.uiMode & (-49));
        this.V = true;
        int i10 = this.f22703U;
        android.content.res.Configuration configuration2 = this.f22700R;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i11 = configuration2.uiMode & 48;
        int i12 = configuration.uiMode & 48;
        p072i.o.b(configuration2);
        int i13 = i11 != i12 ? 512 : 0;
        if (((~i10) & i13) != 0 && z6 && this.f22697O && !f22683j0) {
            boolean z10 = this.f22698P;
        }
        if (i13 != 0) {
            android.content.res.Resources resources = context.getResources();
            android.content.res.Configuration configuration3 = new android.content.res.Configuration(resources.getConfiguration());
            configuration3.uiMode = (resources.getConfiguration().uiMode & (-49)) | i12;
            android.util.LongSparseArray longSparseArray = null;
            resources.updateConfiguration(configuration3, null);
            int i14 = android.os.Build.VERSION.SDK_INT;
            if (i14 < 26 && i14 < 28) {
                if (!com.google.crypto.tink.shaded.protobuf.q0.f19579i) {
                    try {
                        java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mResourcesImpl");
                        com.google.crypto.tink.shaded.protobuf.q0.f19578h = declaredField;
                        declaredField.setAccessible(true);
                    } catch (java.lang.NoSuchFieldException e6) {
                        android.util.Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e6);
                    }
                    com.google.crypto.tink.shaded.protobuf.q0.f19579i = true;
                }
                java.lang.reflect.Field field = com.google.crypto.tink.shaded.protobuf.q0.f19578h;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (java.lang.IllegalAccessException e9) {
                        android.util.Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!com.google.crypto.tink.shaded.protobuf.q0.f19574c) {
                            try {
                                java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                com.google.crypto.tink.shaded.protobuf.q0.f19573b = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (java.lang.NoSuchFieldException e10) {
                                android.util.Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                            }
                            com.google.crypto.tink.shaded.protobuf.q0.f19574c = true;
                        }
                        java.lang.reflect.Field field2 = com.google.crypto.tink.shaded.protobuf.q0.f19573b;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (java.lang.IllegalAccessException e11) {
                                android.util.Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!com.google.crypto.tink.shaded.protobuf.q0.f19576e) {
                                try {
                                    com.google.crypto.tink.shaded.protobuf.q0.f19575d = java.lang.Class.forName("android.content.res.ThemedResourceCache");
                                } catch (java.lang.ClassNotFoundException e12) {
                                    android.util.Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e12);
                                }
                                com.google.crypto.tink.shaded.protobuf.q0.f19576e = true;
                            }
                            java.lang.Class cls = com.google.crypto.tink.shaded.protobuf.q0.f19575d;
                            if (cls != null) {
                                if (!com.google.crypto.tink.shaded.protobuf.q0.g) {
                                    try {
                                        java.lang.reflect.Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        com.google.crypto.tink.shaded.protobuf.q0.f19577f = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (java.lang.NoSuchFieldException e13) {
                                        android.util.Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e13);
                                    }
                                    com.google.crypto.tink.shaded.protobuf.q0.g = true;
                                }
                                java.lang.reflect.Field field3 = com.google.crypto.tink.shaded.protobuf.q0.f19577f;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (android.util.LongSparseArray) field3.get(obj2);
                                    } catch (java.lang.IllegalAccessException e14) {
                                        android.util.Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e14);
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i15 = this.f22702T;
            if (i15 != 0) {
                context.setTheme(i15);
                context.getTheme().applyStyle(this.f22702T, true);
            }
            z9 = true;
        }
        if (i9 == 0) {
            o(context).p();
        } else {
            p072i.r rVar = this.W;
            if (rVar != null) {
                rVar.c();
            }
        }
        if (i9 == 3) {
            if (this.X == null) {
                this.X = new p072i.r(this, context);
            }
            this.X.p();
        } else {
            p072i.r rVar2 = this.X;
            if (rVar2 != null) {
                rVar2.c();
            }
        }
        return z9;
    }

    public final void e(android.view.Window window) {
        android.graphics.drawable.Drawable drawableD;
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f22715m != null) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        android.view.Window.Callback callback = window.getCallback();
        if (callback instanceof p072i.q) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        p072i.q qVar = new p072i.q(this, callback);
        this.f22716n = qVar;
        window.setCallback(qVar);
        int[] iArr = f22682i0;
        android.content.Context context = this.f22714l;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            p103m.r rVarA = p103m.r.a();
            synchronized (rVarA) {
                drawableD = rVarA.f25109a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f22715m = window;
        if (android.os.Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f22711f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f22712g0) != null) {
            p072i.p.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f22712g0 = null;
        }
        this.f22711f0 = null;
        y();
    }

    public final void f(int i3, p072i.u uVar, p095l.l lVar) {
        if (lVar == null) {
            if (uVar == null && i3 >= 0) {
                p072i.u[] uVarArr = this.f22694L;
                if (i3 < uVarArr.length) {
                    uVar = uVarArr[i3];
                }
            }
            if (uVar != null) {
                lVar = uVar.f22673h;
            }
        }
        if ((uVar == null || uVar.f22677m) && !this.f22699Q) {
            p072i.q qVar = this.f22716n;
            android.view.Window.Callback callback = this.f22715m.getCallback();
            qVar.getClass();
            try {
                qVar.f22659k = true;
                callback.onPanelClosed(i3, lVar);
            } finally {
                qVar.f22659k = false;
            }
        }
    }

    public final void g(p095l.l lVar) {
        p103m.C2570j c2570j;
        if (this.f22693K) {
            return;
        }
        this.f22693K = true;
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q;
        actionBarOverlayLayout.k();
        androidx.appcompat.widget.ActionMenuView actionMenuView = ((p103m.Y0) actionBarOverlayLayout.f15702l).f24989a.f15760h;
        if (actionMenuView != null && (c2570j = actionMenuView.f15716A) != null) {
            c2570j.e();
            p103m.C2562f c2562f = c2570j.f25049A;
            if (c2562f != null && c2562f.b()) {
                c2562f.f24705i.dismiss();
            }
        }
        android.view.Window.Callback callback = this.f22715m.getCallback();
        if (callback != null && !this.f22699Q) {
            callback.onPanelClosed(108, lVar);
        }
        this.f22693K = false;
    }

    public final void h(p072i.u uVar, boolean z6) {
        p072i.t tVar;
        p103m.InterfaceC2565g0 interfaceC2565g0;
        p103m.C2570j c2570j;
        if (z6 && uVar.f22667a == 0 && (interfaceC2565g0 = this.f22719q) != null) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g0;
            actionBarOverlayLayout.k();
            androidx.appcompat.widget.ActionMenuView actionMenuView = ((p103m.Y0) actionBarOverlayLayout.f15702l).f24989a.f15760h;
            if (actionMenuView != null && (c2570j = actionMenuView.f15716A) != null && c2570j.h()) {
                g(uVar.f22673h);
                return;
            }
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.f22714l.getSystemService("window");
        if (windowManager != null && uVar.f22677m && (tVar = uVar.f22671e) != null) {
            windowManager.removeView(tVar);
            if (z6) {
                f(uVar.f22667a, uVar, null);
            }
        }
        uVar.f22675k = false;
        uVar.f22676l = false;
        uVar.f22677m = false;
        uVar.f22672f = null;
        uVar.f22678n = true;
        if (this.f22695M == uVar) {
            this.f22695M = null;
        }
        if (uVar.f22667a == 0) {
            y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    public final boolean i(android.view.KeyEvent keyEvent) {
        android.view.View decorView;
        int keyCode;
        p072i.u uVarP;
        p103m.InterfaceC2565g0 interfaceC2565g0;
        android.content.Context context;
        boolean z6;
        boolean z9;
        boolean zW;
        android.media.AudioManager audioManager;
        androidx.appcompat.widget.Toolbar toolbar;
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        p103m.C2570j c2570j;
        p103m.C2570j c2570j2;
        p103m.C2570j c2570j3;
        p072i.u uVarP2;
        android.app.Dialog dialog = this.f22713k;
        if ((!(dialog instanceof D1.InterfaceC0228m) && !(dialog instanceof p072i.h)) || (decorView = this.f22715m.getDecorView()) == null || !E6.G.p(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                p072i.q qVar = this.f22716n;
                android.view.Window.Callback callback = this.f22715m.getCallback();
                qVar.getClass();
                try {
                    qVar.j = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    qVar.j = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f22696N = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    uVarP2 = p(0);
                                    if (!uVarP2.f22677m) {
                                        w(uVarP2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f22722t == null) {
                                    uVarP = p(0);
                                    interfaceC2565g0 = this.f22719q;
                                    context = this.f22714l;
                                    if (interfaceC2565g0 != null) {
                                        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g0;
                                        actionBarOverlayLayout.k();
                                        toolbar = ((p103m.Y0) actionBarOverlayLayout.f15702l).f24989a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f15760h) == null || !actionMenuView.f15725z || android.view.ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z6 = uVarP.f22677m;
                                            if (!z6 || uVarP.f22676l) {
                                                h(uVarP, true);
                                                z9 = z6;
                                            } else {
                                                if (uVarP.f22675k) {
                                                    if (uVarP.f22679o) {
                                                        uVarP.f22675k = false;
                                                        zW = w(uVarP, keyEvent);
                                                    } else {
                                                        zW = true;
                                                    }
                                                    if (zW) {
                                                        t(uVarP, keyEvent);
                                                        z9 = true;
                                                    }
                                                }
                                                z9 = false;
                                            }
                                        } else {
                                            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q;
                                            actionBarOverlayLayout2.k();
                                            androidx.appcompat.widget.ActionMenuView actionMenuView2 = ((p103m.Y0) actionBarOverlayLayout2.f15702l).f24989a.f15760h;
                                            if (actionMenuView2 == null || (c2570j2 = actionMenuView2.f15716A) == null || !c2570j2.h()) {
                                                if (!this.f22699Q && w(uVarP, keyEvent)) {
                                                    androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout3 = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q;
                                                    actionBarOverlayLayout3.k();
                                                    androidx.appcompat.widget.ActionMenuView actionMenuView3 = ((p103m.Y0) actionBarOverlayLayout3.f15702l).f24989a.f15760h;
                                                    if (actionMenuView3 != null && (c2570j = actionMenuView3.f15716A) != null && c2570j.l()) {
                                                        z9 = true;
                                                    }
                                                }
                                                z9 = false;
                                            } else {
                                                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout4 = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q;
                                                actionBarOverlayLayout4.k();
                                                androidx.appcompat.widget.ActionMenuView actionMenuView4 = ((p103m.Y0) actionBarOverlayLayout4.f15702l).f24989a.f15760h;
                                                if (actionMenuView4 == null || (c2570j3 = actionMenuView4.f15716A) == null || !c2570j3.e()) {
                                                    z9 = false;
                                                } else {
                                                    z9 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z6 = uVarP.f22677m;
                                        if (z6) {
                                        }
                                        h(uVarP, true);
                                        z9 = z6;
                                    }
                                    if (z9) {
                                        audioManager = (android.media.AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        android.util.Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (s()) {
                            return false;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    qVar.j = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f22696N = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            uVarP2 = p(0);
                            if (!uVarP2.f22677m) {
                                w(uVarP2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f22722t == null) {
                            uVarP = p(0);
                            interfaceC2565g0 = this.f22719q;
                            context = this.f22714l;
                            if (interfaceC2565g0 != null) {
                                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout5 = (androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g0;
                                actionBarOverlayLayout5.k();
                                toolbar = ((p103m.Y0) actionBarOverlayLayout5.f15702l).f24989a;
                                if (toolbar.getVisibility() == 0) {
                                    z6 = uVarP.f22677m;
                                    if (z6) {
                                    }
                                    h(uVarP, true);
                                    z9 = z6;
                                } else {
                                    z6 = uVarP.f22677m;
                                    if (z6) {
                                    }
                                    h(uVarP, true);
                                    z9 = z6;
                                }
                            } else {
                                z6 = uVarP.f22677m;
                                if (z6) {
                                }
                                h(uVarP, true);
                                z9 = z6;
                            }
                            if (z9) {
                                audioManager = (android.media.AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                android.util.Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (s()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j(int i3) {
        p072i.u uVarP = p(i3);
        if (uVarP.f22673h != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            uVarP.f22673h.t(bundle);
            if (bundle.size() > 0) {
                uVarP.f22680p = bundle;
            }
            uVarP.f22673h.w();
            uVarP.f22673h.clear();
        }
        uVarP.f22679o = true;
        uVarP.f22678n = true;
        if ((i3 == 108 || i3 == 0) && this.f22719q != null) {
            p072i.u uVarP2 = p(0);
            uVarP2.f22675k = false;
            w(uVarP2, null);
        }
    }

    public final void k() {
        android.view.ViewGroup viewGroup;
        if (this.f22727z) {
            return;
        }
        int[] iArr = h.a.j;
        android.content.Context context = this.f22714l;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            c(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            c(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            c(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            c(10);
        }
        this.f22691I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        l();
        this.f22715m.getDecorView();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        if (this.f22692J) {
            viewGroup = this.H ? (android.view.ViewGroup) layoutInflaterFrom.inflate(com.kiptv.tv.R.layout.abc_screen_simple_overlay_action_mode, (android.view.ViewGroup) null) : (android.view.ViewGroup) layoutInflaterFrom.inflate(com.kiptv.tv.R.layout.abc_screen_simple, (android.view.ViewGroup) null);
        } else if (this.f22691I) {
            viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(com.kiptv.tv.R.layout.abc_dialog_title_material, (android.view.ViewGroup) null);
            this.f22690G = false;
            this.f22689F = false;
        } else if (this.f22689F) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(com.kiptv.tv.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(typedValue.resourceId != 0 ? new p088k.b(context, typedValue.resourceId) : context).inflate(com.kiptv.tv.R.layout.abc_screen_toolbar, (android.view.ViewGroup) null);
            p103m.InterfaceC2565g0 interfaceC2565g0 = (p103m.InterfaceC2565g0) viewGroup.findViewById(com.kiptv.tv.R.id.decor_content_parent);
            this.f22719q = interfaceC2565g0;
            interfaceC2565g0.setWindowCallback(this.f22715m.getCallback());
            if (this.f22690G) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q).j(109);
            }
            if (this.f22687D) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q).j(2);
            }
            if (this.f22688E) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f22689F);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f22690G);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f22691I);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.H);
            sb.append(", windowNoTitle: ");
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.o(sb, this.f22692J, " }"));
        }
        p072i.k kVar = new p072i.k(this);
        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
        D1.L.h(viewGroup, kVar);
        if (this.f22719q == null) {
            this.f22685B = (android.widget.TextView) viewGroup.findViewById(com.kiptv.tv.R.id.title);
        }
        boolean z6 = p103m.g1.f25041a;
        try {
            java.lang.reflect.Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (java.lang.IllegalAccessException e6) {
            android.util.Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (java.lang.reflect.InvocationTargetException e9) {
            android.util.Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
        }
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) viewGroup.findViewById(com.kiptv.tv.R.id.action_bar_activity_content);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f22715m.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f22715m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new p072i.l(this));
        this.f22684A = viewGroup;
        java.lang.CharSequence charSequence = this.f22718p;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            p103m.InterfaceC2565g0 interfaceC2565g1 = this.f22719q;
            if (interfaceC2565g1 != null) {
                interfaceC2565g1.setWindowTitle(charSequence);
            } else {
                p072i.B b9 = this.f22717o;
                if (b9 != null) {
                    p103m.Y0 y9 = (p103m.Y0) b9.f22587p;
                    if (!y9.g) {
                        y9.f24995h = charSequence;
                        if ((y9.f24990b & 8) != 0) {
                            androidx.appcompat.widget.Toolbar toolbar = y9.f24989a;
                            toolbar.setTitle(charSequence);
                            if (y9.g) {
                                D1.U.k(toolbar.getRootView(), charSequence);
                            }
                        }
                    }
                } else {
                    android.widget.TextView textView = this.f22685B;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            }
        }
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout2 = (androidx.appcompat.widget.ContentFrameLayout) this.f22684A.findViewById(android.R.id.content);
        android.view.View decorView = this.f22715m.getDecorView();
        contentFrameLayout2.f15734n.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f22727z = true;
        p072i.u uVarP = p(0);
        if (this.f22699Q || uVarP.f22673h != null) {
            return;
        }
        r(108);
    }

    public final void l() {
        android.view.Window window = this.f22715m;
        if (this.f22715m == null) {
            throw new java.lang.IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // p095l.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(p095l.l lVar) {
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        p103m.C2570j c2570j;
        p103m.C2570j c2570j2;
        p103m.C2570j c2570j3;
        p103m.InterfaceC2565g0 interfaceC2565g0 = this.f22719q;
        if (interfaceC2565g0 != null) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g0;
            actionBarOverlayLayout.k();
            androidx.appcompat.widget.Toolbar toolbar = ((p103m.Y0) actionBarOverlayLayout.f15702l).f24989a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f15760h) != null && actionMenuView.f15725z) {
                if (android.view.ViewConfiguration.get(this.f22714l).hasPermanentMenuKey()) {
                    androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q;
                    actionBarOverlayLayout2.k();
                    androidx.appcompat.widget.ActionMenuView actionMenuView2 = ((p103m.Y0) actionBarOverlayLayout2.f15702l).f24989a.f15760h;
                    if (actionMenuView2 != null) {
                        p103m.C2570j c2570j4 = actionMenuView2.f15716A;
                        if (c2570j4 != null) {
                            if (c2570j4.f25050B == null) {
                            }
                        }
                    }
                }
                android.view.Window.Callback callback = this.f22715m.getCallback();
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout3 = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q;
                actionBarOverlayLayout3.k();
                androidx.appcompat.widget.ActionMenuView actionMenuView3 = ((p103m.Y0) actionBarOverlayLayout3.f15702l).f24989a.f15760h;
                if ((actionMenuView3 == null || (c2570j3 = actionMenuView3.f15716A) == null || !c2570j3.h()) ? false : true) {
                    androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout4 = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q;
                    actionBarOverlayLayout4.k();
                    androidx.appcompat.widget.ActionMenuView actionMenuView4 = ((p103m.Y0) actionBarOverlayLayout4.f15702l).f24989a.f15760h;
                    if (actionMenuView4 != null && (c2570j2 = actionMenuView4.f15716A) != null) {
                        c2570j2.e();
                    }
                    if (this.f22699Q) {
                        return;
                    }
                    callback.onPanelClosed(108, p(0).f22673h);
                    return;
                }
                if (callback == null || this.f22699Q) {
                    return;
                }
                if (this.f22704Y && (1 & this.f22705Z) != 0) {
                    android.view.View decorView = this.f22715m.getDecorView();
                    p072i.j jVar = this.f22706a0;
                    decorView.removeCallbacks(jVar);
                    jVar.run();
                }
                p072i.u uVarP = p(0);
                p095l.l lVar2 = uVarP.f22673h;
                if (lVar2 == null || uVarP.f22679o || !callback.onPreparePanel(0, uVarP.g, lVar2)) {
                    return;
                }
                callback.onMenuOpened(108, uVarP.f22673h);
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout5 = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f22719q;
                actionBarOverlayLayout5.k();
                androidx.appcompat.widget.ActionMenuView actionMenuView5 = ((p103m.Y0) actionBarOverlayLayout5.f15702l).f24989a.f15760h;
                if (actionMenuView5 == null || (c2570j = actionMenuView5.f15716A) == null) {
                    return;
                }
                c2570j.l();
                return;
            }
        }
        p072i.u uVarP2 = p(0);
        uVarP2.f22678n = true;
        h(uVarP2, false);
        t(uVarP2, null);
    }

    public final android.content.Context n() {
        android.content.Context context;
        p072i.B bQ = q();
        if (bQ != null) {
            if (bQ.f22584m == null) {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                bQ.f22583l.getTheme().resolveAttribute(com.kiptv.tv.R.attr.actionBarWidgetTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    bQ.f22584m = new android.view.ContextThemeWrapper(bQ.f22583l, i3);
                } else {
                    bQ.f22584m = bQ.f22583l;
                }
            }
            context = bQ.f22584m;
        } else {
            context = null;
        }
        return context == null ? this.f22714l : context;
    }

    public final R0.AbstractC0815c o(android.content.Context context) {
        if (this.W == null) {
            if (android.support.v4.media.session.q.f15615m == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                android.support.v4.media.session.q.f15615m = new android.support.v4.media.session.q(applicationContext, (android.location.LocationManager) applicationContext.getSystemService("location"));
            }
            this.W = new p072i.r(this, android.support.v4.media.session.q.f15615m);
        }
        return this.W;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View b9;
        java.lang.String attributeValue = str;
        byte b10 = 4;
        android.view.View view2 = null;
        if (this.f22710e0 == null) {
            int[] iArr = h.a.j;
            android.content.Context context2 = this.f22714l;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            java.lang.String string = typedArrayObtainStyledAttributes.getString(androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f22710e0 = new p072i.y();
            } else {
                try {
                    this.f22710e0 = (p072i.y) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (java.lang.Throwable th) {
                    android.util.Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f22710e0 = new p072i.y();
                }
            }
        }
        p072i.y yVar = this.f22710e0;
        int i3 = p103m.d1.f25035a;
        yVar.getClass();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f22426x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            android.util.Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        android.content.Context bVar = (resourceId == 0 || ((context instanceof p088k.b) && ((p088k.b) context).f24341a == resourceId)) ? context : new p088k.b(context, resourceId);
        attributeValue.getClass();
        switch (attributeValue.hashCode()) {
            case -1946472170:
                b10 = !attributeValue.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b10 = !attributeValue.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b10 = !attributeValue.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b10 = !attributeValue.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!attributeValue.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                b10 = !attributeValue.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b10 = !attributeValue.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b10 = !attributeValue.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b10 = !attributeValue.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b10 = !attributeValue.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b10 = !attributeValue.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b10 = !attributeValue.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b10 = !attributeValue.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b10 = !attributeValue.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                b9 = new p103m.B(bVar, attributeSet);
                break;
            case 1:
                b9 = new p103m.C2584q(bVar, attributeSet);
                break;
            case 2:
                b9 = new p103m.C2597x(bVar, attributeSet);
                break;
            case 3:
                b9 = new p103m.Y(bVar, attributeSet);
                break;
            case 4:
                b9 = new p103m.C2593v(bVar, attributeSet, com.kiptv.tv.R.attr.imageButtonStyle);
                break;
            case 5:
                b9 = new p103m.D(bVar, attributeSet);
                break;
            case 6:
                b9 = new p103m.O(bVar, attributeSet);
                break;
            case 7:
                b9 = new p103m.A(bVar, attributeSet);
                break;
            case 8:
                b9 = new p103m.C2561e0(bVar, attributeSet);
                break;
            case 9:
                b9 = new p103m.C2595w(bVar, attributeSet, 0);
                break;
            case 10:
                b9 = new p103m.C2578n(bVar, attributeSet);
                break;
            case 11:
                b9 = new p103m.C2582p(bVar, attributeSet);
                break;
            case 12:
                b9 = new p103m.C2589t(bVar, attributeSet);
                break;
            case 13:
                b9 = new p103m.C2580o(bVar, attributeSet);
                break;
            default:
                b9 = null;
                break;
        }
        if (b9 == null && context != bVar) {
            java.lang.Object[] objArr = yVar.f22738a;
            if (attributeValue.equals("view")) {
                attributeValue = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = bVar;
                objArr[1] = attributeSet;
                if (-1 == attributeValue.indexOf(46)) {
                    int i9 = 0;
                    while (true) {
                        java.lang.String[] strArr = p072i.y.g;
                        if (i9 < 3) {
                            android.view.View viewA = yVar.a(bVar, attributeValue, strArr[i9]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i9++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    android.view.View viewA2 = yVar.a(bVar, attributeValue, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (java.lang.Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (java.lang.Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            b9 = view2;
        }
        if (b9 != null) {
            android.content.Context context3 = b9.getContext();
            if ((context3 instanceof android.content.ContextWrapper) && b9.hasOnClickListeners()) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, p072i.y.f22733c);
                java.lang.String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    b9.setOnClickListener(new p072i.x(b9, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes4 = bVar.obtainStyledAttributes(attributeSet, p072i.y.f22734d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z6 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                    new D1.G(com.kiptv.tv.R.id.tag_accessibility_heading, java.lang.Boolean.class, 0, 28, 2).g(b9, java.lang.Boolean.valueOf(z6));
                }
                typedArrayObtainStyledAttributes4.recycle();
                android.content.res.TypedArray typedArrayObtainStyledAttributes5 = bVar.obtainStyledAttributes(attributeSet, p072i.y.f22735e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    D1.U.k(b9, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                android.content.res.TypedArray typedArrayObtainStyledAttributes6 = bVar.obtainStyledAttributes(attributeSet, p072i.y.f22736f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z9 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    java.util.WeakHashMap weakHashMap2 = D1.U.f1980a;
                    new D1.G(com.kiptv.tv.R.id.tag_screen_reader_focusable, java.lang.Boolean.class, 0, 28, 0).g(b9, java.lang.Boolean.valueOf(z9));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return b9;
    }

    public final p072i.u p(int i3) {
        p072i.u[] uVarArr = this.f22694L;
        if (uVarArr == null || uVarArr.length <= i3) {
            p072i.u[] uVarArr2 = new p072i.u[i3 + 1];
            if (uVarArr != null) {
                java.lang.System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f22694L = uVarArr2;
            uVarArr = uVarArr2;
        }
        p072i.u uVar = uVarArr[i3];
        if (uVar != null) {
            return uVar;
        }
        p072i.u uVar2 = new p072i.u();
        uVar2.f22667a = i3;
        uVar2.f22678n = false;
        uVarArr[i3] = uVar2;
        return uVar2;
    }

    public final p072i.B q() {
        k();
        if (this.f22689F && this.f22717o == null) {
            android.app.Dialog dialog = this.f22713k;
            if (dialog != null) {
                this.f22717o = new p072i.B(dialog);
            }
            p072i.B b9 = this.f22717o;
            if (b9 != null) {
                b9.J(this.f22707b0);
            }
        }
        return this.f22717o;
    }

    public final void r(int i3) {
        this.f22705Z = (1 << i3) | this.f22705Z;
        if (this.f22704Y) {
            return;
        }
        android.view.View decorView = this.f22715m.getDecorView();
        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
        decorView.postOnAnimation(this.f22706a0);
        this.f22704Y = true;
    }

    public final boolean s() {
        p103m.InterfaceC2567h0 interfaceC2567h0;
        p103m.T0 t9;
        boolean z6 = this.f22696N;
        this.f22696N = false;
        p072i.u uVarP = p(0);
        if (!uVarP.f22677m) {
            N6.i0 i0Var = this.f22722t;
            if (i0Var != null) {
                i0Var.b();
                return true;
            }
            p072i.B bQ = q();
            if (bQ == null || (interfaceC2567h0 = bQ.f22587p) == null || (t9 = ((p103m.Y0) interfaceC2567h0).f24989a.f15756S) == null || t9.f24965i == null) {
                return false;
            }
            p103m.T0 t10 = ((p103m.Y0) interfaceC2567h0).f24989a.f15756S;
            p095l.n nVar = t10 == null ? null : t10.f24965i;
            if (nVar != null) {
                nVar.collapseActionView();
            }
        } else if (!z6) {
            h(uVarP, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        if (r15.f24629m.getCount() > 0) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(p072i.u uVar, android.view.KeyEvent keyEvent) {
        int i3;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (uVar.f22677m || this.f22699Q) {
            return;
        }
        int i9 = uVar.f22667a;
        android.content.Context context = this.f22714l;
        if (i9 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        android.view.Window.Callback callback = this.f22715m.getCallback();
        if (callback != null && !callback.onMenuOpened(i9, uVar.f22673h)) {
            h(uVar, true);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (windowManager != null && w(uVar, keyEvent)) {
            p072i.t tVar = uVar.f22671e;
            if (tVar != null && !uVar.f22678n) {
                android.view.View view = uVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i3 = -1;
                }
                uVar.f22676l = false;
                android.view.WindowManager.LayoutParams layoutParams2 = new android.view.WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = uVar.f22669c;
                layoutParams2.windowAnimations = uVar.f22670d;
                windowManager.addView(uVar.f22671e, layoutParams2);
                uVar.f22677m = true;
                if (i9 == 0) {
                    y();
                }
            }
            if (tVar == null) {
                android.content.Context contextN = n();
                android.util.TypedValue typedValue = new android.util.TypedValue();
                android.content.res.Resources.Theme themeNewTheme = contextN.getResources().newTheme();
                themeNewTheme.setTo(contextN.getTheme());
                themeNewTheme.resolveAttribute(com.kiptv.tv.R.attr.actionBarPopupTheme, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    themeNewTheme.applyStyle(i10, true);
                }
                themeNewTheme.resolveAttribute(com.kiptv.tv.R.attr.panelMenuListTheme, typedValue, true);
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    themeNewTheme.applyStyle(i11, true);
                } else {
                    themeNewTheme.applyStyle(com.kiptv.tv.R.style.Theme_AppCompat_CompactMenu, true);
                }
                p088k.b bVar = new p088k.b(contextN, 0);
                bVar.getTheme().setTo(themeNewTheme);
                uVar.j = bVar;
                android.content.res.TypedArray typedArrayObtainStyledAttributes = bVar.obtainStyledAttributes(h.a.j);
                uVar.f22668b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                uVar.f22670d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                uVar.f22671e = new p072i.t(this, uVar.j);
                uVar.f22669c = 81;
            } else if (uVar.f22678n && tVar.getChildCount() > 0) {
                uVar.f22671e.removeAllViews();
            }
            android.view.View view2 = uVar.g;
            if (view2 == null) {
                if (uVar.f22673h != null) {
                    if (this.f22721s == null) {
                        this.f22721s = new p072i.l(this);
                    }
                    p072i.l lVar = this.f22721s;
                    if (uVar.f22674i == null) {
                        p095l.h hVar = new p095l.h(uVar.j);
                        uVar.f22674i = hVar;
                        hVar.f24628l = lVar;
                        p095l.l lVar2 = uVar.f22673h;
                        lVar2.b(hVar, lVar2.f24636a);
                    }
                    p095l.h hVar2 = uVar.f22674i;
                    p072i.t tVar2 = uVar.f22671e;
                    if (hVar2.f24627k == null) {
                        hVar2.f24627k = (androidx.appcompat.view.menu.ExpandedMenuView) hVar2.f24626i.inflate(com.kiptv.tv.R.layout.abc_expanded_menu_layout, (android.view.ViewGroup) tVar2, false);
                        if (hVar2.f24629m == null) {
                            hVar2.f24629m = new p095l.g(hVar2);
                        }
                        hVar2.f24627k.setAdapter((android.widget.ListAdapter) hVar2.f24629m);
                        hVar2.f24627k.setOnItemClickListener(hVar2);
                    }
                    androidx.appcompat.view.menu.ExpandedMenuView expandedMenuView = hVar2.f24627k;
                    uVar.f22672f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                }
                uVar.f22678n = true;
                return;
            }
            uVar.f22672f = view2;
            if (uVar.f22672f != null) {
                if (uVar.g == null) {
                    p095l.h hVar3 = uVar.f22674i;
                    if (hVar3.f24629m == null) {
                        hVar3.f24629m = new p095l.g(hVar3);
                    }
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = uVar.f22672f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new android.view.ViewGroup.LayoutParams(-2, -2);
                }
                uVar.f22671e.setBackgroundResource(uVar.f22668b);
                android.view.ViewParent parent = uVar.f22672f.getParent();
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(uVar.f22672f);
                }
                uVar.f22671e.addView(uVar.f22672f, layoutParams3);
                if (!uVar.f22672f.hasFocus()) {
                    uVar.f22672f.requestFocus();
                }
            }
            uVar.f22678n = true;
            return;
            i3 = -2;
            uVar.f22676l = false;
            android.view.WindowManager.LayoutParams layoutParams4 = new android.view.WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = uVar.f22669c;
            layoutParams4.windowAnimations = uVar.f22670d;
            windowManager.addView(uVar.f22671e, layoutParams4);
            uVar.f22677m = true;
            if (i9 == 0) {
                y();
            }
        }
    }

    public final boolean u(p072i.u uVar, int i3, android.view.KeyEvent keyEvent) {
        p095l.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f22675k || w(uVar, keyEvent)) && (lVar = uVar.f22673h) != null) {
            return lVar.performShortcut(i3, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p095l.j
    public final boolean v(p095l.l lVar, android.view.MenuItem menuItem) {
        p072i.u uVar;
        android.view.Window.Callback callback = this.f22715m.getCallback();
        if (callback != null && !this.f22699Q) {
            p095l.l lVarK = lVar.k();
            p072i.u[] uVarArr = this.f22694L;
            int length = uVarArr != null ? uVarArr.length : 0;
            for (int i3 = 0; i3 < length; i3++) {
                uVar = uVarArr[i3];
                if (uVar != null && uVar.f22673h == lVarK) {
                    if (uVar != null) {
                        return callback.onMenuItemSelected(uVar.f22667a, menuItem);
                    }
                }
            }
            uVar = null;
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f22667a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0113  */
    public final boolean w(p072i.u uVar, android.view.KeyEvent keyEvent) {
        p095l.l lVar;
        p103m.InterfaceC2565g0 interfaceC2565g0;
        p103m.InterfaceC2565g0 interfaceC2565g1;
        android.content.res.Resources.Theme themeNewTheme;
        p103m.InterfaceC2565g0 interfaceC2565g2;
        p103m.InterfaceC2565g0 interfaceC2565g3;
        if (!this.f22699Q) {
            if (uVar.f22675k) {
                return true;
            }
            p072i.u uVar2 = this.f22695M;
            if (uVar2 != null && uVar2 != uVar) {
                h(uVar2, false);
            }
            android.view.Window.Callback callback = this.f22715m.getCallback();
            int i3 = uVar.f22667a;
            if (callback != null) {
                uVar.g = callback.onCreatePanelView(i3);
            }
            boolean z6 = i3 == 0 || i3 == 108;
            if (z6 && (interfaceC2565g3 = this.f22719q) != null) {
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g3;
                actionBarOverlayLayout.k();
                ((p103m.Y0) actionBarOverlayLayout.f15702l).f24998l = true;
            }
            if (uVar.g == null) {
                p095l.l lVar2 = uVar.f22673h;
                if (lVar2 == null || uVar.f22679o) {
                    if (lVar2 == null) {
                        android.content.Context context = this.f22714l;
                        if ((i3 == 0 || i3 == 108) && this.f22719q != null) {
                            android.util.TypedValue typedValue = new android.util.TypedValue();
                            android.content.res.Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.kiptv.tv.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.kiptv.tv.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.kiptv.tv.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                p088k.b bVar = new p088k.b(context, 0);
                                bVar.getTheme().setTo(themeNewTheme);
                                context = bVar;
                            }
                        }
                        p095l.l lVar3 = new p095l.l(context);
                        lVar3.f24640e = this;
                        p095l.l lVar4 = uVar.f22673h;
                        if (lVar3 != lVar4) {
                            if (lVar4 != null) {
                                lVar4.r(uVar.f22674i);
                            }
                            uVar.f22673h = lVar3;
                            p095l.h hVar = uVar.f22674i;
                            if (hVar != null) {
                                lVar3.b(hVar, lVar3.f24636a);
                            }
                        }
                        if (uVar.f22673h != null) {
                            if (z6 && (interfaceC2565g1 = this.f22719q) != null) {
                                if (this.f22720r == null) {
                                    this.f22720r = new p072i.k(this);
                                }
                                ((androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g1).l(uVar.f22673h, this.f22720r);
                            }
                            uVar.f22673h.w();
                            if (callback.onCreatePanelMenu(i3, uVar.f22673h)) {
                                uVar.f22679o = false;
                            } else {
                                lVar = uVar.f22673h;
                                if (lVar != null) {
                                    if (lVar != null) {
                                        lVar.r(uVar.f22674i);
                                    }
                                    uVar.f22673h = null;
                                }
                                if (z6 && (interfaceC2565g0 = this.f22719q) != null) {
                                    ((androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g0).l(null, this.f22720r);
                                }
                            }
                        }
                    } else {
                        if (z6) {
                            if (this.f22720r == null) {
                                this.f22720r = new p072i.k(this);
                            }
                            ((androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g1).l(uVar.f22673h, this.f22720r);
                        }
                        uVar.f22673h.w();
                        if (callback.onCreatePanelMenu(i3, uVar.f22673h)) {
                            lVar = uVar.f22673h;
                            if (lVar != null) {
                                if (lVar != null) {
                                    lVar.r(uVar.f22674i);
                                }
                                uVar.f22673h = null;
                            }
                            if (z6) {
                                ((androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g0).l(null, this.f22720r);
                            }
                        } else {
                            uVar.f22679o = false;
                        }
                    }
                }
                uVar.f22673h.w();
                android.os.Bundle bundle = uVar.f22680p;
                if (bundle != null) {
                    uVar.f22673h.s(bundle);
                    uVar.f22680p = null;
                }
                if (!callback.onPreparePanel(0, uVar.g, uVar.f22673h)) {
                    if (z6 && (interfaceC2565g2 = this.f22719q) != null) {
                        ((androidx.appcompat.widget.ActionBarOverlayLayout) interfaceC2565g2).l(null, this.f22720r);
                    }
                    uVar.f22673h.v();
                    return false;
                }
                uVar.f22673h.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                uVar.f22673h.v();
            }
            uVar.f22675k = true;
            uVar.f22676l = false;
            this.f22695M = uVar;
            return true;
        }
        return false;
    }

    public final void x() {
        if (this.f22727z) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void y() {
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f22711f0 != null && (p(0).f22677m || this.f22722t != null)) {
                z6 = true;
            }
            if (z6 && this.f22712g0 == null) {
                this.f22712g0 = p072i.p.b(this.f22711f0, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f22712g0) == null) {
                    return;
                }
                p072i.p.c(this.f22711f0, onBackInvokedCallback);
                this.f22712g0 = null;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
