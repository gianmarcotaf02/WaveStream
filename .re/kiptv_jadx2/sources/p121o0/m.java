package p121o0;

import N1.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.S;
import p056g0.f;
import p056g0.i;
import p103m.W0;

public final class m implements Parcelable.ClassLoaderCreator {

    public final int f26000a;

    public m(int i3) {
        this.f26000a = i3;
    }

    public static n a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = m.class.getClassLoader();
        }
        int i3 = parcel.readInt();
        if (i3 == 0) {
            return new n();
        }
        f fVarP = i.f21767i.p();
        for (int i9 = 0; i9 < i3; i9++) {
            fVarP.add(parcel.readValue(classLoader));
        }
        return new n(fVarP.n());
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f26000a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return b.f7298i;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new S(parcel, classLoader);
            default:
                return new W0(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f26000a) {
            case 0:
                return new n[i3];
            case 1:
                return new b[i3];
            case 2:
                return new S[i3];
            default:
                return new W0[i3];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f26000a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return b.f7298i;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new S(parcel, null);
            default:
                return new W0(parcel, null);
        }
    }
}
