package I5;

import S4.C0867f;
import androidx.media3.common.util.Log;
import com.kiptv.core.model.MyListItem;
import com.kiptv.core.model.WatchProgress;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class s2 implements p194x6.j {

    public final int f5355h;

    public final LinkedHashMap f5356i;

    public s2(LinkedHashMap linkedHashMap, int i3) {
        this.f5355h = i3;
        this.f5356i = linkedHashMap;
    }

    @Override
    public final Object invoke(Object obj) {
        Integer numZ0;
        Integer num;
        switch (this.f5355h) {
            case 0:
                WatchProgress watchProgress = (WatchProgress) obj;
                String str = watchProgress.g;
                if (str == null || (numZ0 = O7.x.z0(str)) == null) {
                    numZ0 = O7.x.z0(watchProgress.f20613d);
                }
                if (numZ0 != null) {
                    return (XtreamSeries) this.f5356i.get(Integer.valueOf(numZ0.intValue()));
                }
                return null;
            case 1:
                Integer numZ1 = O7.x.z0(((MyListItem) obj).f19875d);
                if (numZ1 != null) {
                    return (XtreamSeries) this.f5356i.get(Integer.valueOf(numZ1.intValue()));
                }
                return null;
            case 2:
                p078i6.z zVar = (p078i6.z) obj;
                kotlin.jvm.internal.m.e(zVar, "<destruct>");
                Iterator it = ((S4.p) zVar.f23209b).f9431c.iterator();
                if (it.hasNext()) {
                    String strValueOf = String.valueOf(((C0867f) it.next()).f9387a.f20657d);
                    LinkedHashMap linkedHashMap = this.f5356i;
                    Integer num2 = (Integer) linkedHashMap.get(strValueOf);
                    Integer numValueOf = Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                    while (it.hasNext()) {
                        Integer num3 = (Integer) linkedHashMap.get(String.valueOf(((C0867f) it.next()).f9387a.f20657d));
                        Integer numValueOf2 = Integer.valueOf(num3 != null ? num3.intValue() : Integer.MAX_VALUE);
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                return num != null ? num : Integer.valueOf(Log.LOG_LEVEL_OFF);
            case 3:
                Integer num4 = (Integer) obj;
                num4.getClass();
                S4.p pVar = (S4.p) this.f5356i.get(num4);
                if (pVar != null) {
                    return pVar.e();
                }
                return null;
            default:
                Integer numZ2 = O7.x.z0(((MyListItem) obj).f19875d);
                if (numZ2 != null) {
                    return (XtreamVODStream) this.f5356i.get(Integer.valueOf(numZ2.intValue()));
                }
                return null;
        }
    }
}
