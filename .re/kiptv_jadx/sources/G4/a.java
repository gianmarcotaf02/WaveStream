package G4;

/* JADX INFO: loaded from: classes.dex */
public final class a implements G4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3787a;

    public a(int i3) {
        this.f3787a = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
        return G4.d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G4.d)) {
            return false;
        }
        G4.a aVar = (G4.a) ((G4.d) obj);
        if (this.f3787a != aVar.f3787a) {
            return false;
        }
        java.lang.Object obj2 = G4.c.f3789h;
        aVar.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f3787a) + (G4.c.f3789h.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3787a + "intEncoding=" + G4.c.f3789h + ')';
    }
}
