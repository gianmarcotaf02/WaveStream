package p020c0;

/* JADX INFO: renamed from: c0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1675d0 extends p121o0.u implements android.os.Parcelable, p121o0.l, p020c0.X, p020c0.e1 {
    public static final android.os.Parcelable.Creator<p020c0.C1675d0> CREATOR = new p020c0.C1671b0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p020c0.P0 f18236i;

    public C1675d0(int i3) {
        p121o0.f fVarJ = p121o0.k.j();
        p020c0.P0 p2 = new p020c0.P0(fVarJ.g(), i3);
        if (!(fVarJ instanceof p121o0.a)) {
            p2.f26027b = new p020c0.P0(1, i3);
        }
        this.f18236i = p2;
    }

    @Override // p121o0.l
    public final p020c0.S0 b() {
        return p020c0.C1676e.f18243n;
    }

    @Override // p121o0.t
    public final p121o0.v d() {
        return this.f18236i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p121o0.t
    public final void e(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f18236i = (p020c0.P0) vVar;
    }

    public final int g() {
        return ((p020c0.P0) p121o0.k.t(this.f18236i, this)).f18183c;
    }

    @Override // p020c0.e1
    public java.lang.Object getValue() {
        return java.lang.Integer.valueOf(g());
    }

    public final void h(int i3) {
        p121o0.f fVarJ;
        p020c0.P0 p2 = (p020c0.P0) p121o0.k.h(this.f18236i);
        if (p2.f18183c != i3) {
            p020c0.P0 p9 = this.f18236i;
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                ((p020c0.P0) p121o0.k.o(p9, this, fVarJ, p2)).f18183c = i3;
            }
            p121o0.k.n(fVarJ, this);
        }
    }

    @Override // p121o0.t
    public final p121o0.v n(p121o0.v vVar, p121o0.v vVar2, p121o0.v vVar3) {
        if (((p020c0.P0) vVar2).f18183c == ((p020c0.P0) vVar3).f18183c) {
            return vVar2;
        }
        return null;
    }

    @Override // p020c0.X
    public void setValue(java.lang.Object obj) {
        h(((java.lang.Number) obj).intValue());
    }

    public final java.lang.String toString() {
        return "MutableIntState(value=" + ((p020c0.P0) p121o0.k.h(this.f18236i)).f18183c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(g());
    }
}
