package p148r3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends I3.a {
    public static final android.os.Parcelable.Creator<p148r3.i> CREATOR = new androidx.recyclerview.widget.d0(15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.app.PendingIntent f26854h;

    public i(android.app.PendingIntent pendingIntent) {
        H3.q.g(pendingIntent);
        this.f26854h = pendingIntent;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p148r3.i) {
            return H3.q.j(this.f26854h, ((p148r3.i) obj).f26854h);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f26854h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Y(parcel, 1, this.f26854h, i3);
        E6.G.g0(parcel, iF0);
    }
}
