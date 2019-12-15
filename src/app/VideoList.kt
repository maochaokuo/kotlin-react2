package app

import react.*
import react.dom.*

interface VideoListProps: RProps {
    var videos: List<Video>
}
class VideoList(props: VideoListProps): RComponent<VideoListProps, RState>(props) {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}
