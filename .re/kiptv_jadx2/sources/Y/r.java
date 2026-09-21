package Y;

import android.content.Context;
import android.view.ViewGroup;
import com.kiptv.tv.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class r extends ViewGroup {

    public final int f11006h;

    public final ArrayList f11007i;
    public final ArrayList j;

    public final S2.a f11008k;

    public int f11009l;

    public r(Context context) {
        super(context);
        this.f11006h = 5;
        ArrayList arrayList = new ArrayList();
        this.f11007i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.j = arrayList2;
        this.f11008k = new S2.a(7);
        setClipChildren(false);
        t tVar = new t(context);
        addView(tVar);
        arrayList.add(tVar);
        arrayList2.add(tVar);
        this.f11009l = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final t a(s sVar) {
        S2.a aVar = this.f11008k;
        t tVar = (t) ((LinkedHashMap) aVar.f9211i).get(sVar);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = (t) p078i6.u.S0(this.j);
        LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f9211i;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) aVar.j;
        if (tVar2 == null) {
            int i3 = this.f11009l;
            ArrayList arrayList = this.f11007i;
            if (i3 > p078i6.p.A0(arrayList)) {
                tVar2 = new t(getContext());
                addView(tVar2);
                arrayList.add(tVar2);
            } else {
                tVar2 = (t) arrayList.get(this.f11009l);
                s sVar2 = (s) linkedHashMap2.get(tVar2);
                if (sVar2 != null) {
                    sVar2.F();
                    t tVar3 = (t) linkedHashMap.get(sVar2);
                    if (tVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    tVar2.c();
                }
            }
            int i9 = this.f11009l;
            if (i9 < this.f11006h - 1) {
                this.f11009l = i9 + 1;
            } else {
                this.f11009l = 0;
            }
        }
        linkedHashMap.put(sVar, tVar2);
        linkedHashMap2.put(tVar2, sVar);
        return tVar2;
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override
    public final void requestLayout() {
    }

    @Override
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
    }
}
