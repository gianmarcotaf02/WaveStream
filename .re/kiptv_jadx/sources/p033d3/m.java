package p033d3;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21219a;

    public m(long j) {
        this.f21219a = j;
    }

    public static p033d3.m a(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        android.util.JsonReader jsonReader = new android.util.JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == android.util.JsonToken.STRING) {
                        p033d3.m mVar = new p033d3.m(java.lang.Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return mVar;
                    }
                    p033d3.m mVar2 = new p033d3.m(jsonReader.nextLong());
                    jsonReader.close();
                    return mVar2;
                }
                jsonReader.skipValue();
            }
            throw new java.io.IOException("Response is missing nextRequestWaitMillis field.");
        } catch (java.lang.Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p033d3.m) {
            if (this.f21219a == ((p033d3.m) obj).f21219a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21219a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final java.lang.String toString() {
        return Y6.f.g(this.f21219a, "}", new java.lang.StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
