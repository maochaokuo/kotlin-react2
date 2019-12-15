package app

import react.*
import react.dom.*
import logo.*
import ticker.*

import kotlinx.css.*
import styled.*

data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {

        val unwatchedVideos = listOf(
                Video(1, "Building and breaking things", "John Doe", "https://youtu.be/PsaFVLr8t4E"),
                Video(2, "The development process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
                Video(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
        )

        val watchedVideos = listOf(
                Video(4, "Mouseless development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
        )
        div {
            h3 {
                +"Videos to watch"
            }
            child(VideoList::class) {

                attrs.videos = unwatchedVideos
            }

            h3 {
                +"Videos watched"
            }
            child(VideoList::class) {

                attrs.videos = watchedVideos
            }
        }

//        styledDiv {
//            css {
//                position = Position.absolute
//                top = 10.px
//                right = 10.px
//            }
//            h3 {
//                +"John Doe: Building and breaking things"
//            }
//            img {
//                attrs {
//                    src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
//                }
//            }
//        }
//
//        for(video in unwatchedVideos) {
//            p {
//                +"${video.speaker}: ${video.title}"
//            }
//        }
//        h1 {
//            +"KotlinConf Explorer"
//        }
//        div {
//            h3 {
//                +"Videos to watch"
//            }
//            p {
//                +"John Doe: Building and breaking things"
//            }
//            p {
//                +"Jane Smith: The development process"
//            }
//            p {
//                +"Matt Miller: The Web 7.0"
//            }
//
//            h3 {
//                +"Videos watched"
//            }
//            p {
//                +"Tom Jerry: Mouseless development"
//            }
//        }
//        div {
//            h3 {
//                +"John Doe: Building and breaking things"
//            }
//            img {
//                attrs {
//                    src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
//                }
//            }
//        }

//        div("App-header") {
//            logo()
//            h2 {
//                +"Welcome to React with Kotlin"
//            }
//        }
//        p("App-intro") {
//            +"To get started, edit "
//            code { +"app/App.kt" }
//            +" and save to reload."
//        }
//        p("App-ticker") {
//            ticker()
//        }
    }
}

fun RBuilder.app() = child(App::class) {}
