package p126o6;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p078i6.AbstractC2254e implements p126o6.a, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Enum[] f26144h;

    public b(java.lang.Enum[] entries) {
        kotlin.jvm.internal.m.e(entries, "entries");
        this.f26144h = entries;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return false;
        }
        java.lang.Enum element = (java.lang.Enum) obj;
        kotlin.jvm.internal.m.e(element, "element");
        return ((java.lang.Enum) p078i6.m.r0(this.f26144h, element.ordinal())) == element;
    }

    @Override // p078i6.AbstractC2250a
    public final int d() {
        return this.f26144h.length;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        java.lang.Enum[] enumArr = this.f26144h;
        int length = enumArr.length;
        if (i3 < 0 || i3 >= length) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, length, "index: ", ", size: "));
        }
        return enumArr[i3];
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum element = (java.lang.Enum) obj;
        kotlin.jvm.internal.m.e(element, "element");
        int iOrdinal = element.ordinal();
        if (((java.lang.Enum) p078i6.m.r0(this.f26144h, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum element = (java.lang.Enum) obj;
        kotlin.jvm.internal.m.e(element, "element");
        return indexOf(element);
    }
}
