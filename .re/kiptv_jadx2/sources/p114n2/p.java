package p114n2;

import android.os.Bundle;
import kotlin.jvm.internal.m;
import p194x6.j;

public final class p implements j {

    public final int f25645h;

    public final Bundle f25646i;

    public p(int i3, Bundle bundle) {
        this.f25645h = i3;
        this.f25646i = bundle;
    }

    @Override
    public final Object invoke(Object obj) {
        String argName = (String) obj;
        switch (this.f25645h) {
            case 0:
                m.e(argName, "argName");
                Bundle source = this.f25646i;
                m.e(source, "source");
                return Boolean.valueOf(!source.containsKey(argName));
            default:
                m.e(argName, "key");
                Bundle source2 = this.f25646i;
                m.e(source2, "source");
                return Boolean.valueOf(!source2.containsKey(argName));
        }
    }
}
