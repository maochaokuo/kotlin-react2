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

