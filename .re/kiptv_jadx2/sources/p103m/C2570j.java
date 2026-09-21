package p103m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.kiptv.tv.R;
import java.util.ArrayList;
import p008a8.c;
import p095l.D;
import p095l.l;
import p095l.n;
import p095l.o;
import p095l.t;
import p095l.w;
import p095l.x;
import p095l.y;
import p095l.z;

public final class C2570j implements x {

    public C2562f f25049A;

    public RunnableC2566h f25050B;

    public C2564g f25051C;

    public final Context f25053h;

    public Context f25054i;
    public l j;

    public final LayoutInflater f25055k;

    public w f25056l;

    public z f25059o;

    public C2568i f25060p;

    public Drawable f25061q;

    public boolean f25062r;

    public boolean f25063s;

    public boolean f25064t;

    public int f25065u;

    public int f25066v;

    public int f25067w;

    public boolean f25068x;

    public C2562f f25069z;

    public final int f25057m = R.layout.abc_action_menu_layout;

    public final int f25058n = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray y = new SparseBooleanArray();

    public final c f25052D = new c(10, this);

    public C2570j(Context context) {
        this.f25053h = context;
        this.f25055k = LayoutInflater.from(context);
    }

    public final View a(n nVar, View view, ViewGroup viewGroup) {
        y yVar;
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            if (view instanceof y) {
                yVar = (y) view;
            } else {
                yVar = (y) this.f25055k.inflate(this.f25058n, viewGroup, false);
            }
            yVar.b(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f25059o);
            if (this.f25051C == null) {
                this.f25051C = new C2564g(this);
            }
            actionMenuItemView.setPopupCallback(this.f25051C);
            actionView = (View) yVar;
        }
        actionView.setVisibility(nVar.f24662C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2574l)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final void c(l lVar, boolean z6) {
        e();
        C2562f c2562f = this.f25049A;
        if (c2562f != null && c2562f.b()) {
            c2562f.f24705i.dismiss();
        }
        w wVar = this.f25056l;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i3;
        boolean z6;
        C2570j c2570j = this;
        l lVar = c2570j.j;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i9 = c2570j.f25067w;
        int i10 = c2570j.f25066v;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c2570j.f25059o;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i3 = 2;
            z6 = true;
            if (i11 >= size) {
                break;
            }
            n nVar = (n) arrayListL.get(i11);
            int i14 = nVar.y;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z9 = true;
            }
            if (c2570j.f25068x && nVar.f24662C) {
                i9 = 0;
            }
            i11++;
        }
        if (c2570j.f25063s && (z9 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = c2570j.y;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < size) {
            n nVar2 = (n) arrayListL.get(i16);
            int i18 = nVar2.y;
            boolean z10 = (i18 & 2) == i3 ? z6 : false;
            int i19 = nVar2.f24664b;
            if (z10) {
                View viewA = c2570j.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z6);
                }
                nVar2.f(z6);
            } else {
                if ((i18 & 1) == z6) {
                    boolean z11 = sparseBooleanArray.get(i19);
                    boolean z12 = ((i15 > 0 || z11) && i10 > 0) ? z6 : false;
                    if (z12) {
                        View viewA2 = c2570j.a(nVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i10 -= measuredWidth2;
                        if (i17 == 0) {
                            i17 = measuredWidth2;
                        }
                        z12 &= i10 + i17 > 0;
                    }
                    if (z12 && i19 != 0) {
                        sparseBooleanArray.put(i19, true);
                    } else if (z11) {
                        sparseBooleanArray.put(i19, false);
                        for (int i20 = 0; i20 < i16; i20++) {
                            n nVar3 = (n) arrayListL.get(i20);
                            if (nVar3.f24664b == i19) {
                                if ((nVar3.f24684x & 32) == 32) {
                                    i15++;
                                }
                                nVar3.f(false);
                            }
                        }
                    }
                    if (z12) {
                        i15--;
                    }
                    nVar2.f(z12);
                } else {
                    nVar2.f(false);
                }
                i16++;
                i3 = 2;
                c2570j = this;
                z6 = true;
            }
            i16++;
            i3 = 2;
            c2570j = this;
            z6 = true;
        }
        return z6;
    }

    public final boolean e() {
        Object obj;
        RunnableC2566h runnableC2566h = this.f25050B;
        if (runnableC2566h != null && (obj = this.f25059o) != null) {
            ((View) obj).removeCallbacks(runnableC2566h);
            this.f25050B = null;
            return true;
        }
        C2562f c2562f = this.f25069z;
        if (c2562f == null) {
            return false;
        }
        if (c2562f.b()) {
            c2562f.f24705i.dismiss();
        }
        return true;
    }

    @Override
    public final void f() {
        int i3;
        ViewGroup viewGroup = (ViewGroup) this.f25059o;
        ArrayList arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            l lVar = this.j;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.j.l();
                int size = arrayListL.size();
                i3 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    n nVar = (n) arrayListL.get(i9);
                    if ((nVar.f24684x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i3);
                        n itemData = childAt instanceof y ? ((y) childAt).getItemData() : null;
                        View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f25059o).addView(viewA, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.f25060p) {
                    i3++;
                } else {
                    viewGroup.removeViewAt(i3);
                }
            }
        }
        ((View) this.f25059o).requestLayout();
        l lVar2 = this.j;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f24643i;
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                o oVar = ((n) arrayList2.get(i10)).f24660A;
            }
        }
        l lVar3 = this.j;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.j;
        }
        if (this.f25063s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((n) arrayList.get(0)).f24662C;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f25060p == null) {
                this.f25060p = new C2568i(this, this.f25053h);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f25060p.getParent();
            if (viewGroup3 != this.f25059o) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f25060p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f25059o;
                C2568i c2568i = this.f25060p;
                actionMenuView.getClass();
                C2574l c2574lI = ActionMenuView.i();
                c2574lI.f25074a = true;
                actionMenuView.addView(c2568i, c2574lI);
            }
        } else {
            C2568i c2568i2 = this.f25060p;
            if (c2568i2 != null) {
                Object parent = c2568i2.getParent();
                Object obj = this.f25059o;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f25060p);
                }
            }
        }
        ((ActionMenuView) this.f25059o).setOverflowReserved(this.f25063s);
    }

    @Override
    public final void g(w wVar) {
        throw null;
    }

    public final boolean h() {
        C2562f c2562f = this.f25069z;
        return c2562f != null && c2562f.b();
    }

    @Override
    public final void i(Context context, l lVar) {
        this.f25054i = context;
        LayoutInflater.from(context);
        this.j = lVar;
        Resources resources = context.getResources();
        if (!this.f25064t) {
            this.f25063s = true;
        }
        int i3 = 2;
        this.f25065u = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i9 > 600 || ((i9 > 960 && i10 > 720) || (i9 > 720 && i10 > 960))) {
            i3 = 5;
        } else if (i9 >= 500 || ((i9 > 640 && i10 > 480) || (i9 > 480 && i10 > 640))) {
            i3 = 4;
        } else if (i9 >= 360) {
            i3 = 3;
        }
        this.f25067w = i3;
        int measuredWidth = this.f25065u;
        if (this.f25063s) {
            if (this.f25060p == null) {
                C2568i c2568i = new C2568i(this, this.f25053h);
                this.f25060p = c2568i;
                if (this.f25062r) {
                    c2568i.setImageDrawable(this.f25061q);
                    this.f25061q = null;
                    this.f25062r = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f25060p.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f25060p.getMeasuredWidth();
        } else {
            this.f25060p = null;
        }
        this.f25066v = measuredWidth;
        float f9 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(D d4) {
        boolean z6;
        if (d4.hasVisibleItems()) {
            D d6 = d4;
            while (true) {
                l lVar = d6.f24578z;
                if (lVar == this.j) {
                    break;
                }
                d6 = (D) lVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f25059o;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if ((childAt instanceof y) && ((y) childAt).getItemData() == d6.f24577A) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                d4.f24577A.getClass();
                int size = d4.f24641f.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        z6 = false;
                        break;
                    }
                    MenuItem item = d4.getItem(i9);
                    if (item.isVisible() && item.getIcon() != null) {
                        z6 = true;
                        break;
                    }
                    i9++;
                }
                C2562f c2562f = new C2562f(this, this.f25054i, d4, view);
                this.f25049A = c2562f;
                c2562f.g = z6;
                t tVar = c2562f.f24705i;
                if (tVar != null) {
                    tVar.o(z6);
                }
                C2562f c2562f2 = this.f25049A;
                if (!c2562f2.b()) {
                    if (c2562f2.f24702e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c2562f2.d(0, 0, false, false);
                }
                w wVar = this.f25056l;
                if (wVar != null) {
                    wVar.j(d4);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean k(n nVar) {
        return false;
    }

    public final boolean l() {
        l lVar;
        if (!this.f25063s || h() || (lVar = this.j) == null || this.f25059o == null || this.f25050B != null) {
            return false;
        }
        lVar.i();
        if (lVar.j.isEmpty()) {
            return false;
        }
        RunnableC2566h runnableC2566h = new RunnableC2566h(this, new C2562f(this, this.f25054i, this.j, this.f25060p));
        this.f25050B = runnableC2566h;
        ((View) this.f25059o).post(runnableC2566h);
        return true;
    }
}
