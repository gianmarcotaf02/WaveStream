package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class CodecParameters {
    public static final androidx.media3.exoplayer.CodecParameters EMPTY = new androidx.media3.exoplayer.CodecParameters.Builder().build();
    private final java.util.Map<java.lang.String, java.lang.Object> params;

    public static final class Builder {
        private final java.util.Map<java.lang.String, java.lang.Object> params;

        public androidx.media3.exoplayer.CodecParameters build() {
            return new androidx.media3.exoplayer.CodecParameters(this.params);
        }

        public androidx.media3.exoplayer.CodecParameters.Builder remove(java.lang.String str) {
            this.params.remove(str);
            return this;
        }

        public androidx.media3.exoplayer.CodecParameters.Builder setByteBuffer(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                this.params.put(str, null);
                return this;
            }
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
            byteBufferAllocate.put(byteBuffer.duplicate());
            byteBufferAllocate.flip();
            this.params.put(str, byteBufferAllocate);
            return this;
        }

        public androidx.media3.exoplayer.CodecParameters.Builder setFloat(java.lang.String str, float f9) {
            this.params.put(str, java.lang.Float.valueOf(f9));
            return this;
        }

        public androidx.media3.exoplayer.CodecParameters.Builder setInteger(java.lang.String str, int i3) {
            this.params.put(str, java.lang.Integer.valueOf(i3));
            return this;
        }

        public androidx.media3.exoplayer.CodecParameters.Builder setLong(java.lang.String str, long j) {
            this.params.put(str, java.lang.Long.valueOf(j));
            return this;
        }

        public androidx.media3.exoplayer.CodecParameters.Builder setString(java.lang.String str, java.lang.String str2) {
            this.params.put(str, str2);
            return this;
        }

        public Builder() {
            this.params = new java.util.HashMap();
        }

        private Builder(androidx.media3.exoplayer.CodecParameters codecParameters) {
            this.params = new java.util.HashMap(codecParameters.params);
        }
    }

    public static androidx.media3.exoplayer.CodecParameters.Builder createFrom(android.media.MediaFormat mediaFormat, java.util.Set<java.lang.String> set) {
        androidx.media3.exoplayer.CodecParameters.Builder builder = new androidx.media3.exoplayer.CodecParameters.Builder();
        for (java.lang.String str : set) {
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                if (valueTypeForKey == 1) {
                    builder.setInteger(str, mediaFormat.getInteger(str));
                } else if (valueTypeForKey == 2) {
                    builder.setLong(str, mediaFormat.getLong(str));
                } else if (valueTypeForKey == 3) {
                    builder.setFloat(str, mediaFormat.getFloat(str));
                } else if (valueTypeForKey == 4) {
                    builder.setString(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    builder.setByteBuffer(str, mediaFormat.getByteBuffer(str));
                }
            }
        }
        return builder;
    }

    public void applyTo(android.media.MediaFormat mediaFormat) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.params.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(key, null);
            } else if (value instanceof java.lang.Integer) {
                mediaFormat.setInteger(key, ((java.lang.Integer) value).intValue());
            } else if (value instanceof java.lang.Long) {
                mediaFormat.setLong(key, ((java.lang.Long) value).longValue());
            } else if (value instanceof java.lang.Float) {
                mediaFormat.setFloat(key, ((java.lang.Float) value).floatValue());
            } else if (value instanceof java.lang.String) {
                mediaFormat.setString(key, (java.lang.String) value);
            } else if (value instanceof java.nio.ByteBuffer) {
                mediaFormat.setByteBuffer(key, (java.nio.ByteBuffer) value);
            }
        }
    }

    public androidx.media3.exoplayer.CodecParameters.Builder buildUpon() {
        return new androidx.media3.exoplayer.CodecParameters.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.media3.exoplayer.CodecParameters) {
            return this.params.equals(((androidx.media3.exoplayer.CodecParameters) obj).params);
        }
        return false;
    }

    public java.lang.Object get(java.lang.String str) {
        return this.params.get(str);
    }

    public int hashCode() {
        return this.params.hashCode();
    }

    public java.util.Set<java.lang.String> keySet() {
        return this.params.keySet();
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.params.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null) {
                if (value instanceof java.lang.Integer) {
                    bundle.putInt(key, ((java.lang.Integer) value).intValue());
                } else if (value instanceof java.lang.Long) {
                    bundle.putLong(key, ((java.lang.Long) value).longValue());
                } else if (value instanceof java.lang.Float) {
                    bundle.putFloat(key, ((java.lang.Float) value).floatValue());
                } else if (value instanceof java.lang.String) {
                    bundle.putString(key, (java.lang.String) value);
                } else if (value instanceof java.nio.ByteBuffer) {
                    java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.duplicate().get(bArr);
                    bundle.putByteArray(key, bArr);
                }
            }
        }
        return bundle;
    }

    private CodecParameters(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.params = java.util.Collections.unmodifiableMap(map);
    }
}
