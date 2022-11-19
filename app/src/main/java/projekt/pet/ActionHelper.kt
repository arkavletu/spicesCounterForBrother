package projekt.pet

import db.JEntity

fun JEntity.toModel() = Jerky(
    id = id,
    isFavorite = isFavorite,
    spices = spices
)

fun Jerky.toJEntity() = JEntity(
    id = id,
    isFavorite = isFavorite,
    spices = spices

)