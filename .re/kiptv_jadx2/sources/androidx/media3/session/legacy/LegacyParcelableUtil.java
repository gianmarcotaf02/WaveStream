package androidx.media3.session.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.android.replay.RootViewsSpy$delegatingViewList$1;
import java.util.ArrayList;
import java.util.List;

public final class LegacyParcelableUtil {
    private LegacyParcelableUtil() {
    }

    public static <T extends Parcelable, U extends Parcelable> T convert(U u6, Parcelable.Creator<T> creator) {
        if (u6 == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            u6.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static <T extends Parcelable, U extends Parcelable> ArrayList<T> convertList(List<U> list, Parcelable.Creator<T> creator) {
        if (list == null) {
            return null;
        }
        RootViewsSpy$delegatingViewList$1 rootViewsSpy$delegatingViewList$1 = (ArrayList<T>) new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            rootViewsSpy$delegatingViewList$1.add(convert(list.get(i3), creator));
        }
        return rootViewsSpy$delegatingViewList$1;
    }
}
