package B4;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

public final class o implements p {

    public final int f721h;

    public final B3.o f722i;

    public o(B3.o oVar, int i3) {
        this.f721h = i3;
        this.f722i = oVar;
    }

    @Override
    public final Object b(String str) throws GeneralSecurityException {
        switch (this.f721h) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < 2; i3++) {
                    Provider provider = Security.getProvider(strArr[i3]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                Iterator it = arrayList.iterator();
                Exception exc = null;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    B3.o oVar = this.f722i;
                    if (!zHasNext) {
                        return oVar.m(str, null);
                    }
                    try {
                        return oVar.m(str, (Provider) it.next());
                    } catch (Exception e6) {
                        if (exc == null) {
                            exc = e6;
                        }
                    }
                }
                break;
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < 3; i9++) {
                    Provider provider2 = Security.getProvider(strArr2[i9]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Exception exc2 = null;
                while (it2.hasNext()) {
                    try {
                        return this.f722i.m(str, (Provider) it2.next());
                    } catch (Exception e9) {
                        if (exc2 == null) {
                            exc2 = e9;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}
