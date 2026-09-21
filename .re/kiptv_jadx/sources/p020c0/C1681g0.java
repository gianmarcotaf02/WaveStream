package p020c0;

/* JADX INFO: renamed from: c0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1681g0 extends p121o0.u implements android.os.Parcelable, p121o0.l {
    public static final android.os.Parcelable.Creator<p020c0.C1681g0> CREATOR = new p020c0.C1679f0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p020c0.S0 f18247i;
    public p020c0.R0 j;

    public C1681g0(java.lang.Object obj, p020c0.S0 s9) {
        this.f18247i = s9;
        p121o0.f fVarJ = p121o0.k.j();
        p020c0.R0 r9 = new p020c0.R0(fVarJ.g(), obj);
        if (!(fVarJ instanceof p121o0.a)) {
            r9.f26027b = new p020c0.R0(1, obj);
        }
        this.j = r9;
    }

    @Override // p121o0.l
    public final p020c0.S0 b() {
        return this.f18247i;
    }

    @Override // p121o0.t
    public final p121o0.v d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p121o0.t
    public final void e(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.j = (p020c0.R0) vVar;
    }

    @Override // p020c0.e1
    public final java.lang.Object getValue() {
        return ((p020c0.R0) p121o0.k.t(this.j, this)).f18187c;
    }

    @Override // p121o0.t
    public final p121o0.v n(p121o0.v vVar, p121o0.v vVar2, p121o0.v vVar3) {
        if (this.f18247i.a(((p020c0.R0) vVar2).f18187c, ((p020c0.R0) vVar3).f18187c)) {
            return vVar2;
        }
        return null;
    }

    @Override // p020c0.X
    public final void setValue(java.lang.Object obj) {
        p121o0.f fVarJ;
        p020c0.R0 r9 = (p020c0.R0) p121o0.k.h(this.j);
        if (this.f18247i.a(r9.f18187c, obj)) {
            return;
        }
        p020c0.R0 r10 = this.j;
        synchronized (p121o0.k.f25993c) {
            fVarJ = p121o0.k.j();
            ((p020c0.R0) p121o0.k.o(r10, this, fVarJ, r9)).f18187c = obj;
        }
        p121o0.k.n(fVarJ, this);
    }

    public final java.lang.String toString() {
        return "MutableState(value=" + ((p020c0.R0) p121o0.k.h(this.j)).f18187c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int i9;
        parcel.writeValue(getValue());
        p020c0.C1676e c1676e = p020c0.C1676e.f18240k;
        p020c0.S0 s9 = this.f18247i;
        if (kotlin.jvm.internal.m.a(s9, c1676e)) {
            i9 = 0;
        } else if (kotlin.jvm.internal.m.a(s9, p020c0.C1676e.f18243n)) {
            i9 = 1;
        } else {
            if (!kotlin.jvm.internal.m.a(s9, p020c0.C1676e.f18241l)) {
                throw new java.lang.IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i9 = 2;
        }
        parcel.writeInt(i9);
    }
}
