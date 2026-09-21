package p072i;

import D1.InterfaceC0228m;
import D1.M;
import D1.U;
import E6.G;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.X;
import com.google.common.util.concurrent.AbstractC1903s;
import com.kiptv.tv.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import p019c.l;
import p088k.i;
import p103m.C2588s0;
import p103m.InterfaceC2565g0;
import p103m.Y0;

public final class h extends l implements DialogInterface {

    public v f22646k;

    public final w f22647l;

    public final f f22648m;

    public h(ContextThemeWrapper contextThemeWrapper, int i3) {
        int i9;
        int iH = h(contextThemeWrapper, i3);
        if (iH == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i9 = typedValue.resourceId;
        } else {
            i9 = iH;
        }
        super(contextThemeWrapper, i9);
        this.f22647l = new InterfaceC0228m() {
            @Override
            public final boolean f(KeyEvent keyEvent) {
                return this.f22728h.j(keyEvent);
            }
        };
        i iVarD = d();
        if (iH == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iH = typedValue2.resourceId;
        }
        ((v) iVarD).f22702T = iH;
        iVarD.a();
        this.f22648m = new f(getContext(), this, getWindow());
    }

    public static int h(Context context, int i3) {
        if (((i3 >>> 24) & 255) >= 1) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v vVar = (v) d();
        vVar.k();
        ((ViewGroup) vVar.f22684A.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f22716n.a(vVar.f22715m.getCallback());
    }

    public final i d() {
        if (this.f22646k == null) {
            int i3 = i.f22649h;
            this.f22646k = new v(this, this);
        }
        return this.f22646k;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        v vVar = (v) d();
        Dialog dialog = vVar.f22713k;
        if (vVar.f22704Y) {
            vVar.f22715m.getDecorView().removeCallbacks(vVar.f22706a0);
        }
        vVar.f22699Q = true;
        if (vVar.f22701S != -100) {
            Dialog dialog2 = vVar.f22713k;
        }
        v.f22681h0.remove(vVar.f22713k.getClass().getName());
        r rVar = vVar.W;
        if (rVar != null) {
            rVar.c();
        }
        r rVar2 = vVar.X;
        if (rVar2 != null) {
            rVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return G.q(this.f22647l, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        X.i(getWindow().getDecorView(), this);
        AbstractC1903s.H(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        m.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void f(Bundle bundle) {
        v vVar = (v) d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(vVar.f22714l);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(vVar);
        } else if (!(layoutInflaterFrom.getFactory2() instanceof v)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        d().a();
    }

    @Override
    public final View findViewById(int i3) {
        v vVar = (v) d();
        vVar.k();
        return vVar.f22715m.findViewById(i3);
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        v vVar = (v) d();
        vVar.f22718p = charSequence;
        InterfaceC2565g0 interfaceC2565g0 = vVar.f22719q;
        if (interfaceC2565g0 != null) {
            interfaceC2565g0.setWindowTitle(charSequence);
            return;
        }
        B b9 = vVar.f22717o;
        if (b9 == null) {
            TextView textView = vVar.f22685B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        Y0 y9 = (Y0) b9.f22587p;
        if (y9.g) {
            return;
        }
        y9.f24995h = charSequence;
        if ((y9.f24990b & 8) != 0) {
            Toolbar toolbar = y9.f24989a;
            toolbar.setTitle(charSequence);
            if (y9.g) {
                U.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override
    public final void invalidateOptionsMenu() {
        v vVar = (v) d();
        if (vVar.f22717o != null) {
            vVar.q().getClass();
            vVar.r(0);
        }
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int i3;
        int i9;
        int i10;
        ListAdapter listAdapter;
        View viewFindViewById;
        f(bundle);
        f fVar = this.f22648m;
        fVar.f22622b.setContentView(fVar.y);
        Window window = fVar.f22623c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = fVar.f22626f;
        if (view == null) {
            view = null;
        }
        boolean z6 = view != null;
        if (!z6 || !f.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z6) {
            i3 = 2;
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (fVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fVar.f22625e != null) {
                ((LinearLayout.LayoutParams) ((C2588s0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            i3 = 2;
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = f.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = f.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = f.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        fVar.f22635q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.f22635q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        fVar.f22639u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            fVar.f22635q.removeView(fVar.f22639u);
            if (fVar.f22625e != null) {
                ViewGroup viewGroup2 = (ViewGroup) fVar.f22635q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(fVar.f22635q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(fVar.f22625e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        fVar.f22627h = button;
        ViewOnClickListenerC2181a viewOnClickListenerC2181a = fVar.f22620E;
        button.setOnClickListener(viewOnClickListenerC2181a);
        if (TextUtils.isEmpty(fVar.f22628i)) {
            fVar.f22627h.setVisibility(8);
            i9 = 0;
        } else {
            fVar.f22627h.setText(fVar.f22628i);
            fVar.f22627h.setVisibility(0);
            i9 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        fVar.f22629k = button2;
        button2.setOnClickListener(viewOnClickListenerC2181a);
        if (TextUtils.isEmpty(fVar.f22630l)) {
            fVar.f22629k.setVisibility(8);
        } else {
            fVar.f22629k.setText(fVar.f22630l);
            fVar.f22629k.setVisibility(0);
            i9 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        fVar.f22632n = button3;
        button3.setOnClickListener(viewOnClickListenerC2181a);
        if (TextUtils.isEmpty(fVar.f22633o)) {
            fVar.f22632n.setVisibility(8);
        } else {
            fVar.f22632n.setText(fVar.f22633o);
            fVar.f22632n.setVisibility(0);
            i9 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        fVar.f22621a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i10 = i3;
        } else if (i9 == 1) {
            Button button4 = fVar.f22627h;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i10 = i3;
        } else {
            i10 = i3;
            if (i9 == i10) {
                Button button5 = fVar.f22629k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i9 == 4) {
                Button button6 = fVar.f22632n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i9 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (fVar.f22640v != null) {
            viewGroupB.addView(fVar.f22640v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            fVar.f22637s = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(fVar.f22624d) || !fVar.f22618C) {
                window.findViewById(R.id.title_template).setVisibility(8);
                fVar.f22637s.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                fVar.f22638t = textView2;
                textView2.setText(fVar.f22624d);
                Drawable drawable = fVar.f22636r;
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
        if (!z10 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = fVar.f22635q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = fVar.f22625e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = fVar.f22625e;
        if (alertController$RecycleListView != null && (!z10 || i11 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f15632h, alertController$RecycleListView.getPaddingRight(), z10 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f15633i);
        }
        if (!z9) {
            View view2 = fVar.f22625e;
            if (view2 == null) {
                view2 = fVar.f22635q;
            }
            if (view2 != null) {
                int i12 = i11 | (z10 ? i10 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = U.f1980a;
                M.b(view2, i12, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = fVar.f22625e;
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

    @Override
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f22648m.f22635q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i3, keyEvent);
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f22648m.f22635q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i3, keyEvent);
        }
        return true;
    }

    @Override
    public final void onStop() {
        i iVar;
        super.onStop();
        B bQ = ((v) d()).q();
        if (bQ == null || (iVar = bQ.f22579D) == null) {
            return;
        }
        iVar.a();
    }

    @Override
    public final void setContentView(int i3) {
        e();
        v vVar = (v) d();
        vVar.k();
        ViewGroup viewGroup = (ViewGroup) vVar.f22684A.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(vVar.f22714l).inflate(i3, viewGroup);
        vVar.f22716n.a(vVar.f22715m.getCallback());
    }

    @Override
    public final void setTitle(int i3) {
        super.setTitle(i3);
        i iVarD = d();
        String string = getContext().getString(i3);
        v vVar = (v) iVarD;
        vVar.f22718p = string;
        InterfaceC2565g0 interfaceC2565g0 = vVar.f22719q;
        if (interfaceC2565g0 != null) {
            interfaceC2565g0.setWindowTitle(string);
            return;
        }
        B b9 = vVar.f22717o;
        if (b9 == null) {
            TextView textView = vVar.f22685B;
            if (textView != null) {
                textView.setText(string);
                return;
            }
            return;
        }
        Y0 y9 = (Y0) b9.f22587p;
        if (y9.g) {
            return;
        }
        y9.f24995h = string;
        if ((y9.f24990b & 8) != 0) {
            Toolbar toolbar = y9.f24989a;
            toolbar.setTitle(string);
            if (y9.g) {
                U.k(toolbar.getRootView(), string);
            }
        }
    }

    @Override
    public final void setContentView(View view) {
        e();
        v vVar = (v) d();
        vVar.k();
        ViewGroup viewGroup = (ViewGroup) vVar.f22684A.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        vVar.f22716n.a(vVar.f22715m.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        v vVar = (v) d();
        vVar.k();
        ViewGroup viewGroup = (ViewGroup) vVar.f22684A.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        vVar.f22716n.a(vVar.f22715m.getCallback());
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        f fVar = this.f22648m;
        fVar.f22624d = charSequence;
        TextView textView = fVar.f22638t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
