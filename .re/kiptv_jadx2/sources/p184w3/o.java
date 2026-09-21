package p184w3;

import B3.AbstractC0088a;
import E6.G;
import I3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import io.ktor.http.LinkHeader;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class o extends a {
    public static final Parcelable.Creator<o> CREATOR = new D(8);

    public MediaInfo f29890h;

    public int f29891i;
    public boolean j;

    public double f29892k;

    public double f29893l;

    public double f29894m;

    public long[] f29895n;

    public String f29896o;

    public JSONObject f29897p;

    public o(MediaInfo mediaInfo, int i3, boolean z6, double d4, double d6, double d9, long[] jArr, String str) {
        this.f29890h = mediaInfo;
        this.f29891i = i3;
        this.j = z6;
        this.f29892k = d4;
        this.f29893l = d6;
        this.f29894m = d9;
        this.f29895n = jArr;
        this.f29896o = str;
        if (str == null) {
            this.f29897p = null;
            return;
        }
        try {
            this.f29897p = new JSONObject(this.f29896o);
        } catch (JSONException unused) {
            this.f29897p = null;
            this.f29896o = null;
        }
    }

    public final boolean a(JSONObject jSONObject) {
        boolean z6;
        long[] jArr;
        boolean z9;
        int i3;
        boolean z10 = false;
        if (jSONObject.has(LinkHeader.Parameters.Media)) {
            this.f29890h = new MediaInfo(jSONObject.getJSONObject(LinkHeader.Parameters.Media));
            z6 = true;
        } else {
            z6 = false;
        }
        if (jSONObject.has("itemId") && this.f29891i != (i3 = jSONObject.getInt("itemId"))) {
            this.f29891i = i3;
            z6 = true;
        }
        if (jSONObject.has("autoplay") && this.j != (z9 = jSONObject.getBoolean("autoplay"))) {
            this.j = z9;
            z6 = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.f29892k) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.f29892k) > 1.0E-7d)) {
            this.f29892k = dOptDouble;
            z6 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d4 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d4 - this.f29893l) > 1.0E-7d) {
                this.f29893l = d4;
                z6 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d6 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d6 - this.f29894m) > 1.0E-7d) {
                this.f29894m = d6;
                z6 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i9 = 0; i9 < length; i9++) {
                jArr[i9] = jSONArray.getLong(i9);
            }
            long[] jArr2 = this.f29895n;
            if (jArr2 == null || jArr2.length != length) {
                z10 = true;
                break;
            }
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f29895n[i10] != jArr[i10]) {
                    z10 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z10) {
            this.f29895n = jArr;
            z6 = true;
        }
        if (!jSONObject.has("customData")) {
            return z6;
        }
        this.f29897p = jSONObject.getJSONObject("customData");
        return true;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f29890h;
            if (mediaInfo != null) {
                jSONObject.put(LinkHeader.Parameters.Media, mediaInfo.a());
            }
            int i3 = this.f29891i;
            if (i3 != 0) {
                jSONObject.put("itemId", i3);
            }
            jSONObject.put("autoplay", this.j);
            if (!Double.isNaN(this.f29892k)) {
                jSONObject.put("startTime", this.f29892k);
            }
            double d4 = this.f29893l;
            if (d4 != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d4);
            }
            jSONObject.put("preloadTime", this.f29894m);
            if (this.f29895n != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.f29895n) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f29897p;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        JSONObject jSONObject = this.f29897p;
        boolean z6 = jSONObject == null;
        JSONObject jSONObject2 = oVar.f29897p;
        if (z6 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || M3.a.a(jSONObject, jSONObject2)) && AbstractC0088a.e(this.f29890h, oVar.f29890h) && this.f29891i == oVar.f29891i && this.j == oVar.j && ((Double.isNaN(this.f29892k) && Double.isNaN(oVar.f29892k)) || this.f29892k == oVar.f29892k) && this.f29893l == oVar.f29893l && this.f29894m == oVar.f29894m && Arrays.equals(this.f29895n, oVar.f29895n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29890h, Integer.valueOf(this.f29891i), Boolean.valueOf(this.j), Double.valueOf(this.f29892k), Double.valueOf(this.f29893l), Double.valueOf(this.f29894m), Integer.valueOf(Arrays.hashCode(this.f29895n)), String.valueOf(this.f29897p)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f29897p;
        this.f29896o = jSONObject == null ? null : jSONObject.toString();
        int iF0 = G.f0(parcel, 20293);
        G.Y(parcel, 2, this.f29890h, i3);
        int i9 = this.f29891i;
        G.e0(parcel, 3, 4);
        parcel.writeInt(i9);
        boolean z6 = this.j;
        G.e0(parcel, 4, 4);
        parcel.writeInt(z6 ? 1 : 0);
        double d4 = this.f29892k;
        G.e0(parcel, 5, 8);
        parcel.writeDouble(d4);
        double d6 = this.f29893l;
        G.e0(parcel, 6, 8);
        parcel.writeDouble(d6);
        double d9 = this.f29894m;
        G.e0(parcel, 7, 8);
        parcel.writeDouble(d9);
        G.X(parcel, 8, this.f29895n);
        G.Z(parcel, 9, this.f29896o);
        G.g0(parcel, iF0);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        a(jSONObject);
    }
}
