package p148r3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends I3.a {
    public static final android.os.Parcelable.Creator<p148r3.f> CREATOR = new androidx.recyclerview.widget.d0(8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.app.PendingIntent f26846h;

    public f(android.app.PendingIntent pendingIntent) {
        H3.q.g(pendingIntent);
        this.f26846h = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Y(parcel, 1, this.f26846h, i3);
        E6.G.g0(parcel, iF0);
    }
}
