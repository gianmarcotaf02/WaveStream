package p020c0;

import Y6.f;
import android.os.Parcel;
import android.os.Parcelable;

public final class C1679f0 implements Parcelable.ClassLoaderCreator {
    public static C1681g0 a(Parcel parcel, ClassLoader classLoader) {
        C1676e c1676e;
        if (classLoader == null) {
            classLoader = C1679f0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i3 = parcel.readInt();
        if (i3 == 0) {
            c1676e = C1676e.f18240k;
        } else if (i3 == 1) {
            c1676e = C1676e.f18243n;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException(f.f(i3, "Unsupported MutableState policy ", " was restored"));
            }
            c1676e = C1676e.f18241l;
        }
        return new C1681g0(value, c1676e);
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override
    public final Object[] newArray(int i3) {
        return new C1681g0[i3];
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
