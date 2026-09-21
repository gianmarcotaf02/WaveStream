package U;

import com.kiptv.core.model.ContentTypeSettings;
import java.util.ArrayList;

public final class T implements p194x6.j {

    public final int f9938h;

    public final ArrayList f9939i;

    public T(int i3, ArrayList arrayList) {
        this.f9938h = i3;
        this.f9939i = arrayList;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f9938h) {
            case 0:
                O0.f0 f0Var = (O0.f0) obj;
                ArrayList arrayList = this.f9939i;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f0Var.g((O0.g0) arrayList.get(i3), 0, 0, 0.0f);
                }
                return p070h6.A.f22523a;
            default:
                ContentTypeSettings it = (ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return ContentTypeSettings.a(it, null, p078i6.o.c1(p078i6.o.A1(it.f19690b, this.f9939i)), null, null, null, null, null, null, null, null, null, null, null, null, 16381);
        }
    }
}
