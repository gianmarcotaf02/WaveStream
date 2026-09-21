package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

public final class h implements PrivilegedAction {

    public final ArrayList f23862a;

    public h(ArrayList arrayList) {
        this.f23862a = arrayList;
    }

    @Override
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                i iVar = (i) i.class.cast(Class.forName(property, true, i.class.getClassLoader()).newInstance());
                i.b(iVar);
                this.f23862a.add(iVar);
                return null;
            } catch (Exception e6) {
                throw new Error(e6);
            }
        }
        i.b(new i());
        return null;
    }
}
