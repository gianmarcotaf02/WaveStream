package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public final class C1017b implements Parcelable {
    public static final Parcelable.Creator<C1017b> CREATOR = new T3.G(18);

    public final int[] f11246h;

    public final ArrayList f11247i;
    public final int[] j;

    public final int[] f11248k;

    public final int f11249l;

    public final String f11250m;

    public final int f11251n;

    public final int f11252o;

    public final CharSequence f11253p;

    public final int f11254q;

    public final CharSequence f11255r;

    public final ArrayList f11256s;

    public final ArrayList f11257t;

    public final boolean f11258u;

    public C1017b(C1016a c1016a) {
        int size = c1016a.f11230a.size();
        this.f11246h = new int[size * 6];
        if (!c1016a.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f11247i = new ArrayList(size);
        this.j = new int[size];
        this.f11248k = new int[size];
        int i3 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            K k9 = (K) c1016a.f11230a.get(i9);
            int i10 = i3 + 1;
            this.f11246h[i3] = k9.f11220a;
            ArrayList arrayList = this.f11247i;
            AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = k9.f11221b;
            arrayList.add(abstractComponentCallbacksC1029n != null ? abstractComponentCallbacksC1029n.f11318l : null);
            int[] iArr = this.f11246h;
            iArr[i10] = k9.f11222c ? 1 : 0;
            iArr[i3 + 2] = k9.f11223d;
            iArr[i3 + 3] = k9.f11224e;
            int i11 = i3 + 5;
            iArr[i3 + 4] = k9.f11225f;
            i3 += 6;
            iArr[i11] = k9.g;
            this.j[i9] = k9.f11226h.ordinal();
            this.f11248k[i9] = k9.f11227i.ordinal();
        }
        this.f11249l = c1016a.f11235f;
        this.f11250m = c1016a.f11236h;
        this.f11251n = c1016a.f11245r;
        this.f11252o = c1016a.f11237i;
        this.f11253p = c1016a.j;
        this.f11254q = c1016a.f11238k;
        this.f11255r = c1016a.f11239l;
        this.f11256s = c1016a.f11240m;
        this.f11257t = c1016a.f11241n;
        this.f11258u = c1016a.f11242o;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f11246h);
        parcel.writeStringList(this.f11247i);
        parcel.writeIntArray(this.j);
        parcel.writeIntArray(this.f11248k);
        parcel.writeInt(this.f11249l);
        parcel.writeString(this.f11250m);
        parcel.writeInt(this.f11251n);
        parcel.writeInt(this.f11252o);
        TextUtils.writeToParcel(this.f11253p, parcel, 0);
        parcel.writeInt(this.f11254q);
        TextUtils.writeToParcel(this.f11255r, parcel, 0);
        parcel.writeStringList(this.f11256s);
        parcel.writeStringList(this.f11257t);
        parcel.writeInt(this.f11258u ? 1 : 0);
    }

    public C1017b(Parcel parcel) {
        this.f11246h = parcel.createIntArray();
        this.f11247i = parcel.createStringArrayList();
        this.j = parcel.createIntArray();
        this.f11248k = parcel.createIntArray();
        this.f11249l = parcel.readInt();
        this.f11250m = parcel.readString();
        this.f11251n = parcel.readInt();
        this.f11252o = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f11253p = (CharSequence) creator.createFromParcel(parcel);
        this.f11254q = parcel.readInt();
        this.f11255r = (CharSequence) creator.createFromParcel(parcel);
        this.f11256s = parcel.createStringArrayList();
        this.f11257t = parcel.createStringArrayList();
        this.f11258u = parcel.readInt() != 0;
    }
}
