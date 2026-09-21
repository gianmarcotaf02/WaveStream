package p119n8;

import java.util.ArrayList;
import kotlin.jvm.internal.m;

public final class b extends j {

    public final ArrayList f25937h;

    public b(ArrayList missingFields, String str, b bVar) {
        super(str, bVar);
        m.e(missingFields, "missingFields");
        this.f25937h = missingFields;
    }

    public b(String serialName, ArrayList arrayList) {
        String str;
        m.e(serialName, "serialName");
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(arrayList, str, null);
    }
}
