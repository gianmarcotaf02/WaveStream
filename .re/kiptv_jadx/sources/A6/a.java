package A6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements A6.c {
    private java.lang.Object value;

    public a(java.lang.Object obj) {
        this.value = obj;
    }

    public boolean beforeChange(E6.u property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.m.e(property, "property");
        return true;
    }

    @Override // A6.b
    public java.lang.Object getValue(java.lang.Object obj, E6.u property) {
        kotlin.jvm.internal.m.e(property, "property");
        return this.value;
    }

    @Override // A6.c
    public void setValue(java.lang.Object obj, E6.u property, java.lang.Object obj2) {
        kotlin.jvm.internal.m.e(property, "property");
        java.lang.Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    public java.lang.String toString() {
        return B2.a.n(new java.lang.StringBuilder("ObservableProperty(value="), this.value, ')');
    }

    public void afterChange(E6.u uVar, java.lang.Object obj, java.lang.Object obj2) {
    }
}
