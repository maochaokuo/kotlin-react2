# Kotlin React 2

## A first static page with React
[A first static page with React](https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/03_A_First_Static_Page)

### data class
[data class](https://kotlinlang.org/docs/reference/data-classes.html)
[listOf](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/list-of.html)

### add style
step 1:
yarn add @jetbrains/kotlin-css @jetbrains/kotlin-css-js @jetbrains/kotlin-styled inline-style-prefixer styled-components@4

step 2:
import kotlinx.css.*
import styled.*

example:
```
styledDiv {
    css {
        position = Position.absolute
        top = 10.px
        right = 10.px
    }
    h3 {
        +"John Doe: Building and breaking things"
    }
    img {
        attrs {
            src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
        }
    }
}
```

## Making It React: Our first Component
[Making It React: Our first Component](https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/04_Making_It_React)

### lambdas with receivers
[lambdas with receivers](https://kotlinlang.org/docs/reference/lambdas.html?&_ga=2.61361640.53286982.1576285937-1536103592.1575718692#function-literals-with-receiver)
```dtd
fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}
```

### Adding state
```
interface VideoListState: RState {
    var selectedVideo: Video?
}
class VideoList(props: VideoListProps) : RComponent<VideoListProps, VideoListState>(props) {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        setState {
                            selectedVideo = video
                        }
                    }
                }
                if(video == state.selectedVideo) {
                    +"▶ "
                }
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}
```

## Working together: Composing components
[Working together: Composing components](https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/05_Working_Together_Composing_Components)

## More components
[More components](https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/06_More_Components)

## Using packages from NPM
[Using packages from NPM](https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/07_Using_Packages_From_NPM)

### Adding the video player component
```dtd
yarn add react-player
```

### Adding social share buttons
```dtd
yarn add react-share
```