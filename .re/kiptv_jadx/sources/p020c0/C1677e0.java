package p020c0;

/* JADX INFO: renamed from: c0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1677e0 extends p121o0.u implements android.os.Parcelable, p121o0.l, p020c0.X, p020c0.e1 {
    public static final android.os.Parcelable.Creator<p020c0.C1677e0> CREATOR = new p020c0.C1671b0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p020c0.Q0 f18245i;

    public C1677e0(long j) {
        p121o0.f fVarJ = p121o0.k.j();
        p020c0.Q0 q9 = new p020c0.Q0(fVarJ.g(), j);
        if (!(fVarJ instanceof p121o0.a)) {
            q9.f26027b = new p020c0.Q0(1, j);
        }
        this.f18245i = q9;
    }

    @Override // p121o0.l
    public final p020c0.S0 b() {
        return p020c0.C1676e.f18243n;
    }

    @Override // p121o0.t
    public final p121o0.v d() {
        return this.f18245i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p121o0.t
    public final void e(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f18245i = (p020c0.Q0) vVar;
    }

    public final long g() {
        return ((p020c0.Q0) p121o0.k.t(this.f18245i, this)).f18186c;
    }

    @Override // p020c0.e1
    public java.lang.Object getValue() {
        return java.lang.Long.valueOf(g());
    }

    public final void h(long j) {
        p121o0.f fVarJ;
        p020c0.Q0 q9 = (p020c0.Q0) p121o0.k.h(this.f18245i);
        if (q9.f18186c != j) {
            p020c0.Q0 q10 = this.f18245i;
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                ((p020c0.Q0) p121o0.k.o(q10, this, fVarJ, q9)).f18186c = j;
            }
            p121o0.k.n(fVarJ, this);
        }
    }

    @Override // p121o0.t
    public final p121o0.v n(p121o0.v vVar, p121o0.v vVar2, p121o0.v vVar3) {
        if (((p020c0.Q0) vVar2).f18186c == ((p020c0.Q0) vVar3).f18186c) {
            return vVar2;
        }
        return null;
    }

    @Override // p020c0.X
    public void setValue(java.lang.Object obj) {
        h(((java.lang.Number) obj).longValue());
    }

    public final java.lang.String toString() {
        return "MutableLongState(value=" + ((p020c0.Q0) p121o0.k.h(this.f18245i)).f18186c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeLong(g());
    }
}
