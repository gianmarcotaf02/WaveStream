package p072i;

import D1.C0216c0;
import D1.InterfaceC0228m;
import D1.L;
import D1.U;
import E6.G;
import N6.i0;
import R0.AbstractC0815c;
import android.R;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.q;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.q0;
import h.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p088k.b;
import p095l.g;
import p095l.h;
import p095l.j;
import p095l.l;
import p095l.n;
import p103m.A;
import p103m.B;
import p103m.C2561e0;
import p103m.C2562f;
import p103m.C2570j;
import p103m.C2578n;
import p103m.C2580o;
import p103m.C2582p;
import p103m.C2584q;
import p103m.C2589t;
import p103m.C2593v;
import p103m.C2595w;
import p103m.C2597x;
import p103m.D;
import p103m.InterfaceC2565g0;
import p103m.InterfaceC2567h0;
import p103m.O;
import p103m.T0;
import p103m.Y;
import p103m.Y0;
import p103m.d1;
import p103m.g1;
import p103m.r;
import p136q.S;

public final class v extends i implements j, LayoutInflater.Factory2 {

    public static final S f22681h0 = new S(0);

    public static final int[] f22682i0 = {R.attr.windowBackground};

    public static final boolean f22683j0 = !"robolectric".equals(Build.FINGERPRINT);

    public ViewGroup f22684A;

    public TextView f22685B;

    public View f22686C;

    public boolean f22687D;

    public boolean f22688E;

    public boolean f22689F;

    public boolean f22690G;
    public boolean H;

    public boolean f22691I;

    public boolean f22692J;

    public boolean f22693K;

    public u[] f22694L;

    public u f22695M;

    public boolean f22696N;

    public boolean f22697O;

    public boolean f22698P;

    public boolean f22699Q;

    public Configuration f22700R;

    public final int f22701S;

    public int f22702T;

    public int f22703U;
    public boolean V;
    public r W;
    public r X;

    public boolean f22704Y;

    public int f22705Z;

    public final j f22706a0;

    public boolean f22707b0;

    public Rect f22708c0;

    public Rect f22709d0;

    public y f22710e0;

    public OnBackInvokedDispatcher f22711f0;

    public OnBackInvokedCallback f22712g0;

    public final Dialog f22713k;

    public final Context f22714l;

    public Window f22715m;

    public q f22716n;

    public B f22717o;

    public CharSequence f22718p;

    public InterfaceC2565g0 f22719q;

    public k f22720r;

    public l f22721s;

    public i0 f22722t;

    public ActionBarContextView f22723u;

    public PopupWindow f22724v;

    public j f22725w;

    public C0216c0 f22726x;
    public final boolean y;

    public boolean f22727z;

    public v(h hVar, h hVar2) {
        Context context = hVar.getContext();
        Window window = hVar.getWindow();
        this.f22726x = null;
        this.y = true;
        this.f22701S = -100;
        this.f22706a0 = new j(this, 0);
        this.f22714l = context;
        this.f22713k = hVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f22701S == -100) {
            S s9 = f22681h0;
            Integer num = (Integer) s9.get(this.f22713k.getClass().getName());
            if (num != null) {
                this.f22701S = num.intValue();
                s9.remove(this.f22713k.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        r.c();
    }

    @Override
    public final void a() {
        this.f22697O = true;
        d(false);
        l();
        this.f22700R = new Configuration(this.f22714l.getResources().getConfiguration());
        this.f22698P = true;
    }

    @Override
    public final boolean c(int i3) {
        if (i3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i3 = 108;
        } else if (i3 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
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

    public final boolean d(boolean z6) {
        int i3;
        Object obj;
        Object obj2;
        boolean z9 = false;
        if (this.f22699Q) {
            return false;
        }
        int i9 = this.f22701S;
        if (i9 == -100) {
            i9 = i.f22649h;
        }
        Context context = this.f22714l;
        int iH = -1;
        if (i9 != -100) {
            if (i9 == -1) {
                iH = i9;
            } else if (i9 != 0) {
                if (i9 == 1 || i9 == 2) {
                    iH = i9;
                } else {
                    if (i9 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.X == null) {
                        this.X = new r(this, context);
                    }
                    iH = this.X.h();
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                iH = o(context).h();
            }
        }
        if (iH != 1) {
            i3 = iH != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i3 | (configuration.uiMode & (-49));
        this.V = true;
        int i10 = this.f22703U;
        Configuration configuration2 = this.f22700R;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i11 = configuration2.uiMode & 48;
        int i12 = configuration.uiMode & 48;
        o.b(configuration2);
        int i13 = i11 != i12 ? 512 : 0;
        if (((~i10) & i13) != 0 && z6 && this.f22697O && !f22683j0) {
            boolean z10 = this.f22698P;
        }
        if (i13 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = (resources.getConfiguration().uiMode & (-49)) | i12;
            LongSparseArray longSparseArray = null;
            resources.updateConfiguration(configuration3, null);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 < 26 && i14 < 28) {
                if (!q0.f19579i) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        q0.f19578h = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e6) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e6);
                    }
                    q0.f19579i = true;
                }
                Field field = q0.f19578h;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e9) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!q0.f19574c) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                q0.f19573b = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e10) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                            }
                            q0.f19574c = true;
                        }
                        Field field2 = q0.f19573b;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e11) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!q0.f19576e) {
                                try {
                                    q0.f19575d = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e12) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e12);
                                }
                                q0.f19576e = true;
                            }
                            Class cls = q0.f19575d;
                            if (cls != null) {
                                if (!q0.g) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        q0.f19577f = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e13) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e13);
                                    }
                                    q0.g = true;
                                }
                                Field field3 = q0.f19577f;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e14) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e14);
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
            r rVar = this.W;
            if (rVar != null) {
                rVar.c();
            }
        }
        if (i9 == 3) {
            if (this.X == null) {
                this.X = new r(this, context);
            }
            this.X.p();
        } else {
            r rVar2 = this.X;
            if (rVar2 != null) {
                rVar2.c();
            }
        }
        return z9;
    }

    public final void e(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f22715m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof q) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        q qVar = new q(this, callback);
        this.f22716n = qVar;
        window.setCallback(qVar);
        int[] iArr = f22682i0;
        Context context = this.f22714l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            r rVarA = r.a();
            synchronized (rVarA) {
                drawableD = rVarA.f25109a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f22715m = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f22711f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f22712g0) != null) {
            p.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f22712g0 = null;
        }
        this.f22711f0 = null;
        y();
    }

    public final void f(int i3, u uVar, l lVar) {
        if (lVar == null) {
            if (uVar == null && i3 >= 0) {
                u[] uVarArr = this.f22694L;
                if (i3 < uVarArr.length) {
                    uVar = uVarArr[i3];
                }
            }
            if (uVar != null) {
                lVar = uVar.f22673h;
            }
        }
        if ((uVar == null || uVar.f22677m) && !this.f22699Q) {
            q qVar = this.f22716n;
            Window.Callback callback = this.f22715m.getCallback();
            qVar.getClass();
            try {
                qVar.f22659k = true;
                callback.onPanelClosed(i3, lVar);
            } finally {
                qVar.f22659k = false;
            }
        }
    }

    public final void g(l lVar) {
        C2570j c2570j;
        if (this.f22693K) {
            return;
        }
        this.f22693K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f22719q;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f15702l).f24989a.f15760h;
        if (actionMenuView != null && (c2570j = actionMenuView.f15716A) != null) {
            c2570j.e();
            C2562f c2562f = c2570j.f25049A;
            if (c2562f != null && c2562f.b()) {
                c2562f.f24705i.dismiss();
            }
        }
        Window.Callback callback = this.f22715m.getCallback();
        if (callback != null && !this.f22699Q) {
            callback.onPanelClosed(108, lVar);
        }
        this.f22693K = false;
    }

    public final void h(u uVar, boolean z6) {
        t tVar;
        InterfaceC2565g0 interfaceC2565g0;
        C2570j c2570j;
        if (z6 && uVar.f22667a == 0 && (interfaceC2565g0 = this.f22719q) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2565g0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f15702l).f24989a.f15760h;
            if (actionMenuView != null && (c2570j = actionMenuView.f15716A) != null && c2570j.h()) {
                g(uVar.f22673h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f22714l.getSystemService("window");
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

    public final boolean i(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        u uVarP;
        InterfaceC2565g0 interfaceC2565g0;
        Context context;
        boolean z6;
        boolean z9;
        boolean zW;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        C2570j c2570j;
        C2570j c2570j2;
        C2570j c2570j3;
        u uVarP2;
        Dialog dialog = this.f22713k;
        if ((!(dialog instanceof InterfaceC0228m) && !(dialog instanceof h)) || (decorView = this.f22715m.getDecorView()) == null || !G.p(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                q qVar = this.f22716n;
                Window.Callback callback = this.f22715m.getCallback();
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
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2565g0;
                                        actionBarOverlayLayout.k();
                                        toolbar = ((Y0) actionBarOverlayLayout.f15702l).f24989a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f15760h) == null || !actionMenuView.f15725z || ViewConfiguration.get(context).hasPermanentMenuKey()) {
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
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f22719q;
                                            actionBarOverlayLayout2.k();
                                            ActionMenuView actionMenuView2 = ((Y0) actionBarOverlayLayout2.f15702l).f24989a.f15760h;
                                            if (actionMenuView2 == null || (c2570j2 = actionMenuView2.f15716A) == null || !c2570j2.h()) {
                                                if (!this.f22699Q && w(uVarP, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f22719q;
                                                    actionBarOverlayLayout3.k();
                                                    ActionMenuView actionMenuView3 = ((Y0) actionBarOverlayLayout3.f15702l).f24989a.f15760h;
                                                    if (actionMenuView3 != null && (c2570j = actionMenuView3.f15716A) != null && c2570j.l()) {
                                                        z9 = true;
                                                    }
                                                }
                                                z9 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f22719q;
                                                actionBarOverlayLayout4.k();
                                                ActionMenuView actionMenuView4 = ((Y0) actionBarOverlayLayout4.f15702l).f24989a.f15760h;
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
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
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
                } catch (Throwable th) {
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
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) interfaceC2565g0;
                                actionBarOverlayLayout5.k();
                                toolbar = ((Y0) actionBarOverlayLayout5.f15702l).f24989a;
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
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
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
        u uVarP = p(i3);
        if (uVarP.f22673h != null) {
            Bundle bundle = new Bundle();
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
            u uVarP2 = p(0);
            uVarP2.f22675k = false;
            w(uVarP2, null);
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        if (this.f22727z) {
            return;
        }
        int[] iArr = a.j;
        Context context = this.f22714l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
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
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f22692J) {
            viewGroup = this.H ? (ViewGroup) layoutInflaterFrom.inflate(com.kiptv.tv.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.kiptv.tv.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f22691I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.kiptv.tv.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f22690G = false;
            this.f22689F = false;
        } else if (this.f22689F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.kiptv.tv.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new b(context, typedValue.resourceId) : context).inflate(com.kiptv.tv.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC2565g0 interfaceC2565g0 = (InterfaceC2565g0) viewGroup.findViewById(com.kiptv.tv.R.id.decor_content_parent);
            this.f22719q = interfaceC2565g0;
            interfaceC2565g0.setWindowCallback(this.f22715m.getCallback());
            if (this.f22690G) {
                ((ActionBarOverlayLayout) this.f22719q).j(109);
            }
            if (this.f22687D) {
                ((ActionBarOverlayLayout) this.f22719q).j(2);
            }
            if (this.f22688E) {
                ((ActionBarOverlayLayout) this.f22719q).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f22689F);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f22690G);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f22691I);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.H);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(M0.o(sb, this.f22692J, " }"));
        }
        k kVar = new k(this);
        WeakHashMap weakHashMap = U.f1980a;
        L.h(viewGroup, kVar);
        if (this.f22719q == null) {
            this.f22685B = (TextView) viewGroup.findViewById(com.kiptv.tv.R.id.title);
        }
        boolean z6 = g1.f25041a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e9) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.kiptv.tv.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f22715m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f22715m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new l(this));
        this.f22684A = viewGroup;
        CharSequence charSequence = this.f22718p;
        if (!TextUtils.isEmpty(charSequence)) {
            InterfaceC2565g0 interfaceC2565g1 = this.f22719q;
            if (interfaceC2565g1 != null) {
                interfaceC2565g1.setWindowTitle(charSequence);
            } else {
                B b9 = this.f22717o;
                if (b9 != null) {
                    Y0 y9 = (Y0) b9.f22587p;
                    if (!y9.g) {
                        y9.f24995h = charSequence;
                        if ((y9.f24990b & 8) != 0) {
                            Toolbar toolbar = y9.f24989a;
                            toolbar.setTitle(charSequence);
                            if (y9.g) {
                                U.k(toolbar.getRootView(), charSequence);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f22685B;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f22684A.findViewById(R.id.content);
        View decorView = this.f22715m.getDecorView();
        contentFrameLayout2.f15734n.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
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
        u uVarP = p(0);
        if (this.f22699Q || uVarP.f22673h != null) {
            return;
        }
        r(108);
    }

    public final void l() {
        Window window = this.f22715m;
        if (this.f22715m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(l lVar) {
        ActionMenuView actionMenuView;
        C2570j c2570j;
        C2570j c2570j2;
        C2570j c2570j3;
        InterfaceC2565g0 interfaceC2565g0 = this.f22719q;
        if (interfaceC2565g0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2565g0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((Y0) actionBarOverlayLayout.f15702l).f24989a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f15760h) != null && actionMenuView.f15725z) {
                if (ViewConfiguration.get(this.f22714l).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f22719q;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((Y0) actionBarOverlayLayout2.f15702l).f24989a.f15760h;
                    if (actionMenuView2 != null) {
                        C2570j c2570j4 = actionMenuView2.f15716A;
                        if (c2570j4 != null) {
                            if (c2570j4.f25050B == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f22715m.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f22719q;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((Y0) actionBarOverlayLayout3.f15702l).f24989a.f15760h;
                if ((actionMenuView3 == null || (c2570j3 = actionMenuView3.f15716A) == null || !c2570j3.h()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f22719q;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((Y0) actionBarOverlayLayout4.f15702l).f24989a.f15760h;
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
                    View decorView = this.f22715m.getDecorView();
                    j jVar = this.f22706a0;
                    decorView.removeCallbacks(jVar);
                    jVar.run();
                }
                u uVarP = p(0);
                l lVar2 = uVarP.f22673h;
                if (lVar2 == null || uVarP.f22679o || !callback.onPreparePanel(0, uVarP.g, lVar2)) {
                    return;
                }
                callback.onMenuOpened(108, uVarP.f22673h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f22719q;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((Y0) actionBarOverlayLayout5.f15702l).f24989a.f15760h;
                if (actionMenuView5 == null || (c2570j = actionMenuView5.f15716A) == null) {
                    return;
                }
                c2570j.l();
                return;
            }
        }
        u uVarP2 = p(0);
        uVarP2.f22678n = true;
        h(uVarP2, false);
        t(uVarP2, null);
    }

    public final Context n() {
        Context context;
        B bQ = q();
        if (bQ != null) {
            if (bQ.f22584m == null) {
                TypedValue typedValue = new TypedValue();
                bQ.f22583l.getTheme().resolveAttribute(com.kiptv.tv.R.attr.actionBarWidgetTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    bQ.f22584m = new ContextThemeWrapper(bQ.f22583l, i3);
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

    public final AbstractC0815c o(Context context) {
        if (this.W == null) {
            if (q.f15615m == null) {
                Context applicationContext = context.getApplicationContext();
                q.f15615m = new q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.W = new r(this, q.f15615m);
        }
        return this.W;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View b9;
        String attributeValue = str;
        byte b10 = 4;
        View view2 = null;
        if (this.f22710e0 == null) {
            int[] iArr = a.j;
            Context context2 = this.f22714l;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f22710e0 = new y();
            } else {
                try {
                    this.f22710e0 = (y) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f22710e0 = new y();
                }
            }
        }
        y yVar = this.f22710e0;
        int i3 = d1.f25035a;
        yVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f22426x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context bVar = (resourceId == 0 || ((context instanceof b) && ((b) context).f24341a == resourceId)) ? context : new b(context, resourceId);
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
                b9 = new B(bVar, attributeSet);
                break;
            case 1:
                b9 = new C2584q(bVar, attributeSet);
                break;
            case 2:
                b9 = new C2597x(bVar, attributeSet);
                break;
            case 3:
                b9 = new Y(bVar, attributeSet);
                break;
            case 4:
                b9 = new C2593v(bVar, attributeSet, com.kiptv.tv.R.attr.imageButtonStyle);
                break;
            case 5:
                b9 = new D(bVar, attributeSet);
                break;
            case 6:
                b9 = new O(bVar, attributeSet);
                break;
            case 7:
                b9 = new A(bVar, attributeSet);
                break;
            case 8:
                b9 = new C2561e0(bVar, attributeSet);
                break;
            case 9:
                b9 = new C2595w(bVar, attributeSet, 0);
                break;
            case 10:
                b9 = new C2578n(bVar, attributeSet);
                break;
            case 11:
                b9 = new C2582p(bVar, attributeSet);
                break;
            case 12:
                b9 = new C2589t(bVar, attributeSet);
                break;
            case 13:
                b9 = new C2580o(bVar, attributeSet);
                break;
            default:
                b9 = null;
                break;
        }
        if (b9 == null && context != bVar) {
            Object[] objArr = yVar.f22738a;
            if (attributeValue.equals("view")) {
                attributeValue = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = bVar;
                objArr[1] = attributeSet;
                if (-1 == attributeValue.indexOf(46)) {
                    int i9 = 0;
                    while (true) {
                        String[] strArr = y.g;
                        if (i9 < 3) {
                            View viewA = yVar.a(bVar, attributeValue, strArr[i9]);
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
                    View viewA2 = yVar.a(bVar, attributeValue, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            b9 = view2;
        }
        if (b9 != null) {
            Context context3 = b9.getContext();
            if ((context3 instanceof ContextWrapper) && b9.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, y.f22733c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    b9.setOnClickListener(new x(b9, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = bVar.obtainStyledAttributes(attributeSet, y.f22734d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z6 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = U.f1980a;
                    new D1.G(com.kiptv.tv.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).g(b9, Boolean.valueOf(z6));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = bVar.obtainStyledAttributes(attributeSet, y.f22735e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    U.k(b9, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = bVar.obtainStyledAttributes(attributeSet, y.f22736f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z9 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = U.f1980a;
                    new D1.G(com.kiptv.tv.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(b9, Boolean.valueOf(z9));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return b9;
    }

    public final u p(int i3) {
        u[] uVarArr = this.f22694L;
        if (uVarArr == null || uVarArr.length <= i3) {
            u[] uVarArr2 = new u[i3 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f22694L = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i3];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.f22667a = i3;
        uVar2.f22678n = false;
        uVarArr[i3] = uVar2;
        return uVar2;
    }

    public final B q() {
        k();
        if (this.f22689F && this.f22717o == null) {
            Dialog dialog = this.f22713k;
            if (dialog != null) {
                this.f22717o = new B(dialog);
            }
            B b9 = this.f22717o;
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
        View decorView = this.f22715m.getDecorView();
        WeakHashMap weakHashMap = U.f1980a;
        decorView.postOnAnimation(this.f22706a0);
        this.f22704Y = true;
    }

    public final boolean s() {
        InterfaceC2567h0 interfaceC2567h0;
        T0 t9;
        boolean z6 = this.f22696N;
        this.f22696N = false;
        u uVarP = p(0);
        if (!uVarP.f22677m) {
            i0 i0Var = this.f22722t;
            if (i0Var != null) {
                i0Var.b();
                return true;
            }
            B bQ = q();
            if (bQ == null || (interfaceC2567h0 = bQ.f22587p) == null || (t9 = ((Y0) interfaceC2567h0).f24989a.f15756S) == null || t9.f24965i == null) {
                return false;
            }
            T0 t10 = ((Y0) interfaceC2567h0).f24989a.f15756S;
            n nVar = t10 == null ? null : t10.f24965i;
            if (nVar != null) {
                nVar.collapseActionView();
            }
        } else if (!z6) {
            h(uVarP, true);
            return true;
        }
        return true;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u uVar, KeyEvent keyEvent) {
        int i3;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.f22677m || this.f22699Q) {
            return;
        }
        int i9 = uVar.f22667a;
        Context context = this.f22714l;
        if (i9 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f22715m.getCallback();
        if (callback != null && !callback.onMenuOpened(i9, uVar.f22673h)) {
            h(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && w(uVar, keyEvent)) {
            t tVar = uVar.f22671e;
            if (tVar != null && !uVar.f22678n) {
                View view = uVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i3 = -1;
                }
                uVar.f22676l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = uVar.f22669c;
                layoutParams2.windowAnimations = uVar.f22670d;
                windowManager.addView(uVar.f22671e, layoutParams2);
                uVar.f22677m = true;
                if (i9 == 0) {
                    y();
                }
            }
            if (tVar == null) {
                Context contextN = n();
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextN.getResources().newTheme();
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
                b bVar = new b(contextN, 0);
                bVar.getTheme().setTo(themeNewTheme);
                uVar.j = bVar;
                TypedArray typedArrayObtainStyledAttributes = bVar.obtainStyledAttributes(a.j);
                uVar.f22668b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                uVar.f22670d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                uVar.f22671e = new t(this, uVar.j);
                uVar.f22669c = 81;
            } else if (uVar.f22678n && tVar.getChildCount() > 0) {
                uVar.f22671e.removeAllViews();
            }
            View view2 = uVar.g;
            if (view2 == null) {
                if (uVar.f22673h != null) {
                    if (this.f22721s == null) {
                        this.f22721s = new l(this);
                    }
                    l lVar = this.f22721s;
                    if (uVar.f22674i == null) {
                        h hVar = new h(uVar.j);
                        uVar.f22674i = hVar;
                        hVar.f24628l = lVar;
                        l lVar2 = uVar.f22673h;
                        lVar2.b(hVar, lVar2.f24636a);
                    }
                    h hVar2 = uVar.f22674i;
                    t tVar2 = uVar.f22671e;
                    if (hVar2.f24627k == null) {
                        hVar2.f24627k = (ExpandedMenuView) hVar2.f24626i.inflate(com.kiptv.tv.R.layout.abc_expanded_menu_layout, (ViewGroup) tVar2, false);
                        if (hVar2.f24629m == null) {
                            hVar2.f24629m = new g(hVar2);
                        }
                        hVar2.f24627k.setAdapter((ListAdapter) hVar2.f24629m);
                        hVar2.f24627k.setOnItemClickListener(hVar2);
                    }
                    ExpandedMenuView expandedMenuView = hVar2.f24627k;
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
                    h hVar3 = uVar.f22674i;
                    if (hVar3.f24629m == null) {
                        hVar3.f24629m = new g(hVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = uVar.f22672f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                uVar.f22671e.setBackgroundResource(uVar.f22668b);
                ViewParent parent = uVar.f22672f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(uVar.f22672f);
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
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = uVar.f22669c;
            layoutParams4.windowAnimations = uVar.f22670d;
            windowManager.addView(uVar.f22671e, layoutParams4);
            uVar.f22677m = true;
            if (i9 == 0) {
                y();
            }
        }
    }

    public final boolean u(u uVar, int i3, KeyEvent keyEvent) {
        l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f22675k || w(uVar, keyEvent)) && (lVar = uVar.f22673h) != null) {
            return lVar.performShortcut(i3, keyEvent, 1);
        }
        return false;
    }

    @Override
    public final boolean v(l lVar, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f22715m.getCallback();
        if (callback != null && !this.f22699Q) {
            l lVarK = lVar.k();
            u[] uVarArr = this.f22694L;
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

    public final boolean w(u uVar, KeyEvent keyEvent) {
        l lVar;
        InterfaceC2565g0 interfaceC2565g0;
        InterfaceC2565g0 interfaceC2565g1;
        Resources.Theme themeNewTheme;
        InterfaceC2565g0 interfaceC2565g2;
        InterfaceC2565g0 interfaceC2565g3;
        if (!this.f22699Q) {
            if (uVar.f22675k) {
                return true;
            }
            u uVar2 = this.f22695M;
            if (uVar2 != null && uVar2 != uVar) {
                h(uVar2, false);
            }
            Window.Callback callback = this.f22715m.getCallback();
            int i3 = uVar.f22667a;
            if (callback != null) {
                uVar.g = callback.onCreatePanelView(i3);
            }
            boolean z6 = i3 == 0 || i3 == 108;
            if (z6 && (interfaceC2565g3 = this.f22719q) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2565g3;
                actionBarOverlayLayout.k();
                ((Y0) actionBarOverlayLayout.f15702l).f24998l = true;
            }
            if (uVar.g == null) {
                l lVar2 = uVar.f22673h;
                if (lVar2 == null || uVar.f22679o) {
                    if (lVar2 == null) {
                        Context context = this.f22714l;
                        if ((i3 == 0 || i3 == 108) && this.f22719q != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
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
                                b bVar = new b(context, 0);
                                bVar.getTheme().setTo(themeNewTheme);
                                context = bVar;
                            }
                        }
                        l lVar3 = new l(context);
                        lVar3.f24640e = this;
                        l lVar4 = uVar.f22673h;
                        if (lVar3 != lVar4) {
                            if (lVar4 != null) {
                                lVar4.r(uVar.f22674i);
                            }
                            uVar.f22673h = lVar3;
                            h hVar = uVar.f22674i;
                            if (hVar != null) {
                                lVar3.b(hVar, lVar3.f24636a);
                            }
                        }
                        if (uVar.f22673h != null) {
                            if (z6 && (interfaceC2565g1 = this.f22719q) != null) {
                                if (this.f22720r == null) {
                                    this.f22720r = new k(this);
                                }
                                ((ActionBarOverlayLayout) interfaceC2565g1).l(uVar.f22673h, this.f22720r);
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
                                    ((ActionBarOverlayLayout) interfaceC2565g0).l(null, this.f22720r);
                                }
                            }
                        }
                    } else {
                        if (z6) {
                            if (this.f22720r == null) {
                                this.f22720r = new k(this);
                            }
                            ((ActionBarOverlayLayout) interfaceC2565g1).l(uVar.f22673h, this.f22720r);
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
                                ((ActionBarOverlayLayout) interfaceC2565g0).l(null, this.f22720r);
                            }
                        } else {
                            uVar.f22679o = false;
                        }
                    }
                }
                uVar.f22673h.w();
                Bundle bundle = uVar.f22680p;
                if (bundle != null) {
                    uVar.f22673h.s(bundle);
                    uVar.f22680p = null;
                }
                if (!callback.onPreparePanel(0, uVar.g, uVar.f22673h)) {
                    if (z6 && (interfaceC2565g2 = this.f22719q) != null) {
                        ((ActionBarOverlayLayout) interfaceC2565g2).l(null, this.f22720r);
                    }
                    uVar.f22673h.v();
                    return false;
                }
                uVar.f22673h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
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
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f22711f0 != null && (p(0).f22677m || this.f22722t != null)) {
                z6 = true;
            }
            if (z6 && this.f22712g0 == null) {
                this.f22712g0 = p.b(this.f22711f0, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f22712g0) == null) {
                    return;
                }
                p.c(this.f22711f0, onBackInvokedCallback);
                this.f22712g0 = null;
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
