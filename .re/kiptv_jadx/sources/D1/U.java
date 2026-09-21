package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.util.WeakHashMap f1980a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f1981b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1982c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D1.F f1983d = new D1.F();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D1.H f1984e = new D1.H();

    public static D1.C0216c0 a(android.view.View view) {
        if (f1980a == null) {
            f1980a = new java.util.WeakHashMap();
        }
        D1.C0216c0 c0216c0 = (D1.C0216c0) f1980a.get(view);
        if (c0216c0 != null) {
            return c0216c0;
        }
        D1.C0216c0 c0216c1 = new D1.C0216c0(view);
        f1980a.put(view, c0216c1);
        return c0216c1;
    }

    public static void b(android.view.View view, D1.E0 e6) {
        int i3 = android.os.Build.VERSION.SDK_INT;
        android.view.WindowInsets windowInsetsB = e6.b();
        if (windowInsetsB != null) {
            android.view.WindowInsets windowInsetsA = i3 >= 30 ? D1.Q.a(view, windowInsetsB) : D1.J.a(view, windowInsetsB);
            if (windowInsetsA.equals(windowInsetsB)) {
                return;
            }
            D1.E0.c(view, windowInsetsA);
        }
    }

    public static boolean c(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        java.util.ArrayList arrayList = D1.T.f1976d;
        D1.T t9 = (D1.T) view.getTag(com.kiptv.tv.R.id.tag_unhandled_key_event_manager);
        if (t9 == null) {
            t9 = new D1.T();
            t9.f1977a = null;
            t9.f1978b = null;
            t9.f1979c = null;
            view.setTag(com.kiptv.tv.R.id.tag_unhandled_key_event_manager, t9);
        }
        if (keyEvent.getAction() == 0) {
            java.util.WeakHashMap weakHashMap = t9.f1977a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            java.util.ArrayList arrayList2 = D1.T.f1976d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (t9.f1977a == null) {
                            t9.f1977a = new java.util.WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            java.util.ArrayList arrayList3 = D1.T.f1976d;
                            android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                t9.f1977a.put(view2, java.lang.Boolean.TRUE);
                                for (android.view.ViewParent parent = view2.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                    t9.f1977a.put((android.view.View) parent, java.lang.Boolean.TRUE);
                                }
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }
        android.view.View viewA = t9.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                if (t9.f1978b == null) {
                    t9.f1978b = new android.util.SparseArray();
                }
                t9.f1978b.put(keyCode, new java.lang.ref.WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static android.view.View.AccessibilityDelegate d(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return D1.P.a(view);
        }
        if (f1982c) {
            return null;
        }
        if (f1981b == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                f1981b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                f1982c = true;
                return null;
            }
        }
        try {
            java.lang.Object obj = f1981b.get(view);
            if (obj instanceof android.view.View.AccessibilityDelegate) {
                return (android.view.View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (java.lang.Throwable unused2) {
            f1982c = true;
            return null;
        }
    }

    public static java.lang.String[] e(p103m.C2589t c2589t) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? D1.S.a(c2589t) : (java.lang.String[]) c2589t.getTag(com.kiptv.tv.R.id.tag_on_receive_content_mime_types);
    }

    public static void f(int i3, android.view.View view) {
        java.lang.Object tag;
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i9 = android.os.Build.VERSION.SDK_INT;
            java.lang.Object objA = null;
            if (i9 >= 28) {
                tag = D1.O.a(view);
            } else {
                tag = view.getTag(com.kiptv.tv.R.id.tag_accessibility_pane_title);
                if (!java.lang.CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z6 = ((java.lang.CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i3);
                if (z6) {
                    java.util.List<java.lang.CharSequence> text = accessibilityEventObtain.getText();
                    if (i9 >= 28) {
                        objA = D1.O.a(view);
                    } else {
                        java.lang.Object tag2 = view.getTag(com.kiptv.tv.R.id.tag_accessibility_pane_title);
                        if (java.lang.CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((java.lang.CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i3 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                        return;
                    } catch (java.lang.AbstractMethodError e6) {
                        android.util.Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                        return;
                    }
                }
                return;
            }
            android.view.accessibility.AccessibilityEvent accessibilityEventObtain2 = android.view.accessibility.AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i3);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            java.util.List<java.lang.CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i9 >= 28) {
                objA = D1.O.a(view);
            } else {
                java.lang.Object tag3 = view.getTag(com.kiptv.tv.R.id.tag_accessibility_pane_title);
                if (java.lang.CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((java.lang.CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002d  */
    /* JADX WARN: Code duplicated, block: B:25:0x002f  */
    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public static void g(int i3, android.view.View view) {
        int i9;
        if (i3 == -1) {
            i9 = -1;
        } else {
            int i10 = android.os.Build.VERSION.SDK_INT;
            i9 = 0;
            if (i10 < 34) {
                switch (i3) {
                    case 21:
                    case 23:
                    case 26:
                        i3 = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i3 = 4;
                        break;
                    case 25:
                        i3 = 0;
                        break;
                }
            }
            if (i10 >= 30) {
                i9 = i3;
            } else if (i3 == 12) {
                i9 = 1;
            } else if (i3 == 13) {
                i9 = 6;
            } else if (i3 == 16) {
                i9 = 1;
            } else if (i3 != 17) {
                i9 = i3;
            }
            if (i10 < 27 && (i9 == 7 || i9 == 8 || i9 == 9)) {
                i9 = -1;
            }
        }
        if (i9 == -1) {
            return;
        }
        view.performHapticFeedback(i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static D1.C0222g h(android.view.View view, D1.C0222g c0222g) {
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            android.util.Log.d("ViewCompat", "performReceiveContent: " + c0222g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return D1.S.b(view, c0222g);
        }
        H1.j jVar = (H1.j) view.getTag(com.kiptv.tv.R.id.tag_on_receive_content_listener);
        D1.InterfaceC0234t interfaceC0234t = f1983d;
        if (jVar == null) {
            if (view instanceof D1.InterfaceC0234t) {
                interfaceC0234t = (D1.InterfaceC0234t) view;
            }
            return interfaceC0234t.a(c0222g);
        }
        D1.C0222g c0222gA = H1.j.a(view, c0222g);
        if (c0222gA == null) {
            return null;
        }
        if (view instanceof D1.InterfaceC0234t) {
            interfaceC0234t = (D1.InterfaceC0234t) view;
        }
        return interfaceC0234t.a(c0222gA);
    }

    public static void i(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i3) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            D1.P.b(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    public static void j(android.view.View view, D1.C0213b c0213b) {
        if (c0213b == null && (d(view) instanceof D1.C0211a)) {
            c0213b = new D1.C0213b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0213b == null ? null : c0213b.f1996i);
    }

    public static void k(android.view.View view, java.lang.CharSequence charSequence) {
        new D1.G(com.kiptv.tv.R.id.tag_accessibility_pane_title, java.lang.CharSequence.class, 8, 28, 1).g(view, charSequence);
        D1.H h9 = f1984e;
        if (charSequence == null) {
            h9.f1969h.remove(view);
            view.removeOnAttachStateChangeListener(h9);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h9);
        } else {
            h9.f1969h.put(view, java.lang.Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h9);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h9);
            }
        }
    }

    public static void l(android.view.View view, D1.AbstractC0220e0 abstractC0220e0) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC0220e0 != null ? new D1.j0(abstractC0220e0) : null);
            return;
        }
        android.view.animation.PathInterpolator pathInterpolator = D1.i0.f2028e;
        android.view.View.OnApplyWindowInsetsListener h0Var = abstractC0220e0 != null ? new D1.h0(view, abstractC0220e0) : null;
        view.setTag(com.kiptv.tv.R.id.tag_window_insets_animation_callback, h0Var);
        if (view.getTag(com.kiptv.tv.R.id.tag_compat_insets_dispatch) == null && view.getTag(com.kiptv.tv.R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(h0Var);
        }
    }
}
