package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class BundleCollectionUtil {
    private BundleCollectionUtil() {
    }

    public static java.util.HashMap<java.lang.String, java.lang.String> bundleToStringHashMap(android.os.Bundle bundle) {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        if (bundle != android.os.Bundle.EMPTY) {
            for (java.lang.String str : bundle.keySet()) {
                java.lang.String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static p076i4.AbstractC2194f0 bundleToStringImmutableMap(android.os.Bundle bundle) {
        return bundle == android.os.Bundle.EMPTY ? p076i4.X0.f22848n : p076i4.AbstractC2194f0.a(bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((java.lang.ClassLoader) androidx.media3.common.util.Util.castNonNull(androidx.media3.common.util.BundleCollectionUtil.class.getClassLoader()));
        }
    }

    public static <T> p076i4.AbstractC2186b0 fromBundleList(p068h4.j jVar, java.util.List<android.os.Bundle> list) {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (int i3 = 0; i3 < list.size(); i3++) {
            android.os.Bundle bundle = list.get(i3);
            bundle.getClass();
            yS.c(jVar.apply(bundle));
        }
        return yS.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> android.util.SparseArray<T> fromBundleSparseArray(p068h4.j jVar, android.util.SparseArray<android.os.Bundle> sparseArray) {
        android.util.SparseArray<T> sparseArray2 = (android.util.SparseArray<T>) new android.util.SparseArray(sparseArray.size());
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            sparseArray2.put(sparseArray.keyAt(i3), jVar.apply(sparseArray.valueAt(i3)));
        }
        return sparseArray2;
    }

    public static android.os.Bundle getBundleWithDefault(android.os.Bundle bundle, java.lang.String str, android.os.Bundle bundle2) {
        android.os.Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static java.util.ArrayList<java.lang.Integer> getIntegerArrayListWithDefault(android.os.Bundle bundle, java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static android.os.Bundle stringMapToBundle(java.util.Map<java.lang.String, java.lang.String> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> java.util.ArrayList<android.os.Bundle> toBundleArrayList(java.util.Collection<T> collection, p068h4.j jVar) {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>(collection.size());
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((android.os.Bundle) jVar.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> p076i4.AbstractC2186b0 toBundleList(java.util.List<T> list, p068h4.j jVar) {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (int i3 = 0; i3 < list.size(); i3++) {
            yS.c((android.os.Bundle) jVar.apply(list.get(i3)));
        }
        return yS.f();
    }

    public static <T> android.util.SparseArray<android.os.Bundle> toBundleSparseArray(android.util.SparseArray<T> sparseArray, p068h4.j jVar) {
        android.util.SparseArray<android.os.Bundle> sparseArray2 = new android.util.SparseArray<>(sparseArray.size());
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            sparseArray2.put(sparseArray.keyAt(i3), (android.os.Bundle) jVar.apply(sparseArray.valueAt(i3)));
        }
        return sparseArray2;
    }
}
