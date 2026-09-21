package p163t;

/* JADX INFO: loaded from: classes.dex */
public interface I0 extends p163t.J0 {
    int A();

    int G();

    @Override // p163t.G0
    default long b(p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return ((long) (G() + A())) * 1000000;
    }
}
