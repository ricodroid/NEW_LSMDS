package com.example.newlsmds.articles

/**
 * 記事取得の状態のデータクラス
 */
data class ArticlesState (
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)

