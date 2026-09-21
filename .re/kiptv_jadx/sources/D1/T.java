package D1;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f1976d = new java.util.ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap f1977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.util.SparseArray f1978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f1979c;

    public final android.view.View a(android.view.View view) {
        int size;
        java.util.WeakHashMap weakHashMap = this.f1977a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(com.kiptv.tv.R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new java.lang.ClassCastException();
    }
}
