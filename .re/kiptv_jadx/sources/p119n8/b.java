package p119n8;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p119n8.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f25937h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.ArrayList missingFields, java.lang.String str, p119n8.b bVar) {
        super(str, bVar);
        kotlin.jvm.internal.m.e(missingFields, "missingFields");
        this.f25937h = missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(java.lang.String serialName, java.util.ArrayList arrayList) {
        java.lang.String str;
        kotlin.jvm.internal.m.e(serialName, "serialName");
        if (arrayList.size() == 1) {
            str = "Field '" + ((java.lang.String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(arrayList, str, null);
    }
}
