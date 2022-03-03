package io.king.laxyprofile

import java.io.Serializable

data class Data(
    var id: Int,var name : String, var profPic : Int, var message : String, var pictures: Int, var comments: Int, var views: String, var times: String
):Serializable

object DataProvider {
    val data = Data(
        id = 1,
        name = "Damola Akinfemi",
        profPic = R.drawable.david,
        message = "Is there anyone who doesn't love listening to stories?",
        pictures = R.drawable.glove,
        times = "45Mins",
        comments = 30,
        views = "4K"
    )

    val dataList = listOf(
        data,
        Data(
            id = 2,
            name = "John Wesley",
            profPic = R.drawable.daniel,
            message = "Including fables and fairytales, moral stories, short stories, mythological stories, classic stories and your favourite - animal stories",
            pictures = R.drawable.download,
            times = "48Mins",
            comments = 30,
            views = "4K"
        ),
        Data(
            id = 3,
            name = "Halima Muhammed",
            profPic = R.drawable.halima,
            message = "Right from our toddler days, we humans have this insatiable craving for tales, of the known and the unknown, that is satisfied first by our parents and then a plethora of other sources. Go through a host of fascinating stories from KidsGen",
            pictures = R.drawable.yellow,
            times = "1hr",
            comments = 30,
            views = "4K"
        ),
        Data(
            id = 4,
            name = "Godfree Michael",
            profPic = R.drawable.godfree,
            message = "If you love reading these interesting stories for kids, click here and share them with all your young friends",
            pictures = R.drawable.sky,
            times = "2hrs",
            comments = 30,
            views = "4K"
        ),
        Data(
            id = 5,
            name = "Uyai Idoreyin",
            profPic = R.drawable.beauty,
            message = "",
            pictures = R.drawable.mtrip,
            times = "2hrs",
            comments = 30,
            views = "4K"
        ),
    )
}