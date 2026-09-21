package p146r1;

import A0.o;
import E1.e;
import I3.b;
import O0.InterfaceC0732v;
import R0.AbstractC0813b;
import R0.C0811a;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.X;
import com.google.common.util.concurrent.AbstractC1903s;
import com.kiptv.tv.R;
import java.util.UUID;
import k3.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import p019c.q;
import p020c0.AbstractC1703s;
import p020c0.AbstractC1709v;
import p020c0.C1681g0;
import p020c0.C1700q;
import p020c0.C1701q0;
import p020c0.F;
import p113n1.c;
import p113n1.l;
import p113n1.n;
import p121o0.r;

public final class A extends AbstractC0813b {

    public final C1681g0 f26697A;

    public l f26698B;

    public final F f26699C;

    public final Rect f26700D;

    public final r f26701E;

    public q f26702F;

    public final C1681g0 f26703G;
    public boolean H;

    public final int[] f26704I;

    public Function0 f26705p;

    public F f26706q;

    public String f26707r;

    public final View f26708s;

    public final boolean f26709t;

    public final D f26710u;

    public final WindowManager f26711v;

    public final WindowManager.LayoutParams f26712w;

    public E f26713x;
    public n y;

    public final C1681g0 f26714z;

    public A(Function0 function0, F f9, String str, View view, c cVar, E e6, UUID uuid, boolean z6) {
        super(view.getContext());
        D c9 = Build.VERSION.SDK_INT >= 29 ? new C() : new D();
        this.f26705p = function0;
        this.f26706q = f9;
        this.f26707r = str;
        this.f26708s = view;
        this.f26709t = z6;
        this.f26710u = c9;
        Object systemService = view.getContext().getSystemService("window");
        m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f26711v = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        F f10 = this.f26706q;
        boolean zC = p.c(view);
        boolean z9 = f10.f26716b;
        int i3 = f10.f26715a;
        if (z9 && zC) {
            i3 |= 8192;
        } else if (z9 && !zC) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f26712w = layoutParams;
        this.f26713x = e6;
        this.y = n.f25566h;
        this.f26714z = AbstractC1703s.y(null);
        this.f26697A = AbstractC1703s.y(null);
        this.f26699C = AbstractC1703s.r(new A8.m(22, this));
        this.f26700D = new Rect();
        this.f26701E = new r(new l(this, 2));
        setId(android.R.id.content);
        X.i(this, X.d(view));
        setTag(R.id.view_tree_view_model_store_owner, X.e(view));
        AbstractC1903s.H(this, AbstractC1903s.v(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.Y((float) 8));
        setOutlineProvider(new o(3));
        this.f26703G = AbstractC1703s.y(v.f26776a);
        this.f26704I = new int[2];
    }

    private final p194x6.m getContent() {
        return (p194x6.m) this.f26703G.getValue();
    }

    public final InterfaceC0732v getParentLayoutCoordinates() {
        return (InterfaceC0732v) this.f26697A.getValue();
    }

    private final l getVisibleDisplayBounds() {
        this.f26710u.getClass();
        View view = this.f26708s;
        Rect rect = this.f26700D;
        view.getWindowVisibleDisplayFrame(rect);
        return new l(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(p194x6.m mVar) {
        this.f26703G.setValue(mVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC0732v interfaceC0732v) {
        this.f26697A.setValue(interfaceC0732v);
    }

    @Override
    public final void a(int i3, C1700q c1700q) {
        c1700q.e0(-857613600);
        int i9 = (c1700q.h(this) ? 4 : 2) | i3;
        if (c1700q.T(i9 & 1, (i9 & 3) != 2)) {
            getContent().invoke(c1700q, 0);
        } else {
            c1700q.W();
        }
        C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new C0811a(this, i3, 6);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f26706q.f26717c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.f26705p;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void e(int i3, int i9, boolean z6, int i10, int i11) {
        super.e(i3, i9, z6, i10, i11);
        this.f26706q.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f26712w;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f26710u.getClass();
        this.f26711v.updateViewLayout(this, layoutParams);
    }

    @Override
    public final void f(int i3, int i9) {
        this.f26706q.getClass();
        l visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f25563c - visibleDisplayBounds.f25561a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f25564d - visibleDisplayBounds.f25562b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f26699C.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f26712w;
    }

    public final n getParentLayoutDirection() {
        return this.y;
    }

    public final p113n1.m m522getPopupContentSizebOM6tXw() {
        return (p113n1.m) this.f26714z.getValue();
    }

    public final E getPositionProvider() {
        return this.f26713x;
    }

    @Override
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.H;
    }

    public final String getTestTag() {
        return this.f26707r;
    }

    public View getViewRoot() {
        return null;
    }

    public final void i(AbstractC1709v abstractC1709v, p194x6.m mVar) {
        setParentCompositionContext(abstractC1709v);
        setContent(mVar);
        this.H = true;
    }

    public final void j(Function0 function0, F f9, String str, n nVar) {
        int i3;
        this.f26705p = function0;
        this.f26707r = str;
        if (!m.a(this.f26706q, f9)) {
            f9.getClass();
            WindowManager.LayoutParams layoutParams = this.f26712w;
            this.f26706q = f9;
            boolean zC = p.c(this.f26708s);
            boolean z6 = f9.f26716b;
            int i9 = f9.f26715a;
            if (z6 && zC) {
                i9 |= 8192;
            } else if (z6 && !zC) {
                i9 &= -8193;
            }
            layoutParams.flags = i9;
            this.f26710u.getClass();
            this.f26711v.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = nVar.ordinal();
        if (iOrdinal != 0) {
            i3 = 1;
            if (iOrdinal != 1) {
                throw new b();
            }
        } else {
            i3 = 0;
        }
        super.setLayoutDirection(i3);
    }

    public final void k() {
        InterfaceC0732v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.i()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jK = parentLayoutCoordinates.k();
            long jA = this.f26709t ? parentLayoutCoordinates.A(0L) : parentLayoutCoordinates.f(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jA >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jA & 4294967295L)))) & 4294967295L);
            int i3 = (int) (jRound >> 32);
            int i9 = (int) (jRound & 4294967295L);
            l lVar = new l(i3, i9, ((int) (jK >> 32)) + i3, ((int) (jK & 4294967295L)) + i9);
            if (lVar.equals(this.f26698B)) {
                return;
            }
            this.f26698B = lVar;
            m();
        }
    }

    public final void l(InterfaceC0732v interfaceC0732v) {
        setParentLayoutCoordinates(interfaceC0732v);
        k();
    }

    public final void m() {
        p113n1.m mVarM522getPopupContentSizebOM6tXw;
        l lVar = this.f26698B;
        if (lVar == null || (mVarM522getPopupContentSizebOM6tXw = m522getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        l visibleDisplayBounds = getVisibleDisplayBounds();
        long j = (((long) (visibleDisplayBounds.f25564d - visibleDisplayBounds.f25562b)) & 4294967295L) | (((long) (visibleDisplayBounds.f25563c - visibleDisplayBounds.f25561a)) << 32);
        z zVar = new z();
        zVar.f24556h = 0L;
        this.f26701E.d(this, C2681d.f26733n, new z(zVar, this, lVar, j, mVarM522getPopupContentSizebOM6tXw.f25565a));
        WindowManager.LayoutParams layoutParams = this.f26712w;
        long j9 = zVar.f24556h;
        layoutParams.x = (int) (j9 >> 32);
        layoutParams.y = (int) (j9 & 4294967295L);
        boolean z6 = this.f26706q.f26719e;
        D d4 = this.f26710u;
        if (z6) {
            d4.a(this, (int) (j >> 32), (int) (j & 4294967295L));
        }
        d4.getClass();
        this.f26711v.updateViewLayout(this, layoutParams);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26701E.e();
        if (!this.f26706q.f26717c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f26702F == null) {
            this.f26702F = new q(3, this.f26705p);
        }
        e.f(this, this.f26702F);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r rVar = this.f26701E;
        h hVar = rVar.f26020h;
        if (hVar != null) {
            hVar.a();
        }
        rVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            e.g(this, this.f26702F);
        }
        this.f26702F = null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26706q.f26718d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f26705p;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0 function1 = this.f26705p;
            if (function1 != null) {
                function1.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(n nVar) {
        this.y = nVar;
    }

    public final void m523setPopupContentSizefhxjrPA(p113n1.m mVar) {
        this.f26714z.setValue(mVar);
    }

    public final void setPositionProvider(E e6) {
        this.f26713x = e6;
    }

    public final void setTestTag(String str) {
        this.f26707r = str;
    }

    public static void getParams$ui$annotations() {
    }

    public AbstractC0813b getSubCompositionView() {
        return this;
    }

    @Override
    public void setLayoutDirection(int i3) {
    }
}
