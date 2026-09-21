package p110m7;

/* JADX INFO: renamed from: m7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2630c implements p110m7.w {
    static {
        int i3 = p110m7.C2635h.f25487b;
    }

    public final p110m7.AbstractC2629b b(java.io.ByteArrayInputStream byteArrayInputStream, p110m7.C2635h c2635h) throws p110m7.r {
        p110m7.AbstractC2629b abstractC2629b;
        try {
            int i3 = byteArrayInputStream.read();
            if (i3 == -1) {
                abstractC2629b = null;
            } else {
                if ((i3 & 128) != 0) {
                    i3 &= 127;
                    int i9 = 7;
                    while (true) {
                        if (i9 < 32) {
                            int i10 = byteArrayInputStream.read();
                            if (i10 == -1) {
                                throw p110m7.r.a();
                            }
                            i3 |= (i10 & 127) << i9;
                            if ((i10 & 128) == 0) {
                                break;
                            }
                            i9 += 7;
                        } else {
                            while (true) {
                                if (i9 >= 64) {
                                    throw new p110m7.r("CodedInputStream encountered a malformed varint.");
                                }
                                int i11 = byteArrayInputStream.read();
                                if (i11 == -1) {
                                    throw p110m7.r.a();
                                }
                                if ((i11 & 128) == 0) {
                                    break;
                                }
                                i9 += 7;
                            }
                        }
                    }
                }
                p110m7.C2633f c2633f = new p110m7.C2633f(new p110m7.C2628a(byteArrayInputStream, i3));
                p110m7.AbstractC2629b abstractC2629b2 = (p110m7.AbstractC2629b) a(c2633f, c2635h);
                try {
                    c2633f.a(0);
                    abstractC2629b = abstractC2629b2;
                } catch (p110m7.r e6) {
                    e6.f25503h = abstractC2629b2;
                    throw e6;
                }
            }
            if (abstractC2629b == null || abstractC2629b.isInitialized()) {
                return abstractC2629b;
            }
            p110m7.r rVar = new p110m7.r(new I3.b(12).getMessage());
            rVar.f25503h = abstractC2629b;
            throw rVar;
        } catch (java.io.IOException e9) {
            throw new p110m7.r(e9.getMessage());
        }
    }
}
