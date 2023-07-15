package com.example.core.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ReviewData(
    val authorDetails: AuthorDetails? = null,
    val author: String? = null,
    val id: String? = null,
    val content: String? = null,
    val url: String? = null
): Parcelable

@Parcelize
data class AuthorDetails(
    val avatarPath: String? = null,
    val name: String? = null,
    val rating: Double? = null,
    val username: String? = null
): Parcelable