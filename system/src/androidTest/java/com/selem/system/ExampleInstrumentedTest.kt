package com.selem.system

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun greenView_checkDefaultState() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
//        assertEquals("com.selem.system.test", appContext.packageName)

        val greenView = GreenView(appContext)

        ViewHelpers.setupView(greenView)
            .setExactWidthDp(300)
            .setExactHeightDp(100)
            .layout()

        Screenshot.snap(greenView).record()
    }
}
