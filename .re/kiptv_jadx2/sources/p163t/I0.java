package p163t;

public interface I0 extends J0 {
    int A();

    int G();

    @Override
    default long b(r rVar, r rVar2, r rVar3) {
        return ((long) (G() + A())) * 1000000;
    }
}
