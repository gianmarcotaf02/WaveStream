package p163t;

/* JADX INFO: loaded from: classes.dex */
public interface G0 {
    boolean a();

    long b(p163t.r rVar, p163t.r rVar2, p163t.r rVar3);

    p163t.r e(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3);

    default p163t.r r(p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return u(b(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }

    p163t.r u(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3);
}
