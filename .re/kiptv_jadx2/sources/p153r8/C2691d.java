package p153r8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class C2691d extends r {

    public final int f26954b;

    public final M f26955c;

    public C2691d(KSerializer eSerializer, int i3) {
        super(eSerializer);
        this.f26954b = i3;
        switch (i3) {
            case 1:
                m.e(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc = eSerializer.getDescriptor();
                m.e(elementDesc, "elementDesc");
                this.f26955c = new C2689c(elementDesc, 2);
                break;
            case 2:
                m.e(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc2 = eSerializer.getDescriptor();
                m.e(elementDesc2, "elementDesc");
                this.f26955c = new C2689c(elementDesc2, 3);
                break;
            default:
                m.e(eSerializer, "element");
                SerialDescriptor elementDesc3 = eSerializer.getDescriptor();
                m.e(elementDesc3, "elementDesc");
                this.f26955c = new C2689c(elementDesc3, 1);
                break;
        }
    }

    @Override
    public final Object a() {
        switch (this.f26954b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override
    public final int b(Object obj) {
        switch (this.f26954b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m.e(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                m.e(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                m.e(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        m.e(collection, "<this>");
        return collection.iterator();
    }

    @Override
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        m.e(collection, "<this>");
        return collection.size();
    }

    @Override
    public final Object g(Object obj) {
        switch (this.f26954b) {
            case 0:
                m.e(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                m.e(null, "<this>");
                return new HashSet((Collection) null);
            default:
                m.e(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        switch (this.f26954b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (C2689c) this.f26955c;
    }

    @Override
    public final Object h(Object obj) {
        switch (this.f26954b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m.e(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                m.e(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                m.e(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override
    public final void i(Object obj, int i3, Object obj2) {
        switch (this.f26954b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m.e(arrayList, "<this>");
                arrayList.add(i3, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                m.e(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                m.e(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
