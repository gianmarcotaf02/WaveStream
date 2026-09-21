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

public final class C1681g0 extends u implements Parcelable, l {
    public static final Parcelable.Creator<C1681g0> CREATOR = new C1679f0();

    public final S0 f18247i;
    public R0 j;

    public C1681g0(Object obj, S0 s9) {
        this.f18247i = s9;
        f fVarJ = k.j();
        R0 r9 = new R0(fVarJ.g(), obj);
        if (!(fVarJ instanceof a)) {
            r9.f26027b = new R0(1, obj);
        }
        this.j = r9;
    }

    @Override
    public final S0 b() {
        return this.f18247i;
    }

    @Override
    public final v d() {
        return this.j;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(v vVar) {
        m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.j = (R0) vVar;
    }

    @Override
    public final Object getValue() {
        return ((R0) k.t(this.j, this)).f18187c;
    }

    @Override
    public final v n(v vVar, v vVar2, v vVar3) {
        if (this.f18247i.a(((R0) vVar2).f18187c, ((R0) vVar3).f18187c)) {
            return vVar2;
        }
        return null;
    }

    @Override
    public final void setValue(Object obj) {
        f fVarJ;
        R0 r9 = (R0) k.h(this.j);
        if (this.f18247i.a(r9.f18187c, obj)) {
            return;
        }
        R0 r10 = this.j;
        synchronized (k.f25993c) {
            fVarJ = k.j();
            ((R0) k.o(r10, this, fVarJ, r9)).f18187c = obj;
        }
        k.n(fVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((R0) k.h(this.j)).f18187c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int i9;
        parcel.writeValue(getValue());
        C1676e c1676e = C1676e.f18240k;
        S0 s9 = this.f18247i;
        if (m.a(s9, c1676e)) {
            i9 = 0;
        } else if (m.a(s9, C1676e.f18243n)) {
            i9 = 1;
        } else {
            if (!m.a(s9, C1676e.f18241l)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i9 = 2;
        }
        parcel.writeInt(i9);
    }
}
