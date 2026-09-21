package B4;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class s extends ThreadLocal {

    public final t f727a;

    public s(t tVar) {
        this.f727a = tVar;
    }

    @Override
    public final Object initialValue() {
        t tVar = this.f727a;
        try {
            q qVar = q.f724c;
            Mac mac = (Mac) qVar.f726a.b((String) tVar.f731i);
            mac.init((SecretKeySpec) tVar.f732k);
            return mac;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }
}
