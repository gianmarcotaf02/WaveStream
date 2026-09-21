package C2;

import Y6.f;
import android.os.Parcel;
import android.util.SparseIntArray;
import p136q.C2661e;

public final class c extends b {

    public final SparseIntArray f880d;

    public final Parcel f881e;

    public final int f882f;
    public final int g;

    public final String f883h;

    public int f884i;
    public int j;

    public int f885k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2661e(0), new C2661e(0), new C2661e(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f881e;
        int iDataPosition = parcel.dataPosition();
        int i3 = this.j;
        if (i3 == this.f882f) {
            i3 = this.g;
        }
        return new c(parcel, iDataPosition, i3, f.m(new StringBuilder(), this.f883h, "  "), this.f877a, this.f878b, this.f879c);
    }

    @Override
    public final boolean e(int i3) {
        while (this.j < this.g) {
            int i9 = this.f885k;
            if (i9 == i3) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i10 = this.j;
            Parcel parcel = this.f881e;
            parcel.setDataPosition(i10);
            int i11 = parcel.readInt();
            this.f885k = parcel.readInt();
            this.j += i11;
        }
        return this.f885k == i3;
    }

    @Override
    public final void i(int i3) {
        int i9 = this.f884i;
        SparseIntArray sparseIntArray = this.f880d;
        Parcel parcel = this.f881e;
        if (i9 >= 0) {
            int i10 = sparseIntArray.get(i9);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i10);
            parcel.writeInt(iDataPosition - i10);
            parcel.setDataPosition(iDataPosition);
        }
        this.f884i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public c(Parcel parcel, int i3, int i9, String str, C2661e c2661e, C2661e c2661e2, C2661e c2661e3) {
        super(c2661e, c2661e2, c2661e3);
        this.f880d = new SparseIntArray();
        this.f884i = -1;
        this.f885k = -1;
        this.f881e = parcel;
        this.f882f = i3;
        this.g = i9;
        this.j = i3;
        this.f883h = str;
    }
}
