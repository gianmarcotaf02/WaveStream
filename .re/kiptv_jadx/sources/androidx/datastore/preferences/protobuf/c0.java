package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends java.util.AbstractSet {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f16189i;

    public /* synthetic */ c0(java.util.Map map, int i3) {
        this.f16188h = i3;
        this.f16189i = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        switch (this.f16188h) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((androidx.datastore.preferences.protobuf.Z) this.f16189i).put((java.lang.Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((p110m7.A) this.f16189i).put((java.lang.Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f16188h) {
            case 0:
                ((androidx.datastore.preferences.protobuf.Z) this.f16189i).clear();
                break;
            case 1:
                ((p110m7.A) this.f16189i).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        switch (this.f16188h) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object obj2 = ((androidx.datastore.preferences.protobuf.Z) this.f16189i).get(entry.getKey());
                java.lang.Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
                java.lang.Object obj3 = ((p110m7.A) this.f16189i).get(entry2.getKey());
                java.lang.Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        switch (this.f16188h) {
            case 0:
                return new androidx.datastore.preferences.protobuf.b0((androidx.datastore.preferences.protobuf.Z) this.f16189i, 0);
            case 1:
                return new androidx.datastore.preferences.protobuf.b0((p110m7.A) this.f16189i, 1);
            default:
                return new p136q.C2659c((p136q.C2661e) this.f16189i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        switch (this.f16188h) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((androidx.datastore.preferences.protobuf.Z) this.f16189i).remove(entry.getKey());
                return true;
            case 1:
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((p110m7.A) this.f16189i).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f16188h) {
            case 0:
                return ((androidx.datastore.preferences.protobuf.Z) this.f16189i).size();
            case 1:
                return ((p110m7.A) this.f16189i).size();
            default:
                return ((p136q.C2661e) this.f16189i).j;
        }
    }
}
