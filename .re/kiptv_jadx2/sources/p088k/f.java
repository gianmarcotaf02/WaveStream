package p088k;

import D1.AbstractC0229n;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.play_billing.M0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p095l.n;
import p095l.o;
import p095l.s;
import p197y1.a;

public final class f {

    public CharSequence f24356A;

    public CharSequence f24357B;

    public final g f24360E;

    public final Menu f24361a;

    public boolean f24367h;

    public int f24368i;
    public int j;

    public CharSequence f24369k;

    public CharSequence f24370l;

    public int f24371m;

    public char f24372n;

    public int f24373o;

    public char f24374p;

    public int f24375q;

    public int f24376r;

    public boolean f24377s;

    public boolean f24378t;

    public boolean f24379u;

    public int f24380v;

    public int f24381w;

    public String f24382x;
    public String y;

    public o f24383z;

    public ColorStateList f24358C = null;

    public PorterDuff.Mode f24359D = null;

    public int f24362b = 0;

    public int f24363c = 0;

    public int f24364d = 0;

    public int f24365e = 0;

    public boolean f24366f = true;
    public boolean g = true;

    public f(g gVar, Menu menu) {
        this.f24360E = gVar;
        this.f24361a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f24360E.f24388c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e6) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z6 = false;
        menuItem.setChecked(this.f24377s).setVisible(this.f24378t).setEnabled(this.f24379u).setCheckable(this.f24376r >= 1).setTitleCondensed(this.f24370l).setIcon(this.f24371m);
        int i3 = this.f24380v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.y;
        g gVar = this.f24360E;
        if (str != null) {
            if (gVar.f24388c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (gVar.f24389d == null) {
                gVar.f24389d = g.a(gVar.f24388c);
            }
            Object obj = gVar.f24389d;
            String str2 = this.y;
            e eVar = new e();
            eVar.f24354a = obj;
            Class<?> cls = obj.getClass();
            try {
                eVar.f24355b = cls.getMethod(str2, e.f24353c);
                menuItem.setOnMenuItemClickListener(eVar);
            } catch (Exception e6) {
                StringBuilder sbQ = M0.q("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbQ.append(cls.getName());
                InflateException inflateException = new InflateException(sbQ.toString());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }
        if (this.f24376r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f24684x = (nVar.f24684x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f24695d;
                    a aVar = sVar.f24694c;
                    if (method == null) {
                        sVar.f24695d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f24695d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e9) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e9);
                }
            }
        }
        String str3 = this.f24382x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, g.f24384e, gVar.f24386a));
            z6 = true;
        }
        int i9 = this.f24381w;
        if (i9 > 0) {
            if (z6) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i9);
            }
        }
        o oVar = this.f24383z;
        if (oVar != null) {
            if (menuItem instanceof a) {
                ((a) menuItem).b(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f24356A;
        boolean z9 = menuItem instanceof a;
        if (z9) {
            ((a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0229n.m(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f24357B;
        if (z9) {
            ((a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0229n.u(menuItem, charSequence2);
        }
        char c9 = this.f24372n;
        int i10 = this.f24373o;
        if (z9) {
            ((a) menuItem).setAlphabeticShortcut(c9, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0229n.j(menuItem, c9, i10);
        }
        char c10 = this.f24374p;
        int i11 = this.f24375q;
        if (z9) {
            ((a) menuItem).setNumericShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0229n.q(menuItem, c10, i11);
        }
        PorterDuff.Mode mode = this.f24359D;
        if (mode != null) {
            if (z9) {
                ((a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0229n.p(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f24358C;
        if (colorStateList != null) {
            if (z9) {
                ((a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0229n.o(menuItem, colorStateList);
            }
        }
    }
}
