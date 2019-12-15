package app

import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*
import kotlin.browser.*
import app.*


interface VideoListProps: RProps {
    var videos: List<Video>    
	var selectedVideo: Video?
    var onSelectVideo: (Video) -> Unit
}
//class VideoList(props: VideoListProps) : RComponent<VideoListProps, VideoListState>(props) {
class VideoList(props: VideoListProps) : RComponent<VideoListProps, RState>(props) {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        props.onSelectVideo(video)
                        //setState {
                        //    selectedVideo = video
                        //}
                    }
                }
                //if(video == state.selectedVideo) {
                if(video == props.selectedVideo) {
                    +"▶ "
                }
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}

fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}

interface VideoListState: RState {
    var selectedVideo: Video?
}
//class VideoList(props: VideoListProps): RComponent<VideoListProps, RState>(props) {
//    override fun RBuilder.render() {
//        for (video in props.videos) {
//            p {
//                attrs {
//                    onClickFunction = {
//                        window.alert("Clicked $video!")
//                    }
//                }
//                key = video.id.toString()
//                +"${video.speaker}: ${video.title}"
//            }
//        }
//    }
//}
