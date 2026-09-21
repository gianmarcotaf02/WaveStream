package p183w2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements android.content.SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f29785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f29786b = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o4.a f29787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o4.c f29788d;

    public b(android.content.SharedPreferences sharedPreferences, o4.a aVar, o4.c cVar) {
        this.f29785a = sharedPreferences;
        this.f29787c = aVar;
        this.f29788d = cVar;
    }

    public static boolean c(java.lang.String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final java.lang.String a(java.lang.String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new java.lang.String(B4.g.b(this.f29788d.a(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), "kiptv_secure_prefs".getBytes())), "US-ASCII");
            } catch (java.io.UnsupportedEncodingException e6) {
                throw new java.lang.AssertionError(e6);
            }
        } catch (java.security.GeneralSecurityException e9) {
            throw new java.lang.SecurityException("Could not encrypt key. " + e9.getMessage(), e9);
        }
    }

    public final java.lang.Object b(java.lang.String str) {
        int i3;
        java.lang.String str2;
        if (c(str)) {
            throw new java.lang.SecurityException(p121o0.p.o(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            java.lang.String strA = a(str);
            java.lang.String string = this.f29785a.getString(strA, null);
            if (string != null) {
                byte[] bArrA = B4.g.a(string);
                o4.a aVar = this.f29787c;
                java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(aVar.b(bArrA, strA.getBytes(charset)));
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
                    throw new java.lang.SecurityException("Unknown type ID for encrypted pref value: " + i9);
                }
                int iC = Z.AbstractC1149h0.c(i3);
                if (iC == 0) {
                    int i10 = byteBufferWrap.getInt();
                    java.nio.ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i10);
                    java.lang.String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iC != 1) {
                        if (iC == 2) {
                            return java.lang.Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iC == 3) {
                            return java.lang.Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iC == 4) {
                            return java.lang.Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iC == 5) {
                            return java.lang.Boolean.valueOf(byteBufferWrap.get() != 0);
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
                        throw new java.lang.SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    p136q.C2662f c2662f = new p136q.C2662f(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i11 = byteBufferWrap.getInt();
                        java.nio.ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i11);
                        byteBufferWrap.position(byteBufferWrap.position() + i11);
                        c2662f.add(java.nio.charset.StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (c2662f.j != 1 || !"__NULL__".equals(c2662f.f26382i[0])) {
                        return c2662f;
                    }
                }
            }
            return null;
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.SecurityException("Could not decrypt value. " + e6.getMessage(), e6);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(java.lang.String str) {
        if (c(str)) {
            throw new java.lang.SecurityException(p121o0.p.o(str, " is a reserved key for the encryption keyset."));
        }
        return this.f29785a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    public final android.content.SharedPreferences.Editor edit() {
        return new p183w2.a(this, this.f29785a.edit());
    }

    @Override // android.content.SharedPreferences
    public final java.util.Map getAll() {
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.f29785a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    java.lang.String str = new java.lang.String(this.f29788d.b(B4.g.a(entry.getKey()), "kiptv_secure_prefs".getBytes()), java.nio.charset.StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, b(str));
                } catch (java.security.GeneralSecurityException e6) {
                    throw new java.lang.SecurityException("Could not decrypt key. " + e6.getMessage(), e6);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(java.lang.String str, boolean z6) {
        java.lang.Object objB = b(str);
        return objB instanceof java.lang.Boolean ? ((java.lang.Boolean) objB).booleanValue() : z6;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(java.lang.String str, float f9) {
        java.lang.Object objB = b(str);
        return objB instanceof java.lang.Float ? ((java.lang.Float) objB).floatValue() : f9;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(java.lang.String str, int i3) {
        java.lang.Object objB = b(str);
        return objB instanceof java.lang.Integer ? ((java.lang.Integer) objB).intValue() : i3;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(java.lang.String str, long j) {
        java.lang.Object objB = b(str);
        return objB instanceof java.lang.Long ? ((java.lang.Long) objB).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.lang.Object objB = b(str);
        return objB instanceof java.lang.String ? (java.lang.String) objB : str2;
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        java.lang.Object objB = b(str);
        java.util.Set c2662f = objB instanceof java.util.Set ? (java.util.Set) objB : new p136q.C2662f(0);
        return c2662f.size() > 0 ? c2662f : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29786b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29786b.remove(onSharedPreferenceChangeListener);
    }
}
