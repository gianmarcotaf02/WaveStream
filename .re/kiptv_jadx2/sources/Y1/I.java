package Y1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new T3.G(22);

    public final String f11203h;

    public final String f11204i;
    public final boolean j;

    public final int f11205k;

    public final int f11206l;

    public final String f11207m;

    public final boolean f11208n;

    public final boolean f11209o;

    public final boolean f11210p;

    public final Bundle f11211q;

    public final boolean f11212r;

    public final int f11213s;

    public Bundle f11214t;

    public I(AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        this.f11203h = abstractComponentCallbacksC1029n.getClass().getName();
        this.f11204i = abstractComponentCallbacksC1029n.f11318l;
        this.j = abstractComponentCallbacksC1029n.f11326t;
        this.f11205k = abstractComponentCallbacksC1029n.f11297C;
        this.f11206l = abstractComponentCallbacksC1029n.f11298D;
        this.f11207m = abstractComponentCallbacksC1029n.f11299E;
        this.f11208n = abstractComponentCallbacksC1029n.H;
        this.f11209o = abstractComponentCallbacksC1029n.f11325s;
        this.f11210p = abstractComponentCallbacksC1029n.f11301G;
        this.f11211q = abstractComponentCallbacksC1029n.f11319m;
        this.f11212r = abstractComponentCallbacksC1029n.f11300F;
        this.f11213s = abstractComponentCallbacksC1029n.f11311R.ordinal();
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f11203h);
        sb.append(" (");
        sb.append(this.f11204i);
        sb.append(")}:");
        if (this.j) {
            sb.append(" fromLayout");
        }
        int i3 = this.f11206l;
        if (i3 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i3));
        }
        String str = this.f11207m;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f11208n) {
            sb.append(" retainInstance");
        }
        if (this.f11209o) {
            sb.append(" removing");
        }
        if (this.f11210p) {
            sb.append(" detached");
        }
        if (this.f11212r) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f11203h);
        parcel.writeString(this.f11204i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.f11205k);
        parcel.writeInt(this.f11206l);
        parcel.writeString(this.f11207m);
        parcel.writeInt(this.f11208n ? 1 : 0);
        parcel.writeInt(this.f11209o ? 1 : 0);
        parcel.writeInt(this.f11210p ? 1 : 0);
        parcel.writeBundle(this.f11211q);
        parcel.writeInt(this.f11212r ? 1 : 0);
        parcel.writeBundle(this.f11214t);
        parcel.writeInt(this.f11213s);
    }

    public I(Parcel parcel) {
        this.f11203h = parcel.readString();
        this.f11204i = parcel.readString();
        this.j = parcel.readInt() != 0;
        this.f11205k = parcel.readInt();
        this.f11206l = parcel.readInt();
        this.f11207m = parcel.readString();
        this.f11208n = parcel.readInt() != 0;
        this.f11209o = parcel.readInt() != 0;
        this.f11210p = parcel.readInt() != 0;
        this.f11211q = parcel.readBundle();
        this.f11212r = parcel.readInt() != 0;
        this.f11214t = parcel.readBundle();
        this.f11213s = parcel.readInt();
    }
}
