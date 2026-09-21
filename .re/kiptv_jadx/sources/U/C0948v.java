package U;

/* JADX INFO: renamed from: U.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0948v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f10089e;

    public /* synthetic */ C0948v(int i3) {
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

    public void A(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 2) {
            int iD = abstractC1503j.D();
            if ((iD & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.C1518z("Failed to parse the message.");
            }
            int iF = abstractC1503j.f() + iD;
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Float.valueOf(abstractC1503j.t()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        if (i3 != 5) {
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Float.valueOf(abstractC1503j.t()));
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void B(java.util.List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1924t;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 2) {
                int iD = abstractC1503j.D();
                X(iD);
                int iF = abstractC1503j.f() + iD;
                do {
                    list.add(java.lang.Float.valueOf(abstractC1503j.t()));
                } while (abstractC1503j.f() < iF);
                return;
            }
            if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            do {
                list.add(java.lang.Float.valueOf(abstractC1503j.t()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1924t abstractC1924t = (com.google.crypto.tink.shaded.protobuf.AbstractC1924t) list;
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

    public void C(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.u()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.u()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void D(java.util.List list) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1929y;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(java.lang.Integer.valueOf(abstractC1503j.u()));
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
                list.add(java.lang.Integer.valueOf(abstractC1503j.u()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1929y abstractC1929y = (com.google.crypto.tink.shaded.protobuf.AbstractC1929y) list;
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

    public void E(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.v()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.v()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void F(java.util.List list) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(java.lang.Long.valueOf(abstractC1503j.v()));
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
                list.add(java.lang.Long.valueOf(abstractC1503j.v()));
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

    public void G(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 2) {
            int iD = abstractC1503j.D();
            if ((iD & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.C1518z("Failed to parse the message.");
            }
            int iF = abstractC1503j.f() + iD;
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.w()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        if (i3 != 5) {
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.w()));
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void H(java.util.List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1929y;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 2) {
                int iD = abstractC1503j.D();
                X(iD);
                int iF = abstractC1503j.f() + iD;
                do {
                    list.add(java.lang.Integer.valueOf(abstractC1503j.w()));
                } while (abstractC1503j.f() < iF);
                return;
            }
            if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            do {
                list.add(java.lang.Integer.valueOf(abstractC1503j.w()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1929y abstractC1929y = (com.google.crypto.tink.shaded.protobuf.AbstractC1929y) list;
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

    public void I(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.x()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iD = abstractC1503j.D();
        if ((iD & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Failed to parse the message.");
        }
        int iF = abstractC1503j.f() + iD;
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.x()));
        } while (abstractC1503j.f() < iF);
    }

    public void J(java.util.List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 1) {
                do {
                    list.add(java.lang.Long.valueOf(abstractC1503j.x()));
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
                list.add(java.lang.Long.valueOf(abstractC1503j.x()));
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

    public void K(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.y()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.y()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void L(java.util.List list) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1929y;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(java.lang.Integer.valueOf(abstractC1503j.y()));
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
                list.add(java.lang.Integer.valueOf(abstractC1503j.y()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1929y abstractC1929y = (com.google.crypto.tink.shaded.protobuf.AbstractC1929y) list;
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

    public void M(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.z()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.z()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void N(java.util.List list) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(java.lang.Long.valueOf(abstractC1503j.z()));
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
                list.add(java.lang.Long.valueOf(abstractC1503j.z()));
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

    public void O(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w, boolean z6) throws androidx.datastore.preferences.protobuf.C1517y, com.google.crypto.tink.shaded.protobuf.C {
        java.lang.String strA;
        int iC;
        if ((this.f10086b & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        do {
            androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
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

    public void P(java.util.List list, boolean z6) throws androidx.datastore.preferences.protobuf.C1517y, com.google.crypto.tink.shaded.protobuf.C {
        java.lang.String strA;
        int iC;
        int iC2;
        if ((this.f10086b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.G;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
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

    public void Q(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.D()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.D()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void R(java.util.List list) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1929y;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(java.lang.Integer.valueOf(abstractC1503j.D()));
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
                list.add(java.lang.Integer.valueOf(abstractC1503j.D()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1929y abstractC1929y = (com.google.crypto.tink.shaded.protobuf.AbstractC1929y) list;
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

    public void S(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.E()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.E()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void T(java.util.List list) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(java.lang.Long.valueOf(abstractC1503j.E()));
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
                list.add(java.lang.Long.valueOf(abstractC1503j.E()));
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

    public void U(int i3) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        switch (this.f10085a) {
            case 1:
                if (((androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e).f() != i3) {
                    throw androidx.datastore.preferences.protobuf.C1518z.e();
                }
                return;
            default:
                if (((androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e).f() != i3) {
                    throw com.google.crypto.tink.shaded.protobuf.D.g();
                }
                return;
        }
    }

    public void V(int i3) throws androidx.datastore.preferences.protobuf.C1517y, com.google.crypto.tink.shaded.protobuf.C {
        switch (this.f10085a) {
            case 1:
                if ((this.f10086b & 7) != i3) {
                    throw androidx.datastore.preferences.protobuf.C1518z.b();
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
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (abstractC1503j.g() || (i3 = this.f10086b) == this.f10087c) {
            return false;
        }
        return abstractC1503j.F(i3);
    }

    public void a(int i3, int i9) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i9 < 0) {
            throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i10 = this.f10088d;
        int i11 = i10 * 2;
        int[] iArr = (int[]) this.f10089e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f10089e = iArr2;
            java.util.Arrays.fill(iArr2, -1);
        } else if (i11 >= iArr.length) {
            int[] iArr3 = new int[i10 * 4];
            this.f10089e = iArr3;
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f10089e;
        iArr4[i11] = i3;
        iArr4[i11 + 1] = i9;
        this.f10088d++;
    }

    public U.C0950x b(int i3) {
        return new U.C0950x(P3.e.f0((p011b1.J) this.f10089e, i3), i3, 1L);
    }

    public void c(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z6) {
        this.f10088d = 0;
        int[] iArr = (int[]) this.f10089e;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
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
                    this.f10086b = ((androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e).C();
                }
                int i9 = this.f10086b;
                return (i9 == 0 || i9 == this.f10087c) ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : i9 >>> 3;
            default:
                int i10 = this.f10088d;
                if (i10 != 0) {
                    this.f10086b = i10;
                    this.f10088d = 0;
                } else {
                    this.f10086b = ((androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e).C();
                }
                int i11 = this.f10086b;
                return (i11 == 0 || i11 == this.f10087c) ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : i11 >>> 3;
        }
    }

    public int f(int i3) {
        return ((p030d0.L) this.f10089e).f21115f[this.f10087c + i3];
    }

    public java.lang.Object g(int i3) {
        return ((p030d0.L) this.f10089e).f21116h[this.f10088d + i3];
    }

    public void h(java.lang.Object obj, androidx.datastore.preferences.protobuf.X x9, androidx.datastore.preferences.protobuf.C1507n c1507n) {
        int i3 = this.f10087c;
        this.f10087c = ((this.f10086b >>> 3) << 3) | 4;
        try {
            x9.g(obj, this, c1507n);
            if (this.f10086b != this.f10087c) {
                throw new androidx.datastore.preferences.protobuf.C1518z("Failed to parse the message.");
            }
            this.f10087c = i3;
        } catch (java.lang.Throwable th) {
            this.f10087c = i3;
            throw th;
        }
    }

    public void i(java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.d0 d0Var, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        int i3 = this.f10087c;
        this.f10087c = ((this.f10086b >>> 3) << 3) | 4;
        try {
            d0Var.e(obj, this, c1921p);
            if (this.f10086b != this.f10087c) {
                throw com.google.crypto.tink.shaded.protobuf.D.f();
            }
            this.f10087c = i3;
        } catch (java.lang.Throwable th) {
            this.f10087c = i3;
            throw th;
        }
    }

    public void j(java.lang.Object obj, androidx.datastore.preferences.protobuf.X x9, androidx.datastore.preferences.protobuf.C1507n c1507n) throws androidx.datastore.preferences.protobuf.C1518z {
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        int iD = abstractC1503j.D();
        if (abstractC1503j.f16218a >= 100) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iL = abstractC1503j.l(iD);
        abstractC1503j.f16218a++;
        x9.g(obj, this, c1507n);
        abstractC1503j.b(0);
        abstractC1503j.f16218a--;
        abstractC1503j.j(iL);
    }

    public void k(java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.d0 d0Var, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) throws com.google.crypto.tink.shaded.protobuf.D {
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
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

    public void l(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Boolean.valueOf(abstractC1503j.m()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Boolean.valueOf(abstractC1503j.m()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public void m(java.util.List list) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1910e;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(java.lang.Boolean.valueOf(abstractC1503j.m()));
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
                list.add(java.lang.Boolean.valueOf(abstractC1503j.m()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1910e abstractC1910e = (com.google.crypto.tink.shaded.protobuf.AbstractC1910e) list;
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

    public androidx.datastore.preferences.protobuf.C1500g n() throws androidx.datastore.preferences.protobuf.C1517y, com.google.crypto.tink.shaded.protobuf.C {
        V(2);
        return ((androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e).n();
    }

    public com.google.crypto.tink.shaded.protobuf.AbstractC1915j o() throws androidx.datastore.preferences.protobuf.C1517y, com.google.crypto.tink.shaded.protobuf.C {
        V(2);
        return ((androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e).o();
    }

    public void p(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1517y {
        int iC;
        if ((this.f10086b & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(n());
            androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void q(java.util.List list) throws com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        if ((this.f10086b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.D.c();
        }
        do {
            list.add(o());
            androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void r(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Double.valueOf(abstractC1503j.p()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iD = abstractC1503j.D();
        if ((iD & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Failed to parse the message.");
        }
        int iF = abstractC1503j.f() + iD;
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Double.valueOf(abstractC1503j.p()));
        } while (abstractC1503j.f() < iF);
    }

    public void s(java.util.List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1919n;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 1) {
                do {
                    list.add(java.lang.Double.valueOf(abstractC1503j.p()));
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
                list.add(java.lang.Double.valueOf(abstractC1503j.p()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1919n abstractC1919n = (com.google.crypto.tink.shaded.protobuf.AbstractC1919n) list;
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

    public void t(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.q()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iF = abstractC1503j.f() + abstractC1503j.D();
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.q()));
        } while (abstractC1503j.f() < iF);
        U(iF);
    }

    public java.lang.String toString() {
        switch (this.f10085a) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionInfo(id=1, range=(");
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

    public void u(java.util.List list) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1929y;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 0) {
                do {
                    list.add(java.lang.Integer.valueOf(abstractC1503j.q()));
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
                list.add(java.lang.Integer.valueOf(abstractC1503j.q()));
            } while (abstractC1503j.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1929y abstractC1929y = (com.google.crypto.tink.shaded.protobuf.AbstractC1929y) list;
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

    public java.lang.Object v(androidx.datastore.preferences.protobuf.s0 s0Var, java.lang.Class cls, androidx.datastore.preferences.protobuf.C1507n c1507n) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.C {
        int iOrdinal = s0Var.ordinal();
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        switch (iOrdinal) {
            case 0:
                V(1);
                return java.lang.Double.valueOf(abstractC1503j.p());
            case 1:
                V(5);
                return java.lang.Float.valueOf(abstractC1503j.t());
            case 2:
                V(0);
                return java.lang.Long.valueOf(abstractC1503j.v());
            case 3:
                V(0);
                return java.lang.Long.valueOf(abstractC1503j.E());
            case 4:
                V(0);
                return java.lang.Integer.valueOf(abstractC1503j.u());
            case 5:
                V(1);
                return java.lang.Long.valueOf(abstractC1503j.s());
            case 6:
                V(5);
                return java.lang.Integer.valueOf(abstractC1503j.r());
            case 7:
                V(0);
                return java.lang.Boolean.valueOf(abstractC1503j.m());
            case 8:
                V(2);
                return abstractC1503j.B();
            case 9:
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
            case 10:
                V(2);
                androidx.datastore.preferences.protobuf.X xA = androidx.datastore.preferences.protobuf.U.f16162c.a(cls);
                androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514vD = xA.d();
                j(abstractC1514vD, xA, c1507n);
                xA.b(abstractC1514vD);
                return abstractC1514vD;
            case 11:
                return n();
            case 12:
                V(0);
                return java.lang.Integer.valueOf(abstractC1503j.D());
            case 13:
                V(0);
                return java.lang.Integer.valueOf(abstractC1503j.q());
            case 14:
                V(5);
                return java.lang.Integer.valueOf(abstractC1503j.w());
            case 15:
                V(1);
                return java.lang.Long.valueOf(abstractC1503j.x());
            case 16:
                V(0);
                return java.lang.Integer.valueOf(abstractC1503j.y());
            case 17:
                V(0);
                return java.lang.Long.valueOf(abstractC1503j.z());
        }
    }

    public void w(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 2) {
            int iD = abstractC1503j.D();
            if ((iD & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.C1518z("Failed to parse the message.");
            }
            int iF = abstractC1503j.f() + iD;
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.r()));
            } while (abstractC1503j.f() < iF);
            return;
        }
        if (i3 != 5) {
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Integer.valueOf(abstractC1503j.r()));
            if (abstractC1503j.g()) {
                return;
            } else {
                iC = abstractC1503j.C();
            }
        } while (iC == this.f10086b);
        this.f10088d = iC;
    }

    public void x(java.util.List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1929y;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 2) {
                int iD = abstractC1503j.D();
                X(iD);
                int iF = abstractC1503j.f() + iD;
                do {
                    list.add(java.lang.Integer.valueOf(abstractC1503j.r()));
                } while (abstractC1503j.f() < iF);
                return;
            }
            if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.D.c();
            }
            do {
                list.add(java.lang.Integer.valueOf(abstractC1503j.r()));
                if (abstractC1503j.g()) {
                    return;
                } else {
                    iC = abstractC1503j.C();
                }
            } while (iC == this.f10086b);
            this.f10088d = iC;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1929y abstractC1929y = (com.google.crypto.tink.shaded.protobuf.AbstractC1929y) list;
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

    public void y(androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w) throws androidx.datastore.preferences.protobuf.C1518z {
        int iC;
        int i3 = this.f10086b & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (i3 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.s()));
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
            throw androidx.datastore.preferences.protobuf.C1518z.b();
        }
        int iD = abstractC1503j.D();
        if ((iD & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Failed to parse the message.");
        }
        int iF = abstractC1503j.f() + iD;
        do {
            ((androidx.datastore.preferences.protobuf.V) interfaceC1515w).add(java.lang.Long.valueOf(abstractC1503j.s()));
        } while (abstractC1503j.f() < iF);
    }

    public void z(java.util.List list) throws com.google.crypto.tink.shaded.protobuf.D {
        int iC;
        int iC2;
        boolean z6 = list instanceof com.google.crypto.tink.shaded.protobuf.K;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f10089e;
        if (!z6) {
            int i3 = this.f10086b & 7;
            if (i3 == 1) {
                do {
                    list.add(java.lang.Long.valueOf(abstractC1503j.s()));
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
                list.add(java.lang.Long.valueOf(abstractC1503j.s()));
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

    public C0948v(androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j) {
        this.f10085a = 1;
        this.f10088d = 0;
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a;
        this.f10089e = abstractC1503j;
        abstractC1503j.f16219b = this;
    }

    public C0948v(androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j, byte b9) {
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
