package io.github.collins993.mvvmnewsapp

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)