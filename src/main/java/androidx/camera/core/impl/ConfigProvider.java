package androidx.camera.core.impl;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.Config;

public interface ConfigProvider<C extends Config> {
    C getConfig(CameraInfo cameraInfo);
}
