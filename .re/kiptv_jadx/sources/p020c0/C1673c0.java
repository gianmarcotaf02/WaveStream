package p020c0;

/* JADX INFO: renamed from: c0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1673c0 extends p121o0.u implements android.os.Parcelable, p121o0.l, p020c0.X, p020c0.e1 {
    public static final android.os.Parcelable.Creator<p020c0.C1673c0> CREATOR = new p020c0.C1671b0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p020c0.O0 f18229i;

    public C1673c0(float f9) {
        p121o0.f fVarJ = p121o0.k.j();
        p020c0.O0 o8 = new p020c0.O0(fVarJ.g(), f9);
        if (!(fVarJ instanceof p121o0.a)) {
            o8.f26027b = new p020c0.O0(1, f9);
        }
        this.f18229i = o8;
    }

    @Override // p121o0.l
    public final p020c0.S0 b() {
        return p020c0.C1676e.f18243n;
    }

    @Override // p121o0.t
    public final p121o0.v d() {
        return this.f18229i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p121o0.t
    public final void e(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f18229i = (p020c0.O0) vVar;
    }

    public final float g() {
        return ((p020c0.O0) p121o0.k.t(this.f18229i, this)).f18178c;
    }

    @Override // p020c0.e1
    public java.lang.Object getValue() {
        return java.lang.Float.valueOf(g());
    }

    public final void h(float f9) {
        p121o0.f fVarJ;
        p020c0.O0 o8 = (p020c0.O0) p121o0.k.h(this.f18229i);
        if (o8.f18178c == f9) {
            return;
        }
        p020c0.O0 o9 = this.f18229i;
        synchronized (p121o0.k.f25993c) {
            fVarJ = p121o0.k.j();
            ((p020c0.O0) p121o0.k.o(o9, this, fVarJ, o8)).f18178c = f9;
        }
        p121o0.k.n(fVarJ, this);
    }

    @Override // p121o0.t
    public final p121o0.v n(p121o0.v vVar, p121o0.v vVar2, p121o0.v vVar3) {
        if (((p020c0.O0) vVar2).f18178c == ((p020c0.O0) vVar3).f18178c) {
            return vVar2;
        }
        return null;
    }

    @Override // p020c0.X
    public void setValue(java.lang.Object obj) {
        h(((java.lang.Number) obj).floatValue());
    }

    public final java.lang.String toString() {
        return "MutableFloatState(value=" + ((p020c0.O0) p121o0.k.h(this.f18229i)).f18178c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeFloat(g());
    }
}
