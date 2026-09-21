package p153r8;

/* JADX INFO: renamed from: r8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2691d extends p153r8.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p153r8.M f26955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2691d(kotlinx.serialization.KSerializer eSerializer, int i3) {
        super(eSerializer);
        this.f26954b = i3;
        switch (i3) {
            case 1:
                kotlin.jvm.internal.m.e(eSerializer, "eSerializer");
                super(eSerializer);
                kotlinx.serialization.descriptors.SerialDescriptor elementDesc = eSerializer.getDescriptor();
                kotlin.jvm.internal.m.e(elementDesc, "elementDesc");
                this.f26955c = new p153r8.C2689c(elementDesc, 2);
                break;
            case 2:
                kotlin.jvm.internal.m.e(eSerializer, "eSerializer");
                super(eSerializer);
                kotlinx.serialization.descriptors.SerialDescriptor elementDesc2 = eSerializer.getDescriptor();
                kotlin.jvm.internal.m.e(elementDesc2, "elementDesc");
                this.f26955c = new p153r8.C2689c(elementDesc2, 3);
                break;
            default:
                kotlin.jvm.internal.m.e(eSerializer, "element");
                kotlinx.serialization.descriptors.SerialDescriptor elementDesc3 = eSerializer.getDescriptor();
                kotlin.jvm.internal.m.e(elementDesc3, "elementDesc");
                this.f26955c = new p153r8.C2689c(elementDesc3, 1);
                break;
        }
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object a() {
        switch (this.f26954b) {
            case 0:
                return new java.util.ArrayList();
            case 1:
                return new java.util.HashSet();
            default:
                return new java.util.LinkedHashSet();
        }
    }

    @Override // p153r8.AbstractC2685a
    public final int b(java.lang.Object obj) {
        switch (this.f26954b) {
            case 0:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                kotlin.jvm.internal.m.e(arrayList, "<this>");
                return arrayList.size();
            case 1:
                java.util.HashSet hashSet = (java.util.HashSet) obj;
                kotlin.jvm.internal.m.e(hashSet, "<this>");
                return hashSet.size();
            default:
                java.util.LinkedHashSet linkedHashSet = (java.util.LinkedHashSet) obj;
                kotlin.jvm.internal.m.e(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // p153r8.AbstractC2685a
    public final java.util.Iterator c(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) obj;
        kotlin.jvm.internal.m.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) obj;
        kotlin.jvm.internal.m.e(collection, "<this>");
        return collection.size();
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        switch (this.f26954b) {
            case 0:
                kotlin.jvm.internal.m.e(null, "<this>");
                return new java.util.ArrayList((java.util.Collection) null);
            case 1:
                kotlin.jvm.internal.m.e(null, "<this>");
                return new java.util.HashSet((java.util.Collection) null);
            default:
                kotlin.jvm.internal.m.e(null, "<this>");
                return new java.util.LinkedHashSet((java.util.Collection) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        switch (this.f26954b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (p153r8.C2689c) this.f26955c;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object h(java.lang.Object obj) {
        switch (this.f26954b) {
            case 0:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                kotlin.jvm.internal.m.e(arrayList, "<this>");
                return arrayList;
            case 1:
                java.util.HashSet hashSet = (java.util.HashSet) obj;
                kotlin.jvm.internal.m.e(hashSet, "<this>");
                return hashSet;
            default:
                java.util.LinkedHashSet linkedHashSet = (java.util.LinkedHashSet) obj;
                kotlin.jvm.internal.m.e(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // p153r8.r
    public final void i(java.lang.Object obj, int i3, java.lang.Object obj2) {
        switch (this.f26954b) {
            case 0:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                kotlin.jvm.internal.m.e(arrayList, "<this>");
                arrayList.add(i3, obj2);
                break;
            case 1:
                java.util.HashSet hashSet = (java.util.HashSet) obj;
                kotlin.jvm.internal.m.e(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                java.util.LinkedHashSet linkedHashSet = (java.util.LinkedHashSet) obj;
                kotlin.jvm.internal.m.e(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
