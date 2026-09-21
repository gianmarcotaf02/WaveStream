package Y0;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p070h6.A;
import p188x0.O;

public final class k extends kotlin.jvm.internal.o implements p194x6.m {

    public final int f11060h;

    public static final k f11044i = new k(2, 0);
    public static final k j = new k(2, 1);

    public static final k f11045k = new k(2, 2);

    public static final k f11046l = new k(2, 3);

    public static final k f11047m = new k(2, 4);

    public static final k f11048n = new k(2, 5);

    public static final k f11049o = new k(2, 6);

    public static final k f11050p = new k(2, 7);

    public static final k f11051q = new k(2, 8);

    public static final k f11052r = new k(2, 9);

    public static final k f11053s = new k(2, 10);

    public static final k f11054t = new k(2, 11);

    public static final k f11055u = new k(2, 12);

    public static final k f11056v = new k(2, 13);

    public static final k f11057w = new k(2, 14);

    public static final k f11058x = new k(2, 15);
    public static final k y = new k(2, 16);

    public static final k f11059z = new k(2, 17);

    public static final k f11041A = new k(2, 18);

    public static final k f11042B = new k(2, 19);

    public static final k f11043C = new k(2, 20);

    public k(int i3, int i9) {
        super(i3);
        this.f11060h = i9;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        String str;
        p070h6.e eVar;
        switch (this.f11060h) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = p078i6.w.f23205h;
                }
                return p078i6.o.A1(collection, list);
            case 1:
                return (p145r0.d) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayListO1 = p078i6.o.O1(list2);
                arrayListO1.addAll(list3);
                return arrayListO1;
            case 3:
                return (p145r0.n) obj;
            case 4:
                return (p145r0.f) obj;
            case 5:
                return (A) obj;
            case 6:
                return (A) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (A) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                i iVar = (i) obj;
                int i3 = ((i) obj2).f11038a;
                return iVar;
            case 12:
                return (O) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayListO2 = p078i6.o.O1(list4);
                arrayListO2.addAll(list5);
                return arrayListO2;
            case 15:
                Float f9 = (Float) obj;
                ((Number) obj2).floatValue();
                return f9;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f11024a) == null) {
                    str = aVar2.f11024a;
                }
                if (aVar == null || (eVar = aVar.f11025b) == null) {
                    eVar = aVar2.f11025b;
                }
                return new a(str, eVar);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                p pVar = (p) obj2;
                SemanticsConfiguration semanticsConfiguration = ((p) obj).f11094d;
                w wVar = t.f11136t;
                Object objG = semanticsConfiguration.f15960h.g(wVar);
                if (objG == null) {
                    objG = Float.valueOf(0.0f);
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = pVar.f11094d.f15960h.g(wVar);
                if (objG2 == null) {
                    objG2 = Float.valueOf(0.0f);
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objG2).floatValue()));
        }
    }
}
