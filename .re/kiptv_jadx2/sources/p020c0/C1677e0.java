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

public final class C1677e0 extends u implements Parcelable, l, X, e1 {
    public static final Parcelable.Creator<C1677e0> CREATOR = new C1671b0(2);

    public Q0 f18245i;

    public C1677e0(long j) {
        f fVarJ = k.j();
        Q0 q9 = new Q0(fVarJ.g(), j);
        if (!(fVarJ instanceof a)) {
            q9.f26027b = new Q0(1, j);
        }
        this.f18245i = q9;
    }

    @Override
    public final S0 b() {
        return C1676e.f18243n;
    }

    @Override
    public final v d() {
        return this.f18245i;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(v vVar) {
        m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f18245i = (Q0) vVar;
    }

    public final long g() {
        return ((Q0) k.t(this.f18245i, this)).f18186c;
    }

    @Override
    public Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        f fVarJ;
        Q0 q9 = (Q0) k.h(this.f18245i);
        if (q9.f18186c != j) {
            Q0 q10 = this.f18245i;
            synchronized (k.f25993c) {
                fVarJ = k.j();
                ((Q0) k.o(q10, this, fVarJ, q9)).f18186c = j;
            }
            k.n(fVarJ, this);
        }
    }

    @Override
    public final v n(v vVar, v vVar2, v vVar3) {
        if (((Q0) vVar2).f18186c == ((Q0) vVar3).f18186c) {
            return vVar2;
        }
        return null;
    }

    @Override
    public void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((Q0) k.h(this.f18245i)).f18186c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(g());
    }
}
