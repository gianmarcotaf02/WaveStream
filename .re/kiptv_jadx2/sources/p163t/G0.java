package p163t;

public interface G0 {
    boolean a();

    long b(r rVar, r rVar2, r rVar3);

    r e(long j, r rVar, r rVar2, r rVar3);

    default r r(r rVar, r rVar2, r rVar3) {
        return u(b(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }

    r u(long j, r rVar, r rVar2, r rVar3);
}
