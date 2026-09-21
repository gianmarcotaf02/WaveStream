package w8;

import M8.InterfaceC0683k;

public final class x extends z {

    public final q f30668a;

    public final int f30669b;

    public final byte[] f30670c;

    public final int f30671d;

    public x(q qVar, byte[] bArr, int i3, int i9) {
        this.f30668a = qVar;
        this.f30669b = i3;
        this.f30670c = bArr;
        this.f30671d = i9;
    }

    @Override
    public final long contentLength() {
        return this.f30669b;
    }

    @Override
    public final q contentType() {
        return this.f30668a;
    }

    @Override
    public final void writeTo(InterfaceC0683k interfaceC0683k) {
        M8.D d4 = (M8.D) interfaceC0683k;
        byte[] source = this.f30670c;
        kotlin.jvm.internal.m.e(source, "source");
        if (d4.j) {
            throw new IllegalStateException("closed");
        }
        d4.f7216i.write(source, this.f30671d, this.f30669b);
        d4.b();
    }
}
