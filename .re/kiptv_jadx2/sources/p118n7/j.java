package p118n7;

import A6.a;
import E6.u;
import kotlin.jvm.internal.m;

public final class j extends a {

    public final k f25881h;

    public j(Object obj, k kVar) {
        super(obj);
        this.f25881h = kVar;
    }

    @Override
    public final boolean beforeChange(u property, Object obj, Object obj2) {
        m.e(property, "property");
        if (this.f25881h.f25903a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
