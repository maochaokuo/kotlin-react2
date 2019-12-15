package app

import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*
import kotlin.browser.*

fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}
interface VideoListProps: RProps {
    var videos: List<Video>
}
class VideoList(props: VideoListProps): RComponent<VideoListProps, RState>(props) {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                attrs {
                    onClickFunction = {
                        window.alert("Clicked $video!")
                    }
                }
                key = video.id.toString()
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}
