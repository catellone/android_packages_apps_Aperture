package org.lineageos.aperture.utils

import androidx.camera.core.CameraEffect
import androidx.camera.core.ImageProcessor
import androidx.camera.core.SurfaceProcessor
import java.util.concurrent.Executor

class NightModeEffect : CameraEffect {
    constructor(
        targets: Int, executor: Executor, imageProcessor: ImageProcessor
    ) : super(
        targets, executor, imageProcessor
    ) {

    }

    constructor(targets: Int, executor: Executor, surfaceProcessor: SurfaceProcessor) : super(
        targets, executor, surfaceProcessor
    ) {

    }
}
