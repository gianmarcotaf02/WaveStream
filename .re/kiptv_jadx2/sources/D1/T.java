package D1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.kiptv.tv.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class T {

    public static final ArrayList f1976d = new ArrayList();

    public WeakHashMap f1977a;

    public SparseArray f1978b;

    public WeakReference f1979c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f1977a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
