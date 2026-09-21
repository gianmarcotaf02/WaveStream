package D1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.kiptv.tv.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p103m.C2589t;

public abstract class U {

    public static WeakHashMap f1980a = null;

    public static Field f1981b = null;

    public static boolean f1982c = false;

    public static final F f1983d = new F();

    public static final H f1984e = new H();

    public static C0216c0 a(View view) {
        if (f1980a == null) {
            f1980a = new WeakHashMap();
        }
        C0216c0 c0216c0 = (C0216c0) f1980a.get(view);
        if (c0216c0 != null) {
            return c0216c0;
        }
        C0216c0 c0216c1 = new C0216c0(view);
        f1980a.put(view, c0216c1);
        return c0216c1;
    }

    public static void b(View view, E0 e6) {
        int i3 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsB = e6.b();
        if (windowInsetsB != null) {
            WindowInsets windowInsetsA = i3 >= 30 ? Q.a(view, windowInsetsB) : J.a(view, windowInsetsB);
            if (windowInsetsA.equals(windowInsetsB)) {
                return;
            }
            E0.c(view, windowInsetsA);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = T.f1976d;
        T t9 = (T) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (t9 == null) {
            t9 = new T();
            t9.f1977a = null;
            t9.f1978b = null;
            t9.f1979c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, t9);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = t9.f1977a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = T.f1976d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (t9.f1977a == null) {
                            t9.f1977a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = T.f1976d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                t9.f1977a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    t9.f1977a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = t9.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (t9.f1978b == null) {
                    t9.f1978b = new SparseArray();
                }
                t9.f1978b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return P.a(view);
        }
        if (f1982c) {
            return null;
        }
        if (f1981b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1981b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1982c = true;
                return null;
            }
        }
        try {
            Object obj = f1981b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1982c = true;
            return null;
        }
    }

    public static String[] e(C2589t c2589t) {
        return Build.VERSION.SDK_INT >= 31 ? S.a(c2589t) : (String[]) c2589t.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(int i3, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i9 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i9 >= 28) {
                tag = O.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z6 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i3);
                if (z6) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i9 >= 28) {
                        objA = O.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
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
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i3);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i9 >= 28) {
                objA = O.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void g(int i3, View view) {
        int i9;
        if (i3 == -1) {
            i9 = -1;
        } else {
            int i10 = Build.VERSION.SDK_INT;
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

    public static C0222g h(View view, C0222g c0222g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0222g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return S.b(view, c0222g);
        }
        H1.j jVar = (H1.j) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0234t interfaceC0234t = f1983d;
        if (jVar == null) {
            if (view instanceof InterfaceC0234t) {
                interfaceC0234t = (InterfaceC0234t) view;
            }
            return interfaceC0234t.a(c0222g);
        }
        C0222g c0222gA = H1.j.a(view, c0222g);
        if (c0222gA == null) {
            return null;
        }
        if (view instanceof InterfaceC0234t) {
            interfaceC0234t = (InterfaceC0234t) view;
        }
        return interfaceC0234t.a(c0222gA);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            P.b(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    public static void j(View view, C0213b c0213b) {
        if (c0213b == null && (d(view) instanceof C0211a)) {
            c0213b = new C0213b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0213b == null ? null : c0213b.f1996i);
    }

    public static void k(View view, CharSequence charSequence) {
        new G(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        H h9 = f1984e;
        if (charSequence == null) {
            h9.f1969h.remove(view);
            view.removeOnAttachStateChangeListener(h9);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h9);
        } else {
            h9.f1969h.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h9);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h9);
            }
        }
    }

    public static void l(View view, AbstractC0220e0 abstractC0220e0) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC0220e0 != null ? new j0(abstractC0220e0) : null);
            return;
        }
        PathInterpolator pathInterpolator = i0.f2028e;
        View.OnApplyWindowInsetsListener h0Var = abstractC0220e0 != null ? new h0(view, abstractC0220e0) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, h0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(h0Var);
        }
    }
}
