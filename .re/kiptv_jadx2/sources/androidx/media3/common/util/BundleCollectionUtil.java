package androidx.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p068h4.j;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2194f0;
import p076i4.X0;
import p076i4.Y;

public final class BundleCollectionUtil {
    private BundleCollectionUtil() {
    }

    public static HashMap<String, String> bundleToStringHashMap(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static AbstractC2194f0 bundleToStringImmutableMap(Bundle bundle) {
        return bundle == Bundle.EMPTY ? X0.f22848n : AbstractC2194f0.a(bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleCollectionUtil.class.getClassLoader()));
        }
    }

    public static <T> AbstractC2186b0 fromBundleList(j jVar, List<Bundle> list) {
        Y yS = AbstractC2186b0.s();
        for (int i3 = 0; i3 < list.size(); i3++) {
            Bundle bundle = list.get(i3);
            bundle.getClass();
            yS.c(jVar.apply(bundle));
        }
        return yS.f();
    }

    public static <T> SparseArray<T> fromBundleSparseArray(j jVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            sparseArray2.put(sparseArray.keyAt(i3), jVar.apply(sparseArray.valueAt(i3)));
        }
        return sparseArray2;
    }

    public static Bundle getBundleWithDefault(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> getIntegerArrayListWithDefault(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle stringMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, j jVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) jVar.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> AbstractC2186b0 toBundleList(List<T> list, j jVar) {
        Y yS = AbstractC2186b0.s();
        for (int i3 = 0; i3 < list.size(); i3++) {
            yS.c((Bundle) jVar.apply(list.get(i3)));
        }
        return yS.f();
    }

    public static <T> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray, j jVar) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            sparseArray2.put(sparseArray.keyAt(i3), (Bundle) jVar.apply(sparseArray.valueAt(i3)));
        }
        return sparseArray2;
    }
}
