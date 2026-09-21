package androidx.recyclerview.widget;

import U.C0948v;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends I {

    public final S2.a f17325A;

    public final int f17326B;

    public boolean f17327C;

    public boolean f17328D;

    public e0 f17329E;

    public final Rect f17330F;

    public final a0 f17331G;
    public final boolean H;

    public int[] f17332I;

    public final RunnableC1627i f17333J;

    public final int f17334o;

    public final f0[] f17335p;

    public final T1.g f17336q;

    public final T1.g f17337r;

    public final int f17338s;

    public int f17339t;

    public final C1635q f17340u;

    public boolean f17341v;

    public final BitSet f17343x;

    public boolean f17342w = false;
    public int y = -1;

    public int f17344z = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i9) {
        this.f17334o = -1;
        this.f17341v = false;
        S2.a aVar = new S2.a(14, false);
        this.f17325A = aVar;
        this.f17326B = 2;
        this.f17330F = new Rect();
        this.f17331G = new a0(this);
        this.H = true;
        this.f17333J = new RunnableC1627i(1, this);
        H hD = I.D(context, attributeSet, i3, i9);
        int i10 = hD.f17201a;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        b(null);
        if (i10 != this.f17338s) {
            this.f17338s = i10;
            T1.g gVar = this.f17336q;
            this.f17336q = this.f17337r;
            this.f17337r = gVar;
            h0();
        }
        int i11 = hD.f17202b;
        b(null);
        if (i11 != this.f17334o) {
            aVar.k();
            h0();
            this.f17334o = i11;
            this.f17343x = new BitSet(this.f17334o);
            this.f17335p = new f0[this.f17334o];
            for (int i12 = 0; i12 < this.f17334o; i12++) {
                this.f17335p[i12] = new f0(this, i12);
            }
            h0();
        }
        boolean z6 = hD.f17203c;
        b(null);
        e0 e0Var = this.f17329E;
        if (e0Var != null && e0Var.f17405o != z6) {
            e0Var.f17405o = z6;
        }
        this.f17341v = z6;
        h0();
        C1635q c1635q = new C1635q();
        c1635q.f17490a = true;
        c1635q.f17495f = 0;
        c1635q.g = 0;
        this.f17340u = c1635q;
        this.f17336q = T1.g.a(this, this.f17338s);
        this.f17337r = T1.g.a(this, 1 - this.f17338s);
    }

    public static int V0(int i3, int i9, int i10) {
        int mode;
        return (!(i9 == 0 && i10 == 0) && ((mode = View.MeasureSpec.getMode(i3)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - i9) - i10), mode) : i3;
    }

    public final void A0(O o8, T t9, boolean z6) {
        int iG;
        int iE0 = E0(Integer.MIN_VALUE);
        if (iE0 != Integer.MIN_VALUE && (iG = this.f17336q.g() - iE0) > 0) {
            int i3 = iG - (-R0(-iG, o8, t9));
            if (!z6 || i3 <= 0) {
                return;
            }
            this.f17336q.o(i3);
        }
    }

    public final void B0(O o8, T t9, boolean z6) {
        int iK;
        int iF0 = F0(Log.LOG_LEVEL_OFF);
        if (iF0 != Integer.MAX_VALUE && (iK = iF0 - this.f17336q.k()) > 0) {
            int iR0 = iK - R0(iK, o8, t9);
            if (!z6 || iR0 <= 0) {
                return;
            }
            this.f17336q.o(-iR0);
        }
    }

    public final int C0() {
        if (u() == 0) {
            return 0;
        }
        return I.C(t(0));
    }

    public final int D0() {
        int iU = u();
        if (iU == 0) {
            return 0;
        }
        return I.C(t(iU - 1));
    }

    public final int E0(int i3) {
        int iG = this.f17335p[0].g(i3);
        for (int i9 = 1; i9 < this.f17334o; i9++) {
            int iG2 = this.f17335p[i9].g(i3);
            if (iG2 > iG) {
                iG = iG2;
            }
        }
        return iG;
    }

    public final int F0(int i3) {
        int i9 = this.f17335p[0].i(i3);
        for (int i10 = 1; i10 < this.f17334o; i10++) {
            int i11 = this.f17335p[i10].i(i3);
            if (i11 < i9) {
                i9 = i11;
            }
        }
        return i9;
    }

    @Override
    public final boolean G() {
        return this.f17326B != 0;
    }

    public final void G0(int i3, int i9, int i10) {
        int i11;
        int i12;
        S2.a aVar;
        int[] iArr;
        int iD0;
        ArrayList arrayList;
        c0 c0Var;
        int size;
        int i13;
        int i14;
        int size2;
        int iD1 = this.f17342w ? D0() : C0();
        if (i10 == 8) {
            if (i3 < i9) {
                i11 = i9 + 1;
            } else {
                i11 = i3 + 1;
                i12 = i9;
            }
            aVar = this.f17325A;
            iArr = (int[]) aVar.f9211i;
            if (iArr != null && i12 < iArr.length) {
                arrayList = (ArrayList) aVar.j;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                c0Var = null;
                                break;
                            }
                            c0Var = (c0) ((ArrayList) aVar.j).get(size2);
                            if (c0Var.f17384h == i12) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        c0Var = null;
                        break;
                    }
                    if (c0Var != null) {
                        ((ArrayList) aVar.j).remove(c0Var);
                    }
                    size = ((ArrayList) aVar.j).size();
                    i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            i13 = -1;
                            break;
                        } else if (((c0) ((ArrayList) aVar.j).get(i13)).f17384h >= i12) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 != -1) {
                        c0 c0Var2 = (c0) ((ArrayList) aVar.j).get(i13);
                        ((ArrayList) aVar.j).remove(i13);
                        i14 = c0Var2.f17384h;
                    } else {
                        i14 = -1;
                    }
                } else {
                    i14 = -1;
                }
                if (i14 == -1) {
                    int[] iArr2 = (int[]) aVar.f9211i;
                    Arrays.fill(iArr2, i12, iArr2.length, -1);
                    int length = ((int[]) aVar.f9211i).length;
                } else {
                    Arrays.fill((int[]) aVar.f9211i, i12, Math.min(i14 + 1, ((int[]) aVar.f9211i).length), -1);
                }
            }
            if (i10 != 1) {
                aVar.G(i3, i9);
            } else if (i10 != 2) {
                aVar.H(i3, i9);
            } else if (i10 == 8) {
                aVar.H(i3, 1);
                aVar.G(i9, 1);
            }
            if (i11 <= iD1) {
                return;
            }
            if (this.f17342w) {
                iD0 = C0();
            } else {
                iD0 = D0();
            }
            if (i12 <= iD0) {
                h0();
            }
        }
        i11 = i3 + i9;
        i12 = i3;
        aVar = this.f17325A;
        iArr = (int[]) aVar.f9211i;
        if (iArr != null) {
            arrayList = (ArrayList) aVar.j;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            c0Var = null;
                            break;
                        }
                        c0Var = (c0) ((ArrayList) aVar.j).get(size2);
                        if (c0Var.f17384h == i12) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    c0Var = null;
                    break;
                }
                if (c0Var != null) {
                    ((ArrayList) aVar.j).remove(c0Var);
                }
                size = ((ArrayList) aVar.j).size();
                i13 = 0;
                while (true) {
                    if (i13 < size) {
                        i13 = -1;
                        break;
                    } else {
                        if (((c0) ((ArrayList) aVar.j).get(i13)).f17384h >= i12) {
                            break;
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 != -1) {
                    c0 c0Var3 = (c0) ((ArrayList) aVar.j).get(i13);
                    ((ArrayList) aVar.j).remove(i13);
                    i14 = c0Var3.f17384h;
                } else {
                    i14 = -1;
                }
            } else {
                i14 = -1;
            }
            if (i14 == -1) {
                int[] iArr3 = (int[]) aVar.f9211i;
                Arrays.fill(iArr3, i12, iArr3.length, -1);
                int length2 = ((int[]) aVar.f9211i).length;
            } else {
                Arrays.fill((int[]) aVar.f9211i, i12, Math.min(i14 + 1, ((int[]) aVar.f9211i).length), -1);
            }
        }
        if (i10 != 1) {
            aVar.G(i3, i9);
        } else if (i10 != 2) {
            aVar.H(i3, i9);
        } else if (i10 == 8) {
            aVar.H(i3, 1);
            aVar.G(i9, 1);
        }
        if (i11 <= iD1) {
            return;
        }
        if (this.f17342w) {
            iD0 = C0();
        } else {
            iD0 = D0();
        }
        if (i12 <= iD0) {
            h0();
        }
    }

    public final View H0() {
        boolean z6;
        boolean z9;
        int iU = u();
        int i3 = iU - 1;
        BitSet bitSet = new BitSet(this.f17334o);
        bitSet.set(0, this.f17334o, true);
        byte b9 = (this.f17338s == 1 && I0()) ? (byte) 1 : (byte) -1;
        if (this.f17342w) {
            iU = -1;
        } else {
            i3 = 0;
        }
        int i9 = i3 < iU ? 1 : -1;
        while (i3 != iU) {
            View viewT = t(i3);
            b0 b0Var = (b0) viewT.getLayoutParams();
            if (bitSet.get(b0Var.f17378e.f17418e)) {
                f0 f0Var = b0Var.f17378e;
                if (this.f17342w) {
                    int i10 = f0Var.f17416c;
                    if (i10 == Integer.MIN_VALUE) {
                        f0Var.a();
                        i10 = f0Var.f17416c;
                    }
                    if (i10 < this.f17336q.g()) {
                        ((b0) ((View) M0.j(1, (ArrayList) f0Var.f17419f)).getLayoutParams()).getClass();
                        return viewT;
                    }
                } else {
                    int i11 = f0Var.f17415b;
                    if (i11 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) f0Var.f17419f).get(0);
                        b0 b0Var2 = (b0) view.getLayoutParams();
                        f0Var.f17415b = ((StaggeredGridLayoutManager) f0Var.g).f17336q.e(view);
                        b0Var2.getClass();
                        i11 = f0Var.f17415b;
                    }
                    if (i11 > this.f17336q.k()) {
                        ((b0) ((View) ((ArrayList) f0Var.f17419f).get(0)).getLayoutParams()).getClass();
                        return viewT;
                    }
                }
                bitSet.clear(b0Var.f17378e.f17418e);
            }
            i3 += i9;
            if (i3 != iU) {
                View viewT2 = t(i3);
                if (this.f17342w) {
                    int iB = this.f17336q.b(viewT);
                    int iB2 = this.f17336q.b(viewT2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (b0Var.f17378e.f17418e - ((b0) viewT2.getLayoutParams()).f17378e.f17418e < 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (b9 < 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z6 != z9) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewT;
                }
                int iE = this.f17336q.e(viewT);
                int iE2 = this.f17336q.e(viewT2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (b0Var.f17378e.f17418e - ((b0) viewT2.getLayoutParams()).f17378e.f17418e < 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (b9 < 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z6 != z9) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewT;
            }
        }
        return null;
    }

    public final boolean I0() {
        RecyclerView recyclerView = this.f17206b;
        WeakHashMap weakHashMap = D1.U.f1980a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override
    public final void J(int i3) {
        super.J(i3);
        for (int i9 = 0; i9 < this.f17334o; i9++) {
            f0 f0Var = this.f17335p[i9];
            int i10 = f0Var.f17415b;
            if (i10 != Integer.MIN_VALUE) {
                f0Var.f17415b = i10 + i3;
            }
            int i11 = f0Var.f17416c;
            if (i11 != Integer.MIN_VALUE) {
                f0Var.f17416c = i11 + i3;
            }
        }
    }

    public final void J0(View view, int i3, int i9) {
        RecyclerView recyclerView = this.f17206b;
        Rect rect = this.f17330F;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.H(view));
        }
        b0 b0Var = (b0) view.getLayoutParams();
        int iV0 = V0(i3, ((ViewGroup.MarginLayoutParams) b0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) b0Var).rightMargin + rect.right);
        int iV1 = V0(i9, ((ViewGroup.MarginLayoutParams) b0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) b0Var).bottomMargin + rect.bottom);
        if (p0(view, iV0, iV1, b0Var)) {
            view.measure(iV0, iV1);
        }
    }

    @Override
    public final void K(int i3) {
        super.K(i3);
        for (int i9 = 0; i9 < this.f17334o; i9++) {
            f0 f0Var = this.f17335p[i9];
            int i10 = f0Var.f17415b;
            if (i10 != Integer.MIN_VALUE) {
                f0Var.f17415b = i10 + i3;
            }
            int i11 = f0Var.f17416c;
            if (i11 != Integer.MIN_VALUE) {
                f0Var.f17416c = i11 + i3;
            }
        }
    }

    public final void K0(O o8, T t9, boolean z6) {
        boolean z9;
        e0 e0Var;
        int iU;
        int i3;
        int iC;
        int iC2;
        int iU2;
        int i9;
        boolean z10;
        e0 e0Var2 = this.f17329E;
        a0 a0Var = this.f17331G;
        if (!(e0Var2 == null && this.y == -1) && t9.b() == 0) {
            c0(o8);
            a0Var.a();
            return;
        }
        boolean z11 = (a0Var.f17374e && this.y == -1 && this.f17329E == null) ? false : true;
        S2.a aVar = this.f17325A;
        StaggeredGridLayoutManager staggeredGridLayoutManager = a0Var.g;
        if (z11) {
            a0Var.a();
            e0 e0Var3 = this.f17329E;
            if (e0Var3 != null) {
                int i10 = e0Var3.j;
                if (i10 > 0) {
                    if (i10 == this.f17334o) {
                        for (int i11 = 0; i11 < this.f17334o; i11++) {
                            this.f17335p[i11].b();
                            e0 e0Var4 = this.f17329E;
                            int iG = e0Var4.f17401k[i11];
                            if (iG != Integer.MIN_VALUE) {
                                iG += e0Var4.f17406p ? this.f17336q.g() : this.f17336q.k();
                            }
                            f0 f0Var = this.f17335p[i11];
                            f0Var.f17415b = iG;
                            f0Var.f17416c = iG;
                        }
                    } else {
                        e0Var3.f17401k = null;
                        e0Var3.j = 0;
                        e0Var3.f17402l = 0;
                        e0Var3.f17403m = null;
                        e0Var3.f17404n = null;
                        e0Var3.f17399h = e0Var3.f17400i;
                    }
                }
                e0 e0Var5 = this.f17329E;
                this.f17328D = e0Var5.f17407q;
                boolean z12 = e0Var5.f17405o;
                b(null);
                e0 e0Var6 = this.f17329E;
                if (e0Var6 != null && e0Var6.f17405o != z12) {
                    e0Var6.f17405o = z12;
                }
                this.f17341v = z12;
                h0();
                Q0();
                e0 e0Var7 = this.f17329E;
                int i12 = e0Var7.f17399h;
                if (i12 != -1) {
                    this.y = i12;
                    a0Var.f17372c = e0Var7.f17406p;
                } else {
                    a0Var.f17372c = this.f17342w;
                }
                if (e0Var7.f17402l > 1) {
                    aVar.f9211i = e0Var7.f17403m;
                    aVar.j = e0Var7.f17404n;
                }
            } else {
                Q0();
                a0Var.f17372c = this.f17342w;
            }
            if (t9.f17350f || (i9 = this.y) == -1) {
                if (this.f17327C) {
                    int iB = t9.b();
                    iU2 = u() - 1;
                    while (true) {
                        if (iU2 < 0) {
                            iC2 = 0;
                            break;
                        }
                        iC2 = I.C(t(iU2));
                        if (iC2 < 0 && iC2 < iB) {
                            break;
                        } else {
                            iU2--;
                        }
                    }
                } else {
                    int iB2 = t9.b();
                    iU = u();
                    i3 = 0;
                    while (true) {
                        if (i3 >= iU) {
                            iC2 = 0;
                            break;
                        }
                        iC = I.C(t(i3));
                        if (iC < 0 && iC < iB2) {
                            iC2 = iC;
                            break;
                        }
                        i3++;
                    }
                }
                a0Var.f17370a = iC2;
                a0Var.f17371b = Integer.MIN_VALUE;
            } else if (i9 < 0 || i9 >= t9.b()) {
                this.y = -1;
                this.f17344z = Integer.MIN_VALUE;
                if (this.f17327C) {
                    int iB3 = t9.b();
                    iU2 = u() - 1;
                    while (true) {
                        if (iU2 < 0) {
                            iC2 = 0;
                            break;
                        } else {
                            iC2 = I.C(t(iU2));
                            if (iC2 < 0) {
                            }
                            iU2--;
                        }
                    }
                } else {
                    int iB4 = t9.b();
                    iU = u();
                    i3 = 0;
                    while (true) {
                        if (i3 >= iU) {
                            iC2 = 0;
                            break;
                        } else {
                            iC = I.C(t(i3));
                            if (iC < 0) {
                            }
                            i3++;
                        }
                    }
                }
                a0Var.f17370a = iC2;
                a0Var.f17371b = Integer.MIN_VALUE;
            } else {
                e0 e0Var8 = this.f17329E;
                if (e0Var8 == null || e0Var8.f17399h == -1 || e0Var8.j < 1) {
                    View viewP = p(this.y);
                    if (viewP != null) {
                        a0Var.f17370a = this.f17342w ? D0() : C0();
                        if (this.f17344z != Integer.MIN_VALUE) {
                            if (a0Var.f17372c) {
                                a0Var.f17371b = (this.f17336q.g() - this.f17344z) - this.f17336q.b(viewP);
                            } else {
                                a0Var.f17371b = (this.f17336q.k() + this.f17344z) - this.f17336q.e(viewP);
                            }
                        } else if (this.f17336q.c(viewP) > this.f17336q.l()) {
                            a0Var.f17371b = a0Var.f17372c ? this.f17336q.g() : this.f17336q.k();
                        } else {
                            int iE = this.f17336q.e(viewP) - this.f17336q.k();
                            if (iE < 0) {
                                a0Var.f17371b = -iE;
                            } else {
                                int iG2 = this.f17336q.g() - this.f17336q.b(viewP);
                                if (iG2 < 0) {
                                    a0Var.f17371b = iG2;
                                } else {
                                    a0Var.f17371b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i13 = this.y;
                        a0Var.f17370a = i13;
                        int i14 = this.f17344z;
                        if (i14 == Integer.MIN_VALUE) {
                            if (u() != 0) {
                                if ((i13 < C0()) != this.f17342w) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                            } else if (this.f17342w) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            a0Var.f17372c = z10;
                            a0Var.f17371b = z10 ? staggeredGridLayoutManager.f17336q.g() : staggeredGridLayoutManager.f17336q.k();
                        } else if (a0Var.f17372c) {
                            a0Var.f17371b = staggeredGridLayoutManager.f17336q.g() - i14;
                        } else {
                            a0Var.f17371b = staggeredGridLayoutManager.f17336q.k() + i14;
                        }
                        a0Var.f17373d = true;
                    }
                } else {
                    a0Var.f17371b = Integer.MIN_VALUE;
                    a0Var.f17370a = this.y;
                }
            }
            a0Var.f17374e = true;
        }
        if (this.f17329E == null && this.y == -1 && (a0Var.f17372c != this.f17327C || I0() != this.f17328D)) {
            aVar.k();
            a0Var.f17373d = true;
        }
        if (u() > 0 && ((e0Var = this.f17329E) == null || e0Var.j < 1)) {
            if (a0Var.f17373d) {
                for (int i15 = 0; i15 < this.f17334o; i15++) {
                    this.f17335p[i15].b();
                    int i16 = a0Var.f17371b;
                    if (i16 != Integer.MIN_VALUE) {
                        f0 f0Var2 = this.f17335p[i15];
                        f0Var2.f17415b = i16;
                        f0Var2.f17416c = i16;
                    }
                }
            } else if (z11 || a0Var.f17375f == null) {
                for (int i17 = 0; i17 < this.f17334o; i17++) {
                    f0 f0Var3 = this.f17335p[i17];
                    boolean z13 = this.f17342w;
                    int i18 = a0Var.f17371b;
                    int iG3 = z13 ? f0Var3.g(Integer.MIN_VALUE) : f0Var3.i(Integer.MIN_VALUE);
                    f0Var3.b();
                    if (iG3 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) f0Var3.g;
                        if ((!z13 || iG3 >= staggeredGridLayoutManager2.f17336q.g()) && (z13 || iG3 <= staggeredGridLayoutManager2.f17336q.k())) {
                            if (i18 != Integer.MIN_VALUE) {
                                iG3 += i18;
                            }
                            f0Var3.f17416c = iG3;
                            f0Var3.f17415b = iG3;
                        }
                    }
                }
                f0[] f0VarArr = this.f17335p;
                int length = f0VarArr.length;
                int[] iArr = a0Var.f17375f;
                if (iArr == null || iArr.length < length) {
                    a0Var.f17375f = new int[staggeredGridLayoutManager.f17335p.length];
                }
                for (int i19 = 0; i19 < length; i19++) {
                    a0Var.f17375f[i19] = f0VarArr[i19].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i20 = 0; i20 < this.f17334o; i20++) {
                    f0 f0Var4 = this.f17335p[i20];
                    f0Var4.b();
                    int i21 = a0Var.f17375f[i20];
                    f0Var4.f17415b = i21;
                    f0Var4.f17416c = i21;
                }
            }
        }
        o(o8);
        C1635q c1635q = this.f17340u;
        c1635q.f17490a = false;
        int iL = this.f17337r.l();
        this.f17339t = iL / this.f17334o;
        View.MeasureSpec.makeMeasureSpec(iL, this.f17337r.i());
        T0(a0Var.f17370a);
        if (a0Var.f17372c) {
            S0(-1);
            x0(o8, c1635q, t9);
            S0(1);
            c1635q.f17492c = a0Var.f17370a + c1635q.f17493d;
            x0(o8, c1635q, t9);
        } else {
            S0(1);
            x0(o8, c1635q, t9);
            S0(-1);
            c1635q.f17492c = a0Var.f17370a + c1635q.f17493d;
            x0(o8, c1635q, t9);
        }
        if (this.f17337r.i() != 1073741824) {
            int iU3 = u();
            float fMax = 0.0f;
            for (int i22 = 0; i22 < iU3; i22++) {
                View viewT = t(i22);
                float fC = this.f17337r.c(viewT);
                if (fC >= fMax) {
                    ((b0) viewT.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i23 = this.f17339t;
            int iRound = Math.round(fMax * this.f17334o);
            if (this.f17337r.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f17337r.l());
            }
            this.f17339t = iRound / this.f17334o;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f17337r.i());
            if (this.f17339t != i23) {
                for (int i24 = 0; i24 < iU3; i24++) {
                    View viewT2 = t(i24);
                    b0 b0Var = (b0) viewT2.getLayoutParams();
                    b0Var.getClass();
                    if (I0() && this.f17338s == 1) {
                        int i25 = -((this.f17334o - 1) - b0Var.f17378e.f17418e);
                        viewT2.offsetLeftAndRight((this.f17339t * i25) - (i25 * i23));
                    } else {
                        int i26 = b0Var.f17378e.f17418e;
                        int i27 = this.f17339t * i26;
                        int i28 = i26 * i23;
                        if (this.f17338s == 1) {
                            viewT2.offsetLeftAndRight(i27 - i28);
                        } else {
                            viewT2.offsetTopAndBottom(i27 - i28);
                        }
                    }
                }
            }
        }
        if (u() > 0) {
            if (this.f17342w) {
                A0(o8, t9, true);
                B0(o8, t9, false);
            } else {
                B0(o8, t9, true);
                A0(o8, t9, false);
            }
        }
        if (z6 && !t9.f17350f && this.f17326B != 0 && u() > 0 && H0() != null) {
            RecyclerView recyclerView = this.f17206b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f17333J);
            }
            z9 = t0();
        }
        if (t9.f17350f) {
            a0Var.a();
        }
        this.f17327C = a0Var.f17372c;
        this.f17328D = I0();
        if (z9) {
            a0Var.a();
            K0(o8, t9, false);
        }
    }

    @Override
    public final void L() {
        this.f17325A.k();
        for (int i3 = 0; i3 < this.f17334o; i3++) {
            this.f17335p[i3].b();
        }
    }

    public final boolean L0(int i3) {
        if (this.f17338s == 0) {
            return (i3 == -1) != this.f17342w;
        }
        return ((i3 == -1) == this.f17342w) == I0();
    }

    @Override
    public final void M(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f17206b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f17333J);
        }
        for (int i3 = 0; i3 < this.f17334o; i3++) {
            this.f17335p[i3].b();
        }
        recyclerView.requestLayout();
    }

    public final void M0(int i3) {
        int iC0;
        int i9;
        if (i3 > 0) {
            iC0 = D0();
            i9 = 1;
        } else {
            iC0 = C0();
            i9 = -1;
        }
        C1635q c1635q = this.f17340u;
        c1635q.f17490a = true;
        T0(iC0);
        S0(i9);
        c1635q.f17492c = iC0 + c1635q.f17493d;
        c1635q.f17491b = Math.abs(i3);
    }

    @Override
    public final View N(View view, int i3, O o8, T t9) {
        View viewY;
        int i9;
        if (u() != 0) {
            RecyclerView recyclerView = this.f17206b;
            if (recyclerView == null || (viewY = recyclerView.y(view)) == null || ((ArrayList) this.f17205a.f15618k).contains(viewY)) {
                viewY = null;
            }
            if (viewY != null) {
                Q0();
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 17) {
                            if (i3 != 33) {
                                if (i3 == 66 ? this.f17338s == 0 : !(i3 != 130 || this.f17338s != 1)) {
                                    i9 = 1;
                                }
                            } else if (this.f17338s == 1) {
                                i9 = -1;
                            }
                            i9 = Integer.MIN_VALUE;
                        } else if (this.f17338s == 0) {
                            i9 = -1;
                        } else {
                            i9 = Integer.MIN_VALUE;
                        }
                    } else if (this.f17338s != 1 && I0()) {
                        i9 = -1;
                    } else {
                        i9 = 1;
                    }
                } else if (this.f17338s != 1 && I0()) {
                    i9 = 1;
                } else {
                    i9 = -1;
                }
                if (i9 != Integer.MIN_VALUE) {
                    b0 b0Var = (b0) viewY.getLayoutParams();
                    b0Var.getClass();
                    f0 f0Var = b0Var.f17378e;
                    int iD0 = i9 == 1 ? D0() : C0();
                    T0(iD0);
                    S0(i9);
                    C1635q c1635q = this.f17340u;
                    c1635q.f17492c = c1635q.f17493d + iD0;
                    c1635q.f17491b = (int) (this.f17336q.l() * 0.33333334f);
                    c1635q.f17496h = true;
                    c1635q.f17490a = false;
                    x0(o8, c1635q, t9);
                    this.f17327C = this.f17342w;
                    View viewH = f0Var.h(iD0, i9);
                    if (viewH != null && viewH != viewY) {
                        return viewH;
                    }
                    if (L0(i9)) {
                        for (int i10 = this.f17334o - 1; i10 >= 0; i10--) {
                            View viewH2 = this.f17335p[i10].h(iD0, i9);
                            if (viewH2 != null && viewH2 != viewY) {
                                return viewH2;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < this.f17334o; i11++) {
                            View viewH3 = this.f17335p[i11].h(iD0, i9);
                            if (viewH3 != null && viewH3 != viewY) {
                                return viewH3;
                            }
                        }
                    }
                    boolean z6 = (this.f17341v ^ true) == (i9 == -1);
                    View viewP = p(z6 ? f0Var.c() : f0Var.d());
                    if (viewP != null && viewP != viewY) {
                        return viewP;
                    }
                    if (L0(i9)) {
                        for (int i12 = this.f17334o - 1; i12 >= 0; i12--) {
                            if (i12 != f0Var.f17418e) {
                                View viewP2 = p(z6 ? this.f17335p[i12].c() : this.f17335p[i12].d());
                                if (viewP2 != null && viewP2 != viewY) {
                                    return viewP2;
                                }
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f17334o; i13++) {
                            View viewP3 = p(z6 ? this.f17335p[i13].c() : this.f17335p[i13].d());
                            if (viewP3 != null && viewP3 != viewY) {
                                return viewP3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void N0(O o8, C1635q c1635q) {
        int iMin;
        if (!c1635q.f17490a || c1635q.f17497i) {
            return;
        }
        if (c1635q.f17491b == 0) {
            if (c1635q.f17494e == -1) {
                O0(o8, c1635q.g);
                return;
            } else {
                P0(o8, c1635q.f17495f);
                return;
            }
        }
        int i3 = 1;
        if (c1635q.f17494e == -1) {
            int i9 = c1635q.f17495f;
            int i10 = this.f17335p[0].i(i9);
            while (i3 < this.f17334o) {
                int i11 = this.f17335p[i3].i(i9);
                if (i11 > i10) {
                    i10 = i11;
                }
                i3++;
            }
            int i12 = i9 - i10;
            O0(o8, i12 < 0 ? c1635q.g : c1635q.g - Math.min(i12, c1635q.f17491b));
            return;
        }
        int i13 = c1635q.g;
        int iG = this.f17335p[0].g(i13);
        while (i3 < this.f17334o) {
            int iG2 = this.f17335p[i3].g(i13);
            if (iG2 < iG) {
                iG = iG2;
            }
            i3++;
        }
        int i14 = iG - c1635q.g;
        if (i14 < 0) {
            iMin = c1635q.f17495f;
        } else {
            iMin = Math.min(i14, c1635q.f17491b) + c1635q.f17495f;
        }
        P0(o8, iMin);
    }

    @Override
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (u() > 0) {
            View viewZ0 = z0(false);
            View viewY0 = y0(false);
            if (viewZ0 == null || viewY0 == null) {
                return;
            }
            int iC = I.C(viewZ0);
            int iC2 = I.C(viewY0);
            if (iC < iC2) {
                accessibilityEvent.setFromIndex(iC);
                accessibilityEvent.setToIndex(iC2);
            } else {
                accessibilityEvent.setFromIndex(iC2);
                accessibilityEvent.setToIndex(iC);
            }
        }
    }

    public final void O0(O o8, int i3) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            if (this.f17336q.e(viewT) < i3 || this.f17336q.n(viewT) < i3) {
                return;
            }
            b0 b0Var = (b0) viewT.getLayoutParams();
            b0Var.getClass();
            if (((ArrayList) b0Var.f17378e.f17419f).size() == 1) {
                return;
            }
            f0 f0Var = b0Var.f17378e;
            ArrayList arrayList = (ArrayList) f0Var.f17419f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            b0 b0Var2 = (b0) view.getLayoutParams();
            b0Var2.f17378e = null;
            if (b0Var2.f17217a.isRemoved() || b0Var2.f17217a.isUpdated()) {
                f0Var.f17417d -= ((StaggeredGridLayoutManager) f0Var.g).f17336q.c(view);
            }
            if (size == 1) {
                f0Var.f17415b = Integer.MIN_VALUE;
            }
            f0Var.f17416c = Integer.MIN_VALUE;
            e0(viewT, o8);
        }
    }

    public final void P0(O o8, int i3) {
        while (u() > 0) {
            View viewT = t(0);
            if (this.f17336q.b(viewT) > i3 || this.f17336q.m(viewT) > i3) {
                return;
            }
            b0 b0Var = (b0) viewT.getLayoutParams();
            b0Var.getClass();
            if (((ArrayList) b0Var.f17378e.f17419f).size() == 1) {
                return;
            }
            f0 f0Var = b0Var.f17378e;
            ArrayList arrayList = (ArrayList) f0Var.f17419f;
            View view = (View) arrayList.remove(0);
            b0 b0Var2 = (b0) view.getLayoutParams();
            b0Var2.f17378e = null;
            if (arrayList.size() == 0) {
                f0Var.f17416c = Integer.MIN_VALUE;
            }
            if (b0Var2.f17217a.isRemoved() || b0Var2.f17217a.isUpdated()) {
                f0Var.f17417d -= ((StaggeredGridLayoutManager) f0Var.g).f17336q.c(view);
            }
            f0Var.f17415b = Integer.MIN_VALUE;
            e0(viewT, o8);
        }
    }

    public final void Q0() {
        if (this.f17338s == 1 || !I0()) {
            this.f17342w = this.f17341v;
        } else {
            this.f17342w = !this.f17341v;
        }
    }

    public final int R0(int i3, O o8, T t9) {
        if (u() == 0 || i3 == 0) {
            return 0;
        }
        M0(i3);
        C1635q c1635q = this.f17340u;
        int iX0 = x0(o8, c1635q, t9);
        if (c1635q.f17491b >= iX0) {
            i3 = i3 < 0 ? -iX0 : iX0;
        }
        this.f17336q.o(-i3);
        this.f17327C = this.f17342w;
        c1635q.f17491b = 0;
        N0(o8, c1635q);
        return i3;
    }

    @Override
    public final void S(int i3, int i9) {
        G0(i3, i9, 1);
    }

    public final void S0(int i3) {
        C1635q c1635q = this.f17340u;
        c1635q.f17494e = i3;
        c1635q.f17493d = this.f17342w != (i3 == -1) ? -1 : 1;
    }

    @Override
    public final void T() {
        this.f17325A.k();
        h0();
    }

    public final void T0(int i3) {
        C1635q c1635q = this.f17340u;
        boolean z6 = false;
        c1635q.f17491b = 0;
        c1635q.f17492c = i3;
        RecyclerView recyclerView = this.f17206b;
        if (recyclerView == null || !recyclerView.f17302o) {
            c1635q.g = this.f17336q.f();
            c1635q.f17495f = 0;
        } else {
            c1635q.f17495f = this.f17336q.k();
            c1635q.g = this.f17336q.g();
        }
        c1635q.f17496h = false;
        c1635q.f17490a = true;
        if (this.f17336q.i() == 0 && this.f17336q.f() == 0) {
            z6 = true;
        }
        c1635q.f17497i = z6;
    }

    @Override
    public final void U(int i3, int i9) {
        G0(i3, i9, 8);
    }

    public final void U0(f0 f0Var, int i3, int i9) {
        int i10 = f0Var.f17417d;
        int i11 = f0Var.f17418e;
        if (i3 != -1) {
            int i12 = f0Var.f17416c;
            if (i12 == Integer.MIN_VALUE) {
                f0Var.a();
                i12 = f0Var.f17416c;
            }
            if (i12 - i10 >= i9) {
                this.f17343x.set(i11, false);
                return;
            }
            return;
        }
        int i13 = f0Var.f17415b;
        if (i13 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) f0Var.f17419f).get(0);
            b0 b0Var = (b0) view.getLayoutParams();
            f0Var.f17415b = ((StaggeredGridLayoutManager) f0Var.g).f17336q.e(view);
            b0Var.getClass();
            i13 = f0Var.f17415b;
        }
        if (i13 + i10 <= i9) {
            this.f17343x.set(i11, false);
        }
    }

    @Override
    public final void V(int i3, int i9) {
        G0(i3, i9, 2);
    }

    @Override
    public final void W(int i3, int i9) {
        G0(i3, i9, 4);
    }

    @Override
    public final void X(O o8, T t9) {
        K0(o8, t9, true);
    }

    @Override
    public final void Y(T t9) {
        this.y = -1;
        this.f17344z = Integer.MIN_VALUE;
        this.f17329E = null;
        this.f17331G.a();
    }

    @Override
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof e0) {
            e0 e0Var = (e0) parcelable;
            this.f17329E = e0Var;
            if (this.y != -1) {
                e0Var.f17399h = -1;
                e0Var.f17400i = -1;
                e0Var.f17401k = null;
                e0Var.j = 0;
                e0Var.f17402l = 0;
                e0Var.f17403m = null;
                e0Var.f17404n = null;
            }
            h0();
        }
    }

    @Override
    public final Parcelable a0() {
        int i3;
        int iK;
        int[] iArr;
        e0 e0Var = this.f17329E;
        if (e0Var != null) {
            e0 e0Var2 = new e0();
            e0Var2.j = e0Var.j;
            e0Var2.f17399h = e0Var.f17399h;
            e0Var2.f17400i = e0Var.f17400i;
            e0Var2.f17401k = e0Var.f17401k;
            e0Var2.f17402l = e0Var.f17402l;
            e0Var2.f17403m = e0Var.f17403m;
            e0Var2.f17405o = e0Var.f17405o;
            e0Var2.f17406p = e0Var.f17406p;
            e0Var2.f17407q = e0Var.f17407q;
            e0Var2.f17404n = e0Var.f17404n;
            return e0Var2;
        }
        e0 e0Var3 = new e0();
        e0Var3.f17405o = this.f17341v;
        e0Var3.f17406p = this.f17327C;
        e0Var3.f17407q = this.f17328D;
        S2.a aVar = this.f17325A;
        if (aVar == null || (iArr = (int[]) aVar.f9211i) == null) {
            e0Var3.f17402l = 0;
        } else {
            e0Var3.f17403m = iArr;
            e0Var3.f17402l = iArr.length;
            e0Var3.f17404n = (ArrayList) aVar.j;
        }
        if (u() <= 0) {
            e0Var3.f17399h = -1;
            e0Var3.f17400i = -1;
            e0Var3.j = 0;
            return e0Var3;
        }
        e0Var3.f17399h = this.f17327C ? D0() : C0();
        View viewY0 = this.f17342w ? y0(true) : z0(true);
        e0Var3.f17400i = viewY0 != null ? I.C(viewY0) : -1;
        int i9 = this.f17334o;
        e0Var3.j = i9;
        e0Var3.f17401k = new int[i9];
        for (int i10 = 0; i10 < this.f17334o; i10++) {
            if (this.f17327C) {
                i3 = this.f17335p[i10].g(Integer.MIN_VALUE);
                if (i3 != Integer.MIN_VALUE) {
                    iK = this.f17336q.g();
                    i3 -= iK;
                }
            } else {
                i3 = this.f17335p[i10].i(Integer.MIN_VALUE);
                if (i3 != Integer.MIN_VALUE) {
                    iK = this.f17336q.k();
                    i3 -= iK;
                }
            }
            e0Var3.f17401k[i10] = i3;
        }
        return e0Var3;
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.f17329E != null || (recyclerView = this.f17206b) == null) {
            return;
        }
        recyclerView.f(str);
    }

    @Override
    public final void b0(int i3) {
        if (i3 == 0) {
            t0();
        }
    }

    @Override
    public final boolean c() {
        return this.f17338s == 0;
    }

    @Override
    public final boolean d() {
        return this.f17338s == 1;
    }

    @Override
    public final boolean e(J j) {
        return j instanceof b0;
    }

    @Override
    public final void g(int i3, int i9, T t9, C0948v c0948v) {
        C1635q c1635q;
        int iG;
        int i10;
        if (this.f17338s != 0) {
            i3 = i9;
        }
        if (u() == 0 || i3 == 0) {
            return;
        }
        M0(i3);
        int[] iArr = this.f17332I;
        if (iArr == null || iArr.length < this.f17334o) {
            this.f17332I = new int[this.f17334o];
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f17334o;
            c1635q = this.f17340u;
            if (i11 >= i13) {
                break;
            }
            if (c1635q.f17493d == -1) {
                iG = c1635q.f17495f;
                i10 = this.f17335p[i11].i(iG);
            } else {
                iG = this.f17335p[i11].g(c1635q.g);
                i10 = c1635q.g;
            }
            int i14 = iG - i10;
            if (i14 >= 0) {
                this.f17332I[i12] = i14;
                i12++;
            }
            i11++;
        }
        Arrays.sort(this.f17332I, 0, i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = c1635q.f17492c;
            if (i16 < 0 || i16 >= t9.b()) {
                return;
            }
            c0948v.a(c1635q.f17492c, this.f17332I[i15]);
            c1635q.f17492c += c1635q.f17493d;
        }
    }

    @Override
    public final int i(T t9) {
        return u0(t9);
    }

    @Override
    public final int i0(int i3, O o8, T t9) {
        return R0(i3, o8, t9);
    }

    @Override
    public final int j(T t9) {
        return v0(t9);
    }

    @Override
    public final int j0(int i3, O o8, T t9) {
        return R0(i3, o8, t9);
    }

    @Override
    public final int k(T t9) {
        return w0(t9);
    }

    @Override
    public final int l(T t9) {
        return u0(t9);
    }

    @Override
    public final int m(T t9) {
        return v0(t9);
    }

    @Override
    public final void m0(Rect rect, int i3, int i9) {
        int iF;
        int iF2;
        int i10 = this.f17334o;
        int iA = A() + z();
        int iY = y() + B();
        if (this.f17338s == 1) {
            int iHeight = rect.height() + iY;
            RecyclerView recyclerView = this.f17206b;
            WeakHashMap weakHashMap = D1.U.f1980a;
            iF2 = I.f(i9, iHeight, recyclerView.getMinimumHeight());
            iF = I.f(i3, (this.f17339t * i10) + iA, this.f17206b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iA;
            RecyclerView recyclerView2 = this.f17206b;
            WeakHashMap weakHashMap2 = D1.U.f1980a;
            iF = I.f(i3, iWidth, recyclerView2.getMinimumWidth());
            iF2 = I.f(i9, (this.f17339t * i10) + iY, this.f17206b.getMinimumHeight());
        }
        this.f17206b.setMeasuredDimension(iF, iF2);
    }

    @Override
    public final int n(T t9) {
        return w0(t9);
    }

    @Override
    public final J q() {
        return this.f17338s == 0 ? new b0(-2, -1) : new b0(-1, -2);
    }

    @Override
    public final J r(Context context, AttributeSet attributeSet) {
        return new b0(context, attributeSet);
    }

    @Override
    public final J s(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b0((ViewGroup.MarginLayoutParams) layoutParams) : new b0(layoutParams);
    }

    @Override
    public final boolean s0() {
        return this.f17329E == null;
    }

    public final boolean t0() {
        int iC0;
        if (u() != 0 && this.f17326B != 0 && this.f17210f) {
            if (this.f17342w) {
                iC0 = D0();
                C0();
            } else {
                iC0 = C0();
                D0();
            }
            S2.a aVar = this.f17325A;
            if (iC0 == 0 && H0() != null) {
                aVar.k();
                this.f17209e = true;
                h0();
                return true;
            }
        }
        return false;
    }

    public final int u0(T t9) {
        if (u() == 0) {
            return 0;
        }
        T1.g gVar = this.f17336q;
        boolean z6 = !this.H;
        return P3.e.R(t9, gVar, z0(z6), y0(z6), this, this.H);
    }

    public final int v0(T t9) {
        if (u() == 0) {
            return 0;
        }
        T1.g gVar = this.f17336q;
        boolean z6 = !this.H;
        return P3.e.S(t9, gVar, z0(z6), y0(z6), this, this.H, this.f17342w);
    }

    public final int w0(T t9) {
        if (u() == 0) {
            return 0;
        }
        T1.g gVar = this.f17336q;
        boolean z6 = !this.H;
        return P3.e.T(t9, gVar, z0(z6), y0(z6), this, this.H);
    }

    public final int x0(O o8, C1635q c1635q, T t9) {
        f0 f0Var;
        ?? r9;
        int i3;
        int i9;
        int iC;
        int iK;
        int iC2;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f17343x.set(0, this.f17334o, true);
        C1635q c1635q2 = this.f17340u;
        int i15 = c1635q2.f17497i ? c1635q.f17494e == 1 ? Log.LOG_LEVEL_OFF : Integer.MIN_VALUE : c1635q.f17494e == 1 ? c1635q.g + c1635q.f17491b : c1635q.f17495f - c1635q.f17491b;
        int i16 = c1635q.f17494e;
        for (int i17 = 0; i17 < this.f17334o; i17++) {
            if (!((ArrayList) this.f17335p[i17].f17419f).isEmpty()) {
                U0(this.f17335p[i17], i16, i15);
            }
        }
        int iG = this.f17342w ? this.f17336q.g() : this.f17336q.k();
        boolean z6 = false;
        while (true) {
            int i18 = c1635q.f17492c;
            if (((i18 < 0 || i18 >= t9.b()) ? i13 : i14) == 0 || (!c1635q2.f17497i && this.f17343x.isEmpty())) {
                break;
            }
            View view = o8.k(c1635q.f17492c, Long.MAX_VALUE).itemView;
            c1635q.f17492c += c1635q.f17493d;
            b0 b0Var = (b0) view.getLayoutParams();
            int layoutPosition = b0Var.f17217a.getLayoutPosition();
            S2.a aVar = this.f17325A;
            int[] iArr = (int[]) aVar.f9211i;
            int i19 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i19 == -1) {
                if (L0(c1635q.f17494e)) {
                    i12 = this.f17334o - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f17334o;
                    i12 = i13;
                }
                f0 f0Var2 = null;
                if (c1635q.f17494e == i14) {
                    int iK2 = this.f17336q.k();
                    int i20 = Log.LOG_LEVEL_OFF;
                    while (i12 != i11) {
                        f0 f0Var3 = this.f17335p[i12];
                        int iG2 = f0Var3.g(iK2);
                        if (iG2 < i20) {
                            i20 = iG2;
                            f0Var2 = f0Var3;
                        }
                        i12 += i10;
                    }
                } else {
                    int iG3 = this.f17336q.g();
                    int i21 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        f0 f0Var4 = this.f17335p[i12];
                        int i22 = f0Var4.i(iG3);
                        if (i22 > i21) {
                            f0Var2 = f0Var4;
                            i21 = i22;
                        }
                        i12 += i10;
                    }
                }
                f0Var = f0Var2;
                aVar.z(layoutPosition);
                ((int[]) aVar.f9211i)[layoutPosition] = f0Var.f17418e;
            } else {
                f0Var = this.f17335p[i19];
            }
            b0Var.f17378e = f0Var;
            if (c1635q.f17494e == 1) {
                r9 = 0;
                a(view, -1, false);
            } else {
                r9 = 0;
                a(view, 0, false);
            }
            if (this.f17338s == 1) {
                i3 = 1;
                J0(view, I.v(this.f17339t, this.f17213k, r9, r9, ((ViewGroup.MarginLayoutParams) b0Var).width), I.v(this.f17216n, this.f17214l, true, y() + B(), ((ViewGroup.MarginLayoutParams) b0Var).height));
            } else {
                i3 = 1;
                J0(view, I.v(this.f17215m, this.f17213k, true, A() + z(), ((ViewGroup.MarginLayoutParams) b0Var).width), I.v(this.f17339t, this.f17214l, false, 0, ((ViewGroup.MarginLayoutParams) b0Var).height));
            }
            if (c1635q.f17494e == i3) {
                iC = f0Var.g(iG);
                i9 = this.f17336q.c(view) + iC;
            } else {
                i9 = f0Var.i(iG);
                iC = i9 - this.f17336q.c(view);
            }
            if (c1635q.f17494e == 1) {
                f0 f0Var5 = b0Var.f17378e;
                f0Var5.getClass();
                b0 b0Var2 = (b0) view.getLayoutParams();
                b0Var2.f17378e = f0Var5;
                ArrayList arrayList = (ArrayList) f0Var5.f17419f;
                arrayList.add(view);
                f0Var5.f17416c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    f0Var5.f17415b = Integer.MIN_VALUE;
                }
                if (b0Var2.f17217a.isRemoved() || b0Var2.f17217a.isUpdated()) {
                    f0Var5.f17417d = ((StaggeredGridLayoutManager) f0Var5.g).f17336q.c(view) + f0Var5.f17417d;
                }
            } else {
                f0 f0Var6 = b0Var.f17378e;
                f0Var6.getClass();
                b0 b0Var3 = (b0) view.getLayoutParams();
                b0Var3.f17378e = f0Var6;
                ArrayList arrayList2 = (ArrayList) f0Var6.f17419f;
                arrayList2.add(0, view);
                f0Var6.f17415b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    f0Var6.f17416c = Integer.MIN_VALUE;
                }
                if (b0Var3.f17217a.isRemoved() || b0Var3.f17217a.isUpdated()) {
                    f0Var6.f17417d = ((StaggeredGridLayoutManager) f0Var6.g).f17336q.c(view) + f0Var6.f17417d;
                }
            }
            if (I0() && this.f17338s == 1) {
                iC2 = this.f17337r.g() - (((this.f17334o - 1) - f0Var.f17418e) * this.f17339t);
                iK = iC2 - this.f17337r.c(view);
            } else {
                iK = this.f17337r.k() + (f0Var.f17418e * this.f17339t);
                iC2 = this.f17337r.c(view) + iK;
            }
            if (this.f17338s == 1) {
                I.I(view, iK, iC, iC2, i9);
            } else {
                I.I(view, iC, iK, i9, iC2);
            }
            U0(f0Var, c1635q2.f17494e, i15);
            N0(o8, c1635q2);
            if (c1635q2.f17496h && view.hasFocusable()) {
                this.f17343x.set(f0Var.f17418e, false);
            }
            i14 = 1;
            z6 = true;
            i13 = 0;
        }
        if (!z6) {
            N0(o8, c1635q2);
        }
        int iK3 = c1635q2.f17494e == -1 ? this.f17336q.k() - F0(this.f17336q.k()) : E0(this.f17336q.g()) - this.f17336q.g();
        if (iK3 > 0) {
            return Math.min(c1635q.f17491b, iK3);
        }
        return 0;
    }

    public final View y0(boolean z6) {
        int iK = this.f17336q.k();
        int iG = this.f17336q.g();
        View view = null;
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            int iE = this.f17336q.e(viewT);
            int iB = this.f17336q.b(viewT);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z6) {
                    return viewT;
                }
                if (view == null) {
                    view = viewT;
                }
            }
        }
        return view;
    }

    public final View z0(boolean z6) {
        int iK = this.f17336q.k();
        int iG = this.f17336q.g();
        int iU = u();
        View view = null;
        for (int i3 = 0; i3 < iU; i3++) {
            View viewT = t(i3);
            int iE = this.f17336q.e(viewT);
            if (this.f17336q.b(viewT) > iK && iE < iG) {
                if (iE >= iK || !z6) {
                    return viewT;
                }
                if (view == null) {
                    view = viewT;
                }
            }
        }
        return view;
    }
}
