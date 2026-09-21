package p135p8;

import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p078i6.w;

public final class a {

    public final String f26254a;

    public List f26255b;

    public final ArrayList f26256c;

    public final HashSet f26257d;

    public final ArrayList f26258e;

    public final ArrayList f26259f;
    public final ArrayList g;

    public a(String serialName) {
        m.e(serialName, "serialName");
        this.f26254a = serialName;
        this.f26255b = w.f23205h;
        this.f26256c = new ArrayList();
        this.f26257d = new HashSet();
        this.f26258e = new ArrayList();
        this.f26259f = new ArrayList();
        this.g = new ArrayList();
    }

    public final void a(String elementName, SerialDescriptor descriptor, boolean z6) {
        w wVar = w.f23205h;
        m.e(elementName, "elementName");
        m.e(descriptor, "descriptor");
        if (!this.f26257d.add(elementName)) {
            StringBuilder sbQ = M0.q("Element with name '", elementName, "' is already registered in ");
            sbQ.append(this.f26254a);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        this.f26256c.add(elementName);
        this.f26258e.add(descriptor);
        this.f26259f.add(wVar);
        this.g.add(Boolean.valueOf(z6));
    }
}
