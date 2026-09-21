package p105m2;

/* JADX INFO: renamed from: m2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2617o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f25349a;

    public C2617o(android.os.Bundle bundle) {
        this.f25349a = bundle;
    }

    public final java.util.HashSet a() {
        android.os.Bundle bundle = this.f25349a;
        return !bundle.containsKey("allowedPackages") ? new java.util.HashSet() : new java.util.HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    public final java.util.ArrayList b() {
        android.os.Bundle bundle = this.f25349a;
        return !bundle.containsKey("controlFilters") ? new java.util.ArrayList() : new java.util.ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }

    public final java.util.ArrayList c() {
        android.os.Bundle bundle = this.f25349a;
        return !bundle.containsKey("groupMemberIds") ? new java.util.ArrayList() : new java.util.ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    public final java.lang.String d() {
        return this.f25349a.getString("id");
    }

    public final boolean e() {
        return (android.text.TextUtils.isEmpty(d()) || android.text.TextUtils.isEmpty(this.f25349a.getString("name")) || b().contains(null)) ? false : true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(d());
        sb.append(", groupMemberIds=");
        sb.append(c());
        sb.append(", name=");
        android.os.Bundle bundle = this.f25349a;
        sb.append(bundle.getString("name"));
        sb.append(", description=");
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        java.lang.String string = bundle.getString("iconUri");
        sb.append(string == null ? null : android.net.Uri.parse(string));
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(java.util.Arrays.toString(b().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(bundle.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(bundle.getInt("volume"));
        sb.append(", volumeMax=");
        sb.append(bundle.getInt("volumeMax"));
        sb.append(", volumeHandling=");
        sb.append(bundle.getInt("volumeHandling", 0));
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(bundle.getBundle("extras"));
        sb.append(", isValid=");
        sb.append(e());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", androidx.media3.common.util.Log.LOG_LEVEL_OFF));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(java.util.Arrays.toString(a().toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
