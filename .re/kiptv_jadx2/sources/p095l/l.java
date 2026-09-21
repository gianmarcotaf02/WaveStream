package p095l;

import D1.AbstractC0225j;
import D1.V;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.revenuecat.purchases.common.events.BackendEvent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class l implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    public final Context f24636a;

    public final Resources f24637b;

    public boolean f24638c;

    public final boolean f24639d;

    public j f24640e;

    public final ArrayList f24641f;
    public final ArrayList g;

    public boolean f24642h;

    public final ArrayList f24643i;
    public final ArrayList j;

    public boolean f24644k;

    public CharSequence f24646m;

    public Drawable f24647n;

    public View f24648o;

    public n f24655v;

    public boolean f24657x;

    public int f24645l = 0;

    public boolean f24649p = false;

    public boolean f24650q = false;

    public boolean f24651r = false;

    public boolean f24652s = false;

    public final ArrayList f24653t = new ArrayList();

    public final CopyOnWriteArrayList f24654u = new CopyOnWriteArrayList();

    public boolean f24656w = false;

    public l(Context context) {
        boolean zT;
        boolean z6 = false;
        this.f24636a = context;
        Resources resources = context.getResources();
        this.f24637b = resources;
        this.f24641f = new ArrayList();
        this.g = new ArrayList();
        this.f24642h = true;
        this.f24643i = new ArrayList();
        this.j = new ArrayList();
        this.f24644k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = V.f1985a;
            if (Build.VERSION.SDK_INT >= 28) {
                zT = AbstractC0225j.t(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM);
                zT = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zT) {
                z6 = true;
            }
        }
        this.f24639d = z6;
    }

    public final n a(int i3, int i9, int i10, CharSequence charSequence) {
        int i11;
        int i12 = ((-65536) & i10) >> 16;
        if (i12 < 0 || i12 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i13 = (y[i12] << 16) | (65535 & i10);
        n nVar = new n(this, i3, i9, i10, i13, charSequence, this.f24645l);
        ArrayList arrayList = this.f24641f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((n) arrayList.get(size)).f24666d <= i13) {
                i11 = size + 1;
                arrayList.add(i11, nVar);
                p(true);
                return nVar;
            }
        }
        i11 = 0;
        arrayList.add(i11, nVar);
        p(true);
        return nVar;
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override
    public final int addIntentOptions(int i3, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        PackageManager packageManager = this.f24636a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i11 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i13 = 0; i13 < size; i13++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i14 < 0 ? intent : intentArr[i14]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i3, i9, i10, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.g = intent2;
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = nVarA;
            }
        }
        return size;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f24654u.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.f24644k = true;
    }

    public final void c(boolean z6) {
        if (this.f24652s) {
            return;
        }
        this.f24652s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f24654u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z6);
            }
        }
        this.f24652s = false;
    }

    @Override
    public final void clear() {
        n nVar = this.f24655v;
        if (nVar != null) {
            d(nVar);
        }
        this.f24641f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f24647n = null;
        this.f24646m = null;
        this.f24648o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f24654u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f24655v == nVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar != null) {
                    zK = xVar.k(nVar);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zK) {
                this.f24655v = null;
            }
        }
        return zK;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f24640e;
        return jVar != null && jVar.v(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f24654u;
        boolean zB = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar != null) {
                zB = xVar.b(nVar);
                if (zB) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zB) {
            this.f24655v = nVar;
        }
        return zB;
    }

    @Override
    public final MenuItem findItem(int i3) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) arrayList.get(i9);
            if (nVar.f24663a == i3) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f24675o.findItem(i3)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f24653t;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) arrayList.get(i9);
            char c9 = zN ? nVar.j : nVar.f24669h;
            char[] cArr = keyData.meta;
            if ((c9 == cArr[0] && (metaState & 2) == 0) || ((c9 == cArr[2] && (metaState & 2) != 0) || (zN && c9 == '\b' && i3 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f24641f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList2 = this.f24641f;
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                n nVar = (n) arrayList2.get(i9);
                if (nVar.hasSubMenu()) {
                    nVar.f24675o.h(arrayList, i3, keyEvent);
                }
                char c9 = zN ? nVar.j : nVar.f24669h;
                if ((modifiers & 69647) == ((zN ? nVar.f24671k : nVar.f24670i) & 69647) && c9 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c9 == cArr[0] || c9 == cArr[2] || (zN && c9 == '\b' && i3 == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (this.f24657x) {
            return true;
        }
        ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((n) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f24644k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f24654u;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= xVar.d();
                }
            }
            ArrayList arrayList = this.f24643i;
            ArrayList arrayList2 = this.j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i3 = 0; i3 < size; i3++) {
                    n nVar = (n) arrayListL.get(i3);
                    if ((nVar.f24684x & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f24644k = false;
        }
    }

    @Override
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z6 = this.f24642h;
        ArrayList arrayList = this.g;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f24641f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) arrayList2.get(i3);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f24642h = false;
        this.f24644k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f24656w;
    }

    public boolean n() {
        return this.f24638c;
    }

    public boolean o() {
        return this.f24639d;
    }

    public final void p(boolean z6) {
        if (this.f24649p) {
            this.f24650q = true;
            if (z6) {
                this.f24651r = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f24642h = true;
            this.f24644k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f24654u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.f();
            }
        }
        v();
    }

    @Override
    public final boolean performIdentifierAction(int i3, int i9) {
        return q(findItem(i3), null, i9);
    }

    @Override
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i9) {
        n nVarG = g(i3, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i9) : false;
        if ((i9 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    public final boolean q(MenuItem menuItem, x xVar, int i3) {
        o oVar;
        boolean zExpandActionView;
        o oVar2;
        boolean z6;
        D d4;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        x xVar2;
        n nVar = (n) menuItem;
        boolean zJ = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f24676p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) {
            l lVar = nVar.f24674n;
            if (lVar.e(lVar, nVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = nVar.g;
                if (intent != null) {
                    try {
                        lVar.f24636a.startActivity(intent);
                    } catch (ActivityNotFoundException e6) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e6);
                        oVar = nVar.f24660A;
                        if (oVar == null) {
                        }
                        zExpandActionView = false;
                        oVar2 = nVar.f24660A;
                        if (oVar2 == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (nVar.e()) {
                            zExpandActionView |= nVar.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (nVar.hasSubMenu()) {
                            if ((i3 & 4) == 0) {
                                c(false);
                            }
                            if (!nVar.hasSubMenu()) {
                                D d6 = new D(this.f24636a, this, nVar);
                                nVar.f24675o = d6;
                                d6.setHeaderTitle(nVar.f24667e);
                            }
                            d4 = nVar.f24675o;
                            if (z6) {
                                s sVar = oVar2.f24688c;
                                oVar2.f24687b.onPrepareSubMenu(d4);
                            }
                            copyOnWriteArrayList = this.f24654u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (xVar != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    xVar2 = (x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zJ) {
                                        zJ = xVar2.j(d4);
                                    }
                                }
                            }
                            zExpandActionView |= zJ;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i3 & 4) == 0) {
                                c(false);
                            }
                            if (!nVar.hasSubMenu()) {
                                D d9 = new D(this.f24636a, this, nVar);
                                nVar.f24675o = d9;
                                d9.setHeaderTitle(nVar.f24667e);
                            }
                            d4 = nVar.f24675o;
                            if (z6) {
                                s sVar2 = oVar2.f24688c;
                                oVar2.f24687b.onPrepareSubMenu(d4);
                            }
                            copyOnWriteArrayList = this.f24654u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zJ = xVar != null ? xVar.j(d4) : false;
                                while (r8.hasNext()) {
                                    xVar2 = (x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zJ) {
                                        zJ = xVar2.j(d4);
                                    }
                                }
                            }
                            zExpandActionView |= zJ;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    oVar = nVar.f24660A;
                    if (oVar == null && oVar.f24687b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        oVar2 = nVar.f24660A;
        if (oVar2 == null && oVar2.f24687b.hasSubMenu()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (nVar.e()) {
            zExpandActionView |= nVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (nVar.hasSubMenu() || z6) {
            if ((i3 & 4) == 0) {
                c(false);
            }
            if (!nVar.hasSubMenu()) {
                D d10 = new D(this.f24636a, this, nVar);
                nVar.f24675o = d10;
                d10.setHeaderTitle(nVar.f24667e);
            }
            d4 = nVar.f24675o;
            if (z6) {
                s sVar3 = oVar2.f24688c;
                oVar2.f24687b.onPrepareSubMenu(d4);
            }
            copyOnWriteArrayList = this.f24654u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (xVar != null) {
                }
                while (r8.hasNext()) {
                    xVar2 = (x) weakReference.get();
                    if (xVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = xVar2.j(d4);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i3 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f24654u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((n) arrayList.get(i10)).f24664b == i3) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            int size2 = arrayList.size() - i10;
            while (true) {
                int i11 = i9 + 1;
                if (i9 >= size2 || ((n) arrayList.get(i10)).f24664b != i3) {
                    break;
                }
                if (i10 >= 0) {
                    ArrayList arrayList2 = this.f24641f;
                    if (i10 < arrayList2.size()) {
                        arrayList2.remove(i10);
                    }
                }
                i9 = i11;
            }
            p(true);
        }
    }

    @Override
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((n) arrayList.get(i9)).f24663a == i3) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            ArrayList arrayList2 = this.f24641f;
            if (i9 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i9);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f24641f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((D) item.getSubMenu()).s(bundle);
            }
        }
        int i9 = bundle.getInt("android:menu:expandedactionview");
        if (i9 <= 0 || (menuItemFindItem = findItem(i9)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override
    public final void setGroupCheckable(int i3, boolean z6, boolean z9) {
        ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) arrayList.get(i9);
            if (nVar.f24664b == i3) {
                nVar.f24684x = (nVar.f24684x & (-5)) | (z9 ? 4 : 0);
                nVar.setCheckable(z6);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z6) {
        this.f24656w = z6;
    }

    @Override
    public final void setGroupEnabled(int i3, boolean z6) {
        ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) arrayList.get(i9);
            if (nVar.f24664b == i3) {
                nVar.setEnabled(z6);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i3, boolean z6) {
        ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) arrayList.get(i9);
            if (nVar.f24664b == i3) {
                int i10 = nVar.f24684x;
                int i11 = (i10 & (-9)) | (z6 ? 0 : 8);
                nVar.f24684x = i11;
                if (i10 != i11) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            p(true);
        }
    }

    @Override
    public void setQwertyMode(boolean z6) {
        this.f24638c = z6;
        p(false);
    }

    @Override
    public final int size() {
        return this.f24641f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f24641f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i3, CharSequence charSequence, int i9, Drawable drawable, View view) {
        if (view != null) {
            this.f24648o = view;
            this.f24646m = null;
            this.f24647n = null;
        } else {
            if (i3 > 0) {
                this.f24646m = this.f24637b.getText(i3);
            } else if (charSequence != null) {
                this.f24646m = charSequence;
            }
            if (i9 > 0) {
                this.f24647n = this.f24636a.getDrawable(i9);
            } else if (drawable != null) {
                this.f24647n = drawable;
            }
            this.f24648o = null;
        }
        p(false);
    }

    public final void v() {
        this.f24649p = false;
        if (this.f24650q) {
            this.f24650q = false;
            p(this.f24651r);
        }
    }

    public final void w() {
        if (this.f24649p) {
            return;
        }
        this.f24649p = true;
        this.f24650q = false;
        this.f24651r = false;
    }

    @Override
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f24637b.getString(i3));
    }

    @Override
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f24637b.getString(i3));
    }

    @Override
    public final MenuItem add(int i3, int i9, int i10, CharSequence charSequence) {
        return a(i3, i9, i10, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i9, int i10, CharSequence charSequence) {
        n nVarA = a(i3, i9, i10, charSequence);
        D d4 = new D(this.f24636a, this, nVarA);
        nVarA.f24675o = d4;
        d4.setHeaderTitle(nVarA.f24667e);
        return d4;
    }

    @Override
    public final MenuItem add(int i3, int i9, int i10, int i11) {
        return a(i3, i9, i10, this.f24637b.getString(i11));
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i9, int i10, int i11) {
        return addSubMenu(i3, i9, i10, this.f24637b.getString(i11));
    }

    public l k() {
        return this;
    }
}
