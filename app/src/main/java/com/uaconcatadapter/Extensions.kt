import android.widget.ImageView
import coil.ImageLoader
import coil.request.LoadRequest
import coil.util.DebugLogger

fun ImageView.load(url : String){
    val imageLoader = ImageLoader.Builder(context).logger(DebugLogger())
        .availableMemoryPercentage(0.25)
        .crossfade(true)

        .build()

    val request = LoadRequest.Builder(context)
        .data(url)
        .target(this)
        .build()
    imageLoader.execute(request)
}