package p103m;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import w8.C3029i;
import w8.F;
import w8.j;

public final class P0 {

    public boolean f24958a = true;

    public boolean f24959b;

    public Object f24960c;

    public Object f24961d;

    public j a() {
        return new j(this.f24958a, this.f24959b, (String[]) this.f24960c, (String[]) this.f24961d);
    }

    public void b(String... cipherSuites) {
        m.e(cipherSuites, "cipherSuites");
        if (!this.f24958a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f24960c = (String[]) cipherSuites.clone();
    }

    public void c(C3029i... cipherSuites) {
        m.e(cipherSuites, "cipherSuites");
        if (!this.f24958a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C3029i c3029i : cipherSuites) {
            arrayList.add(c3029i.f30553a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void d(String... tlsVersions) {
        m.e(tlsVersions, "tlsVersions");
        if (!this.f24958a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f24961d = (String[]) tlsVersions.clone();
    }

    public void e(F... fArr) {
        if (!this.f24958a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (F f9 : fArr) {
            arrayList.add(f9.f30508h);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
