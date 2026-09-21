package E2;

import com.google.common.util.concurrent.D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

public final class e {

    public final List f2775a;

    public final List f2776b;

    public final List f2777c;

    public List f2778d;

    public List f2779e;

    public final p070h6.p f2780f;
    public final p070h6.p g;

    public e(List list, List list2, List list3, List list4, List list5) {
        this.f2775a = list;
        this.f2776b = list2;
        this.f2777c = list3;
        this.f2778d = list4;
        this.f2779e = list5;
        final int i3 = 0;
        this.f2780f = D.B(new Function0(this) {

            public final e f2768i;

            {
                this.f2768i = this;
            }

            @Override
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        e eVar = this.f2768i;
                        List list6 = eVar.f2778d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            p078i6.u.M0(arrayList, (List) ((Function0) list6.get(i9)).invoke());
                        }
                        eVar.f2778d = p078i6.w.f23205h;
                        return arrayList;
                    default:
                        e eVar2 = this.f2768i;
                        List list7 = eVar2.f2779e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            p078i6.u.M0(arrayList2, (List) ((Function0) list7.get(i10)).invoke());
                        }
                        eVar2.f2779e = p078i6.w.f23205h;
                        return arrayList2;
                }
            }
        });
        final int i9 = 1;
        this.g = D.B(new Function0(this) {

            public final e f2768i;

            {
                this.f2768i = this;
            }

            @Override
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        e eVar = this.f2768i;
                        List list6 = eVar.f2778d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            p078i6.u.M0(arrayList, (List) ((Function0) list6.get(i10)).invoke());
                        }
                        eVar.f2778d = p078i6.w.f23205h;
                        return arrayList;
                    default:
                        e eVar2 = this.f2768i;
                        List list7 = eVar2.f2779e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            p078i6.u.M0(arrayList2, (List) ((Function0) list7.get(i11)).invoke());
                        }
                        eVar2.f2779e = p078i6.w.f23205h;
                        return arrayList2;
                }
            }
        });
    }
}
