package ru.sberschool.hystrix

import pokemon.Pokemon

class FallbackSlowlyApi : SlowlyApi {
    override fun getPokemon() = Pokemon(-1, "Too long to wait")
}