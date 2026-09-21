package p050f3;

import android.content.Context;
import p058g3.b;
import p098l3.i;

public final class e implements b {

    public final int f21691a;

    public final Object f21692b;

    public e(int i3, Object obj) {
        this.f21691a = i3;
        this.f21692b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f21691a) {
            case 0:
                return new d((Context) ((e) this.f21692b).f21692b, new V1.b(24), new V1.b(23));
            case 1:
                String packageName = ((Context) ((e) this.f21692b).f21692b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 2:
                return new i((Context) ((e) this.f21692b).f21692b, Integer.valueOf(i.f24734k).intValue(), "com.google.android.datatransport.events");
            default:
                return this.f21692b;
        }
    }
}
