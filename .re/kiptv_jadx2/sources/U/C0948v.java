package U;

import androidx.datastore.preferences.protobuf.AbstractC1503j;
import androidx.datastore.preferences.protobuf.AbstractC1514v;
import androidx.datastore.preferences.protobuf.AbstractC1516x;
import androidx.datastore.preferences.protobuf.C1500g;
import androidx.datastore.preferences.protobuf.C1507n;
import androidx.datastore.preferences.protobuf.C1517y;
import androidx.datastore.preferences.protobuf.C1518z;
import androidx.datastore.preferences.protobuf.InterfaceC1515w;
import androidx.media3.common.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.AbstractC1910e;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1919n;
import com.google.crypto.tink.shaded.protobuf.AbstractC1924t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1929y;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public final class C0948v {

    public final int f10085a;

    public int f10086b;

    public int f10087c;

    public int f10088d;

    public Object f10089e;

    public C0948v(int i3) {
        this.f10085a = i3;
    }

    public static void X(int i3) throws com.google.crypto.tink.shaded.protobuf.D {
        if ((i3 & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.D.f();
        }
    }

    public static void Y(int i3) throws com.google.crypto.tink.shaded.protobuf.D {
        if ((i3 & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.D.f();
        }
    }

    public void A(InterfaceC1515w interfaceC1515w) throws C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 2) {
            int iD = abstractC1503j.D();
            if ((iD & 3) != 0) {
                throw new C1518z("Failed to parse the message.");
            }
            int iF = abstractC1503j.f() + iD;
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Float.valueOf(abstractC1503j.t()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        if (i3 != 5) {
            throw C1518z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Float.valueOf(abstractC1503j.t()));
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void B(List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1924t;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 2) {
                int iD = abstractC1503j.D();
                X(iD);
                int iF = abstractC1503j.f() + iD;
                do {
                    list.add(Float.valueOf(abstractC1503j.t()));
                } while (abstractC1503j.f() < iF);
                return;
            }
            if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            do {
                list.add(Float.valueOf(abstractC1503j.t()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        AbstractC1924t abstractC1924t = (AbstractC1924t) list;
        int i9 = this.f10086b & 7;
        if (i9 == 2) {
            int iD2 = abstractC1503j.D();
            X(iD2);
            int iF2 = abstractC1503j.f() + iD2;
            do {
                abstractC1924t.e(abstractC1503j.t());
            } while (abstractC1503j.f() < iF2);
            return;
        }
        if (i9 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        do {
            abstractC1924t.e(abstractC1503j.t());
            if (abstractC1503j.g()) {
                return;
            } else {
                iC2 = abstractC1503j.C();
            }
        } while (iC2 == this.f10086b);
        this.f10088d = iC2;
    }

    public void C(InterfaceC1515w interfaceC1515w) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.u()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.u()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void D(List list) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1929y;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1503j.u()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iF = abstractC1503j.f() + abstractC1503j.D();
            do {
                list.add(Integer.valueOf(abstractC1503j.u()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        AbstractC1929y abstractC1929y = (AbstractC1929y) list;
        int i9 = this.f10086b & 7;
        if (i9 == 0) {
            do {
                abstractC1929y.e(abstractC1503j.u());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iF2 = abstractC1503j.f() + abstractC1503j.D();
        do {
            abstractC1929y.e(abstractC1503j.u());
        } while (abstractC1503j.f() < iF2);
        U(iF2);
    }

    public void E(InterfaceC1515w interfaceC1515w) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.v()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.v()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void F(List list) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1503j.v()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iF = abstractC1503j.f() + abstractC1503j.D();
            do {
                list.add(Long.valueOf(abstractC1503j.v()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.K k9 = (com.google.crypto.tink.shaded.protobuf.K) list;
        int i9 = this.f10086b & 7;
        if (i9 == 0) {
            do {
                k9.e(abstractC1503j.v());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iF2 = abstractC1503j.f() + abstractC1503j.D();
        do {
            k9.e(abstractC1503j.v());
        } while (abstractC1503j.f() < iF2);
        U(iF2);
    }

    public void G(InterfaceC1515w interfaceC1515w) throws C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 2) {
            int iD = abstractC1503j.D();
            if ((iD & 3) != 0) {
                throw new C1518z("Failed to parse the message.");
            }
            int iF = abstractC1503j.f() + iD;
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.w()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        if (i3 != 5) {
            throw C1518z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.w()));
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void H(List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1929y;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 2) {
                int iD = abstractC1503j.D();
                X(iD);
                int iF = abstractC1503j.f() + iD;
                do {
                    list.add(Integer.valueOf(abstractC1503j.w()));
                } while (abstractC1503j.f() < iF);
                return;
            }
            if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            do {
                list.add(Integer.valueOf(abstractC1503j.w()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        AbstractC1929y abstractC1929y = (AbstractC1929y) list;
        int i9 = this.f10086b & 7;
        if (i9 == 2) {
            int iD2 = abstractC1503j.D();
            X(iD2);
            int iF2 = abstractC1503j.f() + iD2;
            do {
                abstractC1929y.e(abstractC1503j.w());
            } while (abstractC1503j.f() < iF2);
            return;
        }
        if (i9 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        do {
            abstractC1929y.e(abstractC1503j.w());
            if (abstractC1503j.g()) {
                return;
            } else {
                iC2 = abstractC1503j.C();
            }
        } while (iC2 == this.f10086b);
        this.f10088d = iC2;
    }

    public void I(InterfaceC1515w interfaceC1515w) throws C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.x()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iD = abstractC1503j.D();
        if ((iD & 7) != 0) {
            throw new C1518z("Failed to parse the message.");
        }
        int iF = abstractC1503j.f() + iD;
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.x()));
        } while (abstractC1503j.f() < iF);
    }

    public void J(List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(abstractC1503j.x()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iD = abstractC1503j.D();
            Y(iD);
            int iF = abstractC1503j.f() + iD;
            do {
                list.add(Long.valueOf(abstractC1503j.x()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.K k9 = (com.google.crypto.tink.shaded.protobuf.K) list;
        int i9 = this.f10086b & 7;
        if (i9 == 1) {
            do {
                k9.e(abstractC1503j.x());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iD2 = abstractC1503j.D();
        Y(iD2);
        int iF2 = abstractC1503j.f() + iD2;
        do {
            k9.e(abstractC1503j.x());
        } while (abstractC1503j.f() < iF2);
    }

    public void K(InterfaceC1515w interfaceC1515w) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.y()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.y()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void L(List list) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1929y;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1503j.y()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iF = abstractC1503j.f() + abstractC1503j.D();
            do {
                list.add(Integer.valueOf(abstractC1503j.y()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        AbstractC1929y abstractC1929y = (AbstractC1929y) list;
        int i9 = this.f10086b & 7;
        if (i9 == 0) {
            do {
                abstractC1929y.e(abstractC1503j.y());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iF2 = abstractC1503j.f() + abstractC1503j.D();
        do {
            abstractC1929y.e(abstractC1503j.y());
        } while (abstractC1503j.f() < iF2);
        U(iF2);
    }

    public void M(InterfaceC1515w interfaceC1515w) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.z()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.z()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void N(List list) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1503j.z()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iF = abstractC1503j.f() + abstractC1503j.D();
            do {
                list.add(Long.valueOf(abstractC1503j.z()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.K k9 = (com.google.crypto.tink.shaded.protobuf.K) list;
        int i9 = this.f10086b & 7;
        if (i9 == 0) {
            do {
                k9.e(abstractC1503j.z());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iF2 = abstractC1503j.f() + abstractC1503j.D();
        do {
            k9.e(abstractC1503j.z());
        } while (abstractC1503j.f() < iF2);
        U(iF2);
    }

    public void O(InterfaceC1515w interfaceC1515w, boolean z6) throws C1517y, com.google.crypto.tink.shaded.protobuf.C {
        String strA;
        int iC;
        if ((this.f10086b & 7) != 2) {
            throw C1518z.b();
        }
        do {
            AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
            if (z6) {
                V(2);
                strA = abstractC1503j.B();
            } else {
                V(2);
                strA = abstractC1503j.A();
            }
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(strA);
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void P(List list, boolean z6) throws C1517y, com.google.crypto.tink.shaded.protobuf.C {
        String strA;
        int iC;
        int iC2;
        if ((this.f10086b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.G;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (z9 && !z6) {
            com.google.crypto.tink.shaded.protobuf.G g = (com.google.crypto.tink.shaded.protobuf.G) list;
            do {
                g.j(o());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        do {
            if (z6) {
                V(2);
                strA = abstractC1503j.B();
            } else {
                V(2);
                strA = abstractC1503j.A();
            }
            list.add(strA);
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void Q(InterfaceC1515w interfaceC1515w) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.D()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.D()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void R(List list) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1929y;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1503j.D()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iF = abstractC1503j.f() + abstractC1503j.D();
            do {
                list.add(Integer.valueOf(abstractC1503j.D()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        AbstractC1929y abstractC1929y = (AbstractC1929y) list;
        int i9 = this.f10086b & 7;
        if (i9 == 0) {
            do {
                abstractC1929y.e(abstractC1503j.D());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iF2 = abstractC1503j.f() + abstractC1503j.D();
        do {
            abstractC1929y.e(abstractC1503j.D());
        } while (abstractC1503j.f() < iF2);
        U(iF2);
    }

    public void S(InterfaceC1515w interfaceC1515w) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.E()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.E()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void T(List list) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1503j.E()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iF = abstractC1503j.f() + abstractC1503j.D();
            do {
                list.add(Long.valueOf(abstractC1503j.E()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.K k9 = (com.google.crypto.tink.shaded.protobuf.K) list;
        int i9 = this.f10086b & 7;
        if (i9 == 0) {
            do {
                k9.e(abstractC1503j.E());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iF2 = abstractC1503j.f() + abstractC1503j.D();
        do {
            k9.e(abstractC1503j.E());
        } while (abstractC1503j.f() < iF2);
        U(iF2);
    }

    public void U(int i3) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        switch (this.f10085a) {
            case 1:
                if (((AbstractC1503j) this.f10089e).f() != i3) {
                    throw C1518z.e();
                }
                return;
            default:
                if (((AbstractC1503j) this.f10089e).f() != i3) {
                    throw com.google.crypto.tink.shaded.protobuf.D.g();
                }
                return;
        }
    }

    public void V(int i3) throws C1517y, com.google.crypto.tink.shaded.protobuf.C {
        switch (this.f10085a) {
            case 1:
                if ((this.f10086b & 7) != i3) {
                    throw C1518z.b();
                }
                return;
            default:
                if ((this.f10086b & 7) != i3) {
                    throw com.google.crypto.tink.shaded.protobuf.D.c();
                }
                return;
        }
    }

    public boolean W() {
        int i3;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (abstractC1503j.g() || (i3 = this.f10086b) == this.f10087c) {
            return false;
        }
        return abstractC1503j.F(i3);
    }

    public void a(int i3, int i9) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i10 = this.f10088d;
        int i11 = i10 * 2;
        int[] iArr = (int[]) this.f10089e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f10089e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i11 >= iArr.length) {
            int[] iArr3 = new int[i10 * 4];
            this.f10089e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f10089e;
        iArr4[i11] = i3;
        iArr4[i11 + 1] = i9;
        this.f10088d++;
    }

    public C0950x b(int i3) {
        return new C0950x(P3.e.f0((p011b1.J) this.f10089e, i3), i3, 1L);
    }

    public void c(RecyclerView recyclerView, boolean z6) {
        this.f10088d = 0;
        int[] iArr = (int[]) this.f10089e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        androidx.recyclerview.widget.I i3 = recyclerView.f17314u;
        if (recyclerView.f17312t == null || i3 == null || !i3.f17211h) {
            return;
        }
        if (z6) {
            if (!recyclerView.f17296l.j()) {
                i3.h(recyclerView.f17312t.getItemCount(), this);
            }
        } else if (!recyclerView.I()) {
            i3.g(this.f10086b, this.f10087c, recyclerView.f17299m0, this);
        }
        int i9 = this.f10088d;
        if (i9 > i3.f17212i) {
            i3.f17212i = i9;
            i3.j = z6;
            recyclerView.j.m();
        }
    }

    public int d() {
        return this.f10088d - this.f10087c;
    }

    public int e() {
        switch (this.f10085a) {
            case 1:
                int i3 = this.f10088d;
                if (i3 != 0) {
                    this.f10086b = i3;
                    this.f10088d = 0;
                } else {
                    this.f10086b = ((AbstractC1503j) this.f10089e).C();
                }
                int i9 = this.f10086b;
                return (i9 == 0 || i9 == this.f10087c) ? Log.LOG_LEVEL_OFF : i9 >>> 3;
            default:
                int i10 = this.f10088d;
                if (i10 != 0) {
                    this.f10086b = i10;
                    this.f10088d = 0;
                } else {
                    this.f10086b = ((AbstractC1503j) this.f10089e).C();
                }
                int i11 = this.f10086b;
                return (i11 == 0 || i11 == this.f10087c) ? Log.LOG_LEVEL_OFF : i11 >>> 3;
        }
    }

    public int f(int i3) {
        return ((p030d0.L) this.f10089e).f21115f[this.f10087c + i3];
    }

    public Object g(int i3) {
        return ((p030d0.L) this.f10089e).f21116h[this.f10088d + i3];
    }

    public void h(Object obj, androidx.datastore.preferences.protobuf.X x9, C1507n c1507n) {
        int i3 = this.f10087c;
        this.f10087c = ((this.f10086b >>> 3) << 3) | 4;
        try {
            x9.g(obj, this, c1507n);
            if (this.f10086b != this.f10087c) {
                throw new C1518z("Failed to parse the message.");
            }
            this.f10087c = i3;
        } catch (Throwable th) {
            this.f10087c = i3;
            throw th;
        }
    }

    public void i(Object obj, com.google.crypto.tink.shaded.protobuf.d0 d0Var, C1921p c1921p) {
        int i3 = this.f10087c;
        this.f10087c = ((this.f10086b >>> 3) << 3) | 4;
        try {
            d0Var.e(obj, this, c1921p);
            if (this.f10086b != this.f10087c) {
                throw com.google.crypto.tink.shaded.protobuf.D.f();
            }
            this.f10087c = i3;
        } catch (Throwable th) {
            this.f10087c = i3;
            throw th;
        }
    }

    public void j(Object obj, androidx.datastore.preferences.protobuf.X x9, C1507n c1507n) throws C1518z {
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        int iD = abstractC1503j.D();
        if (abstractC1503j.f16218a >= 100) {
            throw new C1518z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iL = abstractC1503j.l(iD);
        abstractC1503j.f16218a++;
        x9.g(obj, this, c1507n);
        abstractC1503j.b(0);
        abstractC1503j.f16218a--;
        abstractC1503j.j(iL);
    }

    public void k(Object obj, com.google.crypto.tink.shaded.protobuf.d0 d0Var, C1921p c1921p) throws com.google.crypto.tink.shaded.protobuf.D {
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        int iD = abstractC1503j.D();
        if (abstractC1503j.f16218a >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.D("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iL = abstractC1503j.l(iD);
        abstractC1503j.f16218a++;
        d0Var.e(obj, this, c1921p);
        abstractC1503j.b(0);
        abstractC1503j.f16218a--;
        abstractC1503j.j(iL);
    }

    public void l(InterfaceC1515w interfaceC1515w) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Boolean.valueOf(abstractC1503j.m()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Boolean.valueOf(abstractC1503j.m()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void m(List list) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1910e;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC1503j.m()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iF = abstractC1503j.f() + abstractC1503j.D();
            do {
                list.add(Boolean.valueOf(abstractC1503j.m()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        AbstractC1910e abstractC1910e = (AbstractC1910e) list;
        int i9 = this.f10086b & 7;
        if (i9 == 0) {
            do {
                abstractC1910e.e(abstractC1503j.m());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iF2 = abstractC1503j.f() + abstractC1503j.D();
        do {
            abstractC1910e.e(abstractC1503j.m());
        } while (abstractC1503j.f() < iF2);
        U(iF2);
    }

    public C1500g n() throws C1517y, com.google.crypto.tink.shaded.protobuf.C {
        V(2);
        return ((AbstractC1503j) this.f10089e).n();
    }

    public AbstractC1915j o() throws C1517y, com.google.crypto.tink.shaded.protobuf.C {
        V(2);
        return ((AbstractC1503j) this.f10089e).o();
    }

    public void p(InterfaceC1515w interfaceC1515w) throws C1517y {
        int iC;
        if ((this.f10086b & 7) != 2) {
            throw C1518z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(n());
            AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void q(List list) throws com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        if ((this.f10086b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        do {
            list.add(o());
            AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void r(InterfaceC1515w interfaceC1515w) throws C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Double.valueOf(abstractC1503j.p()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iD = abstractC1503j.D();
        if ((iD & 7) != 0) {
            throw new C1518z("Failed to parse the message.");
        }
        int iF = abstractC1503j.f() + iD;
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Double.valueOf(abstractC1503j.p()));
        } while (abstractC1503j.f() < iF);
    }

    public void s(List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1919n;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(abstractC1503j.p()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iD = abstractC1503j.D();
            Y(iD);
            int iF = abstractC1503j.f() + iD;
            do {
                list.add(Double.valueOf(abstractC1503j.p()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        AbstractC1919n abstractC1919n = (AbstractC1919n) list;
        int i9 = this.f10086b & 7;
        if (i9 == 1) {
            do {
                abstractC1919n.e(abstractC1503j.p());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iD2 = abstractC1503j.D();
        Y(iD2);
        int iF2 = abstractC1503j.f() + iD2;
        do {
            abstractC1919n.e(abstractC1503j.p());
        } while (abstractC1503j.f() < iF2);
    }

    public void t(InterfaceC1515w interfaceC1515w) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.q()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.q()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public String toString() {
        switch (this.f10085a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i3 = this.f10086b;
                sb.append(i3);
                sb.append('-');
                p011b1.J j = (p011b1.J) this.f10089e;
                sb.append(P3.e.f0(j, i3));
                sb.append(',');
                int i9 = this.f10087c;
                sb.append(i9);
                sb.append('-');
                sb.append(P3.e.f0(j, i9));
                sb.append("), prevOffset=");
                return Y6.f.j(sb, this.f10088d, ')');
            case 5:
                return "";
            default:
                return super.toString();
        }
    }

    public void u(List list) throws C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1929y;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1503j.q()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iF = abstractC1503j.f() + abstractC1503j.D();
            do {
                list.add(Integer.valueOf(abstractC1503j.q()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        AbstractC1929y abstractC1929y = (AbstractC1929y) list;
        int i9 = this.f10086b & 7;
        if (i9 == 0) {
            do {
                abstractC1929y.e(abstractC1503j.q());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iF2 = abstractC1503j.f() + abstractC1503j.D();
        do {
            abstractC1929y.e(abstractC1503j.q());
        } while (abstractC1503j.f() < iF2);
        U(iF2);
    }

    public Object v(androidx.datastore.preferences.protobuf.s0 s0Var, Class cls, C1507n c1507n) throws C1518z, com.google.crypto.tink.shaded.protobuf.C {
        int iOrdinal = s0Var.ordinal();
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        switch (iOrdinal) {
            case 0:
                V(1);
                return Double.valueOf(abstractC1503j.p());
            case 1:
                V(5);
                return Float.valueOf(abstractC1503j.t());
            case 2:
                V(0);
                return Long.valueOf(abstractC1503j.v());
            case 3:
                V(0);
                return Long.valueOf(abstractC1503j.E());
            case 4:
                V(0);
                return Integer.valueOf(abstractC1503j.u());
            case 5:
                V(1);
                return Long.valueOf(abstractC1503j.s());
            case 6:
                V(5);
                return Integer.valueOf(abstractC1503j.r());
            case 7:
                V(0);
                return Boolean.valueOf(abstractC1503j.m());
            case 8:
                V(2);
                return abstractC1503j.B();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                V(2);
                androidx.datastore.preferences.protobuf.X xA = androidx.datastore.preferences.protobuf.U.f16162c.a(cls);
                AbstractC1514v abstractC1514vD = xA.d();
                j(abstractC1514vD, xA, c1507n);
                xA.b(abstractC1514vD);
                return abstractC1514vD;
            case 11:
                return n();
            case 12:
                V(0);
                return Integer.valueOf(abstractC1503j.D());
            case 13:
                V(0);
                return Integer.valueOf(abstractC1503j.q());
            case 14:
                V(5);
                return Integer.valueOf(abstractC1503j.w());
            case 15:
                V(1);
                return Long.valueOf(abstractC1503j.x());
            case 16:
                V(0);
                return Integer.valueOf(abstractC1503j.y());
            case 17:
                V(0);
                return Long.valueOf(abstractC1503j.z());
        }
    }

    public void w(InterfaceC1515w interfaceC1515w) throws C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 2) {
            int iD = abstractC1503j.D();
            if ((iD & 3) != 0) {
                throw new C1518z("Failed to parse the message.");
            }
            int iF = abstractC1503j.f() + iD;
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.r()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        if (i3 != 5) {
            throw C1518z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Integer.valueOf(abstractC1503j.r()));
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void x(List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof AbstractC1929y;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 2) {
                int iD = abstractC1503j.D();
                X(iD);
                int iF = abstractC1503j.f() + iD;
                do {
                    list.add(Integer.valueOf(abstractC1503j.r()));
                } while (abstractC1503j.f() < iF);
                return;
            }
            if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            do {
                list.add(Integer.valueOf(abstractC1503j.r()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        AbstractC1929y abstractC1929y = (AbstractC1929y) list;
        int i9 = this.f10086b & 7;
        if (i9 == 2) {
            int iD2 = abstractC1503j.D();
            X(iD2);
            int iF2 = abstractC1503j.f() + iD2;
            do {
                abstractC1929y.e(abstractC1503j.r());
            } while (abstractC1503j.f() < iF2);
            return;
        }
        if (i9 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        do {
            abstractC1929y.e(abstractC1503j.r());
            if (abstractC1503j.g()) {
                return;
            } else {
                iC2 = abstractC1503j.C();
            }
        } while (iC2 == this.f10086b);
        this.f10088d = iC2;
    }

    public void y(InterfaceC1515w interfaceC1515w) throws C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (i3 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.s()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        if (i3 != 2) {
            throw C1518z.b();
        }
        int iD = abstractC1503j.D();
        if ((iD & 7) != 0) {
            throw new C1518z("Failed to parse the message.");
        }
        int iF = abstractC1503j.f() + iD;
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(Long.valueOf(abstractC1503j.s()));
        } while (abstractC1503j.f() < iF);
    }

    public void z(List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(abstractC1503j.s()));
                    if (abstractC1503j.g()) {
                        return;
                    } else {
                        iC = abstractC1503j.C();
                    }
                } while (iC == this.f10086b);
                this.f10088d = iC;
                return;
            }
            if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            int iD = abstractC1503j.D();
            Y(iD);
            int iF = abstractC1503j.f() + iD;
            do {
                list.add(Long.valueOf(abstractC1503j.s()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.K k9 = (com.google.crypto.tink.shaded.protobuf.K) list;
        int i9 = this.f10086b & 7;
        if (i9 == 1) {
            do {
                k9.e(abstractC1503j.s());
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC2 = abstractC1503j.C();
                }
            } while (iC2 == this.f10086b);
            this.f10088d = iC2;
            return;
        }
        if (i9 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        int iD2 = abstractC1503j.D();
        Y(iD2);
        int iF2 = abstractC1503j.f() + iD2;
        do {
            k9.e(abstractC1503j.s());
        } while (abstractC1503j.f() < iF2);
    }

    public C0948v(AbstractC1503j abstractC1503j) {
        this.f10085a = 1;
        this.f10088d = 0;
        Charset charset = AbstractC1516x.f16267a;
        this.f10089e = abstractC1503j;
        abstractC1503j.f16219b = this;
    }

    public C0948v(AbstractC1503j abstractC1503j, byte b9) {
        this.f10085a = 3;
        this.f10088d = 0;
        com.google.crypto.tink.shaded.protobuf.B.a(abstractC1503j, "input");
        this.f10089e = abstractC1503j;
        abstractC1503j.f16219b = this;
    }

    public C0948v(p030d0.L l2) {
        this.f10085a = 4;
        this.f10089e = l2;
    }

    public C0948v(int i3, int i9, int i10, p011b1.J j) {
        this.f10085a = 0;
        this.f10086b = i3;
        this.f10087c = i9;
        this.f10088d = i10;
        this.f10089e = j;
    }
}
