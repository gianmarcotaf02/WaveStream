package p095l;

import R0.T0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.M0;
import com.kiptv.tv.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p008a8.c;
import p103m.C2581o0;
import p103m.C2599y;
import p103m.D0;
import p103m.E0;
import p103m.G0;

public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    public int f24600A;

    public boolean f24602C;

    public w f24603D;

    public ViewTreeObserver f24604E;

    public u f24605F;

    public boolean f24606G;

    public final Context f24607i;
    public final int j;

    public final int f24608k;

    public final boolean f24609l;

    public final Handler f24610m;

    public View f24618u;

    public View f24619v;

    public int f24620w;

    public boolean f24621x;
    public boolean y;

    public int f24622z;

    public final ArrayList f24611n = new ArrayList();

    public final ArrayList f24612o = new ArrayList();

    public final ViewTreeObserverOnGlobalLayoutListenerC2547d f24613p = new ViewTreeObserverOnGlobalLayoutListenerC2547d(0, this);

    public final T0 f24614q = new T0(2, this);

    public final c f24615r = new c(9, this);

    public int f24616s = 0;

    public int f24617t = 0;

    public boolean f24601B = false;

    public f(Context context, View view, int i3, boolean z6) {
        this.f24607i = context;
        this.f24618u = view;
        this.f24608k = i3;
        this.f24609l = z6;
        this.f24620w = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f24610m = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f24612o;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f24597a.f24884F.isShowing();
    }

    @Override
    public final void c(l lVar, boolean z6) {
        ArrayList arrayList = this.f24612o;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i3)).f24598b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i9 = i3 + 1;
        if (i9 < arrayList.size()) {
            ((e) arrayList.get(i9)).f24598b.c(false);
        }
        e eVar = (e) arrayList.remove(i3);
        eVar.f24598b.r(this);
        boolean z9 = this.f24606G;
        G0 g9 = eVar.f24597a;
        if (z9) {
            D0.b(g9.f24884F, null);
            g9.f24884F.setAnimationStyle(0);
        }
        g9.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f24620w = ((e) arrayList.get(size2 - 1)).f24599c;
        } else {
            this.f24620w = this.f24618u.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((e) arrayList.get(0)).f24598b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f24603D;
        if (wVar != null) {
            wVar.c(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f24604E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f24604E.removeGlobalOnLayoutListener(this.f24613p);
            }
            this.f24604E = null;
        }
        this.f24619v.removeOnAttachStateChangeListener(this.f24614q);
        this.f24605F.onDismiss();
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f24612o;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                e eVar = eVarArr[i3];
                if (eVar.f24597a.f24884F.isShowing()) {
                    eVar.f24597a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f24611n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((l) it.next());
        }
        arrayList.clear();
        View view = this.f24618u;
        this.f24619v = view;
        if (view != null) {
            boolean z6 = this.f24604E == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f24604E = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f24613p);
            }
            this.f24619v.addOnAttachStateChangeListener(this.f24614q);
        }
    }

    @Override
    public final void f() {
        Iterator it = this.f24612o.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f24597a.j.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final void g(w wVar) {
        this.f24603D = wVar;
    }

    @Override
    public final C2581o0 h() {
        ArrayList arrayList = this.f24612o;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) M0.j(1, arrayList)).f24597a.j;
    }

    @Override
    public final boolean j(D d4) {
        for (e eVar : this.f24612o) {
            if (d4 == eVar.f24598b) {
                eVar.f24597a.j.requestFocus();
                return true;
            }
        }
        if (!d4.hasVisibleItems()) {
            return false;
        }
        l(d4);
        w wVar = this.f24603D;
        if (wVar != null) {
            wVar.j(d4);
        }
        return true;
    }

    @Override
    public final void l(l lVar) {
        lVar.b(this, this.f24607i);
        if (a()) {
            v(lVar);
        } else {
            this.f24611n.add(lVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f24618u != view) {
            this.f24618u = view;
            this.f24617t = Gravity.getAbsoluteGravity(this.f24616s, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z6) {
        this.f24601B = z6;
    }

    @Override
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f24612o;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i3);
            if (!eVar.f24597a.f24884F.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (eVar != null) {
            eVar.f24598b.c(false);
        }
    }

    @Override
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override
    public final void p(int i3) {
        if (this.f24616s != i3) {
            this.f24616s = i3;
            this.f24617t = Gravity.getAbsoluteGravity(i3, this.f24618u.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i3) {
        this.f24621x = true;
        this.f24622z = i3;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f24605F = (u) onDismissListener;
    }

    @Override
    public final void s(boolean z6) {
        this.f24602C = z6;
    }

    @Override
    public final void t(int i3) {
        this.y = true;
        this.f24600A = i3;
    }

    public final void v(l lVar) {
        int i3;
        e eVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i9;
        C2599y c2599y;
        C2581o0 c2581o0;
        int[] iArr;
        Rect rect3;
        int i10;
        boolean z6;
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int width;
        Method method;
        MenuItem item;
        i iVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f24607i;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        i iVar2 = new i(lVar, layoutInflaterFrom, this.f24609l, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f24601B) {
            iVar2.f24632c = true;
        } else if (a()) {
            iVar2.f24632c = t.u(lVar);
        }
        int iM = t.m(iVar2, context, this.j);
        G0 g9 = new G0(context, null, this.f24608k);
        g9.f24914I = this.f24615r;
        g9.f24899w = this;
        g9.f24884F.setOnDismissListener(this);
        g9.f24898v = this.f24618u;
        g9.f24895s = this.f24617t;
        g9.f24883E = true;
        g9.f24884F.setFocusable(true);
        g9.f24884F.setInputMethodMode(2);
        g9.o(iVar2);
        g9.q(iM);
        g9.f24895s = this.f24617t;
        ArrayList arrayList = this.f24612o;
        if (arrayList.size() > 0) {
            eVar = (e) M0.j(1, arrayList);
            l lVar2 = eVar.f24598b;
            int size = lVar2.f24641f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    item = null;
                    break;
                }
                item = lVar2.getItem(i13);
                if (item.hasSubMenu() && lVar == item.getSubMenu()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (item == null) {
                i3 = 1;
                childAt = null;
            } else {
                C2581o0 c2581o1 = eVar.f24597a.j;
                ListAdapter adapter = c2581o1.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    headersCount = 0;
                }
                int count = iVar.getCount();
                i3 = 1;
                int i14 = 0;
                while (true) {
                    if (i14 >= count) {
                        i14 = -1;
                        break;
                    } else if (item == iVar.getItem(i14)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 != -1 && (firstVisiblePosition = (i14 + headersCount) - c2581o1.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c2581o1.getChildCount()) {
                    childAt = c2581o1.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i9 = Build.VERSION.SDK_INT;
                c2599y = g9.f24884F;
                if (i9 <= 28) {
                    method = G0.f24913J;
                    if (method != null) {
                        try {
                            method.invoke(c2599y, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    E0.a(c2599y, false);
                }
                D0.a(g9.f24884F, null);
                c2581o0 = ((e) arrayList.get(arrayList.size() - 1)).f24597a.j;
                iArr = new int[2];
                c2581o0.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f24619v.getWindowVisibleDisplayFrame(rect3);
                if (this.f24620w == i3) {
                    if (c2581o0.getWidth() + iArr[0] + iM > rect3.right) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                } else if (iArr[0] - iM < 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i10 == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f24620w = i10;
                if (Build.VERSION.SDK_INT >= 26) {
                    g9.f24898v = childAt;
                    i12 = 0;
                    i11 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f24618u.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f24617t & 7) == 5) {
                        iArr2[0] = this.f24618u.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i11 = iArr3[0] - iArr2[0];
                    i12 = iArr3[1] - iArr2[1];
                }
                if ((this.f24617t & 5) == 5) {
                    if (z6) {
                        width = i11 + iM;
                    } else {
                        iM = childAt.getWidth();
                        width = i11 - iM;
                    }
                } else if (z6) {
                    width = i11 + childAt.getWidth();
                } else {
                    width = i11 - iM;
                }
                g9.f24889m = width;
                g9.f24894r = true;
                g9.f24893q = true;
                g9.k(i12);
            } else {
                if (this.f24621x) {
                    g9.f24889m = this.f24622z;
                }
                if (this.y) {
                    g9.k(this.f24600A);
                }
                rect = this.f24696h;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                g9.f24882D = rect2;
            }
            arrayList.add(new e(g9, lVar, this.f24620w));
            g9.e();
            C2581o0 c2581o2 = g9.j;
            c2581o2.setOnKeyListener(this);
            if (eVar == null || !this.f24602C || lVar.f24646m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c2581o2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.f24646m);
            c2581o2.addHeaderView(frameLayout, null, false);
            g9.e();
            return;
        }
        i3 = 1;
        eVar = null;
        childAt = null;
        if (childAt != null) {
            i9 = Build.VERSION.SDK_INT;
            c2599y = g9.f24884F;
            if (i9 <= 28) {
                method = G0.f24913J;
                if (method != null) {
                    method.invoke(c2599y, Boolean.FALSE);
                }
            } else {
                E0.a(c2599y, false);
            }
            D0.a(g9.f24884F, null);
            c2581o0 = ((e) arrayList.get(arrayList.size() - 1)).f24597a.j;
            iArr = new int[2];
            c2581o0.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f24619v.getWindowVisibleDisplayFrame(rect3);
            if (this.f24620w == i3) {
                if (c2581o0.getWidth() + iArr[0] + iM > rect3.right) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (i10 == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f24620w = i10;
            if (Build.VERSION.SDK_INT >= 26) {
                g9.f24898v = childAt;
                i12 = 0;
                i11 = 0;
            } else {
                iArr2 = new int[2];
                this.f24618u.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f24617t & 7) == 5) {
                    iArr2[0] = this.f24618u.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i11 = iArr3[0] - iArr2[0];
                i12 = iArr3[1] - iArr2[1];
            }
            if ((this.f24617t & 5) == 5) {
                if (z6) {
                    width = i11 + iM;
                } else {
                    iM = childAt.getWidth();
                    width = i11 - iM;
                }
            } else if (z6) {
                width = i11 + childAt.getWidth();
            } else {
                width = i11 - iM;
            }
            g9.f24889m = width;
            g9.f24894r = true;
            g9.f24893q = true;
            g9.k(i12);
        } else {
            if (this.f24621x) {
                g9.f24889m = this.f24622z;
            }
            if (this.y) {
                g9.k(this.f24600A);
            }
            rect = this.f24696h;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            g9.f24882D = rect2;
        }
        arrayList.add(new e(g9, lVar, this.f24620w));
        g9.e();
        C2581o0 c2581o3 = g9.j;
        c2581o3.setOnKeyListener(this);
        if (eVar == null) {
        }
    }
}
