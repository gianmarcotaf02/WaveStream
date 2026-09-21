package A1;

import android.util.Base64;
import java.util.List;

public final class e {

    public final String f131a;

    public final String f132b;

    public final String f133c;

    public final List f134d;

    public final String f135e;

    public e(String str, String str2, String str3, List list) {
        str.getClass();
        this.f131a = str;
        str2.getClass();
        this.f132b = str2;
        this.f133c = str3;
        list.getClass();
        this.f134d = list;
        this.f135e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f131a + ", mProviderPackage: " + this.f132b + ", mQuery: " + this.f133c + ", mCertificates:");
        int i3 = 0;
        while (true) {
            List list = this.f134d;
            if (i3 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i3);
            for (int i9 = 0; i9 < list2.size(); i9++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i9), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i3++;
        }
    }
}
