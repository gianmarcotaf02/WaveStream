package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZoneId implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Map f23576a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract void W(java.io.ObjectOutput objectOutput);

    public abstract j$.time.zone.f r();

    public abstract java.lang.String s();

    static {
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new java.util.AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new java.util.AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new java.util.AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new java.util.AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new java.util.AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new java.util.AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new java.util.AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new java.util.AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new java.util.AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new java.util.AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new java.util.AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new java.util.AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new java.util.AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new java.util.AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new java.util.AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new java.util.AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new java.util.AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new java.util.AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new java.util.AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new java.util.AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new java.util.AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new java.util.AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new java.util.AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new java.util.AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new java.util.AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new java.util.AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new java.util.AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        java.util.HashMap map = new java.util.HashMap(28);
        for (int i3 = 0; i3 < 28; i3++) {
            java.util.Map.Entry entry = entryArr[i3];
            java.lang.Object key = entry.getKey();
            java.util.Objects.requireNonNull(key);
            java.lang.Object value = entry.getValue();
            java.util.Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key);
            }
        }
        f23576a = java.util.Collections.unmodifiableMap(map);
    }

    public static j$.time.ZoneId systemDefault() {
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        java.util.Objects.requireNonNull(id, "zoneId");
        java.util.Map map = f23576a;
        java.util.Objects.requireNonNull(map, "aliasMap");
        java.lang.String str = (java.lang.String) map.get(id);
        if (str != null) {
            id = str;
        }
        return B(id, true);
    }

    public static j$.time.ZoneId J(java.lang.String str, j$.time.ZoneOffset zoneOffset) {
        java.util.Objects.requireNonNull(str, "prefix");
        java.util.Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new java.lang.IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.f23581c);
        }
        return new j$.time.w(str, new j$.time.zone.f(zoneOffset));
    }

    public static j$.time.ZoneId B(java.lang.String str, boolean z6) {
        java.util.Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return j$.time.ZoneOffset.Y(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return K(str, 3, z6);
        }
        if (str.startsWith("UT")) {
            return K(str, 2, z6);
        }
        return j$.time.w.Y(str, z6);
    }

    public static j$.time.ZoneId K(java.lang.String str, int i3, boolean z6) {
        java.lang.String strSubstring = str.substring(0, i3);
        if (str.length() == i3) {
            return J(strSubstring, j$.time.ZoneOffset.UTC);
        }
        if (str.charAt(i3) != '+' && str.charAt(i3) != '-') {
            return j$.time.w.Y(str, z6);
        }
        try {
            j$.time.ZoneOffset zoneOffsetY = j$.time.ZoneOffset.Y(str.substring(i3));
            if (zoneOffsetY == j$.time.ZoneOffset.UTC) {
                return J(strSubstring, zoneOffsetY);
            }
            return J(strSubstring, zoneOffsetY);
        } catch (j$.time.DateTimeException e6) {
            throw new j$.time.DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e6);
        }
    }

    public ZoneId() {
        if (getClass() != j$.time.ZoneOffset.class && getClass() != j$.time.w.class) {
            throw new java.lang.AssertionError("Invalid subclass");
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.ZoneId) {
            return s().equals(((j$.time.ZoneId) obj).s());
        }
        return false;
    }

    public int hashCode() {
        return s().hashCode();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public java.lang.String toString() {
        return s();
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 7, this);
    }
}
