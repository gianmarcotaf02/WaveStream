package androidx.core.app;

import android.app.Notification;
import android.os.Parcel;

public final class F {

    public final String f15978a;

    public final int f15979b;

    public final Notification f15980c;

    public F(String str, int i3, Notification notification) {
        this.f15978a = str;
        this.f15979b = i3;
        this.f15980c = notification;
    }

    public final void a(p009b.c cVar) {
        String str = this.f15978a;
        int i3 = this.f15979b;
        p009b.a aVar = (p009b.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(p009b.c.f17528b);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i3);
            parcelObtain.writeString(null);
            Notification notification = this.f15980c;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f15978a);
        sb.append(", id:");
        return Y6.f.k(sb, this.f15979b, ", tag:null]");
    }
}
