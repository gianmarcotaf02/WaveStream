package p183w2;

import B4.g;
import Z.AbstractC1149h0;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import o4.a;
import o4.c;
import p121o0.p;
import p136q.C2662f;

public final class b implements SharedPreferences {

    public final SharedPreferences f29785a;

    public final CopyOnWriteArrayList f29786b = new CopyOnWriteArrayList();

    public final a f29787c;

    public final c f29788d;

    public b(SharedPreferences sharedPreferences, a aVar, c cVar) {
        this.f29785a = sharedPreferences;
        this.f29787c = aVar;
        this.f29788d = cVar;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(g.b(this.f29788d.a(str.getBytes(StandardCharsets.UTF_8), "kiptv_secure_prefs".getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e6) {
                throw new AssertionError(e6);
            }
        } catch (GeneralSecurityException e9) {
            throw new SecurityException("Could not encrypt key. " + e9.getMessage(), e9);
        }
    }

    public final Object b(String str) {
        int i3;
        String str2;
        if (c(str)) {
            throw new SecurityException(p.o(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = a(str);
            String string = this.f29785a.getString(strA, null);
            if (string != null) {
                byte[] bArrA = g.a(string);
                a aVar = this.f29787c;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.b(bArrA, strA.getBytes(charset)));
                byteBufferWrap.position(0);
                int i9 = byteBufferWrap.getInt();
                if (i9 == 0) {
                    i3 = 1;
                } else if (i9 == 1) {
                    i3 = 2;
                } else if (i9 == 2) {
                    i3 = 3;
                } else if (i9 == 3) {
                    i3 = 4;
                } else if (i9 != 4) {
                    i3 = i9 != 5 ? 0 : 6;
                } else {
                    i3 = 5;
                }
                if (i3 == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i9);
                }
                int iC = AbstractC1149h0.c(i3);
                if (iC == 0) {
                    int i10 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i10);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iC != 1) {
                        if (iC == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iC == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iC == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iC == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i3) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    C2662f c2662f = new C2662f(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i11 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i11);
                        byteBufferWrap.position(byteBufferWrap.position() + i11);
                        c2662f.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (c2662f.j != 1 || !"__NULL__".equals(c2662f.f26382i[0])) {
                        return c2662f;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not decrypt value. " + e6.getMessage(), e6);
        }
    }

    @Override
    public final boolean contains(String str) {
        if (c(str)) {
            throw new SecurityException(p.o(str, " is a reserved key for the encryption keyset."));
        }
        return this.f29785a.contains(a(str));
    }

    @Override
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f29785a.edit());
    }

    @Override
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f29785a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f29788d.b(g.a(entry.getKey()), "kiptv_secure_prefs".getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, b(str));
                } catch (GeneralSecurityException e6) {
                    throw new SecurityException("Could not decrypt key. " + e6.getMessage(), e6);
                }
            }
        }
        return map;
    }

    @Override
    public final boolean getBoolean(String str, boolean z6) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z6;
    }

    @Override
    public final float getFloat(String str, float f9) {
        Object objB = b(str);
        return objB instanceof Float ? ((Float) objB).floatValue() : f9;
    }

    @Override
    public final int getInt(String str, int i3) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i3;
    }

    @Override
    public final long getLong(String str, long j) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j;
    }

    @Override
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override
    public final Set getStringSet(String str, Set set) {
        Object objB = b(str);
        Set c2662f = objB instanceof Set ? (Set) objB : new C2662f(0);
        return c2662f.size() > 0 ? c2662f : set;
    }

    @Override
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29786b.add(onSharedPreferenceChangeListener);
    }

    @Override
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29786b.remove(onSharedPreferenceChangeListener);
    }
}
