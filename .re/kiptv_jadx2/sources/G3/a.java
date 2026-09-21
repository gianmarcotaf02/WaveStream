package G3;

import B3.e;
import E6.G;
import H3.q;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.ktor.sse.ServerSentEventKt;
import io.sentry.protocol.Request;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends I3.a {
    public static final Parcelable.Creator<a> CREATOR = new e(8);

    public final int f3784h;

    public final Uri f3785i;
    public final int j;

    public final int f3786k;

    public a(int i3, Uri uri, int i9, int i10) {
        this.f3784h = i3;
        this.f3785i = uri;
        this.j = i9;
        this.f3786k = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (q.j(this.f3785i, aVar.f3785i) && this.j == aVar.j && this.f3786k == aVar.f3786k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3785i, Integer.valueOf(this.j), Integer.valueOf(this.f3786k)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Image " + this.j + "x" + this.f3786k + ServerSentEventKt.SPACE + this.f3785i.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 1, 4);
        parcel.writeInt(this.f3784h);
        G.Y(parcel, 2, this.f3785i, i3);
        G.e0(parcel, 3, 4);
        parcel.writeInt(this.j);
        G.e0(parcel, 4, 4);
        parcel.writeInt(this.f3786k);
        G.g0(parcel, iF0);
    }

    public a(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has(Request.JsonKeys.URL)) {
            try {
                uri = Uri.parse(jSONObject.getString(Request.JsonKeys.URL));
            } catch (JSONException unused) {
            }
        }
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        this(1, uri, iOptInt, iOptInt2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (iOptInt < 0 || iOptInt2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }
}
