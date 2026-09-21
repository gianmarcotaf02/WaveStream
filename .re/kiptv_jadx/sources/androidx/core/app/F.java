package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.app.Notification f15980c;

    public F(java.lang.String str, int i3, android.app.Notification notification) {
        this.f15978a = str;
        this.f15979b = i3;
        this.f15980c = notification;
    }

    public final void a(p009b.c cVar) {
        java.lang.String str = this.f15978a;
        int i3 = this.f15979b;
        p009b.a aVar = (p009b.a) cVar;
        aVar.getClass();
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(p009b.c.f17528b);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i3);
            parcelObtain.writeString(null);
            android.app.Notification notification = this.f15980c;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            aVar.f17526c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifyTask[packageName:");
        sb.append(this.f15978a);
        sb.append(", id:");
        return Y6.f.k(sb, this.f15979b, ", tag:null]");
    }
}
