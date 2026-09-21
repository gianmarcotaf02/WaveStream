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

public final class C1673c0 extends u implements Parcelable, l, X, e1 {
    public static final Parcelable.Creator<C1673c0> CREATOR = new C1671b0(0);

    public O0 f18229i;

    public C1673c0(float f9) {
        f fVarJ = k.j();
        O0 o8 = new O0(fVarJ.g(), f9);
        if (!(fVarJ instanceof a)) {
            o8.f26027b = new O0(1, f9);
        }
        this.f18229i = o8;
    }

    @Override
    public final S0 b() {
        return C1676e.f18243n;
    }

    @Override
    public final v d() {
        return this.f18229i;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(v vVar) {
        m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f18229i = (O0) vVar;
    }

    public final float g() {
        return ((O0) k.t(this.f18229i, this)).f18178c;
    }

    @Override
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f9) {
        f fVarJ;
        O0 o8 = (O0) k.h(this.f18229i);
        if (o8.f18178c == f9) {
            return;
        }
        O0 o9 = this.f18229i;
        synchronized (k.f25993c) {
            fVarJ = k.j();
            ((O0) k.o(o9, this, fVarJ, o8)).f18178c = f9;
        }
        k.n(fVarJ, this);
    }

    @Override
    public final v n(v vVar, v vVar2, v vVar3) {
        if (((O0) vVar2).f18178c == ((O0) vVar3).f18178c) {
            return vVar2;
        }
        return null;
    }

    @Override
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((O0) k.h(this.f18229i)).f18178c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(g());
    }
}
