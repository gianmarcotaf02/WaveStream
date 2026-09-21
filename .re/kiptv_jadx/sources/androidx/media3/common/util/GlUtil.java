package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class GlUtil {
    private static final java.lang.String EXTENSION_COLORSPACE_BT2020_HLG = "EGL_EXT_gl_colorspace_bt2020_hlg";
    private static final java.lang.String EXTENSION_COLORSPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final java.lang.String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final java.lang.String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final java.lang.String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    private static final long GL_FENCE_SYNC_FAILED = 0;
    public static final long GL_FENCE_SYNC_UNSET = -1;
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int MAX_BITMAP_DECODING_SIZE = 4096;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};
    private static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    private GlUtil() {
    }

    private static void assertValidTextureSize(int i3, int i9) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(3379, iArr, 0);
        int i10 = iArr[0];
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(i10 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i3 < 0 || i9 < 0) {
            throw new androidx.media3.common.util.GlUtil.GlException("width or height is less than 0");
        }
        if (i3 > i10 || i9 > i10) {
            throw new androidx.media3.common.util.GlUtil.GlException(com.google.android.gms.internal.play_billing.M0.l(i10, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void awaitSyncObject(long j) throws androidx.media3.common.util.GlUtil.GlException {
        if (j == -1) {
            return;
        }
        if (j == 0) {
            android.opengl.GLES20.glFinish();
        } else {
            android.opengl.GLES30.glWaitSync(j, 0, -1L);
            checkGlError();
        }
    }

    public static void bindTexture(int i3, int i9, int i10) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glBindTexture(i3, i9);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i3, 10240, i10);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i3, 10241, i10);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i3, 10242, 33071);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i3, 10243, 33071);
        checkGlError();
    }

    public static void blitFrameBuffer(int i3, androidx.media3.common.util.GlRect glRect, int i9, androidx.media3.common.util.GlRect glRect2) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(36006, iArr, 0);
        checkGlError();
        android.opengl.GLES20.glBindFramebuffer(36008, i3);
        checkGlError();
        android.opengl.GLES20.glBindFramebuffer(36009, i9);
        checkGlError();
        android.opengl.GLES30.glBlitFramebuffer(glRect.left, glRect.bottom, glRect.right, glRect.top, glRect2.left, glRect2.bottom, glRect2.right, glRect2.top, 16384, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        checkGlError();
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
    }

    public static void checkEglException(java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int iEglGetError = android.opengl.EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        java.lang.StringBuilder sbN = Y6.f.n(str, ", error code: 0x");
        sbN.append(java.lang.Integer.toHexString(iEglGetError));
        throw new androidx.media3.common.util.GlUtil.GlException(sbN.toString(), p076i4.AbstractC2186b0.y(java.lang.Integer.valueOf(iEglGetError)));
    }

    public static void checkGlError() throws androidx.media3.common.util.GlUtil.GlException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        p076i4.AbstractC2230y.d(4, "initialCapacity");
        java.lang.Object[] objArrCopyOf = new java.lang.Object[4];
        boolean z6 = false;
        int i3 = 0;
        while (true) {
            int iGlGetError = android.opengl.GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z6) {
                sb.append('\n');
            }
            java.lang.String strGluErrorString = android.opengl.GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + java.lang.Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iGlGetError);
            int i9 = i3 + 1;
            int iB = p076i4.V.b(objArrCopyOf.length, i9);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i3] = numValueOf;
            z6 = true;
            i3 = i9;
        }
        if (z6) {
            throw new androidx.media3.common.util.GlUtil.GlException(sb.toString(), p076i4.AbstractC2186b0.r(objArrCopyOf, i3));
        }
    }

    public static void checkGlException(boolean z6, java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        if (!z6) {
            throw new androidx.media3.common.util.GlUtil.GlException(str);
        }
    }

    public static void clearFocusedBuffers() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClearDepthf(1.0f);
        android.opengl.GLES20.glClear(16640);
        checkGlError();
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static java.nio.FloatBuffer createBuffer(float[] fArr) {
        return (java.nio.FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay) {
        return createEglContext(android.opengl.EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static android.opengl.EGLSurface createEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int i3, boolean z6) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr;
        int[] iArr2;
        if (i3 == 3 || i3 == 10) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
            iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
        } else {
            if (i3 != 7 && i3 != 6) {
                throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Unsupported color transfer: "));
            }
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
            if (z6) {
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
            } else if (i3 == 6) {
                if (!isBt2020PqExtensionSupported()) {
                    throw new androidx.media3.common.util.GlUtil.GlException("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            } else {
                if (!isBt2020HlgExtensionSupported()) {
                    throw new androidx.media3.common.util.GlUtil.GlException("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG;
            }
        }
        android.opengl.EGLSurface eGLSurfaceEglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
        checkEglException("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static int createExternalTexture() throws androidx.media3.common.util.GlUtil.GlException {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        return iGenerateTexture;
    }

    public static int createFboForTexture(int i3) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
        checkGlError();
        return iArr[0];
    }

    public static android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLSurface eGLSurfaceCreatePbufferSurface = isSurfacelessContextExtensionSupported() ? android.opengl.EGL14.EGL_NO_SURFACE : createPbufferSurface(eGLDisplay, 1, 1, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceCreatePbufferSurface, 1, 1);
        return eGLSurfaceCreatePbufferSurface;
    }

    public static long createGlSyncFence() throws androidx.media3.common.util.GlUtil.GlException {
        if (getContextMajorVersion() < 3) {
            return 0L;
        }
        long jGlFenceSync = android.opengl.GLES30.glFenceSync(37143, 0);
        checkGlError();
        android.opengl.GLES20.glFlush();
        checkGlError();
        return jGlFenceSync;
    }

    private static android.opengl.EGLSurface createPbufferSurface(android.opengl.EGLDisplay eGLDisplay, int i3, int i9, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), new int[]{12375, i3, 12374, i9, 12344}, 0);
        checkEglException("Error creating a new EGL Pbuffer surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static int createPixelBufferObject(int i3) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenBuffers(1, iArr, 0);
        checkGlError();
        android.opengl.GLES20.glBindBuffer(35051, iArr[0]);
        checkGlError();
        android.opengl.GLES20.glBufferData(35051, i3, null, 35049);
        checkGlError();
        android.opengl.GLES20.glBindBuffer(35051, 0);
        checkGlError();
        return iArr[0];
    }

    public static int createRgb10A2Texture(int i3, int i9) {
        return createTextureUninitialized(i3, i9, 32857, 33640);
    }

    public static int createTexture(android.graphics.Bitmap bitmap) throws androidx.media3.common.util.GlUtil.GlException {
        int iGenerateTexture = generateTexture();
        setTexture(iGenerateTexture, bitmap);
        return iGenerateTexture;
    }

    private static int createTextureUninitialized(int i3, int i9, int i10, int i11) throws androidx.media3.common.util.GlUtil.GlException {
        assertValidTextureSize(i3, i9);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        android.opengl.GLES20.glTexImage2D(3553, 0, i10, i3, i9, 0, 6408, i11, null);
        checkGlError();
        return iGenerateTexture;
    }

    public static float[] createVertexBuffer(java.util.List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i3 = 0; i3 < list.size(); i3++) {
            java.lang.System.arraycopy(list.get(i3), 0, fArr, i3 * 4, 4);
        }
        return fArr;
    }

    public static void deleteBuffer(int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteBuffers(1, new int[]{i3}, 0);
        checkGlError();
    }

    public static void deleteFbo(int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteRenderbuffers(1, new int[]{i3}, 0);
        checkGlError();
    }

    public static void deleteSyncObject(long j) throws androidx.media3.common.util.GlUtil.GlException {
        deleteSyncObjectQuietly(j);
        checkGlError();
    }

    public static void deleteSyncObjectQuietly(long j) {
        if (j == -1) {
            return;
        }
        android.opengl.GLES30.glDeleteSync(j);
    }

    public static void deleteTexture(int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i3}, 0);
        checkGlError();
    }

    public static void destroyEglContext(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext) throws androidx.media3.common.util.GlUtil.GlException {
        if (eGLDisplay == null || eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
        checkEglException("Error releasing context");
        if (eGLContext == null || eGLContext.equals(android.opengl.EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        android.opengl.EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        checkEglException("Error destroying context");
    }

    public static void destroyEglSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface) throws androidx.media3.common.util.GlUtil.GlException {
        if (eGLDisplay == null || eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
            return;
        }
        android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        checkEglException("Error destroying surface");
    }

    public static void focusEglSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i3, int i9) throws androidx.media3.common.util.GlUtil.GlException {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i3, i9);
    }

    public static void focusFramebuffer(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i3, int i9, int i10) throws androidx.media3.common.util.GlUtil.GlException {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i3, i9, i10);
    }

    public static void focusFramebufferUsingCurrentContext(int i3, int i9, int i10) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i3) {
            android.opengl.GLES20.glBindFramebuffer(36160, i3);
        }
        checkGlError();
        android.opengl.GLES20.glViewport(0, 0, i9, i10);
        checkGlError();
    }

    private static void focusRenderTarget(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i3, int i9, int i10) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        checkEglException("Error making context current");
        focusFramebufferUsingCurrentContext(i3, i9, i10);
        if (eGLSurface.equals(android.opengl.EGL14.EGL_NO_SURFACE) || i3 != 0 || getContextMajorVersion() < 3) {
            return;
        }
        android.opengl.GLES30.glDrawBuffers(1, new int[]{androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_CODEC_ERROR}, 0);
        checkGlError();
        android.opengl.GLES30.glReadBuffer(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_CODEC_ERROR);
        checkGlError();
    }

    public static int generateTexture() throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static long getContextMajorVersion() throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQueryContext(android.opengl.EGL14.eglGetDisplay(0), android.opengl.EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static android.opengl.EGLContext getCurrentContext() {
        return android.opengl.EGL14.eglGetCurrentContext();
    }

    public static android.opengl.EGLDisplay getDefaultEglDisplay() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        checkGlException(!eGLDisplayEglGetDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY), "No EGL display.");
        checkGlException(android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        checkEglException("Error in getDefaultEglDisplay");
        return eGLDisplayEglGetDisplay;
    }

    private static android.opengl.EGLConfig getEglConfig(android.opengl.EGLDisplay eGLDisplay, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (android.opengl.EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new androidx.media3.common.util.GlUtil.GlException("eglChooseConfig failed.");
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020HlgExtensionSupported() {
        return isExtensionSupported(EXTENSION_COLORSPACE_BT2020_HLG);
    }

    public static boolean isBt2020PqExtensionSupported() {
        return android.os.Build.VERSION.SDK_INT >= 33 && isExtensionSupported(EXTENSION_COLORSPACE_BT2020_PQ);
    }

    public static boolean isColorTransferSupported(int i3) {
        if (i3 == 6) {
            return isBt2020PqExtensionSupported();
        }
        if (i3 == 7) {
            return isBt2020HlgExtensionSupported();
        }
        return true;
    }

    private static boolean isExtensionSupported(java.lang.String str) {
        java.lang.String strEglQueryString = android.opengl.EGL14.eglQueryString(getDefaultEglDisplay(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean isProtectedContentExtensionSupported(android.content.Context context) {
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 26 && ("samsung".equals(android.os.Build.MANUFACTURER) || "XT1650".equals(android.os.Build.MODEL))) {
            return false;
        }
        if (i3 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return isExtensionSupported(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        return isExtensionSupported(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static boolean isYuvTargetExtensionSupported() {
        java.lang.String strGlGetString;
        if (java.util.Objects.equals(android.opengl.EGL14.eglGetCurrentContext(), android.opengl.EGL14.EGL_NO_CONTEXT)) {
            try {
                android.opengl.EGLDisplay defaultEglDisplay = getDefaultEglDisplay();
                android.opengl.EGLContext eGLContextCreateEglContext = createEglContext(defaultEglDisplay);
                createFocusedPlaceholderEglSurface(eGLContextCreateEglContext, defaultEglDisplay);
                strGlGetString = android.opengl.GLES20.glGetString(7939);
                destroyEglContext(defaultEglDisplay, eGLContextCreateEglContext);
            } catch (androidx.media3.common.util.GlUtil.GlException unused) {
                return false;
            }
        } else {
            strGlGetString = android.opengl.GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains(EXTENSION_YUV_TARGET);
    }

    public static java.nio.ByteBuffer mapPixelBufferObject(int i3, int i9) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glBindBuffer(35051, i3);
        checkGlError();
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) android.opengl.GLES30.glMapBufferRange(35051, 0, i9, 1);
        checkGlError();
        android.opengl.GLES20.glBindBuffer(35051, 0);
        checkGlError();
        return byteBuffer;
    }

    public static void schedulePixelBufferRead(int i3, int i9, int i10, int i11) throws androidx.media3.common.util.GlUtil.GlException {
        focusFramebufferUsingCurrentContext(i3, i9, i10);
        android.opengl.GLES20.glBindBuffer(35051, i11);
        checkGlError();
        android.opengl.GLES30.glReadBuffer(36064);
        android.opengl.GLES30.glReadPixels(0, 0, i9, i10, 6408, 5121, 0);
        checkGlError();
        android.opengl.GLES20.glBindBuffer(35051, 0);
        checkGlError();
    }

    public static void setTexture(int i3, android.graphics.Bitmap bitmap) throws androidx.media3.common.util.GlUtil.GlException {
        assertValidTextureSize(bitmap.getWidth(), bitmap.getHeight());
        bindTexture(3553, i3, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        checkGlError();
    }

    public static void setToIdentity(float[] fArr) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
    }

    public static void terminate(android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGL14.eglReleaseThread();
        checkEglException("Error releasing thread");
        android.opengl.EGL14.eglTerminate(eGLDisplay);
        checkEglException("Error terminating display");
    }

    public static void unmapPixelBufferObject(int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glBindBuffer(35051, i3);
        checkGlError();
        android.opengl.GLES30.glUnmapBuffer(35051);
        checkGlError();
        android.opengl.GLES20.glBindBuffer(35051, 0);
        checkGlError();
    }

    private static java.nio.FloatBuffer createBuffer(int i3) {
        return java.nio.ByteBuffer.allocateDirect(i3 * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static android.opengl.EGLContext createEglContext(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay, int i3, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        boolean z6 = true;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        if (i3 != 2 && i3 != 3) {
            z6 = false;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
        android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i3, 12344}, 0);
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext.equals(android.opengl.EGL14.EGL_NO_CONTEXT)) {
            android.opengl.EGL14.eglTerminate(eGLDisplay);
            throw new androidx.media3.common.util.GlUtil.GlException(com.google.android.gms.internal.play_billing.M0.l(i3, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        checkEglException("Error in createEglContext");
        return eGLContextEglCreateContext;
    }

    public static final class GlException extends java.lang.Exception {
        public final p076i4.AbstractC2186b0 errorCodes;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GlException(java.lang.String str) {
            this(str, p076i4.S0.f22832l);
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        }

        public GlException(java.lang.String str, java.util.List<java.lang.Integer> list) {
            super(str);
            this.errorCodes = p076i4.AbstractC2186b0.u(list);
        }
    }

    public static int createTexture(int i3, int i9, boolean z6) {
        if (z6) {
            return createTextureUninitialized(i3, i9, 34842, 5131);
        }
        return createTextureUninitialized(i3, i9, 6408, 5121);
    }
}
