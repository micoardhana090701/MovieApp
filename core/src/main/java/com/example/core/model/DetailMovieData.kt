package com.example.core.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailMovieData(
    val revenue: Int? = null,
    val genres: List<GenresItem?>? = null,
    val popularity: Double? = null,
    val budget: Int? = null,
    val spokenLanguages: List<SpokenLanguagesItem?>? = null,
    val productionCompanies: List<ProductionCompaniesItem?>? = null,
    val tagline: String? = null,
    val homepage: String? = null,
    val status: String? = null
): Parcelable

@Parcelize
data class GenresItem(
    val name: String? = null,
    val id: Int? = null
): Parcelable

@Parcelize
data class SpokenLanguagesItem(
    val name: String? = null,
    val iso6391: String? = null,
    val englishName: String? = null
): Parcelable

@Parcelize
data class ProductionCompaniesItem(
    val logoPath: String? = null,
    val name: String? = null,
    val id: Int? = null,
    val originCountry: String? = null
): Parcelable