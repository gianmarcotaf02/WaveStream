package E3;

import com.google.android.gms.common.api.Status;

public class d extends Exception {

    public final Status f2825h;

    public d(Status status) {
        int i3 = status.f18690h;
        String str = status.f18691i;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 2 + String.valueOf(str).length());
        sb.append(i3);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f2825h = status;
    }
}
