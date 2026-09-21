package p020c0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;
import p121o0.a;
import p121o0.f;
import p121o0.k;
import p121o0.l;
import p121o0.u;
import p121o0.v;

public final class C1675d0 extends u implements Parcelable, l, X, e1 {
    public static final Parcelable.Creator<C1675d0> CREATOR = new C1671b0(1);

    public P0 f18236i;

    public C1675d0(int i3) {
        f fVarJ = k.j();
        P0 p2 = new P0(fVarJ.g(), i3);
        if (!(fVarJ instanceof a)) {
            p2.f26027b = new P0(1, i3);
        }
        this.f18236i = p2;
    }

    @Override
    public final S0 b() {
        return C1676e.f18243n;
    }

    @Override
    public final v d() {
        return this.f18236i;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(v vVar) {
        m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f18236i = (P0) vVar;
    }

    public final int g() {
        return ((P0) k.t(this.f18236i, this)).f18183c;
    }

    @Override
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i3) {
        f fVarJ;
        P0 p2 = (P0) k.h(this.f18236i);
        if (p2.f18183c != i3) {
            P0 p9 = this.f18236i;
            synchronized (k.f25993c) {
                fVarJ = k.j();
                ((P0) k.o(p9, this, fVarJ, p2)).f18183c = i3;
            }
            k.n(fVarJ, this);
        }
    }

    @Override
    public final v n(v vVar, v vVar2, v vVar3) {
        if (((P0) vVar2).f18183c == ((P0) vVar3).f18183c) {
            return vVar2;
        }
        return null;
    }

    @Override
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((P0) k.h(this.f18236i)).f18183c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(g());
    }
}
